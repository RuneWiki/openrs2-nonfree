import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XBRLLWQI")
public final class Class43 {

	@OriginalMember(owner = "client!XBRLLWQI", name = "a", descriptor = "B")
	private static byte aByte38 = 4;

	@OriginalMember(owner = "client!XBRLLWQI", name = "b", descriptor = "I")
	private static int anInt757 = -33;

	@OriginalMember(owner = "client!XBRLLWQI", name = "c", descriptor = "Z")
	private static boolean aBoolean198 = true;

	@OriginalMember(owner = "client!XBRLLWQI", name = "d", descriptor = "I")
	private static int anInt758 = -686;

	@OriginalMember(owner = "client!XBRLLWQI", name = "e", descriptor = "I")
	private static int anInt759 = 7;

	@OriginalMember(owner = "client!XBRLLWQI", name = "f", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!XBRLLWQI", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method544(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!XBRLLWQI", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method545(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(26) int local26 = 0;
				@Pc(29) char[] local29 = new char[12];
				while (arg0 != 0L) {
					@Pc(33) long local33 = arg0;
					arg0 /= 37L;
					local29[11 - local26++] = aCharArray4[(int) (local33 - arg0 * 37L)];
				}
				return new String(local29, 12 - local26, local26);
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("14569, " + 57 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBRLLWQI", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method546(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(10) int local10 = 0; local10 < local2.length(); local10++) {
				local4 = local4 * 61L + (long) local2.charAt(local10) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("73122, " + arg0 + ", " + 464 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBRLLWQI", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method547(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("64, " + true + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBRLLWQI", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method548(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("243, " + arg0 + ", " + 0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBRLLWQI", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method549(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			@Pc(13) StringBuffer local13 = new StringBuffer();
			for (@Pc(15) int local15 = 0; local15 < arg1.length(); local15++) {
				local13.append("*");
			}
			return local13.toString();
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("55846, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}
}
