import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!gga;")
	public static final Class120 aClass120_4 = new Class120();

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!hca;")
	public static final Class134 aClass134_6 = new Class134();

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "[Lclient!jq;")
	public static final Class174[] aClass174Array1 = new Class174[14];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLclient!wk;)V")
	public static void method3782(@OriginalArg(1) Class2_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt7633 == Static129.anInt10429 || arg0.anInt7651 == -1 || arg0.anInt7584 != 0) {
			local5 = true;
		} else {
			@Pc(27) Class174 local27 = Static532.aClass157_2.method3734(arg0.anInt7651);
			if (local27.aBoolean471 || arg0.anInt7588 + 1 > local27.anIntArray325[arg0.anInt7646]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(57) int local57 = arg0.anInt7633 - arg0.anInt7616;
			@Pc(63) int local63 = Static129.anInt10429 - arg0.anInt7616;
			@Pc(75) int local75 = arg0.anInt7654 * 512 + arg0.method6311() * 256;
			@Pc(87) int local87 = arg0.anInt7607 * 512 + arg0.method6311() * 256;
			@Pc(98) int local98 = arg0.anInt7644 * 512 + arg0.method6311() * 256;
			@Pc(110) int local110 = arg0.anInt7602 * 512 + arg0.method6311() * 256;
			arg0.anInt9396 = (local63 * local110 + local87 * (local57 - local63)) / local57;
			arg0.anInt9398 = (local75 * (local57 - local63) + local63 * local98) / local57;
		}
		arg0.anInt7658 = 0;
		if (arg0.anInt7597 == 0) {
			arg0.method6301(8192, false);
		}
		if (arg0.anInt7597 == 1) {
			arg0.method6301(12288, false);
		}
		if (arg0.anInt7597 == 2) {
			arg0.method6301(0, false);
		}
		if (arg0.anInt7597 == 3) {
			arg0.method6301(4096, false);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public static void method3784(@OriginalArg(1) int arg0) {
		Static185.anInt3726 = arg0;
		Static423.anInt8217 = -1;
		Static593.anInt10380 = -1;
		Static293.method4983();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public static void method3785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub37 local10 = (Class3_Sub37) Static516.aClass183_18.method4795(); local10 != null; local10 = (Class3_Sub37) Static516.aClass183_18.method4793()) {
			Static58.method1498(arg1, arg2, local10, arg0, arg3);
		}
		for (@Pc(31) Class3_Sub37 local31 = (Class3_Sub37) Static22.aClass183_1.method4795(); local31 != null; local31 = (Class3_Sub37) Static22.aClass183_1.method4793()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class171 local40 = local31.aClass2_Sub2_Sub1_Sub2_1.method6316();
			if (local31.aClass2_Sub2_Sub1_Sub2_1.aBoolean645) {
				local35 = 0;
			} else if (local31.aClass2_Sub2_Sub1_Sub2_1.anInt7655 == local40.anInt5079 || local40.anInt5082 == local31.aClass2_Sub2_Sub1_Sub2_1.anInt7655 || local40.anInt5094 == local31.aClass2_Sub2_Sub1_Sub2_1.anInt7655 || local40.anInt5113 == local31.aClass2_Sub2_Sub1_Sub2_1.anInt7655) {
				local35 = 2;
			} else if (local31.aClass2_Sub2_Sub1_Sub2_1.anInt7655 == local40.anInt5115 || local31.aClass2_Sub2_Sub1_Sub2_1.anInt7655 == local40.anInt5080 || local40.anInt5117 == local31.aClass2_Sub2_Sub1_Sub2_1.anInt7655 || local40.anInt5104 == local31.aClass2_Sub2_Sub1_Sub2_1.anInt7655) {
				local35 = 3;
			}
			if (local35 != local31.anInt7028) {
				@Pc(135) int local135 = Static79.method8447(local31.aClass2_Sub2_Sub1_Sub2_1);
				@Pc(139) Class169 local139 = local31.aClass2_Sub2_Sub1_Sub2_1.aClass169_1;
				if (local139.anIntArray306 != null) {
					local139 = local139.method4177(Static588.aClass322_1);
				}
				if (local139 == null || local135 == -1) {
					local31.aBoolean592 = false;
					local31.anInt7024 = -1;
				} else if (local135 != local31.anInt7024 || local31.aBoolean592 != local139.aBoolean421) {
					if (local31.aClass3_Sub14_Sub2_4 != null) {
						Static485.aClass3_Sub14_Sub1_2.method2816(local31.aClass3_Sub14_Sub2_4);
						local31.aClass3_Sub14_Sub2_4 = null;
					}
					local31.aBoolean592 = local139.aBoolean421;
					local31.anInt7024 = local135;
					local31.aClass3_Sub16_3 = null;
					local31.aClass3_Sub6_Sub1_3 = null;
				}
				local31.anInt7028 = local35;
			}
			local31.anInt7023 = local31.aClass2_Sub2_Sub1_Sub2_1.anInt9398;
			local31.anInt7020 = local31.aClass2_Sub2_Sub1_Sub2_1.anInt9398 + (local31.aClass2_Sub2_Sub1_Sub2_1.method6311() << 8);
			local31.anInt7019 = local31.aClass2_Sub2_Sub1_Sub2_1.anInt9396;
			local31.anInt7027 = local31.aClass2_Sub2_Sub1_Sub2_1.anInt9396 + (local31.aClass2_Sub2_Sub1_Sub2_1.method6311() << 8);
			Static58.method1498(arg1, arg2, local31, arg0, arg3);
		}
		for (@Pc(253) Class3_Sub37 local253 = (Class3_Sub37) Static521.aClass25_39.method949(); local253 != null; local253 = (Class3_Sub37) Static521.aClass25_39.method947()) {
			@Pc(259) byte local259 = 1;
			@Pc(264) Class171 local264 = local253.aClass2_Sub2_Sub1_Sub1_1.method6316();
			if (local253.aClass2_Sub2_Sub1_Sub1_1.aBoolean645) {
				local259 = 0;
			} else if (local253.aClass2_Sub2_Sub1_Sub1_1.anInt7655 == local264.anInt5079 || local253.aClass2_Sub2_Sub1_Sub1_1.anInt7655 == local264.anInt5082 || local264.anInt5094 == local253.aClass2_Sub2_Sub1_Sub1_1.anInt7655 || local264.anInt5113 == local253.aClass2_Sub2_Sub1_Sub1_1.anInt7655) {
				local259 = 2;
			} else if (local253.aClass2_Sub2_Sub1_Sub1_1.anInt7655 == local264.anInt5115 || local264.anInt5080 == local253.aClass2_Sub2_Sub1_Sub1_1.anInt7655 || local264.anInt5117 == local253.aClass2_Sub2_Sub1_Sub1_1.anInt7655 || local264.anInt5104 == local253.aClass2_Sub2_Sub1_Sub1_1.anInt7655) {
				local259 = 3;
			}
			if (local259 != local253.anInt7028) {
				@Pc(347) int local347 = Static569.method8163(local253.aClass2_Sub2_Sub1_Sub1_1);
				if (local253.anInt7024 != local347 || local253.aBoolean592 != local253.aClass2_Sub2_Sub1_Sub1_1.aBoolean173) {
					if (local253.aClass3_Sub14_Sub2_4 != null) {
						Static485.aClass3_Sub14_Sub1_2.method2816(local253.aClass3_Sub14_Sub2_4);
						local253.aClass3_Sub14_Sub2_4 = null;
					}
					local253.aClass3_Sub16_3 = null;
					local253.anInt7024 = local347;
					local253.aClass3_Sub6_Sub1_3 = null;
					local253.aBoolean592 = local253.aClass2_Sub2_Sub1_Sub1_1.aBoolean173;
				}
				local253.anInt7028 = local259;
			}
			local253.anInt7023 = local253.aClass2_Sub2_Sub1_Sub1_1.anInt9398;
			local253.anInt7020 = local253.aClass2_Sub2_Sub1_Sub1_1.anInt9398 + (local253.aClass2_Sub2_Sub1_Sub1_1.method6311() << 8);
			local253.anInt7019 = local253.aClass2_Sub2_Sub1_Sub1_1.anInt9396;
			local253.anInt7027 = local253.aClass2_Sub2_Sub1_Sub1_1.anInt9396 + (local253.aClass2_Sub2_Sub1_Sub1_1.method6311() << 8);
			Static58.method1498(arg1, arg2, local253, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!tc;")
	public static Class305 method3786(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >> 16;
		@Pc(19) int local19 = arg0 & 0xFFFF;
		if (Static108.aClass305ArrayArray1[local15] == null || Static108.aClass305ArrayArray1[local15][local19] == null) {
			@Pc(33) boolean local33 = Static402.method8391(local15);
			if (!local33) {
				return null;
			}
		}
		return Static108.aClass305ArrayArray1[local15][local19];
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)I")
	public static int method3787() {
		return Static423.anInt8220;
	}
}
