import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SJGLGRTK")
public final class Class38 {

	@OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "B")
	private static byte aByte17 = 8;

	@OriginalMember(owner = "client!SJGLGRTK", name = "b", descriptor = "I")
	private static int anInt720 = 3;

	@OriginalMember(owner = "client!SJGLGRTK", name = "c", descriptor = "I")
	private static int anInt721 = 612;

	@OriginalMember(owner = "client!SJGLGRTK", name = "d", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method453(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method454(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(21) int local21 = 0;
				@Pc(24) char[] local24 = new char[12];
				while (arg0 != 0L) {
					@Pc(37) long local37 = arg0;
					arg0 /= 37L;
					local24[11 - local21++] = aCharArray2[(int) (local37 - arg0 * 37L)];
				}
				return new String(local24, 12 - local21, local21);
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("73030, " + -39 + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method455(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(6) int local6 = 0; local6 < local2.length(); local6++) {
				local4 = local4 * 61L + (long) local2.charAt(local6) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("72942, " + arg0 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method456(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 4) {
				@Pc(4) boolean local4 = false;
			} else {
				anInt721 = 459;
			}
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("42426, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method457(@OriginalArg(0) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(11) char[] local11 = arg0.toCharArray();
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				if (local11[local13] == '_') {
					local11[local13] = ' ';
					if (local13 + 1 < local11.length && local11[local13 + 1] >= 'a' && local11[local13 + 1] <= 'z') {
						local11[local13 + 1] = (char) (local11[local13 + 1] + 'A' - 97);
					}
				}
			}
			if (local11[0] >= 'a' && local11[0] <= 'z') {
				local11[0] = (char) (local11[0] + 'A' - 97);
			}
			return new String(local11);
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("68810, " + arg0 + ", " + false + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SJGLGRTK", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method458(@OriginalArg(0) String arg0) {
		try {
			@Pc(16) StringBuffer local16 = new StringBuffer();
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				local16.append("*");
			}
			return local16.toString();
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("1813, " + arg0 + ", " + -799 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
