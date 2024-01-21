import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XXUUHLAE")
public final class Class46 {

	@OriginalMember(owner = "client!XXUUHLAE", name = "e", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!XXUUHLAE", name = "a", descriptor = "I")
	private static int anInt806 = 4;

	@OriginalMember(owner = "client!XXUUHLAE", name = "b", descriptor = "I")
	private static int anInt807 = -19812;

	@OriginalMember(owner = "client!XXUUHLAE", name = "c", descriptor = "Z")
	private static boolean aBoolean221 = true;

	@OriginalMember(owner = "client!XXUUHLAE", name = "d", descriptor = "I")
	private static int anInt808 = 189;

	@OriginalMember(owner = "client!XXUUHLAE", name = "f", descriptor = "[C")
	private static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!XXUUHLAE", name = "a", descriptor = "(Ljava/lang/String;)J")
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

	@OriginalMember(owner = "client!XXUUHLAE", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method551(@OriginalArg(1) long arg0) {
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
					local22[11 - local19++] = aCharArray2[(int) (local30 - arg0 * 37L)];
				}
				return new String(local22, 12 - local19, local19);
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("97989, " + false + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XXUUHLAE", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method552(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(2) String local2 = arg1.toUpperCase();
			@Pc(4) long local4 = 0L;
			@Pc(8) boolean local8 = false;
			for (@Pc(10) int local10 = 0; local10 < local2.length(); local10++) {
				local4 = local4 * 61L + (long) local2.charAt(local10) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("51790, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XXUUHLAE", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method553(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("87557, " + arg0 + ", " + 7 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XXUUHLAE", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method554(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("33119, " + arg0 + ", " + -85 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XXUUHLAE", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method555(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("1979, " + true + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
