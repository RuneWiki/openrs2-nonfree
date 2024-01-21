import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CIRLBWBX")
public final class Class11 {

	@OriginalMember(owner = "client!CIRLBWBX", name = "a", descriptor = "Z")
	private static boolean aBoolean46 = true;

	@OriginalMember(owner = "client!CIRLBWBX", name = "b", descriptor = "I")
	private static int anInt71 = 17551;

	@OriginalMember(owner = "client!CIRLBWBX", name = "c", descriptor = "Z")
	private static boolean aBoolean47 = true;

	@OriginalMember(owner = "client!CIRLBWBX", name = "d", descriptor = "I")
	private static int anInt72 = -774;

	@OriginalMember(owner = "client!CIRLBWBX", name = "e", descriptor = "I")
	private static int anInt73 = -207;

	@OriginalMember(owner = "client!CIRLBWBX", name = "f", descriptor = "[C")
	private static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!CIRLBWBX", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method47(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!CIRLBWBX", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method48(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg0 < 2 || arg0 > 2) {
				anInt72 = 3;
			}
			if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg1 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(27) int local27 = 0;
				@Pc(30) char[] local30 = new char[12];
				while (arg1 != 0L) {
					@Pc(34) long local34 = arg1;
					arg1 /= 37L;
					local30[11 - local27++] = aCharArray1[(int) (local34 - arg1 * 37L)];
				}
				return new String(local30, 12 - local27, local27);
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("96042, " + arg0 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CIRLBWBX", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method49(@OriginalArg(0) String arg0) {
		try {
			@Pc(11) String local11 = arg0.toUpperCase();
			@Pc(13) long local13 = 0L;
			for (@Pc(15) int local15 = 0; local15 < local11.length(); local15++) {
				local13 = local13 * 61L + (long) local11.charAt(local15) - 32L;
				local13 = local13 + (local13 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local13;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("81137, " + arg0 + ", " + -32663 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CIRLBWBX", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method50(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("93113, " + arg0 + ", " + false + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CIRLBWBX", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method51(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("71650, " + arg0 + ", " + 42484 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CIRLBWBX", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method52(@OriginalArg(1) String arg0) {
		try {
			@Pc(8) StringBuffer local8 = new StringBuffer();
			for (@Pc(10) int local10 = 0; local10 < arg0.length(); local10++) {
				local8.append("*");
			}
			return local8.toString();
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("9635, " + -118 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}
}
