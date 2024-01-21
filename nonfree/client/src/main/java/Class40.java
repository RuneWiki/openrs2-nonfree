import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class40 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private static int anInt769;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private static int anInt768 = 63;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
	private static boolean aBoolean154 = true;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[C")
	private static char[] aCharArray1 = new char[12];

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method538(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method539(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				while (arg0 != 0L) {
					@Pc(27) long local27 = arg0;
					arg0 /= 37L;
					aCharArray1[11 - local19++] = aCharArray2[(int) (local27 - arg0 * 37L)];
				}
				return new String(aCharArray1, 12 - local19, local19);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("53811, " + arg0 + ", " + true + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method540(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(12) int local12 = 0; local12 < local2.length(); local12++) {
				local4 = local4 * 61L + (long) local2.charAt(local12) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("27994, " + false + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method541(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 5) {
				@Pc(4) boolean local4 = false;
			} else {
				anInt769 = -142;
			}
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("64937, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method542(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("7589, " + 0 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method543(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toLowerCase();
			@Pc(5) char[] local5 = local2.toCharArray();
			@Pc(12) int local12 = local5.length;
			@Pc(14) boolean local14 = true;
			for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
				@Pc(22) char local22 = local5[local16];
				if (local14 && local22 >= 'a' && local22 <= 'z') {
					local5[local16] = (char) (local5[local16] - 32);
					local14 = false;
				}
				if (local22 == '.' || local22 == '!') {
					local14 = true;
				}
			}
			return new String(local5);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("76672, " + false + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method544(@OriginalArg(1) String arg0) {
		try {
			@Pc(11) String local11 = "";
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11 = local11 + "*";
			}
			return local11;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("55247, " + 0 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}
}
