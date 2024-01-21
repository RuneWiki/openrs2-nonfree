import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JDMIWTSP")
public final class Class18 {

	@OriginalMember(owner = "client!JDMIWTSP", name = "a", descriptor = "Z")
	private static boolean aBoolean75 = true;

	@OriginalMember(owner = "client!JDMIWTSP", name = "b", descriptor = "Z")
	private static boolean aBoolean76 = true;

	@OriginalMember(owner = "client!JDMIWTSP", name = "c", descriptor = "I")
	private static int anInt323 = 598;

	@OriginalMember(owner = "client!JDMIWTSP", name = "d", descriptor = "I")
	private static int anInt324 = 49845;

	@OriginalMember(owner = "client!JDMIWTSP", name = "e", descriptor = "I")
	private static int anInt325 = -306;

	@OriginalMember(owner = "client!JDMIWTSP", name = "f", descriptor = "I")
	private static int anInt326 = -250;

	@OriginalMember(owner = "client!JDMIWTSP", name = "g", descriptor = "Z")
	private static boolean aBoolean77 = true;

	@OriginalMember(owner = "client!JDMIWTSP", name = "h", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!JDMIWTSP", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method206(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!JDMIWTSP", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method207(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg1 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(22) char[] local22 = new char[12];
				if (!arg0) {
					anInt326 = -7;
				}
				while (arg1 != 0L) {
					@Pc(30) long local30 = arg1;
					arg1 /= 37L;
					local22[11 - local19++] = aCharArray2[(int) (local30 - arg1 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("28942, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDMIWTSP", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method208(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(15) long local15 = 0L;
			for (@Pc(17) int local17 = 0; local17 < local4.length(); local17++) {
				local15 = local15 * 61L + (long) local4.charAt(local17) - 32L;
				local15 = local15 + (local15 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local15;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("9634, " + true + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDMIWTSP", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method209(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("8907, " + arg0 + ", " + 0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDMIWTSP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method210(@OriginalArg(1) String arg0) {
		try {
			if (anInt324 != 49845) {
				throw new NullPointerException();
			} else if (arg0.length() > 0) {
				@Pc(12) char[] local12 = arg0.toCharArray();
				for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
					if (local12[local14] == '_') {
						local12[local14] = ' ';
						if (local14 + 1 < local12.length && local12[local14 + 1] >= 'a' && local12[local14 + 1] <= 'z') {
							local12[local14 + 1] = (char) (local12[local14 + 1] + 'A' - 97);
						}
					}
				}
				if (local12[0] >= 'a' && local12[0] <= 'z') {
					local12[0] = (char) (local12[0] + 'A' - 97);
				}
				return new String(local12);
			} else {
				return arg0;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("62302, " + 49845 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDMIWTSP", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method211(@OriginalArg(0) String arg0) {
		try {
			@Pc(5) StringBuffer local5 = new StringBuffer();
			for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
				local5.append("*");
			}
			return local5.toString();
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("45605, " + arg0 + ", " + false + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}
