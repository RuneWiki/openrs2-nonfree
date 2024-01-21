import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JBXCIWFE")
public final class Class18 {

	@OriginalMember(owner = "client!JBXCIWFE", name = "a", descriptor = "Z")
	private static boolean aBoolean89 = true;

	@OriginalMember(owner = "client!JBXCIWFE", name = "b", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!JBXCIWFE", name = "c", descriptor = "Lclient!IMUIZRAF;")
	private static Class3_Sub1_Sub3 aClass3_Sub1_Sub3_2 = new Class3_Sub1_Sub3(0, new byte[100]);

	@OriginalMember(owner = "client!JBXCIWFE", name = "d", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!JBXCIWFE", name = "a", descriptor = "(ZLclient!IMUIZRAF;I)Ljava/lang/String;")
	public static String method184(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 0;
			@Pc(5) int local5 = -1;
			@Pc(12) int local12;
			@Pc(18) int local18;
			for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
				local12 = arg1.method146();
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
			if (!arg0) {
				for (local12 = 1; local12 > 0; local12++) {
				}
			}
			@Pc(105) boolean local105 = true;
			for (local18 = 0; local18 < local3; local18++) {
				@Pc(113) char local113 = aCharArray2[local18];
				if (local105 && local113 >= 'a' && local113 <= 'z') {
					aCharArray2[local18] = (char) (aCharArray2[local18] - 32);
					local105 = false;
				}
				if (local113 == '.' || local113 == '!' || local113 == '?') {
					local105 = true;
				}
			}
			return new String(aCharArray2, 0, local3);
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("89851, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JBXCIWFE", name = "a", descriptor = "(Ljava/lang/String;Lclient!IMUIZRAF;I)V")
	public static void method185(@OriginalArg(0) String arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0.length() > 80) {
				arg0 = arg0.substring(0, 80);
			}
			arg0 = arg0.toLowerCase();
			@Pc(15) int local15 = -1;
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
				@Pc(27) char local27 = arg0.charAt(local21);
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
				if (local15 == -1) {
					if (local29 < 13) {
						local15 = local29;
					} else {
						arg1.method136(local29);
					}
				} else if (local29 < 13) {
					arg1.method136((local15 << 4) + local29);
					local15 = -1;
				} else {
					arg1.method136((local15 << 4) + (local29 >> 4));
					local15 = local29 & 0xF;
				}
			}
			if (local15 != -1) {
				arg1.method136(local15 << 4);
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("24460, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JBXCIWFE", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method186(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			aClass3_Sub1_Sub3_2.anInt243 = 0;
			method185(arg0, aClass3_Sub1_Sub3_2, 974);
			@Pc(9) int local9 = aClass3_Sub1_Sub3_2.anInt243;
			aClass3_Sub1_Sub3_2.anInt243 = 0;
			@Pc(16) boolean local16 = false;
			return method184(aBoolean89, aClass3_Sub1_Sub3_2, local9);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("26647, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}
}
