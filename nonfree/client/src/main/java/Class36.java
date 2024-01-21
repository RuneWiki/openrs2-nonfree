import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RPCTGZHI")
public final class Class36 {

	@OriginalMember(owner = "client!RPCTGZHI", name = "d", descriptor = "Z")
	private static boolean aBoolean157;

	@OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "I")
	private static int anInt529 = -39;

	@OriginalMember(owner = "client!RPCTGZHI", name = "b", descriptor = "I")
	private static int anInt530 = -33427;

	@OriginalMember(owner = "client!RPCTGZHI", name = "c", descriptor = "B")
	private static byte aByte27 = 6;

	@OriginalMember(owner = "client!RPCTGZHI", name = "e", descriptor = "I")
	private static int anInt531 = 11573;

	@OriginalMember(owner = "client!RPCTGZHI", name = "f", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method378(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method379(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(28) int local28 = 0;
				@Pc(31) char[] local31 = new char[12];
				while (arg0 != 0L) {
					@Pc(35) long local35 = arg0;
					arg0 /= 37L;
					local31[11 - local28++] = aCharArray4[(int) (local35 - arg0 * 37L)];
				}
				return new String(local31, 12 - local28, local28);
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("75614, " + arg0 + ", " + 5 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method380(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(2) String local2 = arg1.toUpperCase();
			@Pc(4) long local4 = 0L;
			@Pc(8) int local8 = 92 / arg0;
			for (@Pc(10) int local10 = 0; local10 < local2.length(); local10++) {
				local4 = local4 * 61L + (long) local2.charAt(local10) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("50621, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method381(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("93801, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method382(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
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
			signlink.reporterror("46604, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RPCTGZHI", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method383(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("93145, " + arg0 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
