import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LBMFERBT")
public final class Class20 {

	@OriginalMember(owner = "client!LBMFERBT", name = "a", descriptor = "I")
	private static int anInt506 = -710;

	@OriginalMember(owner = "client!LBMFERBT", name = "b", descriptor = "I")
	private static int anInt507 = -28345;

	@OriginalMember(owner = "client!LBMFERBT", name = "c", descriptor = "I")
	private static int anInt508 = 685;

	@OriginalMember(owner = "client!LBMFERBT", name = "d", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!LBMFERBT", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method319(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!LBMFERBT", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method320(@OriginalArg(0) long arg0) {
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
			signlink.reporterror("42871, " + arg0 + ", " + 82 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBMFERBT", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method321(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(2) String local2 = arg1.toUpperCase();
			@Pc(4) long local4 = 0L;
			if (arg0 != -3107) {
				throw new NullPointerException();
			}
			for (@Pc(13) int local13 = 0; local13 < local2.length(); local13++) {
				local4 = local4 * 61L + (long) local2.charAt(local13) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("30386, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBMFERBT", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method322(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("10061, " + -60 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBMFERBT", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method323(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else if (arg1.length() > 0) {
				@Pc(11) char[] local11 = arg1.toCharArray();
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
			} else {
				return arg1;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("68621, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBMFERBT", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method324(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("18831, " + false + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
