import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RSIGORUG")
public final class Class36 {

	@OriginalMember(owner = "client!RSIGORUG", name = "b", descriptor = "I")
	private static int anInt575;

	@OriginalMember(owner = "client!RSIGORUG", name = "c", descriptor = "I")
	private static int anInt576;

	@OriginalMember(owner = "client!RSIGORUG", name = "d", descriptor = "I")
	private static int anInt577;

	@OriginalMember(owner = "client!RSIGORUG", name = "e", descriptor = "I")
	private static int anInt578;

	@OriginalMember(owner = "client!RSIGORUG", name = "f", descriptor = "[C")
	private static final char[] aCharArray4;

	static {
		aBoolean135 = true;
		anInt576 = -324;
		anInt577 = 9;
		anInt578 = 8;
		aCharArray4 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	}

	@OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(Ljava/lang/String;)J")
	public static long method381(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method382(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) {
		try {
			if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
				return "invalid_name";
			} else if (arg1 % 37L == 0L) {
				return "invalid_name";
			} else {
				@Pc(21) int local21 = 0;
				@Pc(26) boolean local26 = false;
				@Pc(37) char[] local37 = new char[12];
				while (arg1 != 0L) {
					@Pc(41) long local41 = arg1;
					arg1 /= 37L;
					local37[11 - local21++] = aCharArray4[(int) (local41 - arg1 * 37L)];
				}
				return new String(local37, 12 - local21, local21);
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("11754, " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method383(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) String local4 = arg0.toUpperCase();
			@Pc(6) long local6 = 0L;
			@Pc(11) boolean local11 = false;
			for (@Pc(19) int local19 = 0; local19 < local4.length(); local19++) {
				local6 = local6 * 61L + (long) local4.charAt(local19) - 32L;
				local6 = local6 + (local6 >> 56) & 0xFFFFFFFFFFFFFFL;
			}
			return local6;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("77586, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method384(@OriginalArg(1) int arg0) {
		try {
			return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("98656, " + false + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method385(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg1.length() <= 0) {
				return arg1;
			}
			@Pc(9) char[] local9 = arg1.toCharArray();
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
			signlink.reporterror("53559, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method386(@OriginalArg(0) String arg0) {
		try {
			@Pc(11) StringBuffer local11 = new StringBuffer();
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11.append("*");
			}
			return local11.toString();
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("60647, " + arg0 + ", " + -812 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
