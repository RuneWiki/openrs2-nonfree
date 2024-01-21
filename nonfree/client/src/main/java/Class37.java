import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!vb")
public final class Class37 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	private static int anInt609 = -339;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private static int anInt610 = 8;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[C")
	private static char[] aCharArray1 = new char[12];

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method481(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method482(@OriginalArg(1) long arg0) {
		try {
			if (arg0 < 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			}
			@Pc(11) int local11 = 0;
			while (arg0 != 0L) {
				@Pc(19) long local19 = arg0;
				arg0 /= 37L;
				aCharArray1[11 - local11++] = aCharArray2[(int) (local19 - arg0 * 37L)];
			}
			return new String(aCharArray1, 12 - local11, local11);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("17221, " + true + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method483(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toLowerCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(6) int local6 = 0; local6 < local2.length(); local6++) {
				local4 = local4 * 61L + (long) local2.charAt(local6) - 32L;
			}
			return local4;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("7659, " + arg0 + ", " + 6 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method484(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("43593, " + -580 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method485(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toLowerCase();
			@Pc(5) char[] local5 = local2.toCharArray();
			@Pc(15) int local15 = local5.length;
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
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
			signlink.reporterror("7832, " + -4442 + ", " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method486(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(17) String local17 = "";
			for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
				local17 = local17 + "*";
			}
			return local17;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("52554, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}
}
