import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class40 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
	private static boolean aBoolean175 = true;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private static int anInt755 = 4;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private static int anInt756 = -359;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[C")
	private static char[] aCharArray1 = new char[12];

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method518(@OriginalArg(0) String arg0) {
		@Pc(4) String local4 = arg0.trim();
		@Pc(6) long local6 = 0L;
		for (@Pc(8) int local8 = 0; local8 < local4.length() && local8 < 12; local8++) {
			@Pc(14) char local14 = local4.charAt(local8);
			local6 *= 37L;
			if (local14 >= 'A' && local14 <= 'Z') {
				local6 += local14 + 1 - 65;
			} else if (local14 >= 'a' && local14 <= 'z') {
				local6 += local14 + 1 - 97;
			} else if (local14 >= '0' && local14 <= '9') {
				local6 += local14 + 27 - 48;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method519(@OriginalArg(1) long arg0) {
		try {
			if (arg0 < 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			}
			@Pc(11) int local11 = 0;
			if (anInt755 != 4) {
				throw new NullPointerException();
			}
			while (arg0 != 0L) {
				@Pc(20) long local20 = arg0;
				arg0 /= 37L;
				aCharArray1[11 - local11++] = aCharArray2[(int) (local20 - arg0 * 37L)];
			}
			return new String(aCharArray1, 12 - local11, local11);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("62687, " + 4 + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method520(@OriginalArg(1) String arg0) {
		try {
			@Pc(9) String local9 = arg0.toUpperCase();
			@Pc(11) long local11 = 0L;
			for (@Pc(13) int local13 = 0; local13 < local9.length(); local13++) {
				local11 = local11 * 61L + (long) local9.charAt(local13) - 32L;
				local11 = local11 + (local11 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local11;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("90860, " + -6530 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method521(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("89237, " + arg0 + ", " + false + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method522(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(17) char[] local17 = arg0.toCharArray();
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				if (local17[local19] == '_') {
					local17[local19] = ' ';
					if (local19 + 1 < local17.length && local17[local19 + 1] >= 'a' && local17[local19 + 1] <= 'z') {
						local17[local19 + 1] = (char) (local17[local19 + 1] + 'A' - 97);
					}
				}
			}
			if (local17[0] >= 'a' && local17[0] <= 'z') {
				local17[0] = (char) (local17[0] + 'A' - 97);
			}
			return new String(local17);
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("64830, " + -10 + ", " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method523(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toLowerCase();
			@Pc(11) char[] local11 = local2.toCharArray();
			@Pc(14) int local14 = local11.length;
			@Pc(16) boolean local16 = true;
			for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
				@Pc(24) char local24 = local11[local18];
				if (local16 && local24 >= 'a' && local24 <= 'z') {
					local11[local18] = (char) (local11[local18] - 32);
					local16 = false;
				}
				if (local24 == '.' || local24 == '!') {
					local16 = true;
				}
			}
			return new String(local11);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("90691, " + 837 + ", " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method524(@OriginalArg(0) String arg0) {
		try {
			@Pc(7) String local7 = "";
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				local7 = local7 + "*";
			}
			return local7;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("89070, " + arg0 + ", " + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
