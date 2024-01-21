import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class48 {

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private static int anInt975 = 8;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private static int anInt976 = -208;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private static int anInt977 = 4;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "Z")
	private static boolean aBoolean257 = true;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "I")
	private static int anInt978 = 70;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "Z")
	private static boolean aBoolean258 = true;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[C")
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

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method668(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(26) char[] local26 = new char[12];
				while (arg0 != 0L) {
					@Pc(30) long local30 = arg0;
					arg0 /= 37L;
					local26[11 - local19++] = aCharArray2[(int) (local30 - arg0 * 37L)];
				}
				return new String(local26, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("59481, " + false + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method669(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(11) long local11 = 0L;
			for (@Pc(13) int local13 = 0; local13 < local2.length(); local13++) {
				local11 = local11 * 61L + (long) local2.charAt(local13) - 32L;
				local11 = local11 + (local11 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local11;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("22894, " + arg0 + ", " + 32501 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method670(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == 5) {
				@Pc(4) boolean local4 = false;
			}
			return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("89447, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
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
			signlink.reporterror("32685, " + false + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method672(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(16) StringBuffer local16 = new StringBuffer();
			for (@Pc(18) int local18 = 0; local18 < arg1.length(); local18++) {
				local16.append("*");
			}
			return local16.toString();
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("36609, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
