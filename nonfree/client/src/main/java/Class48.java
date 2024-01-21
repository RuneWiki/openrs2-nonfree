import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private static int anInt1000 = 33070;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private static int anInt1001 = 942;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private static int anInt1002 = 9;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "Z")
	private static boolean aBoolean246 = true;

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
	public static String method668(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				if (arg1 < 3 || arg1 > 3) {
					anInt1002 = -73;
				}
				@Pc(30) char[] local30 = new char[12];
				while (arg0 != 0L) {
					@Pc(34) long local34 = arg0;
					arg0 /= 37L;
					local30[11 - local19++] = aCharArray2[(int) (local34 - arg0 * 37L)];
				}
				return new String(local30, 12 - local19, local19);
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("94774, " + arg0 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method669(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 != -46) {
				throw new NullPointerException();
			}
			@Pc(9) String local9 = arg1.toUpperCase();
			@Pc(11) long local11 = 0L;
			for (@Pc(13) int local13 = 0; local13 < local9.length(); local13++) {
				local11 = local11 * 61L + (long) local9.charAt(local13) - 32L;
				local11 = local11 + (local11 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local11;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("58598, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method670(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("12620, " + arg0 + ", " + true + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method671(@OriginalArg(0) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(10) char[] local10 = arg0.toCharArray();
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				if (local10[local12] == '_') {
					local10[local12] = ' ';
					if (local12 + 1 < local10.length && local10[local12 + 1] >= 'a' && local10[local12 + 1] <= 'z') {
						local10[local12 + 1] = (char) (local10[local12 + 1] + 'A' - 97);
					}
				}
			}
			if (local10[0] >= 'a' && local10[0] <= 'z') {
				local10[0] = (char) (local10[0] + 'A' - 97);
			}
			return new String(local10);
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("32351, " + arg0 + ", " + -4015 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method672(@OriginalArg(0) String arg0) {
		try {
			@Pc(13) StringBuffer local13 = new StringBuffer();
			for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
				local13.append("*");
			}
			return local13.toString();
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("22039, " + arg0 + ", " + -107 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}
}
