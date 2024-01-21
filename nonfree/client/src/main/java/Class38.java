import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UJPWWGLO")
public final class Class38 {

	@OriginalMember(owner = "client!UJPWWGLO", name = "a", descriptor = "I")
	private static int anInt609 = -17039;

	@OriginalMember(owner = "client!UJPWWGLO", name = "b", descriptor = "I")
	private static int anInt610 = 776;

	@OriginalMember(owner = "client!UJPWWGLO", name = "c", descriptor = "I")
	private static int anInt611 = -498;

	@OriginalMember(owner = "client!UJPWWGLO", name = "d", descriptor = "I")
	private static int anInt612 = 3;

	@OriginalMember(owner = "client!UJPWWGLO", name = "e", descriptor = "Z")
	private static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!UJPWWGLO", name = "f", descriptor = "Z")
	private static boolean aBoolean152 = true;

	@OriginalMember(owner = "client!UJPWWGLO", name = "g", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!UJPWWGLO", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method435(@OriginalArg(0) String arg0) {
		@Pc(3) long local3 = 0L;
		for (@Pc(5) int local5 = 0; local5 < arg0.length() && local5 < 12; local5++) {
			@Pc(11) char local11 = arg0.charAt(local5);
			local3 *= 37L;
			if (local11 >= 'A' && local11 <= 'Z') {
				local3 += (long) (local11 + 1 - 65);
			} else if (local11 >= 'a' && local11 <= 'z') {
				local3 += (long) (local11 + 1 - 97);
			} else if (local11 >= '0' && local11 <= '9') {
				local3 += (long) (local11 + 27 - 48);
			}
		}
		while (local3 % 37L == 0L && local3 != 0L) {
			local3 /= 37L;
		}
		return local3;
	}

	@OriginalMember(owner = "client!UJPWWGLO", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method436(@OriginalArg(1) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(24) int local24 = 0;
				@Pc(27) char[] local27 = new char[12];
				while (arg0 != 0L) {
					@Pc(31) long local31 = arg0;
					arg0 /= 37L;
					local27[11 - local24++] = aCharArray4[(int) (local31 - arg0 * 37L)];
				}
				return new String(local27, 12 - local24, local24);
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("68622, " + 4 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJPWWGLO", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method437(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
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
			signlink.reporterror("73787, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJPWWGLO", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method438(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("4796, " + -325 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJPWWGLO", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method439(@OriginalArg(0) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(16) char[] local16 = arg0.toCharArray();
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				if (local16[local18] == '_') {
					local16[local18] = ' ';
					if (local18 + 1 < local16.length && local16[local18 + 1] >= 'a' && local16[local18 + 1] <= 'z') {
						local16[local18 + 1] = (char) (local16[local18 + 1] + 'A' - 97);
					}
				}
			}
			if (local16[0] >= 'a' && local16[0] <= 'z') {
				local16[0] = (char) (local16[0] + 'A' - 97);
			}
			return new String(local16);
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("32878, " + arg0 + ", " + 0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJPWWGLO", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method440(@OriginalArg(0) String arg0) {
		try {
			@Pc(5) StringBuffer local5 = new StringBuffer();
			for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
				local5.append("*");
			}
			return local5.toString();
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("35999, " + arg0 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}
