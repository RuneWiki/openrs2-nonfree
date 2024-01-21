import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YOLZIXCN")
public final class Class49 {

	@OriginalMember(owner = "client!YOLZIXCN", name = "a", descriptor = "Z")
	private static boolean aBoolean172 = true;

	@OriginalMember(owner = "client!YOLZIXCN", name = "b", descriptor = "I")
	private static int anInt739 = 21302;

	@OriginalMember(owner = "client!YOLZIXCN", name = "c", descriptor = "[C")
	private static char[] aCharArray3 = new char[100];

	@OriginalMember(owner = "client!YOLZIXCN", name = "d", descriptor = "Lclient!MNKDCXXG;")
	private static Class1_Sub2_Sub3 aClass1_Sub2_Sub3_5 = new Class1_Sub2_Sub3(new byte[100], -670);

	@OriginalMember(owner = "client!YOLZIXCN", name = "e", descriptor = "[C")
	private static char[] aCharArray4 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!YOLZIXCN", name = "a", descriptor = "(IZLclient!MNKDCXXG;)Ljava/lang/String;")
	public static String method558(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub3 arg1) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
				@Pc(12) int local12 = arg1.method307();
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
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(104) char local104 = aCharArray3[local18];
				if (local96 && local104 >= 'a' && local104 <= 'z') {
					aCharArray3[local18] = (char) (aCharArray3[local18] - 32);
					local96 = false;
				}
				if (local104 == '.' || local104 == '!' || local104 == '?') {
					local96 = true;
				}
			}
			return new String(aCharArray3, 0, local3);
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("45622, " + arg0 + ", " + true + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YOLZIXCN", name = "a", descriptor = "(Ljava/lang/String;BLclient!MNKDCXXG;)V")
	public static void method559(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub2_Sub3 arg1) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
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
				if (local15 == -1) {
					if (local34 < 13) {
						local15 = local34;
					} else {
						arg1.method297(local34);
					}
				} else if (local34 < 13) {
					arg1.method297((local15 << 4) + local34);
					local15 = -1;
				} else {
					arg1.method297((local15 << 4) + (local34 >> 4));
					local15 = local34 & 0xF;
				}
			}
			if (local15 != -1) {
				arg1.method297(local15 << 4);
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("92990, " + arg0 + ", " + -29 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YOLZIXCN", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method560(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			aClass1_Sub2_Sub3_5.anInt474 = 0;
			method559(arg1, aClass1_Sub2_Sub3_5);
			@Pc(9) int local9 = aClass1_Sub2_Sub3_5.anInt474;
			if (arg0 != anInt739) {
				for (@Pc(14) int local14 = 1; local14 > 0; local14++) {
				}
			}
			aClass1_Sub2_Sub3_5.anInt474 = 0;
			return method558(local9, aClass1_Sub2_Sub3_5);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("76512, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}
}
