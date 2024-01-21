import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MYWERTTF")
public final class Class28 {

	@OriginalMember(owner = "client!MYWERTTF", name = "a", descriptor = "Z")
	private static boolean aBoolean93 = true;

	@OriginalMember(owner = "client!MYWERTTF", name = "b", descriptor = "I")
	private static int anInt291 = -493;

	@OriginalMember(owner = "client!MYWERTTF", name = "c", descriptor = "I")
	private static int anInt292 = 7;

	@OriginalMember(owner = "client!MYWERTTF", name = "d", descriptor = "I")
	private static int anInt293 = 42987;

	@OriginalMember(owner = "client!MYWERTTF", name = "e", descriptor = "[C")
	private static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!MYWERTTF", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method191(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!MYWERTTF", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method192(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg1 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(35) int local35 = 0;
				@Pc(38) char[] local38 = new char[12];
				while (arg1 != 0L) {
					@Pc(42) long local42 = arg1;
					arg1 /= 37L;
					local38[11 - local35++] = aCharArray1[(int) (local42 - arg1 * 37L)];
				}
				return new String(local38, 12 - local35, local35);
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("27031, " + arg0 + ", " + arg1 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MYWERTTF", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method193(@OriginalArg(0) String arg0) {
		try {
			@Pc(12) String local12 = arg0.toUpperCase();
			@Pc(14) long local14 = 0L;
			for (@Pc(16) int local16 = 0; local16 < local12.length(); local16++) {
				local14 = local14 * 61L + (long) local12.charAt(local16) - 32L;
				local14 = local14 + (local14 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local14;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("58874, " + arg0 + ", " + 8 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MYWERTTF", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method194(@OriginalArg(0) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("58254, " + arg0 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MYWERTTF", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method195(@OriginalArg(1) String arg0) {
		try {
			if (arg0.length() <= 0) {
				return arg0;
			}
			@Pc(11) char[] local11 = arg0.toCharArray();
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				if (local11[local13] == '_') {
					local11[local13] = ' ';
					if (local13 + 1 < local11.length && local11[local13 + 1] >= 'a' && local11[local13 + 1] <= 'z') {
						local11[local13 + 1] = (char) (local11[local13 + 1] + 'A' - 97);
					}
				}
			}
			if (local11[0] >= 'a' && local11[0] <= 'z') {
				local11[0] = (char) (local11[0] + 'A' - 97);
			}
			return new String(local11);
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("47690, " + -616 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MYWERTTF", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method196(@OriginalArg(1) String arg0) {
		try {
			@Pc(5) StringBuffer local5 = new StringBuffer();
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				local5.append("*");
			}
			return local5.toString();
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("49608, " + 7 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}
}
