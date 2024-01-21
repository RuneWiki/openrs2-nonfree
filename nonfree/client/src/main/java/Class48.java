import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "I")
	private static int anInt977;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private static int anInt975 = 688;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "Z")
	private static boolean aBoolean239 = true;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "Z")
	private static boolean aBoolean240 = true;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "I")
	private static int anInt976 = -178;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method667(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method668(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(22) char[] local22 = new char[12];
				while (arg0 != 0L) {
					@Pc(30) long local30 = arg0;
					arg0 /= 37L;
					local22[11 - local19++] = aCharArray2[(int) (local30 - arg0 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("27809, " + arg0 + ", " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method669(@OriginalArg(0) String arg0) {
		try {
			@Pc(9) String local9 = arg0.toUpperCase();
			@Pc(11) long local11 = 0L;
			for (@Pc(13) int local13 = 0; local13 < local9.length(); local13++) {
				local11 = local11 * 61L + (long) local9.charAt(local13) - 32L;
				local11 = local11 + (local11 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local11;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("33515, " + arg0 + ", " + 97 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method670(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("69101, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method671(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(9) char[] local9 = arg0.toCharArray();
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
			signlink.reporterror("30305, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method672(@OriginalArg(0) String arg0) {
		try {
			@Pc(14) StringBuffer local14 = new StringBuffer();
			for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
				local14.append("*");
			}
			return local14.toString();
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("23088, " + arg0 + ", " + false + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}
