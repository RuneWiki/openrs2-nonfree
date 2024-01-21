import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private static int anInt955 = -206;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "B")
	private static byte aByte40 = 17;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private static int anInt956 = 584;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "I")
	private static int anInt957 = 37801;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "I")
	private static int anInt958 = 968;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "Z")
	private static boolean aBoolean254;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[C")
	private static final char[] aCharArray2;

	static {
		aBoolean253 = true;
		aBoolean254 = true;
		aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method659(@OriginalArg(0) String arg0) {
		@Pc(3) long local3 = 0L;
		for (@Pc(5) int local5 = 0; local5 < arg0.length() && local5 < 12; local5++) {
			@Pc(11) char local11 = arg0.charAt(local5);
			local3 *= 37L;
			if (local11 >= 'A' && local11 <= 'Z') {
				local3 += local11 + 1 - 65;
			} else if (local11 >= 'a' && local11 <= 'z') {
				local3 += local11 + 1 - 97;
			} else if (local11 >= '0' && local11 <= '9') {
				local3 += local11 + 27 - 48;
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method660(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(21) int local21 = 0;
				@Pc(34) char[] local34 = new char[12];
				while (arg0 != 0L) {
					@Pc(38) long local38 = arg0;
					arg0 /= 37L;
					local34[11 - local21++] = aCharArray2[(int) (local38 - arg0 * 37L)];
				}
				return new String(local34, 12 - local21, local21);
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("43513, " + -206 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method661(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(6) int local6 = 0; local6 < local2.length(); local6++) {
				local4 = local4 * 61L + (long) local2.charAt(local6) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("71380, " + 0 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("27197, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method663(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1.length() <= 0) {
				return arg1;
			}
			@Pc(9) char[] local9 = arg1.toCharArray();
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				if (local9[local11] == '_') {
					local9[local11] = ' ';
					if (local11 + 1 < local9.length && local9[local11 + 1] >= 'a' && local9[local11 + 1] <= 'z') {
						local9[local11 + 1] = (char) (local9[local11 + 1] + 'A' - 97);
					}
				}
			}
			if (local9[0] >= 'a' && local9[0] <= 'z') {
				local9[0] = (char) (local9[0] + 'A' - 97);
			}
			return new String(local9);
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("80187, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method664(@OriginalArg(0) String arg0) {
		try {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(11) char[] local11 = local8.toCharArray();
			@Pc(14) int local14 = local11.length;
			@Pc(16) boolean local16 = true;
			for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
				@Pc(24) char local24 = local11[local18];
				if (local16 && local24 >= 'a' && local24 <= 'z') {
					local11[local18] = (char) (local11[local18] - 32);
					local16 = false;
				}
				if (local24 == '.' || local24 == '!') {
					local16 = true;
				}
			}
			return new String(local11);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("23863, " + arg0 + ", " + 0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method665(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			if (arg1 != 0) {
				throw new NullPointerException();
			}
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("10888, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
