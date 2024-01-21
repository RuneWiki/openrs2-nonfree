import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZMJDGKKV")
public final class Class47 {

	@OriginalMember(owner = "client!ZMJDGKKV", name = "a", descriptor = "B")
	private static byte aByte27 = 122;

	@OriginalMember(owner = "client!ZMJDGKKV", name = "b", descriptor = "I")
	private static int anInt737 = 559;

	@OriginalMember(owner = "client!ZMJDGKKV", name = "c", descriptor = "I")
	private static int anInt738 = 41941;

	@OriginalMember(owner = "client!ZMJDGKKV", name = "d", descriptor = "I")
	private static int anInt739 = 4;

	@OriginalMember(owner = "client!ZMJDGKKV", name = "e", descriptor = "Z")
	private static boolean aBoolean194 = true;

	@OriginalMember(owner = "client!ZMJDGKKV", name = "f", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ZMJDGKKV", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method550(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ZMJDGKKV", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method551(@OriginalArg(0) long arg0) {
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
					local28[11 - local19++] = aCharArray4[(int) (local32 - arg0 * 37L)];
				}
				return new String(local28, 12 - local19, local19);
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("42192, " + arg0 + ", " + -115 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZMJDGKKV", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method552(@OriginalArg(1) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(6) long local6 = 0L;
			for (@Pc(8) int local8 = 0; local8 < local4.length(); local8++) {
				local6 = local6 * 61L + (long) local4.charAt(local8) - 32L;
				local6 = local6 + (local6 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local6;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("22199, " + 13619 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZMJDGKKV", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method553(@OriginalArg(1) int arg0) {
		try {
			if (aByte27 != 122) {
				anInt738 = 462;
			}
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("91626, " + 122 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZMJDGKKV", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method554(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
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
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("23662, " + 20 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZMJDGKKV", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method555(@OriginalArg(0) String arg0) {
		try {
			@Pc(9) StringBuffer local9 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local9.append("*");
			}
			return local9.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("9344, " + arg0 + ", " + 55 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
