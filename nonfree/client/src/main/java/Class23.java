import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JYGZTITV")
public final class Class23 {

	@OriginalMember(owner = "client!JYGZTITV", name = "a", descriptor = "Z")
	private static boolean aBoolean96 = true;

	@OriginalMember(owner = "client!JYGZTITV", name = "b", descriptor = "I")
	private static int anInt287 = 3;

	@OriginalMember(owner = "client!JYGZTITV", name = "c", descriptor = "I")
	private static int anInt288 = 692;

	@OriginalMember(owner = "client!JYGZTITV", name = "d", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!JYGZTITV", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method226(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!JYGZTITV", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method227(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(23) int local23 = 0;
				@Pc(26) char[] local26 = new char[12];
				while (arg0 != 0L) {
					@Pc(30) long local30 = arg0;
					arg0 /= 37L;
					local26[11 - local23++] = aCharArray4[(int) (local30 - arg0 * 37L)];
				}
				return new String(local26, 12 - local23, local23);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("96378, " + -602 + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JYGZTITV", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method228(@OriginalArg(1) String arg0) {
		try {
			@Pc(11) String local11 = arg0.toUpperCase();
			@Pc(13) long local13 = 0L;
			for (@Pc(15) int local15 = 0; local15 < local11.length(); local15++) {
				local13 = local13 * 61L + (long) local11.charAt(local15) - 32L;
				local13 = local13 + (local13 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local13;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("62586, " + 5 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JYGZTITV", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method229(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("85952, " + true + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JYGZTITV", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method230(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("65906, " + true + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JYGZTITV", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method231(@OriginalArg(1) String arg0) {
		try {
			@Pc(9) StringBuffer local9 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local9.append("*");
			}
			return local9.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("44404, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
