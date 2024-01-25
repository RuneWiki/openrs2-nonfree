import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "I")
	public static int anInt1326;

	@OriginalMember(owner = "client!bja", name = "g", descriptor = "[S")
	public static final short[] aShortArray11 = new short[] { 18, 57, 59, 46, 5, 4, 53, 49 };

	@OriginalMember(owner = "client!bja", name = "i", descriptor = "I")
	public static int anInt1325 = 0;

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(Lclient!ika;I)Lclient!kr;")
	public static Class29 method1246(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(18) int local18 = arg0.method2048(255);
		@Pc(24) Class320 local24 = Static50.method1249(local18);
		@Pc(26) Class29 local26 = null;
		if (Static203.aClass320_11 == local24) {
			local26 = new Class29_Sub11(arg0);
		} else if (local24 == Static541.aClass320_33) {
			local26 = new Class29_Sub8(arg0);
		} else if (Static397.aClass320_20 == local24) {
			local26 = new Class29_Sub13(arg0);
		} else if (local24 == Static594.aClass320_27) {
			local26 = new Class29_Sub16(arg0);
		} else if (Static495.aClass320_28 == local24) {
			local26 = new Class29_Sub14(arg0);
		} else if (Static668.aClass320_40 == local24) {
			local26 = new Class29_Sub22(arg0);
		} else if (local24 == Static460.aClass320_25) {
			local26 = new Class29_Sub10(arg0);
		} else if (Static61.aClass320_4 == local24) {
			local26 = new Class29_Sub12_Sub2(arg0);
		} else if (Static695.aClass320_26 == local24) {
			local26 = new Class29_Sub1(arg0);
		} else if (Static501.aClass320_29 == local24) {
			local26 = new Class29_Sub20(arg0);
		} else if (Static10.aClass320_1 == local24) {
			local26 = new Class29_Sub18(arg0);
		} else if (Static142.aClass320_9 == local24) {
			local26 = new Class29_Sub19(arg0);
		} else if (local24 == Static532.aClass320_32) {
			local26 = new Class29_Sub17(arg0);
		} else if (Static212.aClass320_12 == local24) {
			local26 = new Class29_Sub2(arg0);
		} else if (local24 == Static524.aClass320_31) {
			local26 = new Class29_Sub5(arg0);
		} else if (local24 == Static460.aClass320_24) {
			local26 = new Class29_Sub4(arg0);
		} else if (Static126.aClass320_8 == local24) {
			local26 = new Class29_Sub21(arg0);
		} else if (Static644.aClass320_38 == local24) {
			local26 = new Class29_Sub6(arg0);
		} else if (Static119.aClass320_22 == local24) {
			local26 = new Class29_Sub9(arg0);
		} else if (Static349.aClass320_17 == local24) {
			local26 = new Class29_Sub12_Sub1(arg0);
		} else if (local24 == Static703.aClass320_42) {
			local26 = new Class29_Sub15(arg0, 1, 1);
		} else if (local24 == Static596.aClass320_34) {
			local26 = new Class29_Sub15(arg0, 0, 1);
		} else if (Static407.aClass320_21 == local24) {
			local26 = new Class29_Sub15(arg0, 0, 0);
		} else if (local24 == Static228.aClass320_43) {
			local26 = new Class29_Sub15(arg0, 1, 0);
		} else if (local24 == Static348.aClass320_16) {
			local26 = new Class29_Sub3(arg0, false);
		} else if (Static522.aClass320_30 == local24) {
			local26 = new Class29_Sub3(arg0, true);
		} else if (Static68.aClass320_5 == local24) {
			local26 = new Class29_Sub23(arg0);
		} else if (Static627.aClass320_37 == local24) {
			local26 = new Class29_Sub7(arg0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(II)V")
	public static void method1248(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub7_Sub21 local13 = Static136.method2378((long) arg0, 20);
		local13.method9260();
	}
}
