import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YYRFHIVS")
public final class Class48 {

	@OriginalMember(owner = "client!YYRFHIVS", name = "a", descriptor = "Z")
	private static boolean aBoolean183;

	@OriginalMember(owner = "client!YYRFHIVS", name = "d", descriptor = "Z")
	private static boolean aBoolean185;

	@OriginalMember(owner = "client!YYRFHIVS", name = "b", descriptor = "Z")
	private static boolean aBoolean184 = true;

	@OriginalMember(owner = "client!YYRFHIVS", name = "c", descriptor = "I")
	private static int anInt805 = -558;

	@OriginalMember(owner = "client!YYRFHIVS", name = "e", descriptor = "I")
	private static int anInt806 = 1;

	@OriginalMember(owner = "client!YYRFHIVS", name = "f", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!YYRFHIVS", name = "a", descriptor = "(Ljava/lang/String;)J")
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

	@OriginalMember(owner = "client!YYRFHIVS", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method560(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(22) char[] local22 = new char[12];
				while (arg0 != 0L) {
					@Pc(34) long local34 = arg0;
					arg0 /= 37L;
					local22[11 - local19++] = aCharArray4[(int) (local34 - arg0 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("16811, " + arg0 + ", " + 803 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYRFHIVS", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method561(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(6) long local6 = 0L;
			for (@Pc(17) int local17 = 0; local17 < local4.length(); local17++) {
				local6 = local6 * 61L + (long) local4.charAt(local17) - 32L;
				local6 = local6 + (local6 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local6;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("37243, " + true + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYRFHIVS", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method562(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("11046, " + 0 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYRFHIVS", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method563(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("93435, " + arg0 + ", " + true + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYRFHIVS", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method564(@OriginalArg(1) String arg0) {
		try {
			@Pc(5) StringBuffer local5 = new StringBuffer();
			for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
				local5.append("*");
			}
			return local5.toString();
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("3632, " + 0 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}
