import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VTCTQQUO")
public final class Class42 {

	@OriginalMember(owner = "client!VTCTQQUO", name = "f", descriptor = "Z")
	private static boolean aBoolean181;

	@OriginalMember(owner = "client!VTCTQQUO", name = "a", descriptor = "I")
	private static int anInt697 = 8;

	@OriginalMember(owner = "client!VTCTQQUO", name = "b", descriptor = "B")
	private static byte aByte28 = -45;

	@OriginalMember(owner = "client!VTCTQQUO", name = "c", descriptor = "I")
	private static int anInt698 = 3;

	@OriginalMember(owner = "client!VTCTQQUO", name = "d", descriptor = "Z")
	private static boolean aBoolean180 = true;

	@OriginalMember(owner = "client!VTCTQQUO", name = "e", descriptor = "I")
	private static int anInt699 = 7;

	@OriginalMember(owner = "client!VTCTQQUO", name = "g", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!VTCTQQUO", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method464(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!VTCTQQUO", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method465(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg1 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				if (arg0 != 33820) {
					throw new NullPointerException();
				}
				@Pc(29) char[] local29 = new char[12];
				while (arg1 != 0L) {
					@Pc(33) long local33 = arg1;
					arg1 /= 37L;
					local29[11 - local19++] = aCharArray4[(int) (local33 - arg1 * 37L)];
				}
				return new String(local29, 12 - local19, local19);
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("46849, " + arg0 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VTCTQQUO", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method466(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(14) int local14 = 0; local14 < local2.length(); local14++) {
				local4 = local4 * 61L + (long) local2.charAt(local14) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("16980, " + -285 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VTCTQQUO", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method467(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("74942, " + arg0 + ", " + 4 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VTCTQQUO", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method468(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("77483, " + false + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VTCTQQUO", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method469(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			if (arg0 != anInt698) {
				anInt698 = -281;
			}
			for (@Pc(10) int local10 = 0; local10 < arg1.length(); local10++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("3523, " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}
}
