import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZTQFNQRH")
public final class Class50 {

	@OriginalMember(owner = "client!ZTQFNQRH", name = "d", descriptor = "Z")
	private static boolean aBoolean213;

	@OriginalMember(owner = "client!ZTQFNQRH", name = "a", descriptor = "I")
	private static int anInt815 = 923;

	@OriginalMember(owner = "client!ZTQFNQRH", name = "b", descriptor = "B")
	private static byte aByte26 = -99;

	@OriginalMember(owner = "client!ZTQFNQRH", name = "c", descriptor = "I")
	private static int anInt816 = -388;

	@OriginalMember(owner = "client!ZTQFNQRH", name = "e", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ZTQFNQRH", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method559(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ZTQFNQRH", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method560(@OriginalArg(0) long arg0) {
		try {
			if (aByte26 != -99) {
				throw new NullPointerException();
			} else if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(26) int local26 = 0;
				@Pc(29) char[] local29 = new char[12];
				while (arg0 != 0L) {
					@Pc(33) long local33 = arg0;
					arg0 /= 37L;
					local29[11 - local26++] = aCharArray4[(int) (local33 - arg0 * 37L)];
				}
				return new String(local29, 12 - local26, local26);
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("81570, " + arg0 + ", " + -99 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTQFNQRH", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method561(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(6) int local6 = 0; local6 < local2.length(); local6++) {
				local4 = local4 * 61L + (long) local2.charAt(local6) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("27119, " + 1 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTQFNQRH", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method562(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("3088, " + arg0 + ", " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTQFNQRH", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method563(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(10) char[] local10 = arg0.toCharArray();
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				if (local10[local12] == '_') {
					local10[local12] = ' ';
					if (local12 + 1 < local10.length && local10[local12 + 1] >= 'a' && local10[local12 + 1] <= 'z') {
						local10[local12 + 1] = (char) (local10[local12 + 1] + 'A' - 97);
					}
				}
			}
			if (local10[0] >= 'a' && local10[0] <= 'z') {
				local10[0] = (char) (local10[0] + 'A' - 97);
			}
			return new String(local10);
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("64121, " + -45804 + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTQFNQRH", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method564(@OriginalArg(0) String arg0) {
		try {
			@Pc(9) StringBuffer local9 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local9.append("*");
			}
			return local9.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("97205, " + arg0 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
