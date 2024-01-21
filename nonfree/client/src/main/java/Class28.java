import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OERTMYQW")
public final class Class28 {

	@OriginalMember(owner = "client!OERTMYQW", name = "a", descriptor = "Z")
	private static boolean aBoolean116 = true;

	@OriginalMember(owner = "client!OERTMYQW", name = "b", descriptor = "B")
	private static byte aByte14 = 8;

	@OriginalMember(owner = "client!OERTMYQW", name = "c", descriptor = "Z")
	private static boolean aBoolean117 = true;

	@OriginalMember(owner = "client!OERTMYQW", name = "d", descriptor = "I")
	private static int anInt394 = -138;

	@OriginalMember(owner = "client!OERTMYQW", name = "e", descriptor = "I")
	private static int anInt395 = 8;

	@OriginalMember(owner = "client!OERTMYQW", name = "f", descriptor = "I")
	private static int anInt396 = 148;

	@OriginalMember(owner = "client!OERTMYQW", name = "g", descriptor = "I")
	private static int anInt397 = 7;

	@OriginalMember(owner = "client!OERTMYQW", name = "h", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!OERTMYQW", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method346(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!OERTMYQW", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method347(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(27) int local27 = 0;
				@Pc(30) char[] local30 = new char[12];
				while (arg0 != 0L) {
					@Pc(34) long local34 = arg0;
					arg0 /= 37L;
					local30[11 - local27++] = aCharArray2[(int) (local34 - arg0 * 37L)];
				}
				return new String(local30, 12 - local27, local27);
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("80711, " + 359 + ", " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OERTMYQW", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method348(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(15) long local15 = 0L;
			for (@Pc(17) int local17 = 0; local17 < local4.length(); local17++) {
				local15 = local15 * 61L + (long) local4.charAt(local17) - 32L;
				local15 = local15 + (local15 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local15;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("19824, " + arg0 + ", " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OERTMYQW", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method349(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("4621, " + 2 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OERTMYQW", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method350(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("62557, " + true + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OERTMYQW", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method351(@OriginalArg(0) String arg0) {
		try {
			@Pc(8) StringBuffer local8 = new StringBuffer();
			for (@Pc(10) int local10 = 0; local10 < arg0.length(); local10++) {
				local8.append("*");
			}
			return local8.toString();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("92598, " + arg0 + ", " + 3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}
}
