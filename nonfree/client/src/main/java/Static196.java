import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public static int anInt4150;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	public static void method3452() {
		Static240.aClass14_25.method305();
		for (@Pc(19) Class1_Sub12 local19 = (Class1_Sub12) Static58.aClass14_4.method302(); local19 != null; local19 = (Class1_Sub12) Static58.aClass14_4.method313()) {
			if (local19.anInt1409 < 1000) {
				local19.method5796();
				Static240.aClass14_25.method300(local19);
			}
		}
		Static240.aClass14_25.method304(Static58.aClass14_4);
		if (Static43.aClass163_4 != null || (Static157.aClass163_11 != null || Static148.anInt3053 > 0)) {
			return;
		}
		@Pc(61) int local61 = Static171.anInt3612;
		@Pc(70) int local70;
		if (!Static308.aBoolean499) {
			if (local61 == 1 && Static61.anInt1413 > 0) {
				local70 = ((Class1_Sub12) Static58.aClass14_4.aClass1_17.aClass1_248).anInt1409;
				if (local70 == 51 || local70 == 1 || local70 == 23 || local70 == 10 || local70 == 25 || local70 == 15 || local70 == 30 || local70 == 19 || local70 == 47 || local70 == 2 || local70 == 34 || local70 == 1004) {
					@Pc(324) Class1_Sub12 local324 = (Class1_Sub12) Static58.aClass14_4.aClass1_17.aClass1_248;
					@Pc(329) Class163 local329 = Static248.method22(local324.anInt1405);
					@Pc(332) Class1_Sub11 local332 = Static40.method857(local329);
					if (local332.method1090()) {
						Static57.aBoolean95 = false;
						Static63.anInt2653 = 0;
						if (Static43.aClass163_4 != null) {
							Static340.method5639(Static43.aClass163_4);
						}
						Static43.aClass163_4 = Static248.method22(local324.anInt1405);
						Static351.anInt4024 = Static27.anInt4213;
						Static35.anInt870 = local324.anInt1410;
						Static69.anInt1476 = Static289.anInt5796;
						Static340.method5639(Static43.aClass163_4);
						return;
					}
				}
			}
			if (local61 <= 0 && Static59.anInt1395 > 0) {
				local61 = Static59.anInt1395;
			}
			Static59.anInt1395 = 0;
			if (local61 == 1 && (Static120.anInt2335 == 1 && Static61.anInt1413 > 2 || Static82.method1316())) {
				local61 = 2;
			}
			if (local61 == 2 && Static61.anInt1413 > 0) {
				Static140.method2319();
			}
			if (local61 != 1 || Static61.anInt1413 <= 0) {
				return;
			}
			Static344.method5762();
			return;
		}
		@Pc(72) int local72;
		if (local61 != 1) {
			local70 = Static208.anInt4358;
			local72 = Static28.anInt538;
			if (local70 < Static298.anInt6013 - 10 || Static228.anInt4754 + Static298.anInt6013 + 10 < local70 || Static148.anInt3051 - 10 > local72 || Static148.anInt3051 + Static145.anInt3038 + 10 < local72) {
				Static308.aBoolean499 = false;
				Static177.method3159(Static298.anInt6013, Static145.anInt3038, Static148.anInt3051, Static228.anInt4754);
			}
		}
		if (local61 != 1) {
			return;
		}
		local70 = Static298.anInt6013;
		local72 = Static148.anInt3051;
		@Pc(124) int local124 = Static228.anInt4754;
		@Pc(126) int local126 = Static289.anInt5796;
		@Pc(128) int local128 = Static27.anInt4213;
		@Pc(130) int local130 = -1;
		@Pc(149) int local149;
		for (@Pc(132) int local132 = 0; local132 < Static61.anInt1413; local132++) {
			if (Static345.aBoolean548) {
				local149 = (Static61.anInt1413 - local132 - 1) * 16 + local72 + 33;
				if (local126 > local70 && local126 < local70 + local124 && local149 - 13 < local128 && local149 + 3 > local128) {
					local130 = local132;
				}
			} else {
				local149 = (Static61.anInt1413 - local132 - 1) * 16 + local72 + 31;
				if (local126 > local70 && local124 + local70 > local126 && local128 > local149 - 13 && local128 < local149 + 3) {
					local130 = local132;
				}
			}
		}
		if (local130 != -1) {
			local149 = 0;
			@Pc(226) Class137 local226 = new Class137(Static58.aClass14_4);
			for (@Pc(231) Class1_Sub12 local231 = (Class1_Sub12) local226.method3157(); local231 != null; local231 = (Class1_Sub12) local226.method3162()) {
				if (local149 == local130) {
					Static50.method1011(local231);
				}
				local149++;
			}
		}
		Static308.aBoolean499 = false;
		Static177.method3159(Static298.anInt6013, Static145.anInt3038, Static148.anInt3051, Static228.anInt4754);
		return;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
	public static int method3453(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(24) int local24 = (local10 & 0x33333333) + (local10 >>> 2 & 0xB3333333);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}
}
