import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZDHYRWCV")
public final class Class49 {

	@OriginalMember(owner = "client!ZDHYRWCV", name = "g", descriptor = "Z")
	private static boolean aBoolean217;

	@OriginalMember(owner = "client!ZDHYRWCV", name = "a", descriptor = "B")
	private static byte aByte31 = -66;

	@OriginalMember(owner = "client!ZDHYRWCV", name = "b", descriptor = "I")
	private static int anInt831 = 7;

	@OriginalMember(owner = "client!ZDHYRWCV", name = "c", descriptor = "B")
	private static byte aByte32 = 68;

	@OriginalMember(owner = "client!ZDHYRWCV", name = "d", descriptor = "I")
	private static int anInt832 = -639;

	@OriginalMember(owner = "client!ZDHYRWCV", name = "e", descriptor = "I")
	private static int anInt833 = -658;

	@OriginalMember(owner = "client!ZDHYRWCV", name = "f", descriptor = "B")
	private static byte aByte33 = 48;

	@OriginalMember(owner = "client!ZDHYRWCV", name = "h", descriptor = "Z")
	private static boolean aBoolean218 = true;

	@OriginalMember(owner = "client!ZDHYRWCV", name = "i", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ZDHYRWCV", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method563(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ZDHYRWCV", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method564(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				if (aByte31 != -66) {
					throw new NullPointerException();
				}
				@Pc(29) char[] local29 = new char[12];
				while (arg0 != 0L) {
					@Pc(33) long local33 = arg0;
					arg0 /= 37L;
					local29[11 - local19++] = aCharArray4[(int) (local33 - arg0 * 37L)];
				}
				return new String(local29, 12 - local19, local19);
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("51286, " + arg0 + ", " + -66 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZDHYRWCV", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method565(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			if (aByte32 != 68) {
				aBoolean218 = !aBoolean218;
			}
			for (@Pc(15) int local15 = 0; local15 < local2.length(); local15++) {
				local4 = local4 * 61L + (long) local2.charAt(local15) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("80739, " + 68 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZDHYRWCV", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method566(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("44130, " + arg0 + ", " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZDHYRWCV", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method567(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("20883, " + 1 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZDHYRWCV", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method568(@OriginalArg(0) String arg0) {
		try {
			@Pc(11) StringBuffer local11 = new StringBuffer();
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11.append("*");
			}
			return local11.toString();
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("9475, " + arg0 + ", " + 323 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
