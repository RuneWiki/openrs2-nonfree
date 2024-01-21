import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!REROLFNU")
public final class Class36 {

	@OriginalMember(owner = "client!REROLFNU", name = "a", descriptor = "Z")
	private static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!REROLFNU", name = "b", descriptor = "B")
	private static byte aByte28 = 1;

	@OriginalMember(owner = "client!REROLFNU", name = "c", descriptor = "Z")
	private static boolean aBoolean152 = true;

	@OriginalMember(owner = "client!REROLFNU", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!REROLFNU", name = "e", descriptor = "Lclient!DNRIFKTO;")
	private static Class2_Sub1_Sub4 aClass2_Sub1_Sub4_4 = new Class2_Sub1_Sub4(new byte[100], aBoolean151);

	@OriginalMember(owner = "client!REROLFNU", name = "f", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!REROLFNU", name = "a", descriptor = "(BILclient!DNRIFKTO;)Ljava/lang/String;")
	public static String method360(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method94();
				local18 = local12 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray3[local3++] = aCharArray4[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray3[local3++] = aCharArray4[local18];
				} else {
					local5 = local18;
				}
				local18 = local12 & 0xF;
				if (local5 != -1) {
					aCharArray3[local3++] = aCharArray4[(local5 << 4) + local18 - 195];
					local5 = -1;
				} else if (local18 < 13) {
					aCharArray3[local3++] = aCharArray4[local18];
				} else {
					local5 = local18;
				}
			}
			@Pc(96) boolean local96 = true;
			if (aByte28 != 1) {
				aBoolean152 = !aBoolean152;
			}
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(113) char local113 = aCharArray3[local18];
				if (local96 && local113 >= 'a' && local113 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local96 = false;
				}
				if (local113 == '.' || local113 == '!' || local113 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("31669, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!REROLFNU", name = "a", descriptor = "(Ljava/lang/String;ZLclient!DNRIFKTO;)V")
	public static void method361(@OriginalArg(0) String arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(24) int local24 = -1;
			for (@Pc(26) int local26 = 0; local26 < arg0.length(); local26++) {
				@Pc(32) char local32 = arg0.charAt(local26);
				@Pc(34) int local34 = 0;
				for (@Pc(36) int local36 = 0; local36 < aCharArray4.length; local36++) {
					if (local32 == aCharArray4[local36]) {
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
						arg1.method84(local34);
					}
				} else if (local34 < 13) {
					arg1.method84((local24 << 4) + local34);
					local24 = -1;
				} else {
					arg1.method84((local24 << 4) + (local34 >> 4));
					local24 = local34 & 0xF;
				}
			}
			if (local24 != -1) {
				arg1.method84(local24 << 4);
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("69619, " + arg0 + ", " + true + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!REROLFNU", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method362(@OriginalArg(1) String arg0) {
		try {
			aClass2_Sub1_Sub4_4.anInt166 = 0;
			method361(arg0, aClass2_Sub1_Sub4_4);
			@Pc(15) int local15 = aClass2_Sub1_Sub4_4.anInt166;
			aClass2_Sub1_Sub4_4.anInt166 = 0;
			return method360(local15, aClass2_Sub1_Sub4_4);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("8000, " + false + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
