import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WAQVJSXE")
public final class Class40 {

	@OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "B")
	private static byte aByte22 = 8;

	@OriginalMember(owner = "client!WAQVJSXE", name = "b", descriptor = "I")
	private static int anInt596 = 44101;

	@OriginalMember(owner = "client!WAQVJSXE", name = "c", descriptor = "Z")
	private static boolean aBoolean188 = true;

	@OriginalMember(owner = "client!WAQVJSXE", name = "d", descriptor = "I")
	private static int anInt597 = -580;

	@OriginalMember(owner = "client!WAQVJSXE", name = "e", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method405(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method406(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(26) char[] local26 = new char[12];
				while (arg0 != 0L) {
					@Pc(30) long local30 = arg0;
					arg0 /= 37L;
					local26[11 - local19++] = aCharArray4[(int) (local30 - arg0 * 37L)];
				}
				return new String(local26, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("63826, " + false + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method407(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(15) long local15 = 0L;
			for (@Pc(17) int local17 = 0; local17 < local4.length(); local17++) {
				local15 = local15 * 61L + (long) local4.charAt(local17) - 32L;
				local15 = local15 + (local15 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local15;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("63132, " + true + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method408(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("53129, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method409(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(13) char[] local13 = arg0.toCharArray();
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				if (local13[local15] == '_') {
					local13[local15] = ' ';
					if (local15 + 1 < local13.length && local13[local15 + 1] >= 'a' && local13[local15 + 1] <= 'z') {
						local13[local15 + 1] = (char) (local13[local15 + 1] + 'A' - 97);
					}
				}
			}
			if (local13[0] >= 'a' && local13[0] <= 'z') {
				local13[0] = (char) (local13[0] + 'A' - 97);
			}
			return new String(local13);
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("31282, " + -74 + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method410(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			if (aByte22 != 8) {
				throw new NullPointerException();
			}
			@Pc(6) boolean local6 = false;
			@Pc(15) StringBuffer local15 = new StringBuffer();
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				local15.append("*");
			}
			return local15.toString();
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("88092, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
