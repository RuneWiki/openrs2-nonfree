import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)I")
	public static int method5603(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLclient!mo;)V")
	public static void method5604(@OriginalArg(1) Class28_Sub4 arg0) {
		arg0.aClass26_1 = null;
		@Pc(12) int local12 = arg0.aClass28_Sub6Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass28_Sub6Array1[local14].aBoolean336 = false;
		}
		@Pc(36) Class169[] local36 = Class7_Sub6.aClass169Array1;
		synchronized (Class7_Sub6.aClass169Array1) {
			if (local12 < Class7_Sub6.aClass169Array1.length && Static384.anIntArray619[local12] < 200) {
				Class7_Sub6.aClass169Array1[local12].method3603(arg0);
				@Pc(63) int local63 = Static384.anIntArray619[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIII)V")
	public static void method5605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static289.method3844(arg3);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg3 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg3;
		@Pc(26) int local26 = -arg3;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(35) int local35 = -1;
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(71) int local71;
		@Pc(80) int local80;
		if (Static316.anInt5188 <= arg0 && Static82.anInt1667 >= arg0) {
			@Pc(45) int[] local45 = Static353.anIntArrayArray48[arg0];
			local54 = Static278.method3708(arg5 - arg3, Static137.anInt2576, Static293.anInt4886);
			local62 = Static278.method3708(arg3 + arg5, Static137.anInt2576, Static293.anInt4886);
			local71 = Static278.method3708(arg5 - local14, Static137.anInt2576, Static293.anInt4886);
			local80 = Static278.method3708(arg5 + local14, Static137.anInt2576, Static293.anInt4886);
			Static404.method5769(local45, local54, local71, arg4);
			Static404.method5769(local45, local71, local80, arg1);
			Static404.method5769(local45, local80, local62, arg4);
		}
		while (local23 > local10) {
			local33 += 2;
			local35 += 2;
			local31 += local35;
			local26 += local33;
			if (local31 >= 0 && local28 >= 1) {
				local28--;
				Static424.anIntArray597[local28] = local10;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(196) int local196;
			@Pc(205) int local205;
			@Pc(216) int[] local216;
			@Pc(144) int local144;
			if (local26 >= 0) {
				local23--;
				local26 -= local23 << 1;
				local144 = arg0 - local23;
				local54 = arg0 + local23;
				if (Static316.anInt5188 <= local54 && Static82.anInt1667 >= local144) {
					if (local14 > local23) {
						local62 = Static424.anIntArray597[local23];
						local71 = Static278.method3708(arg5 + local10, Static137.anInt2576, Static293.anInt4886);
						local80 = Static278.method3708(arg5 - local10, Static137.anInt2576, Static293.anInt4886);
						local196 = Static278.method3708(local62 + arg5, Static137.anInt2576, Static293.anInt4886);
						local205 = Static278.method3708(arg5 - local62, Static137.anInt2576, Static293.anInt4886);
						if (local54 <= Static82.anInt1667) {
							local216 = Static353.anIntArrayArray48[local54];
							Static404.method5769(local216, local80, local205, arg4);
							Static404.method5769(local216, local205, local196, arg1);
							Static404.method5769(local216, local196, local71, arg4);
						}
						if (local144 >= Static316.anInt5188) {
							local216 = Static353.anIntArrayArray48[local144];
							Static404.method5769(local216, local80, local205, arg4);
							Static404.method5769(local216, local205, local196, arg1);
							Static404.method5769(local216, local196, local71, arg4);
						}
					} else {
						local62 = Static278.method3708(local10 + arg5, Static137.anInt2576, Static293.anInt4886);
						local71 = Static278.method3708(arg5 - local10, Static137.anInt2576, Static293.anInt4886);
						if (Static82.anInt1667 >= local54) {
							Static404.method5769(Static353.anIntArrayArray48[local54], local71, local62, arg4);
						}
						if (local144 >= Static316.anInt5188) {
							Static404.method5769(Static353.anIntArrayArray48[local144], local71, local62, arg4);
						}
					}
				}
			}
			local144 = arg0 - local10;
			local54 = local10 + arg0;
			if (local54 >= Static316.anInt5188 && local144 <= Static82.anInt1667) {
				local62 = local23 + arg5;
				local71 = arg5 - local23;
				if (Static293.anInt4886 <= local62 && Static137.anInt2576 >= local71) {
					local62 = Static278.method3708(local62, Static137.anInt2576, Static293.anInt4886);
					local71 = Static278.method3708(local71, Static137.anInt2576, Static293.anInt4886);
					if (local10 >= local14) {
						if (local54 <= Static82.anInt1667) {
							Static404.method5769(Static353.anIntArrayArray48[local54], local71, local62, arg4);
						}
						if (Static316.anInt5188 <= local144) {
							Static404.method5769(Static353.anIntArrayArray48[local144], local71, local62, arg4);
						}
					} else {
						local80 = local10 <= local28 ? local28 : Static424.anIntArray597[local10];
						local196 = Static278.method3708(local80 + arg5, Static137.anInt2576, Static293.anInt4886);
						local205 = Static278.method3708(arg5 - local80, Static137.anInt2576, Static293.anInt4886);
						if (local54 <= Static82.anInt1667) {
							local216 = Static353.anIntArrayArray48[local54];
							Static404.method5769(local216, local71, local205, arg4);
							Static404.method5769(local216, local205, local196, arg1);
							Static404.method5769(local216, local196, local62, arg4);
						}
						if (local144 >= Static316.anInt5188) {
							local216 = Static353.anIntArrayArray48[local144];
							Static404.method5769(local216, local71, local205, arg4);
							Static404.method5769(local216, local205, local196, arg1);
							Static404.method5769(local216, local196, local62, arg4);
						}
					}
				}
			}
		}
	}
}
