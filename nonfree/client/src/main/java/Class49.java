import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XNWHEMGT")
public final class Class49 {

	@OriginalMember(owner = "client!XNWHEMGT", name = "a", descriptor = "I")
	private static int anInt792 = -642;

	@OriginalMember(owner = "client!XNWHEMGT", name = "b", descriptor = "I")
	private static int anInt793 = -29040;

	@OriginalMember(owner = "client!XNWHEMGT", name = "c", descriptor = "Z")
	private static boolean aBoolean183 = true;

	@OriginalMember(owner = "client!XNWHEMGT", name = "d", descriptor = "I")
	private static int anInt794 = 2;

	@OriginalMember(owner = "client!XNWHEMGT", name = "e", descriptor = "Z")
	private static boolean aBoolean184 = true;

	@OriginalMember(owner = "client!XNWHEMGT", name = "f", descriptor = "I")
	private static int anInt795 = 49176;

	@OriginalMember(owner = "client!XNWHEMGT", name = "g", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!XNWHEMGT", name = "a", descriptor = "(Ljava/lang/String;)J")
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

	@OriginalMember(owner = "client!XNWHEMGT", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method539(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(21) int local21 = 0;
				@Pc(24) char[] local24 = new char[12];
				while (arg0 != 0L) {
					@Pc(36) long local36 = arg0;
					arg0 /= 37L;
					local24[11 - local21++] = aCharArray4[(int) (local36 - arg0 * 37L)];
				}
				return new String(local24, 12 - local21, local21);
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("25724, " + arg0 + ", " + -642 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XNWHEMGT", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method540(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(4) String local4 = arg1.toUpperCase();
			@Pc(6) long local6 = 0L;
			for (@Pc(8) int local8 = 0; local8 < local4.length(); local8++) {
				local6 = local6 * 61L + (long) local4.charAt(local8) - 32L;
				local6 = local6 + (local6 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			if (arg0 != 4) {
				throw new NullPointerException();
			}
			@Pc(39) boolean local39 = false;
			return local6;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("11234, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XNWHEMGT", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method541(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("82926, " + arg0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XNWHEMGT", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method542(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(10) char[] local10 = arg0.toCharArray();
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				if (local10[local12] == '_') {
					local10[local12] = ' ';
					if (local12 + 1 < local10.length && local10[local12 + 1] >= 'a' && local10[local12 + 1] <= 'z') {
						local10[local12 + 1] = (char) (local10[local12 + 1] + 'A' - 97);
					}
				}
			}
			if (local10[0] >= 'a' && local10[0] <= 'z') {
				local10[0] = (char) (local10[0] + 'A' - 97);
			}
			return new String(local10);
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("60810, " + 86 + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XNWHEMGT", name = "c", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method543(@OriginalArg(1) String arg0) {
		try {
			@Pc(12) StringBuffer local12 = new StringBuffer();
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				local12.append("*");
			}
			return local12.toString();
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("27315, " + 4 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
