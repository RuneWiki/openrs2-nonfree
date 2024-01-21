import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JQPXVJFJ")
public final class Class19 {

	@OriginalMember(owner = "client!JQPXVJFJ", name = "a", descriptor = "I")
	private static int anInt425 = -367;

	@OriginalMember(owner = "client!JQPXVJFJ", name = "b", descriptor = "I")
	private static int anInt426 = 3;

	@OriginalMember(owner = "client!JQPXVJFJ", name = "c", descriptor = "Z")
	private static boolean aBoolean91 = true;

	@OriginalMember(owner = "client!JQPXVJFJ", name = "d", descriptor = "I")
	private static int anInt427 = 752;

	@OriginalMember(owner = "client!JQPXVJFJ", name = "e", descriptor = "B")
	private static byte aByte21 = -46;

	@OriginalMember(owner = "client!JQPXVJFJ", name = "f", descriptor = "Z")
	private static boolean aBoolean92 = true;

	@OriginalMember(owner = "client!JQPXVJFJ", name = "g", descriptor = "I")
	private static int anInt428 = -872;

	@OriginalMember(owner = "client!JQPXVJFJ", name = "h", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!JQPXVJFJ", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method231(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!JQPXVJFJ", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method232(@OriginalArg(1) long arg0) {
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
			signlink.reporterror("10121, " + true + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQPXVJFJ", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method233(@OriginalArg(0) String arg0) {
		try {
			@Pc(11) String local11 = arg0.toUpperCase();
			@Pc(13) long local13 = 0L;
			for (@Pc(15) int local15 = 0; local15 < local11.length(); local15++) {
				local13 = local13 * 61L + (long) local11.charAt(local15) - 32L;
				local13 = local13 + (local13 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local13;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("63368, " + arg0 + ", " + 90 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQPXVJFJ", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method234(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("61046, " + arg0 + ", " + -367 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQPXVJFJ", name = "b", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method235(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("28738, " + arg0 + ", " + 58 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQPXVJFJ", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method236(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("13796, " + true + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
