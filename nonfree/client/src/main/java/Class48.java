import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "Z")
	private static boolean aBoolean251;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private static int anInt974 = 101;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "B")
	private static byte aByte57 = 5;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private static int anInt975 = 218;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "I")
	private static int anInt976 = 783;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "Z")
	private static boolean aBoolean252 = true;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "I")
	private static int anInt977 = -940;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method663(@OriginalArg(0) String arg0) {
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
	public static String method664(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(25) int local25 = 0;
				@Pc(28) char[] local28 = new char[12];
				while (arg0 != 0L) {
					@Pc(32) long local32 = arg0;
					arg0 /= 37L;
					local28[11 - local25++] = aCharArray2[(int) (local32 - arg0 * 37L)];
				}
				return new String(local28, 12 - local25, local25);
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("40622, " + arg0 + ", " + true + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method665(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(11) int local11 = 0; local11 < local2.length(); local11++) {
				local4 = local4 * 61L + (long) local2.charAt(local11) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("8420, " + -5562 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method666(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("43699, " + arg0 + ", " + 1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method667(@OriginalArg(0) String arg0) {
		try {
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
			signlink.reporterror("42296, " + arg0 + ", " + true + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method668(@OriginalArg(1) String arg0) {
		try {
			@Pc(11) StringBuffer local11 = new StringBuffer();
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11.append("*");
			}
			return local11.toString();
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("15483, " + 0 + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
