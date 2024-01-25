import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_164 = new Class123(22, -1);

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "[I")
	public static int[] anIntArray212 = new int[1];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!eq;B)V")
	public static void method2811(@OriginalArg(0) Class66 arg0) {
		@Pc(7) int local7 = Static187.anInt3647;
		@Pc(9) int local9 = Static200.anInt3772;
		@Pc(11) int local11 = Static382.anInt4224;
		@Pc(15) int local15 = Static230.anInt4199 - 3;
		if (Static306.aClass87_21 == null || Static379.aClass87_27 == null) {
			if (Static350.aClass100_69.method2492(Static254.anInt4643) && Static350.aClass100_69.method2492(Static441.anInt7803)) {
				Static306.aClass87_21 = arg0.method5038(Static458.method4494(Static350.aClass100_69, Static254.anInt4643, 0));
				@Pc(44) Class194 local44 = Static458.method4494(Static350.aClass100_69, Static441.anInt7803, 0);
				Static379.aClass87_27 = arg0.method5038(local44);
				local44.method4487();
				Static330.aClass87_23 = arg0.method5038(local44);
			} else {
				arg0.method5004(local7, local9, local11, 20, Static445.anInt7974 | 255 - Static39.anInt1158 << 24, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static306.aClass87_21 != null && Static379.aClass87_27 != null) {
			local88 = (local11 - Static379.aClass87_27.method6555() * 2) / Static306.aClass87_21.method6555();
			for (local90 = 0; local90 < local88; local90++) {
				Static306.aClass87_21.method6567(Static379.aClass87_27.method6555() + local7 + Static306.aClass87_21.method6555() * local90, local9);
			}
			Static379.aClass87_27.method6567(local7, local9);
			Static330.aClass87_23.method6567(local7 + local11 - Static330.aClass87_23.method6555(), local9);
		}
		Static236.aClass29_2.method4804(Static36.anInt1126 | 0xFF000000, -1, local7 + 3, local9 - -14, Static214.aClass267_55.method6581(Static161.anInt3239));
		arg0.method5004(local7, local9 + 20, local11, local15 - 20, -Static39.anInt1158 + 255 << 24 | Static445.anInt7974, 1);
		local88 = Static186.aClass50_1.method1436();
		local90 = Static186.aClass50_1.method1446();
		@Pc(181) int local181 = 0;
		@Pc(204) int local204;
		for (@Pc(186) Class6_Sub40 local186 = (Class6_Sub40) Static292.aClass244_25.method5976(); local186 != null; local186 = (Class6_Sub40) Static292.aClass244_25.method5964()) {
			local204 = local9 + (Static151.anInt3129 - local181 - 1) * 16 + 33;
			if (local88 > local7 && local7 + local11 > local88 && local90 > local204 - 13 && local90 < local204 + 4 && local186.aBoolean428) {
				arg0.method5004(local7, local204 - 12, local11, 16, Static408.anInt7339 | 255 - Static21.anInt688 << 24, 1);
			}
			local181++;
		}
		if ((Static447.aClass87_30 == null || Static335.aClass87_24 == null || Static234.aClass87_19 == null) && Static350.aClass100_69.method2492(Static338.anInt5880) && Static350.aClass100_69.method2492(Static293.anInt345) && Static350.aClass100_69.method2492(Static176.anInt3529)) {
			@Pc(288) Class194 local288 = Static458.method4494(Static350.aClass100_69, Static293.anInt345, 0);
			Static335.aClass87_24 = arg0.method5038(local288);
			local288.method4487();
			Static100.aClass87_7 = arg0.method5038(local288);
			Static447.aClass87_30 = arg0.method5038(Static458.method4494(Static350.aClass100_69, Static338.anInt5880, 0));
			@Pc(313) Class194 local313 = Static458.method4494(Static350.aClass100_69, Static176.anInt3529, 0);
			Static234.aClass87_19 = arg0.method5038(local313);
			local313.method4487();
			Static387.aClass87_28 = arg0.method5038(local313);
		}
		@Pc(381) int local381;
		@Pc(344) int local344;
		if (Static447.aClass87_30 != null && Static335.aClass87_24 != null && Static234.aClass87_19 != null) {
			local204 = (local11 - Static234.aClass87_19.method6555() * 2) / Static447.aClass87_30.method6555();
			for (local344 = 0; local344 < local204; local344++) {
				Static447.aClass87_30.method6567(Static234.aClass87_19.method6555() + local7 + Static447.aClass87_30.method6555() * local344, -Static447.aClass87_30.method6554() + local15 + local9);
			}
			local381 = (local15 - Static234.aClass87_19.method6554() - 20) / Static335.aClass87_24.method6554();
			for (@Pc(383) int local383 = 0; local383 < local381; local383++) {
				Static335.aClass87_24.method6567(local7, Static335.aClass87_24.method6554() * local383 + local9 + 20);
				Static100.aClass87_7.method6567(local11 + local7 - Static100.aClass87_7.method6555(), local383 * Static335.aClass87_24.method6554() + 20 + local9);
			}
			Static234.aClass87_19.method6567(local7, local9 + local15 - Static234.aClass87_19.method6554());
			Static387.aClass87_28.method6567(local7 + local11 - Static234.aClass87_19.method6555(), -Static234.aClass87_19.method6554() + (local9 - -local15));
		}
		local181 = 0;
		for (@Pc(456) Class6_Sub40 local456 = (Class6_Sub40) Static292.aClass244_25.method5976(); local456 != null; local456 = (Class6_Sub40) Static292.aClass244_25.method5964()) {
			local344 = local9 + (Static151.anInt3129 - local181 - 1) * 16 + 33;
			local381 = Static36.anInt1126 | 0xFF000000;
			if (local88 > local7 && local7 + local11 > local88 && local90 > local344 - 13 && local344 + 4 > local90 && local456.aBoolean428) {
				local381 = Static199.anInt3764 | 0xFF000000;
			}
			@Pc(516) int[] local516 = null;
			if (Static49.method1093(local456.anInt6722)) {
				local516 = Static380.aClass231_2.method5648((int) local456.aLong192).anIntArray8;
			} else if (local456.anInt6721 != -1) {
				local516 = Static380.aClass231_2.method5648(local456.anInt6721).anIntArray8;
			} else if (Static428.method6233(local456.anInt6722)) {
				@Pc(585) Class3_Sub2_Sub1_Sub1 local585 = Static308.aClass3_Sub2_Sub1_Sub1Array1[(int) local456.aLong192];
				if (local585 != null) {
					@Pc(590) Class48 local590 = local585.aClass48_1;
					if (local590.anIntArray103 != null) {
						local590 = local590.method1378(Static393.aClass207_1);
					}
					if (local590 != null) {
						local516 = local590.anIntArray104;
					}
				}
			} else if (Static86.method822(local456.anInt6722)) {
				@Pc(557) Class106 local557;
				if (local456.anInt6722 == 1002) {
					local557 = Static448.aClass104_4.method2616((int) local456.aLong192);
				} else {
					local557 = Static448.aClass104_4.method2616((int) (local456.aLong192 >>> 32 & 0x7FFFFFFFL));
				}
				if (local557.anIntArray188 != null) {
					local557 = local557.method2625(Static393.aClass207_1);
				}
				if (local557 != null) {
					local516 = local557.anIntArray191;
				}
			}
			@Pc(624) String local624 = Static105.method1871(local456);
			if (local516 != null) {
				local624 = local624 + Static221.method3327(local516);
			}
			Static236.aClass29_2.method4805(local381, local624, local7 + 3, local344, Static58.aClass87Array8, Static108.anIntArray138);
			local181++;
			if (local456.aBoolean429) {
				Static172.aClass87_11.method6567(Static237.aClass166_8.method3892(local624) + local7 + 5, local344 + -12);
			}
		}
		Static407.method6009(Static200.anInt3772, Static187.anInt3647, Static382.anInt4224, Static230.anInt4199);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIB)Z")
	public static boolean method2812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BIZIIIIF)[I")
	public static int[] method2813(@OriginalArg(7) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class6_Sub5_Sub37 local10 = new Class6_Sub5_Sub37();
		local10.anInt7650 = 35;
		local10.anInt7651 = 8;
		local10.anInt7658 = (int) (arg0 * 4096.0F);
		local10.anInt7653 = 8;
		local10.aBoolean482 = true;
		local10.anInt7657 = 4;
		local10.method6533();
		Static369.method3609(2048, 1);
		local10.method6263(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIII)I")
	public static int method2814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 <= arg2) {
			return arg2 > arg1 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}
}
