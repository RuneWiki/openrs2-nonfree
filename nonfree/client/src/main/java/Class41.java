import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TGGPOZND")
public final class Class41 {

	@OriginalMember(owner = "client!TGGPOZND", name = "c", descriptor = "B")
	private static byte aByte24;

	@OriginalMember(owner = "client!TGGPOZND", name = "a", descriptor = "Z")
	private static boolean aBoolean157 = true;

	@OriginalMember(owner = "client!TGGPOZND", name = "b", descriptor = "B")
	private static byte aByte23 = 3;

	@OriginalMember(owner = "client!TGGPOZND", name = "d", descriptor = "B")
	private static byte aByte25 = 9;

	@OriginalMember(owner = "client!TGGPOZND", name = "e", descriptor = "I")
	private static int anInt725 = 618;

	@OriginalMember(owner = "client!TGGPOZND", name = "f", descriptor = "I")
	private static int anInt726 = -30470;

	@OriginalMember(owner = "client!TGGPOZND", name = "g", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!TGGPOZND", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method504(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!TGGPOZND", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method505(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(29) char[] local29 = new char[12];
				while (arg0 != 0L) {
					@Pc(33) long local33 = arg0;
					arg0 /= 37L;
					local29[11 - local19++] = aCharArray4[(int) (local33 - arg0 * 37L)];
				}
				return new String(local29, 12 - local19, local19);
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("45264, " + arg0 + ", " + 13452 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TGGPOZND", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method506(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(6) int local6 = 0; local6 < local2.length(); local6++) {
				local4 = local4 * 61L + (long) local2.charAt(local6) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			@Pc(36) boolean local36 = false;
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("44087, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TGGPOZND", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method507(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("41648, " + arg0 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TGGPOZND", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method508(@OriginalArg(0) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(9) char[] local9 = arg0.toCharArray();
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				if (local9[local11] == '_') {
					local9[local11] = ' ';
					if (local11 + 1 < local9.length && local9[local11 + 1] >= 'a' && local9[local11 + 1] <= 'z') {
						local9[local11 + 1] = (char) (local9[local11 + 1] + 'A' - 97);
					}
				}
			}
			if (local9[0] >= 'a' && local9[0] <= 'z') {
				local9[0] = (char) (local9[0] + 'A' - 97);
			}
			return new String(local9);
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("84796, " + arg0 + ", " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TGGPOZND", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method509(@OriginalArg(1) String arg0) {
		try {
			if (aByte24 != 0) {
				throw new NullPointerException();
			}
			@Pc(16) StringBuffer local16 = new StringBuffer();
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				local16.append("*");
			}
			return local16.toString();
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("72496, " + 0 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
