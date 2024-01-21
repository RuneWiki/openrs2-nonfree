import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VUKQGAWR")
public final class Class41 {

	@OriginalMember(owner = "client!VUKQGAWR", name = "b", descriptor = "I")
	private static int anInt706 = 5;

	@OriginalMember(owner = "client!VUKQGAWR", name = "c", descriptor = "B")
	private static byte aByte48 = 7;

	@OriginalMember(owner = "client!VUKQGAWR", name = "d", descriptor = "I")
	private static int anInt707 = -22582;

	@OriginalMember(owner = "client!VUKQGAWR", name = "e", descriptor = "B")
	private static byte aByte49 = 11;

	@OriginalMember(owner = "client!VUKQGAWR", name = "f", descriptor = "Z")
	private static boolean aBoolean172 = true;

	@OriginalMember(owner = "client!VUKQGAWR", name = "g", descriptor = "I")
	private static int anInt708 = -55;

	@OriginalMember(owner = "client!VUKQGAWR", name = "h", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method481(@OriginalArg(0) String arg0) {
		@Pc(3) long local3 = 0L;
		for (@Pc(5) int local5 = 0; local5 < arg0.length() && local5 < 12; local5++) {
			@Pc(11) char local11 = arg0.charAt(local5);
			local3 *= 37L;
			if (local11 >= 'A' && local11 <= 'Z') {
				local3 += (long) (1 + local11 - 65);
			} else if (local11 >= 'a' && local11 <= 'z') {
				local3 += (long) (1 + local11 - 97);
			} else if (local11 >= '0' && local11 <= '9') {
				local3 += (long) (27 + local11 - 48);
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method482(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		try {
			if (7 == aByte48) {
				@Pc(6) boolean local6 = false;
			}
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(34) int local34 = 0;
				@Pc(37) char[] local37 = new char[12];
				while (arg0 != 0L) {
					@Pc(41) long local41 = arg0;
					arg0 /= 37L;
					local37[11 - local34++] = aCharArray4[(int) (local41 - arg0 * 37L)];
				}
				return new String(local37, 12 - local34, local34);
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("48560, " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method483(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(6) long local6 = 0L;
			for (@Pc(17) int local17 = 0; local17 < local4.length(); local17++) {
				local6 = local6 * 61L + (long) local4.charAt(local17) - 32L;
				local6 = local6 + (local6 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local6;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("98259, " + arg0 + ", " + true + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method484(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("10992, " + arg0 + ", " + 7 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method485(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("48519, " + 0 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUKQGAWR", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method486(@OriginalArg(1) String arg0) {
		try {
			@Pc(12) StringBuffer local12 = new StringBuffer();
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				local12.append("*");
			}
			return local12.toString();
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("27587, " + -40219 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
