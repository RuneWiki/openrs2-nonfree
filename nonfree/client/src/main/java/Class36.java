import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VSUIHULP")
public final class Class36 {

	@OriginalMember(owner = "client!VSUIHULP", name = "a", descriptor = "I")
	private static int anInt701 = 6;

	@OriginalMember(owner = "client!VSUIHULP", name = "b", descriptor = "I")
	private static int anInt702 = 622;

	@OriginalMember(owner = "client!VSUIHULP", name = "c", descriptor = "Z")
	private static boolean aBoolean168 = true;

	@OriginalMember(owner = "client!VSUIHULP", name = "d", descriptor = "I")
	private static int anInt703 = -29191;

	@OriginalMember(owner = "client!VSUIHULP", name = "e", descriptor = "Z")
	private static boolean aBoolean169 = true;

	@OriginalMember(owner = "client!VSUIHULP", name = "f", descriptor = "I")
	private static int anInt704 = 5;

	@OriginalMember(owner = "client!VSUIHULP", name = "g", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!VSUIHULP", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method477(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!VSUIHULP", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method478(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(19) int local19 = 0;
				@Pc(22) char[] local22 = new char[12];
				@Pc(26) boolean local26 = false;
				while (arg0 != 0L) {
					@Pc(30) long local30 = arg0;
					arg0 /= 37L;
					local22[11 - local19++] = aCharArray4[(int) (local30 - arg0 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("4341, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSUIHULP", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method479(@OriginalArg(0) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(6) int local6 = 0; local6 < local2.length(); local6++) {
				local4 = local4 * 61L + (long) local2.charAt(local6) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("60908, " + arg0 + ", " + -104 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSUIHULP", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method480(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("94566, " + arg0 + ", " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSUIHULP", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method481(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("82862, " + arg0 + ", " + -36397 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSUIHULP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method482(@OriginalArg(1) String arg0) {
		try {
			@Pc(10) StringBuffer local10 = new StringBuffer();
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local10.append("*");
			}
			return local10.toString();
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("37072, " + 47641 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}
}
