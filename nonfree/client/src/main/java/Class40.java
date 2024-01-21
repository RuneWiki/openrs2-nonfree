import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class40 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Z")
	private static boolean aBoolean174 = true;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private static int anInt762 = 38131;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private static int anInt763 = -3154;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[C")
	private static char[] aCharArray1 = new char[12];

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method530(@OriginalArg(0) String arg0) {
		@Pc(4) String local4 = arg0.trim();
		@Pc(6) long local6 = 0L;
		for (@Pc(8) int local8 = 0; local8 < local4.length() && local8 < 12; local8++) {
			@Pc(14) char local14 = local4.charAt(local8);
			local6 *= 37L;
			if (local14 >= 'A' && local14 <= 'Z') {
				local6 += local14 + 1 - 65;
			} else if (local14 >= 'a' && local14 <= 'z') {
				local6 += local14 + 1 - 97;
			} else if (local14 >= '0' && local14 <= '9') {
				local6 += local14 + 27 - 48;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method531(@OriginalArg(0) long arg0) {
		try {
			if (arg0 < 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			}
			@Pc(16) int local16 = 0;
			while (arg0 != 0L) {
				@Pc(20) long local20 = arg0;
				arg0 /= 37L;
				aCharArray1[11 - local16++] = aCharArray2[(int) (local20 - arg0 * 37L)];
			}
			return new String(aCharArray1, 12 - local16, local16);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("74487, " + arg0 + ", " + -74 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method532(@OriginalArg(1) String arg0) {
		try {
			@Pc(8) String local8 = arg0.toUpperCase();
			@Pc(10) long local10 = 0L;
			for (@Pc(12) int local12 = 0; local12 < local8.length(); local12++) {
				local10 = local10 * 61L + (long) local8.charAt(local12) - 32L;
				local10 = local10 + (local10 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local10;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("96279, " + false + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method533(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("45705, " + arg0 + ", " + -639 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method534(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("97328, " + arg0 + ", " + true + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method535(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toLowerCase();
			@Pc(5) char[] local5 = local2.toCharArray();
			@Pc(13) int local13 = local5.length;
			@Pc(15) boolean local15 = true;
			for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
				@Pc(23) char local23 = local5[local17];
				if (local15 && local23 >= 'a' && local23 <= 'z') {
					local5[local17] = (char) (local5[local17] - 32);
					local15 = false;
				}
				if (local23 == '.' || local23 == '!') {
					local15 = true;
				}
			}
			return new String(local5);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("76418, " + arg0 + ", " + 99 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method536(@OriginalArg(0) String arg0) {
		try {
			@Pc(7) String local7 = "";
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				local7 = local7 + "*";
			}
			return local7;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("65269, " + arg0 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
