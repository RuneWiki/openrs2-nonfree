import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class46 {

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "I")
	private static int anInt997 = -797;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "[C")
	private static char[] aCharArray3 = new char[12];

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method645(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method646(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(26) int local26 = 0;
				while (arg0 != 0L) {
					@Pc(30) long local30 = arg0;
					arg0 /= 37L;
					aCharArray3[11 - local26++] = aCharArray4[(int) (local30 - arg0 * 37L)];
				}
				return new String(aCharArray3, 12 - local26, local26);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("53384, " + arg0 + ", " + -16782 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method647(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(11) long local11 = 0L;
			for (@Pc(13) int local13 = 0; local13 < local2.length(); local13++) {
				local11 = local11 * 61L + (long) local2.charAt(local13) - 32L;
				local11 = local11 + (local11 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local11;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("18875, " + 3 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method648(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("99928, " + false + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method649(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("11583, " + 7 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method650(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toLowerCase();
			@Pc(12) char[] local12 = local2.toCharArray();
			@Pc(15) int local15 = local12.length;
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
				@Pc(25) char local25 = local12[local19];
				if (local17 && local25 >= 'a' && local25 <= 'z') {
					local12[local19] = (char) (local12[local19] - 32);
					local17 = false;
				}
				if (local25 == '.' || local25 == '!') {
					local17 = true;
				}
			}
			return new String(local12);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("82721, " + 30 + ", " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method651(@OriginalArg(1) String arg0) {
		try {
			@Pc(8) String local8 = "";
			for (@Pc(10) int local10 = 0; local10 < arg0.length(); local10++) {
				local8 = local8 + "*";
			}
			return local8;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("32984, " + -46918 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
