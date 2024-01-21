import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UJXMBJLW")
public final class Class40 {

	@OriginalMember(owner = "client!UJXMBJLW", name = "g", descriptor = "Z")
	private static boolean aBoolean127;

	@OriginalMember(owner = "client!UJXMBJLW", name = "h", descriptor = "Z")
	private static boolean aBoolean128;

	@OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "I")
	private static int anInt607 = 42220;

	@OriginalMember(owner = "client!UJXMBJLW", name = "b", descriptor = "I")
	private static int anInt608 = 111;

	@OriginalMember(owner = "client!UJXMBJLW", name = "c", descriptor = "Z")
	private static boolean aBoolean126 = true;

	@OriginalMember(owner = "client!UJXMBJLW", name = "d", descriptor = "I")
	private static int anInt609 = -607;

	@OriginalMember(owner = "client!UJXMBJLW", name = "e", descriptor = "I")
	private static int anInt610 = 431;

	@OriginalMember(owner = "client!UJXMBJLW", name = "f", descriptor = "I")
	private static int anInt611 = 437;

	@OriginalMember(owner = "client!UJXMBJLW", name = "i", descriptor = "Z")
	private static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!UJXMBJLW", name = "j", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method413(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method414(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(22) char[] local22 = new char[12];
				if (anInt607 != 42220) {
					aBoolean127 = !aBoolean127;
				}
				while (arg0 != 0L) {
					@Pc(35) long local35 = arg0;
					arg0 /= 37L;
					local22[11 - local19++] = aCharArray2[(int) (local35 - arg0 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("8782, " + 42220 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method415(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(6) long local6 = 0L;
			for (@Pc(8) int local8 = 0; local8 < local4.length(); local8++) {
				local6 = local6 * 61L + (long) local4.charAt(local8) - 32L;
				local6 = local6 + (local6 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local6;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("21050, " + 274 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method416(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("66229, " + -85 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method417(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(13) char[] local13 = arg0.toCharArray();
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				if (local13[local15] == '_') {
					local13[local15] = ' ';
					if (local15 + 1 < local13.length && local13[local15 + 1] >= 'a' && local13[local15 + 1] <= 'z') {
						local13[local15 + 1] = (char) (local13[local15 + 1] + 'A' - 97);
					}
				}
			}
			if (local13[0] >= 'a' && local13[0] <= 'z') {
				local13[0] = (char) (local13[0] + 'A' - 97);
			}
			return new String(local13);
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("90127, " + true + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJXMBJLW", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method418(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("77957, " + true + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
