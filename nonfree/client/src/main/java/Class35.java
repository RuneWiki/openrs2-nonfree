import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RJOTKPCV")
public final class Class35 {

	@OriginalMember(owner = "client!RJOTKPCV", name = "a", descriptor = "[C")
	private static char[] aCharArray2 = new char[100];

	@OriginalMember(owner = "client!RJOTKPCV", name = "b", descriptor = "Lclient!FTMSICIZ;")
	private static Class4_Sub1_Sub3 aClass4_Sub1_Sub3_4 = new Class4_Sub1_Sub3(new byte[100], (byte) 3);

	@OriginalMember(owner = "client!RJOTKPCV", name = "c", descriptor = "[C")
	private static char[] aCharArray3 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

	@OriginalMember(owner = "client!RJOTKPCV", name = "a", descriptor = "(ILclient!FTMSICIZ;I)Ljava/lang/String;")
	public static String method375(@OriginalArg(1) Class4_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = -1;
			@Pc(24) int local24;
			for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
				@Pc(18) int local18 = arg0.method102();
				local24 = local18 >> 4 & 0xF;
				if (local11 != -1) {
					aCharArray2[local9++] = aCharArray3[(local11 << 4) + local24 - 195];
					local11 = -1;
				} else if (local24 < 13) {
					aCharArray2[local9++] = aCharArray3[local24];
				} else {
					local11 = local24;
				}
				local24 = local18 & 0xF;
				if (local11 != -1) {
					aCharArray2[local9++] = aCharArray3[(local11 << 4) + local24 - 195];
					local11 = -1;
				} else if (local24 < 13) {
					aCharArray2[local9++] = aCharArray3[local24];
				} else {
					local11 = local24;
				}
			}
			@Pc(102) boolean local102 = true;
			for (local24 = 0; local24 < local9; local24++) {
				@Pc(110) char local110 = aCharArray2[local24];
				if (local102 && local110 >= 'a' && local110 <= 'z') {
					aCharArray2[local24] = (char) (aCharArray2[local24] - 32);
					local102 = false;
				}
				if (local110 == '.' || local110 == '!' || local110 == '?') {
					local102 = true;
				}
			}
			return new String(aCharArray2, 0, local9);
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("71264, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RJOTKPCV", name = "a", descriptor = "(Ljava/lang/String;ILclient!FTMSICIZ;)V")
	public static void method376(@OriginalArg(0) String arg0, @OriginalArg(2) Class4_Sub1_Sub3 arg1) {
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
						arg1.method92(local25);
					}
				} else if (local25 < 13) {
					arg1.method92((local15 << 4) + local25);
					local15 = -1;
				} else {
					arg1.method92((local15 << 4) + (local25 >> 4));
					local15 = local25 & 0xF;
				}
			}
			if (local15 != -1) {
				arg1.method92(local15 << 4);
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("96883, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RJOTKPCV", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method377(@OriginalArg(0) String arg0) {
		try {
			aClass4_Sub1_Sub3_4.anInt101 = 0;
			method376(arg0, aClass4_Sub1_Sub3_4);
			@Pc(9) int local9 = aClass4_Sub1_Sub3_4.anInt101;
			aClass4_Sub1_Sub3_4.anInt101 = 0;
			return method375(aClass4_Sub1_Sub3_4, local9);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("73681, " + arg0 + ", " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}
}
