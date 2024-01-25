import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!en", name = "U", descriptor = "I")
	public static int anInt2225 = 0;

	@OriginalMember(owner = "client!en", name = "K", descriptor = "[I")
	public static final int[] anIntArray142 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBI)V")
	public static void method2125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg1, 6);
		local9.method4004();
		local9.anInt4595 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBIII)V")
	public static void method2127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static18.anInt243 != 1) {
			return;
		}
		@Pc(19) int local19 = arg1 / Static599.anInt9885;
		@Pc(23) int local23 = arg0 / Static599.anInt9885;
		@Pc(27) int local27 = arg3 / Static611.anInt10061;
		@Pc(31) int local31 = arg2 / Static611.anInt10061;
		if (local19 >= Static93.anInt1647 || local23 < 0 || local27 >= Static117.anInt1906 || local31 < 0) {
			return;
		}
		if (Static93.anInt1647 <= local23) {
			local23 = Static93.anInt1647 - 1;
		}
		if (local19 < 0) {
			local19 = 0;
		}
		if (local27 < 0) {
			local27 = 0;
		}
		if (Static117.anInt1906 <= local31) {
			local31 = Static117.anInt1906 - 1;
		}
		for (@Pc(93) int local93 = local27; local93 <= local31; local93++) {
			@Pc(103) int local103 = Static596.method8450(Static515.anInt8875 + local93, Static117.anInt1906) * Static93.anInt1647;
			for (@Pc(105) int local105 = local19; local105 <= local23; local105++) {
				@Pc(116) int local116 = local103 + Static596.method8450(Static511.anInt8867 + local105, Static93.anInt1647);
				Static466.anIntArray414[local116] = Static186.anInt3088;
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "h", descriptor = "(I)I")
	public static int method2128() {
		@Pc(18) byte local18;
		if (Static360.anInt6168 < 96) {
			Static620.method8714();
			local18 = 1;
		} else {
			@Pc(22) int local22 = Static346.method5277();
			if (local22 <= 100) {
				local18 = 4;
				Static354.method5383();
			} else if (local22 <= 500) {
				Static682.method9410();
				local18 = 3;
			} else if (local22 <= 1000) {
				local18 = 2;
				Static285.method4778();
			} else {
				Static620.method8714();
				local18 = 1;
			}
		}
		if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() != 0) {
			Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
			Static459.method8986(false, 0);
		}
		Static574.method8188();
		return local18;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)Lclient!nh;")
	public static Class4_Sub3_Sub3_Sub3 method2130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class89 local20 = Static63.aClass89ArrayArrayArray1[arg2][arg0][arg1];
		if (local20 == null) {
			return null;
		}
		@Pc(27) Class4_Sub3_Sub3_Sub3 local27 = null;
		@Pc(29) int local29 = -1;
		for (@Pc(32) Class58 local32 = local20.aClass58_2; local32 != null; local32 = local32.aClass58_1) {
			@Pc(36) Class4_Sub3_Sub3 local36 = local32.aClass4_Sub3_Sub3_1;
			if (local36 instanceof Class4_Sub3_Sub3_Sub3) {
				@Pc(42) Class4_Sub3_Sub3_Sub3 local42 = (Class4_Sub3_Sub3_Sub3) local36;
				@Pc(50) int local50 = local42.method2870(0) * 256 - 4;
				@Pc(57) int local57 = local42.anInt11184 - local50 >> 9;
				@Pc(65) int local65 = local42.anInt11178 - local50 >> 9;
				@Pc(72) int local72 = local42.anInt11184 + local50 >> 9;
				@Pc(80) int local80 = local42.anInt11178 + local50 >> 9;
				if (local57 <= arg0 && local65 <= arg1 && local72 >= arg0 && local80 >= arg1) {
					@Pc(124) int local124 = (local80 + 1 - arg1) * (local72 + 1 + -arg0);
					if (local29 < local124) {
						local27 = local42;
						local29 = local124;
					}
				}
			}
		}
		return local27;
	}
}
