import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private static int anInt960;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private static int anInt959 = -762;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "B")
	private static byte aByte39 = -27;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "B")
	private static byte aByte40 = 3;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "B")
	private static byte aByte41 = -80;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "Z")
	private static boolean aBoolean258 = true;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "Z")
	private static boolean aBoolean259 = true;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[C")
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

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method668(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(26) int local26 = 0;
				@Pc(29) char[] local29 = new char[12];
				while (arg0 != 0L) {
					@Pc(33) long local33 = arg0;
					arg0 /= 37L;
					local29[11 - local26++] = aCharArray2[(int) (local33 - arg0 * 37L)];
				}
				return new String(local29, 12 - local26, local26);
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("88539, " + arg0 + ", " + -48 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method669(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(15) long local15 = 0L;
			for (@Pc(17) int local17 = 0; local17 < local4.length(); local17++) {
				local15 = local15 * 61L + (long) local4.charAt(local17) - 32L;
				local15 = local15 + (local15 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local15;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("24276, " + arg0 + ", " + -577 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method670(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("3007, " + arg0 + ", " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method671(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("60103, " + 78 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method672(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("71331, " + arg0 + ", " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
