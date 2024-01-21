import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FBIFPAXF")
public final class Class15 {

	@OriginalMember(owner = "client!FBIFPAXF", name = "a", descriptor = "Z")
	private static boolean aBoolean70;

	@OriginalMember(owner = "client!FBIFPAXF", name = "b", descriptor = "Z")
	private static boolean aBoolean71 = true;

	@OriginalMember(owner = "client!FBIFPAXF", name = "c", descriptor = "I")
	private static int anInt275 = -249;

	@OriginalMember(owner = "client!FBIFPAXF", name = "d", descriptor = "I")
	private static int anInt276 = -28858;

	@OriginalMember(owner = "client!FBIFPAXF", name = "e", descriptor = "I")
	private static int anInt277 = -47115;

	@OriginalMember(owner = "client!FBIFPAXF", name = "f", descriptor = "Z")
	private static boolean aBoolean72 = true;

	@OriginalMember(owner = "client!FBIFPAXF", name = "g", descriptor = "I")
	private static int anInt278 = 18224;

	@OriginalMember(owner = "client!FBIFPAXF", name = "h", descriptor = "[C")
	private static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!FBIFPAXF", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method194(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!FBIFPAXF", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method195(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(22) char[] local22 = new char[12];
				while (arg0 != 0L) {
					@Pc(30) long local30 = arg0;
					arg0 /= 37L;
					local22[11 - local19++] = aCharArray1[(int) (local30 - arg0 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("67786, " + arg0 + ", " + -898 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBIFPAXF", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method196(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(6) int local6 = 0; local6 < local2.length(); local6++) {
				local4 = local4 * 61L + (long) local2.charAt(local6) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("27166, " + 1 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBIFPAXF", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method197(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("43439, " + -266 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBIFPAXF", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method198(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("39694, " + false + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBIFPAXF", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method199(@OriginalArg(1) String arg0) {
		try {
			@Pc(5) StringBuffer local5 = new StringBuffer();
			@Pc(10) int local10;
			if (anInt276 != -28858) {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			for (local10 = 0; local10 < arg0.length(); local10++) {
				local5.append("*");
			}
			return local5.toString();
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("30430, " + -28858 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}
}
