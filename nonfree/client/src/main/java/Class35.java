import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class35 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Z")
	private static boolean aBoolean110;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
	private static boolean aBoolean109 = true;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private static int anInt570 = 86;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private static int anInt571 = 604;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[C")
	private static char[] aCharArray1 = new char[12];

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "[C")
	private static char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method430(@OriginalArg(0) String arg0) {
		@Pc(4) String local4 = arg0.trim();
		@Pc(6) long local6 = 0L;
		for (@Pc(8) int local8 = 0; local8 < local4.length() && local8 < 12; local8++) {
			@Pc(14) char local14 = local4.charAt(local8);
			local6 *= 37L;
			if (local14 >= 'A' && local14 <= 'Z') {
				local6 += local14 + 1 - 65;
			} else if (local14 >= 'a' && local14 <= 'z') {
				local6 += local14 + 1 - 97;
			} else if (local14 >= '0' && local14 <= '9') {
				local6 += local14 + 27 - 48;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method431(@OriginalArg(1) long arg0) {
		if (arg0 < 0L || arg0 >= 6582952005840035281L) {
			return "invalid_name";
		}
		@Pc(11) int local11 = 0;
		while (arg0 != 0L) {
			@Pc(20) long local20 = arg0;
			arg0 /= 37L;
			aCharArray1[11 - local11++] = aCharArray2[(int) (local20 - arg0 * 37L)];
		}
		return new String(aCharArray1, 12 - local11, local11);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method432(@OriginalArg(0) String arg0) {
		@Pc(2) String local2 = arg0.toLowerCase();
		@Pc(8) long local8 = 0L;
		for (@Pc(10) int local10 = 0; local10 < local2.length(); local10++) {
			local8 = local8 * 61L + (long) local2.charAt(local10) - 32L;
		}
		return local8;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method433(@OriginalArg(0) String arg0) {
		@Pc(13) String local13 = arg0.toLowerCase().trim();
		@Pc(15) String local15 = "";
		for (@Pc(17) int local17 = 0; local17 < local13.length() && local17 < 12; local17++) {
			@Pc(23) char local23 = local13.charAt(local17);
			if (local23 >= 'a' && local23 <= 'z') {
				local15 = local15 + local23;
			} else if (local23 >= '0' && local23 <= '9') {
				local15 = local15 + local23;
			} else {
				local15 = local15 + '_';
			}
		}
		while (local15.endsWith("_")) {
			local15 = local15.substring(0, local15.length() - 1);
		}
		while (local15.startsWith("_")) {
			local15 = local15.substring(1);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method434(@OriginalArg(0) String arg0) {
		if (arg0.length() <= 0) {
			return arg0;
		}
		@Pc(15) char[] local15 = arg0.toCharArray();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			if (local15[local17] == '_') {
				local15[local17] = ' ';
				if (local17 + 1 < local15.length && local15[local17 + 1] >= 'a' && local15[local17 + 1] <= 'z') {
					local15[local17 + 1] = (char) (local15[local17 + 1] + 'A' - 97);
				}
			}
		}
		if (local15[0] >= 'a' && local15[0] <= 'z') {
			local15[0] = (char) (local15[0] + 'A' - 97);
		}
		return new String(local15);
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method435(@OriginalArg(0) String arg0) {
		@Pc(10) String local10 = arg0.toLowerCase();
		@Pc(13) char[] local13 = local10.toCharArray();
		@Pc(16) int local16 = local13.length;
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(26) char local26 = local13[local20];
			if (local18 && local26 >= 'a' && local26 <= 'z') {
				local13[local20] = (char) (local13[local20] - 32);
				local18 = false;
			}
			if (local26 == '.' || local26 == '!') {
				local18 = true;
			}
		}
		return new String(local13);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method436(@OriginalArg(0) String arg0) {
		@Pc(6) String local6 = "";
		for (@Pc(8) int local8 = 0; local8 < arg0.length(); local8++) {
			local6 = local6 + "*";
		}
		return local6;
	}
}
