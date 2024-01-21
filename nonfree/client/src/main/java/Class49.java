import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!zb")
public final class Class49 {

	@OriginalMember(owner = "client!zb", name = "d", descriptor = "Z")
	private static boolean aBoolean242;

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "I")
	private static int anInt1042 = -474;

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "I")
	private static int anInt1043 = -668;

	@OriginalMember(owner = "client!zb", name = "c", descriptor = "I")
	private static int anInt1044 = 1;

	@OriginalMember(owner = "client!zb", name = "e", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method700(@OriginalArg(0) String arg0) {
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
	public static String method701(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg1 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(23) boolean local23 = false;
				@Pc(26) char[] local26 = new char[12];
				while (arg1 != 0L) {
					@Pc(30) long local30 = arg1;
					arg1 /= 37L;
					local26[11 - local19++] = aCharArray4[(int) (local30 - arg1 * 37L)];
				}
				return new String(local26, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("50690, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method702(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(10) long local10 = 0L;
			for (@Pc(12) int local12 = 0; local12 < local2.length(); local12++) {
				local10 = local10 * 61L + (long) local2.charAt(local12) - 32L;
				local10 = local10 + (local10 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local10;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("69014, " + arg0 + ", " + false + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 44106) {
				throw new NullPointerException();
			}
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("74268, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method704(@OriginalArg(0) String arg0) {
		try {
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
			signlink.reporterror("8848, " + arg0 + ", " + 8 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method705(@OriginalArg(0) String arg0) {
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
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("27344, " + arg0 + ", " + 4 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!zb", name = "b", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method706(@OriginalArg(0) String arg0) {
		try {
			@Pc(11) StringBuffer local11 = new StringBuffer();
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11.append("*");
			}
			return local11.toString();
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("31443, " + arg0 + ", " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
