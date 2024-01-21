import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class46 {

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "Z")
	private static boolean aBoolean200 = true;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "[C")
	private static char[] aCharArray3 = new char[12];

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method640(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method641(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(21) int local21 = 0;
				while (arg0 != 0L) {
					@Pc(35) long local35 = arg0;
					arg0 /= 37L;
					aCharArray3[11 - local21++] = aCharArray4[(int) (local35 - arg0 * 37L)];
				}
				return new String(aCharArray3, 12 - local21, local21);
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("55390, " + 9 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method642(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(13) long local13 = 0L;
			for (@Pc(15) int local15 = 0; local15 < local2.length(); local15++) {
				local13 = local13 * 61L + (long) local2.charAt(local15) - 32L;
				local13 = local13 + (local13 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local13;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("38036, " + 42 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method643(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("29231, " + arg0 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method644(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("771, " + arg0 + ", " + 1 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method645(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toLowerCase();
			@Pc(5) char[] local5 = local2.toCharArray();
			@Pc(8) int local8 = local5.length;
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
				@Pc(18) char local18 = local5[local12];
				if (local10 && local18 >= 'a' && local18 <= 'z') {
					local5[local12] = (char) (local5[local12] - 32);
					local10 = false;
				}
				if (local18 == '.' || local18 == '!') {
					local10 = true;
				}
			}
			return new String(local5);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("29146, " + arg0 + ", " + 7 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method646(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) String local3 = "";
			for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
				local3 = local3 + "*";
			}
			return local3;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("12208, " + arg0 + ", " + -530 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}
}
