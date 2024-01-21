import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DCKSLYWK")
public final class Class7 {

	@OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "Z")
	private static boolean aBoolean19 = true;

	@OriginalMember(owner = "client!DCKSLYWK", name = "b", descriptor = "Z")
	private static boolean aBoolean20 = true;

	@OriginalMember(owner = "client!DCKSLYWK", name = "c", descriptor = "B")
	private static byte aByte4 = -68;

	@OriginalMember(owner = "client!DCKSLYWK", name = "d", descriptor = "B")
	private static byte aByte5 = 8;

	@OriginalMember(owner = "client!DCKSLYWK", name = "e", descriptor = "I")
	private static int anInt78 = -77;

	@OriginalMember(owner = "client!DCKSLYWK", name = "f", descriptor = "I")
	private static int anInt79 = 192;

	@OriginalMember(owner = "client!DCKSLYWK", name = "g", descriptor = "B")
	private static byte aByte6 = 79;

	@OriginalMember(owner = "client!DCKSLYWK", name = "h", descriptor = "I")
	private static int anInt80 = -178;

	@OriginalMember(owner = "client!DCKSLYWK", name = "i", descriptor = "I")
	private static int anInt81 = 6;

	@OriginalMember(owner = "client!DCKSLYWK", name = "k", descriptor = "[C")
	private static final char[] aCharArray3;

	static {
		aBoolean21 = true;
		aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	}

	@OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method53(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method54(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(26) char[] local26 = new char[12];
				while (arg0 != 0L) {
					@Pc(30) long local30 = arg0;
					arg0 /= 37L;
					local26[11 - local19++] = aCharArray3[(int) (local30 - arg0 * 37L)];
				}
				return new String(local26, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("98352, " + false + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method55(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(4) String local4 = arg1.toUpperCase();
			@Pc(6) long local6 = 0L;
			for (@Pc(8) int local8 = 0; local8 < local4.length(); local8++) {
				local6 = local6 * 61L + (long) local4.charAt(local8) - 32L;
				local6 = local6 + (local6 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			@Pc(39) boolean local39 = false;
			return local6;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("5758, " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method56(@OriginalArg(0) int arg0) {
		try {
			if (aByte5 != 8) {
				throw new NullPointerException();
			}
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("62767, " + arg0 + ", " + 8 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DCKSLYWK", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method57(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(14) char[] local14 = arg0.toCharArray();
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				if (local14[local16] == '_') {
					local14[local16] = ' ';
					if (local16 + 1 < local14.length && local14[local16 + 1] >= 'a' && local14[local16 + 1] <= 'z') {
						local14[local16 + 1] = (char) (local14[local16 + 1] + 'A' - 97);
					}
				}
			}
			if (local14[0] >= 'a' && local14[0] <= 'z') {
				local14[0] = (char) (local14[0] + 'A' - 97);
			}
			return new String(local14);
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("35899, " + -32 + ", " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method58(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("36024, " + true + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
