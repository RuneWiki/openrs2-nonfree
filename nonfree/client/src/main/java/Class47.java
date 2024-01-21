import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class47 {

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "Z")
	private static boolean aBoolean223;

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "I")
	private static int anInt1014;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "Z")
	private static boolean aBoolean224 = true;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "I")
	private static int anInt1012 = 767;

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "I")
	private static int anInt1013 = -607;

	@OriginalMember(owner = "client!zb", name = "f", descriptor = "[C")
	private static char[] aCharArray3 = new char[12];

	@OriginalMember(owner = "client!zb", name = "g", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method675(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method676(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(25) int local25 = 0;
				while (arg0 != 0L) {
					@Pc(29) long local29 = arg0;
					arg0 /= 37L;
					aCharArray3[11 - local25++] = aCharArray4[(int) (local29 - arg0 * 37L)];
				}
				return new String(aCharArray3, 12 - local25, local25);
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("11503, " + arg0 + ", " + false + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method677(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(10) int local10 = 0; local10 < local2.length(); local10++) {
				local4 = local4 * 61L + (long) local2.charAt(local10) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("18213, " + true + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method678(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("64604, " + arg0 + ", " + 767 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method679(@OriginalArg(0) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(14) char[] local14 = arg0.toCharArray();
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				if (local14[local16] == '_') {
					local14[local16] = ' ';
					if (local16 + 1 < local14.length && local14[local16 + 1] >= 'a' && local14[local16 + 1] <= 'z') {
						local14[local16 + 1] = (char) (local14[local16 + 1] + 'A' - 97);
					}
				}
			}
			if (local14[0] >= 'a' && local14[0] <= 'z') {
				local14[0] = (char) (local14[0] + 'A' - 97);
			}
			return new String(local14);
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("51720, " + arg0 + ", " + -19010 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method680(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toLowerCase();
			@Pc(7) char[] local7 = local4.toCharArray();
			@Pc(10) int local10 = local7.length;
			@Pc(12) boolean local12 = true;
			for (@Pc(23) int local23 = 0; local23 < local10; local23++) {
				@Pc(29) char local29 = local7[local23];
				if (local12 && local29 >= 'a' && local29 <= 'z') {
					local7[local23] = (char) (local7[local23] - 32);
					local12 = false;
				}
				if (local29 == '.' || local29 == '!') {
					local12 = true;
				}
			}
			return new String(local7);
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("76589, " + arg0 + ", " + -607 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method681(@OriginalArg(0) String arg0) {
		try {
			@Pc(1) String local1 = "";
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local1 = local1 + "*";
			}
			return local1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("87096, " + arg0 + ", " + 4 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}
