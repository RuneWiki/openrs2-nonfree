import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SQKAIUXX")
public final class Class33 {

	@OriginalMember(owner = "client!SQKAIUXX", name = "a", descriptor = "I")
	private static int anInt588 = 536;

	@OriginalMember(owner = "client!SQKAIUXX", name = "b", descriptor = "Z")
	private static boolean aBoolean131 = true;

	@OriginalMember(owner = "client!SQKAIUXX", name = "c", descriptor = "I")
	private static int anInt589 = -648;

	@OriginalMember(owner = "client!SQKAIUXX", name = "d", descriptor = "I")
	private static int anInt590 = 31203;

	@OriginalMember(owner = "client!SQKAIUXX", name = "e", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!SQKAIUXX", name = "f", descriptor = "Lclient!CMGGUSPR;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3 = new Class1_Sub1_Sub3(new byte[100], anInt588);

	@OriginalMember(owner = "client!SQKAIUXX", name = "g", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!SQKAIUXX", name = "a", descriptor = "(ILclient!CMGGUSPR;Z)Ljava/lang/String;")
	public static String method392(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) boolean arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(9) int local9;
			if (!arg2) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			@Pc(27) int local27;
			for (local9 = 0; local9 < arg0; local9++) {
				@Pc(21) int local21 = arg1.method55();
				local27 = local21 >> 4 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local27 - 195];
					local5 = -1;
				} else if (local27 < 13) {
					aCharArray2[local3++] = aCharArray3[local27];
				} else {
					local5 = local27;
				}
				local27 = local21 & 0xF;
				if (local5 != -1) {
					aCharArray2[local3++] = aCharArray3[(local5 << 4) + local27 - 195];
					local5 = -1;
				} else if (local27 < 13) {
					aCharArray2[local3++] = aCharArray3[local27];
				} else {
					local5 = local27;
				}
			}
			@Pc(105) boolean local105 = true;
			for (local27 = 0; local27 < local3; local27++) {
				@Pc(113) char local113 = aCharArray2[local27];
				if (local105 && local113 >= 'a' && local113 <= 'z') {
					aCharArray2[local27] = (char) (aCharArray2[local27] - 32);
					local105 = false;
				}
				if (local113 == '.' || local113 == '!' || local113 == '?') {
					local105 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("68622, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQKAIUXX", name = "a", descriptor = "(Lclient!CMGGUSPR;Ljava/lang/String;I)V")
	public static void method393(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1.length() > 80) {
				arg1 = arg1.substring(0, 80);
			}
			arg1 = arg1.toLowerCase();
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < arg1.length(); local21++) {
				@Pc(27) char local27 = arg1.charAt(local21);
				@Pc(29) int local29 = 0;
				for (@Pc(31) int local31 = 0; local31 < aCharArray3.length; local31++) {
					if (local27 == aCharArray3[local31]) {
						local29 = local31;
						break;
					}
				}
				if (local29 > 12) {
					local29 += 195;
				}
				if (local19 == -1) {
					if (local29 < 13) {
						local19 = local29;
					} else {
						arg0.method45(local29);
					}
				} else if (local29 < 13) {
					arg0.method45((local19 << 4) + local29);
					local19 = -1;
				} else {
					arg0.method45((local19 << 4) + (local29 >> 4));
					local19 = local29 & 0xF;
				}
			}
			if (local19 != -1) {
				arg0.method45(local19 << 4);
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("96844, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SQKAIUXX", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method394(@OriginalArg(0) String arg0) {
		try {
			aClass1_Sub1_Sub3_3.anInt78 = 0;
			method393(aClass1_Sub1_Sub3_3, arg0);
			@Pc(9) int local9 = aClass1_Sub1_Sub3_3.anInt78;
			aClass1_Sub1_Sub3_3.anInt78 = 0;
			return method392(local9, aClass1_Sub1_Sub3_3, aBoolean131);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("80829, " + arg0 + ", " + -443 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
