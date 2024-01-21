import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SFBUQEXP")
public final class Class34 {

	@OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "Z")
	private static boolean aBoolean192 = true;

	@OriginalMember(owner = "client!SFBUQEXP", name = "b", descriptor = "B")
	private static byte aByte51 = 7;

	@OriginalMember(owner = "client!SFBUQEXP", name = "c", descriptor = "Z")
	private static boolean aBoolean193 = true;

	@OriginalMember(owner = "client!SFBUQEXP", name = "d", descriptor = "I")
	private static int anInt650 = -422;

	@OriginalMember(owner = "client!SFBUQEXP", name = "e", descriptor = "I")
	private static int anInt651 = 340;

	@OriginalMember(owner = "client!SFBUQEXP", name = "f", descriptor = "Z")
	private static boolean aBoolean194 = true;

	@OriginalMember(owner = "client!SFBUQEXP", name = "g", descriptor = "I")
	private static int anInt652 = -198;

	@OriginalMember(owner = "client!SFBUQEXP", name = "h", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method478(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method479(@OriginalArg(1) long arg0) {
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
					local28[11 - local19++] = aCharArray2[(int) (local32 - arg0 * 37L)];
				}
				return new String(local28, 12 - local19, local19);
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("49378, " + false + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method480(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(15) String local15 = arg1.toUpperCase();
			@Pc(17) long local17 = 0L;
			for (@Pc(19) int local19 = 0; local19 < local15.length(); local19++) {
				local17 = local17 * 61L + (long) local15.charAt(local19) - 32L;
				local17 = local17 + (local17 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local17;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("96021, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method481(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("5811, " + arg0 + ", " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method482(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("87494, " + arg0 + ", " + true + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method483(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("5327, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
