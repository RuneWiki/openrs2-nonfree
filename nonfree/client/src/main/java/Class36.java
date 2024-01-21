import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RTHTIIVA")
public final class Class36 {

	@OriginalMember(owner = "client!RTHTIIVA", name = "a", descriptor = "I")
	private static int anInt652;

	@OriginalMember(owner = "client!RTHTIIVA", name = "b", descriptor = "Z")
	private static boolean aBoolean164;

	@OriginalMember(owner = "client!RTHTIIVA", name = "c", descriptor = "Z")
	private static boolean aBoolean165 = true;

	@OriginalMember(owner = "client!RTHTIIVA", name = "d", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!RTHTIIVA", name = "e", descriptor = "Lclient!MBMGIXGO;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4 = new Class1_Sub1_Sub3(new byte[100], 891);

	@OriginalMember(owner = "client!RTHTIIVA", name = "f", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!RTHTIIVA", name = "a", descriptor = "(IZLclient!MBMGIXGO;)Ljava/lang/String;")
	public static String method449(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method268();
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
			@Pc(96) boolean local96 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(104) char local104 = aCharArray2[local18];
				if (local96 && local104 >= 'a' && local104 <= 'z') {
					aCharArray2[local18] = (char) (aCharArray2[local18] - 32);
					local96 = false;
				}
				if (local104 == '.' || local104 == '!' || local104 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("62664, " + arg0 + ", " + true + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RTHTIIVA", name = "a", descriptor = "(Ljava/lang/String;ZLclient!MBMGIXGO;)V")
	public static void method450(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < arg0.length(); local17++) {
				@Pc(23) char local23 = arg0.charAt(local17);
				@Pc(25) int local25 = 0;
				for (@Pc(27) int local27 = 0; local27 < aCharArray3.length; local27++) {
					if (local23 == aCharArray3[local27]) {
						local25 = local27;
						break;
					}
				}
				if (local25 > 12) {
					local25 += 195;
				}
				if (local15 == -1) {
					if (local25 < 13) {
						local15 = local25;
					} else {
						arg2.method258(local25);
					}
				} else if (local25 < 13) {
					arg2.method258((local15 << 4) + local25);
					local15 = -1;
				} else {
					arg2.method258((local15 << 4) + (local25 >> 4));
					local15 = local25 & 0xF;
				}
			}
			if (!arg1) {
				anInt652 = -452;
			}
			if (local15 != -1) {
				arg2.method258(local15 << 4);
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("94520, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RTHTIIVA", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method451(@OriginalArg(0) String arg0) {
		try {
			aClass1_Sub1_Sub3_4.anInt468 = 0;
			method450(arg0, aBoolean165, aClass1_Sub1_Sub3_4);
			@Pc(9) int local9 = aClass1_Sub1_Sub3_4.anInt468;
			aClass1_Sub1_Sub3_4.anInt468 = 0;
			return method449(local9, aClass1_Sub1_Sub3_4);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("98483, " + arg0 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}
}
