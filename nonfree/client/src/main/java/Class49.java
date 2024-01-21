import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZLGGMMMS")
public final class Class49 {

	@OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "Z")
	private static boolean aBoolean204 = true;

	@OriginalMember(owner = "client!ZLGGMMMS", name = "b", descriptor = "I")
	private static int anInt816 = -400;

	@OriginalMember(owner = "client!ZLGGMMMS", name = "c", descriptor = "Z")
	private static boolean aBoolean205 = true;

	@OriginalMember(owner = "client!ZLGGMMMS", name = "d", descriptor = "Z")
	private static boolean aBoolean206 = true;

	@OriginalMember(owner = "client!ZLGGMMMS", name = "e", descriptor = "[C")
	private static final char[] aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method568(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method569(@OriginalArg(0) long arg0) {
		try {
			if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg0 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(21) int local21 = 0;
				@Pc(35) char[] local35 = new char[12];
				while (arg0 != 0L) {
					@Pc(39) long local39 = arg0;
					arg0 /= 37L;
					local35[11 - local21++] = aCharArray4[(int) (local39 - arg0 * 37L)];
				}
				return new String(local35, 12 - local21, local21);
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("9268, " + arg0 + ", " + -491 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method570(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(2) String local2 = arg0.toUpperCase();
			if (arg1 != 18) {
				throw new NullPointerException();
			}
			@Pc(11) long local11 = 0L;
			for (@Pc(13) int local13 = 0; local13 < local2.length(); local13++) {
				local11 = local11 * 61L + (long) local2.charAt(local13) - 32L;
				local11 = local11 + (local11 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local11;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("62568, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method571(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("24022, " + -38344 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method572(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("10912, " + arg0 + ", " + 8384 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLGGMMMS", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method573(@OriginalArg(0) String arg0) {
		try {
			@Pc(12) StringBuffer local12 = new StringBuffer();
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				local12.append("*");
			}
			return local12.toString();
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("22907, " + arg0 + ", " + 7 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
