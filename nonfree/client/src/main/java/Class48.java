import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private static int anInt997 = -971;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "B")
	private static byte aByte58 = -28;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "Z")
	private static boolean aBoolean238 = true;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "I")
	private static int anInt998 = -368;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method667(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method668(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(22) char[] local22 = new char[12];
				while (arg0 != 0L) {
					@Pc(30) long local30 = arg0;
					arg0 /= 37L;
					local22[11 - local19++] = aCharArray2[(int) (local30 - arg0 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("93047, " + arg0 + ", " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method669(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(6) int local6 = 0; local6 < local2.length(); local6++) {
				local4 = local4 * 61L + (long) local2.charAt(local6) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("48545, " + arg0 + ", " + 83 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method670(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("44216, " + true + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method671(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(11) char[] local11 = arg0.toCharArray();
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				if (local11[local13] == '_') {
					local11[local13] = ' ';
					if (local13 + 1 < local11.length && local11[local13 + 1] >= 'a' && local11[local13 + 1] <= 'z') {
						local11[local13 + 1] = (char) (local11[local13 + 1] + 'A' - 97);
					}
				}
			}
			if (local11[0] >= 'a' && local11[0] <= 'z') {
				local11[0] = (char) (local11[0] + 'A' - 97);
			}
			return new String(local11);
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("40948, " + -257 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method672(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("18286, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
