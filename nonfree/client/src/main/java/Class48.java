import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XLAXYQGJ")
public final class Class48 {

	@OriginalMember(owner = "client!XLAXYQGJ", name = "e", descriptor = "Z")
	private static boolean aBoolean184;

	@OriginalMember(owner = "client!XLAXYQGJ", name = "a", descriptor = "I")
	private static int anInt806 = -23134;

	@OriginalMember(owner = "client!XLAXYQGJ", name = "b", descriptor = "B")
	private static byte aByte31 = -90;

	@OriginalMember(owner = "client!XLAXYQGJ", name = "c", descriptor = "I")
	private static int anInt807 = -138;

	@OriginalMember(owner = "client!XLAXYQGJ", name = "d", descriptor = "Z")
	private static boolean aBoolean183 = true;

	@OriginalMember(owner = "client!XLAXYQGJ", name = "f", descriptor = "I")
	private static int anInt808 = 3;

	@OriginalMember(owner = "client!XLAXYQGJ", name = "g", descriptor = "Z")
	private static boolean aBoolean185 = true;

	@OriginalMember(owner = "client!XLAXYQGJ", name = "h", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!XLAXYQGJ", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method535(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!XLAXYQGJ", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method536(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg1 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(22) char[] local22 = new char[12];
				if (arg0) {
					throw new NullPointerException();
				}
				while (arg1 != 0L) {
					@Pc(30) long local30 = arg1;
					arg1 /= 37L;
					local22[11 - local19++] = aCharArray4[(int) (local30 - arg1 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("35130, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XLAXYQGJ", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method537(@OriginalArg(0) String arg0) {
		try {
			@Pc(8) String local8 = arg0.toUpperCase();
			@Pc(10) long local10 = 0L;
			for (@Pc(12) int local12 = 0; local12 < local8.length(); local12++) {
				local10 = local10 * 61L + (long) local8.charAt(local12) - 32L;
				local10 = local10 + (local10 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local10;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("37642, " + arg0 + ", " + -26 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XLAXYQGJ", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method538(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("23667, " + -29619 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XLAXYQGJ", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method539(@OriginalArg(0) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(16) char[] local16 = arg0.toCharArray();
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				if (local16[local18] == '_') {
					local16[local18] = ' ';
					if (local18 + 1 < local16.length && local16[local18 + 1] >= 'a' && local16[local18 + 1] <= 'z') {
						local16[local18 + 1] = (char) (local16[local18 + 1] + 'A' - 97);
					}
				}
			}
			if (local16[0] >= 'a' && local16[0] <= 'z') {
				local16[0] = (char) (local16[0] + 'A' - 97);
			}
			return new String(local16);
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("87782, " + arg0 + ", " + true + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XLAXYQGJ", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method540(@OriginalArg(1) String arg0) {
		try {
			@Pc(13) StringBuffer local13 = new StringBuffer();
			for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
				local13.append("*");
			}
			return local13.toString();
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("45055, " + -749 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}
}
