import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LJWIWXSK")
public final class Class26 {

	@OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "I")
	private static int anInt326 = 236;

	@OriginalMember(owner = "client!LJWIWXSK", name = "b", descriptor = "I")
	private static int anInt327 = -20714;

	@OriginalMember(owner = "client!LJWIWXSK", name = "c", descriptor = "I")
	private static int anInt328 = 3;

	@OriginalMember(owner = "client!LJWIWXSK", name = "d", descriptor = "I")
	private static int anInt329 = -68;

	@OriginalMember(owner = "client!LJWIWXSK", name = "e", descriptor = "[C")
	private static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method248(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method249(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(25) int local25 = 0;
				@Pc(28) char[] local28 = new char[12];
				while (arg0 != 0L) {
					@Pc(32) long local32 = arg0;
					arg0 /= 37L;
					local28[11 - local25++] = aCharArray1[(int) (local32 - arg0 * 37L)];
				}
				return new String(local28, 12 - local25, local25);
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("93269, " + arg0 + ", " + 0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method250(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(2) String local2 = arg1.toUpperCase();
			@Pc(4) long local4 = 0L;
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < local2.length(); local10++) {
				local4 = local4 * 61L + (long) local2.charAt(local10) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("28419, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method251(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("19868, " + arg0 + ", " + -826 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJWIWXSK", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method252(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
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
			signlink.reporterror("81217, " + arg0 + ", " + arg1 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJWIWXSK", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method253(@OriginalArg(1) String arg0) {
		try {
			@Pc(5) StringBuffer local5 = new StringBuffer();
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				local5.append("*");
			}
			return local5.toString();
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("9657, " + 2934 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}
}
