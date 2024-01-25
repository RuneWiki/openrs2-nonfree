import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "[I")
	public static final int[] anIntArray67 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V")
	public static void method1341() {
		@Pc(18) Class3_Sub26 local18 = Static640.method8636(Static287.aClass344_72, Static403.aClass294_3);
		local18.aClass3_Sub15_Sub1_3.method8448(0);
		Static472.method5189(local18);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZZ)V")
	public static void method1342(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static530.anInt9144 != -1) {
				Static136.method3118(Static530.anInt9144);
			}
			for (@Pc(20) Class3_Sub50 local20 = (Class3_Sub50) Static40.aClass307_5.method7421(); local20 != null; local20 = (Class3_Sub50) Static40.aClass307_5.method7428()) {
				if (!local20.method8670()) {
					local20 = (Class3_Sub50) Static40.aClass307_5.method7421();
					if (local20 == null) {
						break;
					}
				}
				Static488.method7168(true, false, local20);
			}
			Static530.anInt9144 = -1;
			Static40.aClass307_5 = new Class307(8);
			Static42.method786();
			Static530.anInt9144 = Static16.anInt166;
			Static557.method7852(false);
			Static594.method8139();
			Static84.method2225(Static530.anInt9144);
		}
		Static389.aBoolean634 = false;
		Static562.aString109 = "";
		Static141.aString29 = "";
		Static596.method8158();
		Static548.anInt9367 = -1;
		Static529.method7519(Static219.anInt5059);
		Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 = new Class2_Sub3_Sub1_Sub2_Sub2();
		Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428 = Static394.anInt7540 * 512 / 2;
		Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424 = Static462.anInt8391 * 512 / 2;
		Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray378[0] = Static394.anInt7540 / 2;
		Static289.anInt5908 = 0;
		Static465.anInt8425 = 0;
		Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anIntArray377[0] = Static462.anInt8391 / 2;
		if (Static516.anInt9019 == 2) {
			Static465.anInt8425 = Static493.anInt8769 << 9;
			Static289.anInt5908 = Static66.anInt1410 << 9;
		} else {
			Static58.method1281();
		}
		Static34.method625();
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!tn;)V")
	public static void method1343(@OriginalArg(1) Class3_Sub15 arg0) {
		if (arg0.aByteArray106.length - arg0.anInt10282 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method8401();
		if (local20 < 0 || local20 > 1 || arg0.aByteArray106.length - arg0.anInt10282 < 2) {
			return;
		}
		@Pc(40) int local40 = arg0.method8414();
		if (arg0.aByteArray106.length - arg0.anInt10282 < local40 * 6) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < local40; local57++) {
			@Pc(65) int local65 = arg0.method8414();
			@Pc(69) int local69 = arg0.method8402();
			if (Static477.anIntArray533.length > local65 && Static158.aBooleanArray10[local65] && (Static514.aClass378_1.method8645(local65).aChar3 != '1' || local69 >= -1 && local69 <= 1)) {
				Static477.anIntArray533[local65] = local69;
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I[ILclient!lea;I)V")
	public static void method1344(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class2_Sub3_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg1.anIntArray376 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg1.anIntArray376.length; local8++) {
				if (arg0[local8] != arg1.anIntArray376[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg1.anInt6306 != -1) {
				@Pc(43) Class290 local43 = Static618.aClass222_2.method5867(arg1.anInt6306);
				@Pc(46) int local46 = local43.anInt8682;
				if (local46 == 1) {
					arg1.anInt6283 = 0;
					arg1.anInt6297 = arg2;
					arg1.anInt6267 = 0;
					arg1.anInt6315 = 0;
					arg1.anInt6313 = 1;
					if (!arg1.aBoolean533) {
						Static349.method5726(arg1.anInt6315, local43, arg1);
					}
				}
				if (local46 == 2) {
					arg1.anInt6283 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg0.length; local8++) {
			if (arg0[local8] != -1) {
				local6 = false;
			}
			if (arg1.anIntArray376 == null || arg1.anIntArray376[local8] == -1 || Static618.aClass222_2.method5867(arg0[local8]).anInt8688 >= Static618.aClass222_2.method5867(arg1.anIntArray376[local8]).anInt8688) {
				arg1.anIntArray376 = arg0;
				arg1.anInt6297 = arg2;
				break;
			}
		}
		if (local6) {
			arg1.anIntArray376 = arg0;
			arg1.anInt6297 = arg2;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(III)Z")
	public static boolean method1346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V")
	public static void method1347() {
		@Pc(9) int local9;
		if (Static188.aClass92Array4 != null) {
			for (local9 = 0; local9 < Static322.anInt6491; local9++) {
				Static188.aClass92Array4[local9] = null;
			}
			Static188.aClass92Array4 = null;
		}
		if (Static206.aClass92Array9 != null) {
			for (local9 = 0; local9 < Static244.anInt5486; local9++) {
				Static206.aClass92Array9[local9] = null;
			}
			Static206.aClass92Array9 = null;
		}
		if (Static270.aClass92Array6 != null) {
			for (local9 = 0; local9 < Static92.anInt2488; local9++) {
				Static270.aClass92Array6[local9] = null;
			}
			Static270.aClass92Array6 = null;
		}
		Static255.anInt5651 = -1;
		Static582.anInt9741 = -1;
		Static475.anIntArray532 = null;
		Static467.anIntArrayArrayArray11 = null;
		Static14.aClass92Array16 = null;
	}
}
