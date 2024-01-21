import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class49 {

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "Z")
	private static boolean aBoolean236;

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "Z")
	private static boolean aBoolean237;

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "B")
	private static byte aByte46 = 2;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "I")
	private static int anInt1001 = 650;

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method679(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method680(@OriginalArg(1) long arg0) {
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
			signlink.reporterror("77719, " + 4 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method681(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(15) int local15 = 0; local15 < local2.length(); local15++) {
				local4 = local4 * 61L + (long) local2.charAt(local15) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("36747, " + -97 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method682(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("71901, " + 9 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method683(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("63528, " + arg0 + ", " + 9 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method684(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(4) String local4 = arg1.toLowerCase();
			@Pc(7) char[] local7 = local4.toCharArray();
			@Pc(10) int local10 = local7.length;
			if (arg0 != -4) {
				for (@Pc(15) int local15 = 1; local15 > 0; local15++) {
				}
			}
			@Pc(22) boolean local22 = true;
			for (@Pc(24) int local24 = 0; local24 < local10; local24++) {
				@Pc(30) char local30 = local7[local24];
				if (local22 && local30 >= 'a' && local30 <= 'z') {
					local7[local24] = (char) (local7[local24] - 32);
					local22 = false;
				}
				if (local30 == '.' || local30 == '!') {
					local22 = true;
				}
			}
			return new String(local7);
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("74134, " + arg0 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method685(@OriginalArg(0) String arg0) {
		try {
			@Pc(5) StringBuffer local5 = new StringBuffer();
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				local5.append("*");
			}
			return local5.toString();
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("54196, " + arg0 + ", " + -76 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}
}
