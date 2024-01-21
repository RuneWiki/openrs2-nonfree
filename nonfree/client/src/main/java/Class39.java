import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SISNGPYM")
public final class Class39 {

	@OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "B")
	private static byte aByte24 = 2;

	@OriginalMember(owner = "client!SISNGPYM", name = "b", descriptor = "I")
	private static int anInt487 = 4;

	@OriginalMember(owner = "client!SISNGPYM", name = "c", descriptor = "Z")
	private static boolean aBoolean154 = true;

	@OriginalMember(owner = "client!SISNGPYM", name = "d", descriptor = "I")
	private static int anInt488 = 446;

	@OriginalMember(owner = "client!SISNGPYM", name = "e", descriptor = "I")
	private static int anInt489 = 446;

	@OriginalMember(owner = "client!SISNGPYM", name = "f", descriptor = "I")
	private static int anInt490 = -286;

	@OriginalMember(owner = "client!SISNGPYM", name = "g", descriptor = "I")
	private static int anInt491 = 135;

	@OriginalMember(owner = "client!SISNGPYM", name = "h", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method359(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method360(@OriginalArg(1) long arg0) {
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
			signlink.reporterror("28014, " + -53 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method361(@OriginalArg(1) String arg0) {
		try {
			@Pc(13) String local13 = arg0.toUpperCase();
			@Pc(15) long local15 = 0L;
			for (@Pc(17) int local17 = 0; local17 < local13.length(); local17++) {
				local15 = local15 * 61L + (long) local13.charAt(local17) - 32L;
				local15 = local15 + (local15 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local15;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("81157, " + false + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method362(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("69831, " + arg0 + ", " + 73 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method363(@OriginalArg(1) String arg0) {
		try {
			if (anInt487 > 4 || anInt487 < 4) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(20) char[] local20 = arg0.toCharArray();
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
				if (local20[local22] == '_') {
					local20[local22] = ' ';
					if (local22 + 1 < local20.length && local20[local22 + 1] >= 'a' && local20[local22 + 1] <= 'z') {
						local20[local22 + 1] = (char) (local20[local22 + 1] + 'A' - 97);
					}
				}
			}
			if (local20[0] >= 'a' && local20[0] <= 'z') {
				local20[0] = (char) (local20[0] + 'A' - 97);
			}
			return new String(local20);
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("97431, " + 4 + ", " + arg0 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SISNGPYM", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method364(@OriginalArg(1) String arg0) {
		try {
			@Pc(7) StringBuffer local7 = new StringBuffer();
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				local7.append("*");
			}
			return local7.toString();
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("37331, " + 0 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
