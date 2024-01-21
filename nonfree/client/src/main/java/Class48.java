import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "Z")
	private static boolean aBoolean236 = true;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private static int anInt983 = 618;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private static int anInt984 = 7;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "B")
	private static byte aByte46 = 7;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "I")
	private static int anInt985 = -407;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "I")
	private static int anInt986 = 1;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method660(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method661(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(28) char[] local28 = new char[12];
				while (arg0 != 0L) {
					@Pc(32) long local32 = arg0;
					arg0 /= 37L;
					local28[11 - local19++] = aCharArray2[(int) (local32 - arg0 * 37L)];
				}
				return new String(local28, 12 - local19, local19);
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("19920, " + 0 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method662(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			if (anInt984 > 7 || anInt984 < 7) {
				aBoolean236 = !aBoolean236;
			}
			@Pc(16) long local16 = 0L;
			for (@Pc(18) int local18 = 0; local18 < local2.length(); local18++) {
				local16 = local16 * 61L + (long) local2.charAt(local18) - 32L;
				local16 = local16 + (local16 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local16;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("29520, " + 7 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method663(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("16952, " + 94 + ", " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method664(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("47678, " + 131 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method665(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toLowerCase();
			@Pc(5) char[] local5 = local2.toCharArray();
			@Pc(8) int local8 = local5.length;
			@Pc(10) boolean local10 = true;
			for (@Pc(16) int local16 = 0; local16 < local8; local16++) {
				@Pc(22) char local22 = local5[local16];
				if (local10 && local22 >= 'a' && local22 <= 'z') {
					local5[local16] = (char) (local5[local16] - 32);
					local10 = false;
				}
				if (local22 == '.' || local22 == '!') {
					local10 = true;
				}
			}
			return new String(local5);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("14098, " + arg0 + ", " + -407 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method666(@OriginalArg(0) String arg0) {
		try {
			@Pc(9) StringBuffer local9 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local9.append("*");
			}
			return local9.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("17136, " + arg0 + ", " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
