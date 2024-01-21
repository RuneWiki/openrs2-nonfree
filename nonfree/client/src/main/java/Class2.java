import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ASZHZJYZ")
public final class Class2 {

	@OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "Z")
	private static boolean aBoolean9 = true;

	@OriginalMember(owner = "client!ASZHZJYZ", name = "b", descriptor = "I")
	private static int anInt21 = 357;

	@OriginalMember(owner = "client!ASZHZJYZ", name = "c", descriptor = "B")
	private static byte aByte1 = 5;

	@OriginalMember(owner = "client!ASZHZJYZ", name = "d", descriptor = "I")
	private static int anInt22 = 2;

	@OriginalMember(owner = "client!ASZHZJYZ", name = "e", descriptor = "I")
	private static int anInt23 = 148;

	@OriginalMember(owner = "client!ASZHZJYZ", name = "f", descriptor = "Z")
	private static boolean aBoolean10 = true;

	@OriginalMember(owner = "client!ASZHZJYZ", name = "g", descriptor = "I")
	private static int anInt24 = 726;

	@OriginalMember(owner = "client!ASZHZJYZ", name = "h", descriptor = "Z")
	private static boolean aBoolean11 = true;

	@OriginalMember(owner = "client!ASZHZJYZ", name = "i", descriptor = "[C")
	private static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method14(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method15(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg1 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(23) boolean local23 = false;
				@Pc(26) char[] local26 = new char[12];
				while (arg1 != 0L) {
					@Pc(30) long local30 = arg1;
					arg1 /= 37L;
					local26[11 - local19++] = aCharArray1[(int) (local30 - arg1 * 37L)];
				}
				return new String(local26, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("32791, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method16(@OriginalArg(1) String arg0) {
		try {
			@Pc(7) String local7 = arg0.toUpperCase();
			@Pc(9) long local9 = 0L;
			for (@Pc(11) int local11 = 0; local11 < local7.length(); local11++) {
				local9 = local9 * 61L + (long) local7.charAt(local11) - 32L;
				local9 = local9 + (local9 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local9;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("98629, " + -16 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method17(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("24307, " + -29151 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method18(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(12) char[] local12 = arg0.toCharArray();
			for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
				if (local12[local14] == '_') {
					local12[local14] = ' ';
					if (local14 + 1 < local12.length && local12[local14 + 1] >= 'a' && local12[local14 + 1] <= 'z') {
						local12[local14 + 1] = (char) (local12[local14 + 1] + 'A' - 97);
					}
				}
			}
			if (local12[0] >= 'a' && local12[0] <= 'z') {
				local12[0] = (char) (local12[0] + 'A' - 97);
			}
			return new String(local12);
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("42992, " + 27250 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method19(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				anInt24 = 347;
			}
			@Pc(7) StringBuffer local7 = new StringBuffer();
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				local7.append("*");
			}
			return local7.toString();
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("78042, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
