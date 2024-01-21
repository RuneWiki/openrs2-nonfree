import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PZGHUCRX")
public final class Class28 {

	@OriginalMember(owner = "client!PZGHUCRX", name = "a", descriptor = "I")
	private static int anInt472 = -11452;

	@OriginalMember(owner = "client!PZGHUCRX", name = "c", descriptor = "Z")
	private static boolean aBoolean116 = true;

	@OriginalMember(owner = "client!PZGHUCRX", name = "d", descriptor = "I")
	private static int anInt473 = 33636;

	@OriginalMember(owner = "client!PZGHUCRX", name = "e", descriptor = "I")
	private static int anInt474 = 1;

	@OriginalMember(owner = "client!PZGHUCRX", name = "f", descriptor = "I")
	private static int anInt475 = -782;

	@OriginalMember(owner = "client!PZGHUCRX", name = "g", descriptor = "Z")
	private static boolean aBoolean117 = true;

	@OriginalMember(owner = "client!PZGHUCRX", name = "h", descriptor = "[C")
	private static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!PZGHUCRX", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method305(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!PZGHUCRX", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method306(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(21) int local21 = 0;
				@Pc(34) char[] local34 = new char[12];
				while (arg0 != 0L) {
					@Pc(38) long local38 = arg0;
					arg0 /= 37L;
					local34[11 - local21++] = aCharArray3[(int) (local38 - arg0 * 37L)];
				}
				return new String(local34, 12 - local21, local21);
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("64039, " + arg0 + ", " + 1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PZGHUCRX", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method307(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(6) long local6 = 0L;
			for (@Pc(8) int local8 = 0; local8 < local4.length(); local8++) {
				local6 = local6 * 61L + (long) local4.charAt(local8) - 32L;
				local6 = local6 + (local6 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local6;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("48062, " + arg0 + ", " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PZGHUCRX", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method308(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("14139, " + arg0 + ", " + -63 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PZGHUCRX", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method309(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("75318, " + -354 + ", " + arg0 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PZGHUCRX", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method310(@OriginalArg(1) String arg0) {
		try {
			@Pc(11) StringBuffer local11 = new StringBuffer();
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11.append("*");
			}
			return local11.toString();
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("38166, " + false + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
