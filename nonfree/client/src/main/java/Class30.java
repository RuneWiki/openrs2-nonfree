import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PMGJNHXQ")
public final class Class30 {

	@OriginalMember(owner = "client!PMGJNHXQ", name = "a", descriptor = "Z")
	private static boolean aBoolean118;

	@OriginalMember(owner = "client!PMGJNHXQ", name = "b", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!PMGJNHXQ", name = "c", descriptor = "Lclient!IUVBENCV;")
	private static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_4 = new Class8_Sub1_Sub3(new byte[100], 713);

	@OriginalMember(owner = "client!PMGJNHXQ", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!PMGJNHXQ", name = "a", descriptor = "(IILclient!IUVBENCV;)Ljava/lang/String;")
	public static String method312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub1_Sub3 arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
				@Pc(12) int local12 = arg2.method152();
				local18 = local12 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray2[local3++] = aCharArray3[local18];
				} else {
					local5 = local18;
				}
				local18 = local12 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray2[local3++] = aCharArray3[local18];
				} else {
					local5 = local18;
				}
			}
			@Pc(98) boolean local98 = false;
			@Pc(100) boolean local100 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(108) char local108 = aCharArray2[local18];
				if (local100 && local108 >= 'a' && local108 <= 'z') {
					aCharArray2[local18] = (char) (aCharArray2[local18] - 32);
					local100 = false;
				}
				if (local108 == '.' || local108 == '!' || local108 == '?') {
					local100 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("15993, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMGJNHXQ", name = "a", descriptor = "(Ljava/lang/String;ILclient!IUVBENCV;)V")
	public static void method313(@OriginalArg(0) String arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(24) int local24 = -1;
			for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
				@Pc(32) char local32 = arg0.charAt(local26);
				@Pc(34) int local34 = 0;
				for (@Pc(36) int local36 = 0; local36 < aCharArray3.length; local36++) {
					if (local32 == aCharArray3[local36]) {
						local34 = local36;
						break;
					}
				}
				if (local34 > 12) {
					local34 += 195;
				}
				if (local24 == -1) {
					if (local34 < 13) {
						local24 = local34;
					} else {
						arg1.method142(local34);
					}
				} else if (local34 < 13) {
					arg1.method142((local24 << 4) + local34);
					local24 = -1;
				} else {
					arg1.method142((local24 << 4) + (local34 >> 4));
					local24 = local34 & 0xF;
				}
			}
			if (local24 != -1) {
				arg1.method142(local24 << 4);
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("83024, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PMGJNHXQ", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method314(@OriginalArg(1) String arg0) {
		try {
			aClass8_Sub1_Sub3_4.anInt239 = 0;
			method313(arg0, aClass8_Sub1_Sub3_4);
			@Pc(21) int local21 = aClass8_Sub1_Sub3_4.anInt239;
			aClass8_Sub1_Sub3_4.anInt239 = 0;
			return method312(448, local21, aClass8_Sub1_Sub3_4);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("4050, " + 9 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}
}
