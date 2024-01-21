import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PQGPOSRV")
public final class Class31 {

	@OriginalMember(owner = "client!PQGPOSRV", name = "d", descriptor = "Z")
	private static boolean aBoolean134;

	@OriginalMember(owner = "client!PQGPOSRV", name = "a", descriptor = "B")
	private static byte aByte22 = 8;

	@OriginalMember(owner = "client!PQGPOSRV", name = "b", descriptor = "I")
	private static int anInt540 = 8;

	@OriginalMember(owner = "client!PQGPOSRV", name = "c", descriptor = "I")
	private static int anInt541 = -550;

	@OriginalMember(owner = "client!PQGPOSRV", name = "e", descriptor = "I")
	private static int anInt542 = -41990;

	@OriginalMember(owner = "client!PQGPOSRV", name = "f", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!PQGPOSRV", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method379(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!PQGPOSRV", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method380(@OriginalArg(0) long arg0) {
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
					local24[11 - local21++] = aCharArray2[(int) (local36 - arg0 * 37L)];
				}
				return new String(local24, 12 - local21, local21);
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("1940, " + arg0 + ", " + -437 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQGPOSRV", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method381(@OriginalArg(0) String arg0) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(15) long local15 = 0L;
			for (@Pc(17) int local17 = 0; local17 < local4.length(); local17++) {
				local15 = local15 * 61L + (long) local4.charAt(local17) - 32L;
				local15 = local15 + (local15 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local15;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("21370, " + arg0 + ", " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQGPOSRV", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method382(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("48717, " + arg0 + ", " + false + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQGPOSRV", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method383(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("77732, " + -2 + ", " + arg0 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQGPOSRV", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method384(@OriginalArg(1) String arg0) {
		try {
			@Pc(5) StringBuffer local5 = new StringBuffer();
			for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
				local5.append("*");
			}
			return local5.toString();
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("17961, " + -796 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}
}
