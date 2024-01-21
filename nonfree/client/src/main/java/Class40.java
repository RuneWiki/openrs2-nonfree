import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class40 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Z")
	private static boolean aBoolean158;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Z")
	private static boolean aBoolean159;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "B")
	private static byte aByte42 = 9;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private static int anInt782 = 420;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private static int anInt783 = 4;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[C")
	private static char[] aCharArray1 = new char[12];

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method530(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method531(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				while (arg0 != 0L) {
					@Pc(32) long local32 = arg0;
					arg0 /= 37L;
					aCharArray1[11 - local19++] = aCharArray2[(int) (local32 - arg0 * 37L)];
				}
				return new String(aCharArray1, 12 - local19, local19);
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("47474, " + arg0 + ", " + -38644 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method532(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(12) int local12 = 0; local12 < local2.length(); local12++) {
				local4 = local4 * 61L + (long) local2.charAt(local12) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("3725, " + arg0 + ", " + true + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method533(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("54587, " + arg0 + ", " + true + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method534(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("96921, " + -148 + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method535(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toLowerCase();
			@Pc(13) char[] local13 = local2.toCharArray();
			@Pc(16) int local16 = local13.length;
			@Pc(18) boolean local18 = true;
			for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
				@Pc(26) char local26 = local13[local20];
				if (local18 && local26 >= 'a' && local26 <= 'z') {
					local13[local20] = (char) (local13[local20] - 32);
					local18 = false;
				}
				if (local26 == '.' || local26 == '!') {
					local18 = true;
				}
			}
			return new String(local13);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("30987, " + 0 + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method536(@OriginalArg(1) String arg0) {
		try {
			@Pc(1) String local1 = "";
			for (@Pc(8) int local8 = 0; local8 < arg0.length(); local8++) {
				local1 = local1 + "*";
			}
			return local1;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("30400, " + 4 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}
}
