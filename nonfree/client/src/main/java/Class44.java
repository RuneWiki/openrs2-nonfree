import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UWUPOZSY")
public final class Class44 {

	@OriginalMember(owner = "client!UWUPOZSY", name = "a", descriptor = "I")
	private static int anInt755 = 666;

	@OriginalMember(owner = "client!UWUPOZSY", name = "b", descriptor = "I")
	private static int anInt756 = -884;

	@OriginalMember(owner = "client!UWUPOZSY", name = "c", descriptor = "I")
	private static int anInt757 = 1;

	@OriginalMember(owner = "client!UWUPOZSY", name = "d", descriptor = "B")
	private static byte aByte36 = 7;

	@OriginalMember(owner = "client!UWUPOZSY", name = "e", descriptor = "Z")
	private static boolean aBoolean161 = true;

	@OriginalMember(owner = "client!UWUPOZSY", name = "f", descriptor = "B")
	private static byte aByte37 = 3;

	@OriginalMember(owner = "client!UWUPOZSY", name = "g", descriptor = "I")
	private static int anInt758 = 673;

	@OriginalMember(owner = "client!UWUPOZSY", name = "i", descriptor = "I")
	private static int anInt759 = -965;

	@OriginalMember(owner = "client!UWUPOZSY", name = "j", descriptor = "[C")
	private static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!UWUPOZSY", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method448(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!UWUPOZSY", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method449(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(21) int local21 = 0;
				if (aByte36 == 7) {
					@Pc(26) boolean local26 = false;
				}
				@Pc(37) char[] local37 = new char[12];
				while (arg0 != 0L) {
					@Pc(41) long local41 = arg0;
					arg0 /= 37L;
					local37[11 - local21++] = aCharArray3[(int) (local41 - arg0 * 37L)];
				}
				return new String(local37, 12 - local21, local21);
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("62339, " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWUPOZSY", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method450(@OriginalArg(1) String arg0) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			@Pc(4) long local4 = 0L;
			for (@Pc(12) int local12 = 0; local12 < local2.length(); local12++) {
				local4 = local4 * 61L + (long) local2.charAt(local12) - 32L;
				local4 = local4 + (local4 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local4;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("90176, " + 0 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWUPOZSY", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method451(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("28607, " + -144 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWUPOZSY", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method452(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(13) char[] local13 = arg0.toCharArray();
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				if (local13[local15] == '_') {
					local13[local15] = ' ';
					if (local15 + 1 < local13.length && local13[local15 + 1] >= 'a' && local13[local15 + 1] <= 'z') {
						local13[local15 + 1] = (char) (local13[local15 + 1] + 'A' - 97);
					}
				}
			}
			if (local13[0] >= 'a' && local13[0] <= 'z') {
				local13[0] = (char) (local13[0] + 'A' - 97);
			}
			return new String(local13);
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("27896, " + false + ", " + arg0 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UWUPOZSY", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method453(@OriginalArg(1) String arg0) {
		try {
			@Pc(3) StringBuffer local3 = new StringBuffer();
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local3.append("*");
			}
			return local3.toString();
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("96868, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
