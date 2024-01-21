import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DQKGVELR")
public final class Class7 {

	@OriginalMember(owner = "client!DQKGVELR", name = "h", descriptor = "Z")
	private static boolean aBoolean32;

	@OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "I")
	private static int anInt138 = -41034;

	@OriginalMember(owner = "client!DQKGVELR", name = "b", descriptor = "Z")
	private static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!DQKGVELR", name = "c", descriptor = "I")
	private static int anInt139 = 578;

	@OriginalMember(owner = "client!DQKGVELR", name = "d", descriptor = "B")
	private static byte aByte4 = 5;

	@OriginalMember(owner = "client!DQKGVELR", name = "e", descriptor = "Z")
	private static boolean aBoolean31 = true;

	@OriginalMember(owner = "client!DQKGVELR", name = "f", descriptor = "I")
	private static int anInt140 = -660;

	@OriginalMember(owner = "client!DQKGVELR", name = "g", descriptor = "I")
	private static int anInt141 = -377;

	@OriginalMember(owner = "client!DQKGVELR", name = "i", descriptor = "[C")
	private static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method55(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method56(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(31) char[] local31 = new char[12];
				while (arg0 != 0L) {
					@Pc(35) long local35 = arg0;
					arg0 /= 37L;
					local31[11 - local19++] = aCharArray1[(int) (local35 - arg0 * 37L)];
				}
				return new String(local31, 12 - local19, local19);
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("55786, " + 39082 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method57(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(4) String local4 = arg1.toUpperCase();
			@Pc(6) long local6 = 0L;
			for (@Pc(8) int local8 = 0; local8 < local4.length(); local8++) {
				local6 = local6 * 61L + (long) local4.charAt(local8) - 32L;
				local6 = local6 + (local6 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			@Pc(39) boolean local39 = false;
			return local6;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("47821, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method58(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("63607, " + 8 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method59(@OriginalArg(0) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(17) char[] local17 = arg0.toCharArray();
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				if (local17[local19] == '_') {
					local17[local19] = ' ';
					if (local19 + 1 < local17.length && local17[local19 + 1] >= 'a' && local17[local19 + 1] <= 'z') {
						local17[local19 + 1] = (char) (local17[local19 + 1] + 'A' - 97);
					}
				}
			}
			if (local17[0] >= 'a' && local17[0] <= 'z') {
				local17[0] = (char) (local17[0] + 'A' - 97);
			}
			return new String(local17);
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("83253, " + arg0 + ", " + 7139 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method60(@OriginalArg(0) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("84782, " + arg0 + ", " + -26 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}
}
