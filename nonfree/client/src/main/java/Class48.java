import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "I")
	private static int anInt981;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "Z")
	private static boolean aBoolean252 = true;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "Z")
	private static boolean aBoolean253 = true;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "Z")
	private static boolean aBoolean254 = true;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method661(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method662(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(22) char[] local22 = new char[12];
				while (arg0 != 0L) {
					@Pc(31) long local31 = arg0;
					arg0 /= 37L;
					local22[11 - local19++] = aCharArray2[(int) (local31 - arg0 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("66127, " + 3 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method663(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(10) long local10 = 0L;
			for (@Pc(12) int local12 = 0; local12 < local2.length(); local12++) {
				local10 = local10 * 61L + (long) local2.charAt(local12) - 32L;
				local10 = local10 + (local10 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local10;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("74488, " + true + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method664(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("39695, " + arg0 + ", " + 9 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method665(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("42544, " + 81 + ", " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method666(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toLowerCase();
			@Pc(5) char[] local5 = local2.toCharArray();
			@Pc(8) int local8 = local5.length;
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
				@Pc(25) char local25 = local5[local19];
				if (local17 && local25 >= 'a' && local25 <= 'z') {
					local5[local19] = (char) (local5[local19] - 32);
					local17 = false;
				}
				if (local25 == '.' || local25 == '!') {
					local17 = true;
				}
			}
			return new String(local5);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("4727, " + arg0 + ", " + -70 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method667(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("74360, " + arg0 + ", " + -238 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
