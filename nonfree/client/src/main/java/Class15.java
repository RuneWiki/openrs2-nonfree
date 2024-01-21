import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HCBZAWVW")
public final class Class15 {

	@OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "I")
	private static int anInt213 = -741;

	@OriginalMember(owner = "client!HCBZAWVW", name = "b", descriptor = "I")
	private static int anInt214 = 576;

	@OriginalMember(owner = "client!HCBZAWVW", name = "c", descriptor = "Z")
	private static boolean aBoolean64 = true;

	@OriginalMember(owner = "client!HCBZAWVW", name = "d", descriptor = "[C")
	private static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method198(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method199(@OriginalArg(1) long arg0) {
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
					local28[11 - local19++] = aCharArray1[(int) (local32 - arg0 * 37L)];
				}
				return new String(local28, 12 - local19, local19);
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("63943, " + false + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method200(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(6) int local6 = 0; local6 < local2.length(); local6++) {
				local4 = local4 * 61L + (long) local2.charAt(local6) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("152, " + -685 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method201(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("42409, " + arg0 + ", " + 7 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method202(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(16) char[] local16 = arg0.toCharArray();
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				if (local16[local18] == '_') {
					local16[local18] = ' ';
					if (local18 + 1 < local16.length && local16[local18 + 1] >= 'a' && local16[local18 + 1] <= 'z') {
						local16[local18 + 1] = (char) (local16[local18 + 1] + 'A' - 97);
					}
				}
			}
			if (local16[0] >= 'a' && local16[0] <= 'z') {
				local16[0] = (char) (local16[0] + 'A' - 97);
			}
			return new String(local16);
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("52926, " + true + ", " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method203(@OriginalArg(0) String arg0) {
		try {
			@Pc(5) StringBuffer local5 = new StringBuffer();
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				local5.append("*");
			}
			return local5.toString();
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("88332, " + arg0 + ", " + 6 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}
}
