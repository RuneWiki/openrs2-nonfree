import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!qea", name = "s", descriptor = "I")
	public static int anInt8128;

	@OriginalMember(owner = "client!qea", name = "v", descriptor = "I")
	public static int anInt8135;

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_154 = new Class225(34, 0);

	@OriginalMember(owner = "client!qea", name = "B", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_155 = new Class225(71, 2);

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IILclient!np;)V")
	public static void method7246(@OriginalArg(1) int arg0, @OriginalArg(2) Class264 arg1) {
		if (Static10.aBoolean24) {
			Static10.aBoolean24 = false;
			arg0 = 0;
		}
		if (Static250.aClass264_1 != null && Static250.aClass264_1.method6285(arg1)) {
			return;
		}
		Static250.aClass264_1 = arg1;
		Static431.aLong215 = Static567.method7863();
		Static398.anInt6539 = arg0;
		Static206.anInt3342 = arg0;
		if (Static206.anInt3342 == 0) {
			Static65.method991();
			return;
		}
		Static255.anInt4025 = Static521.anInt8289;
		Static233.aFloat47 = Static426.aFloat114;
		Static482.aFloat127 = Static434.aFloat122;
		Static117.aFloat10 = Static678.aFloat175;
		Static167.aFloat27 = Static558.aFloat145;
		Static20.anInt270 = Static366.anInt5876;
		Static138.aFloat24 = Static65.aFloat3;
		Static206.aClass358_16 = Static315.aClass358_20;
		Static611.aFloat151 = Static439.aFloat123;
		Static627.anInt9594 = Static266.anInt4126;
		Static200.aClass74_2 = Static11.aClass74_1;
		if (Static315.aClass358_20 == null) {
			return;
		}
		if (Static315.aClass358_20.method8439()) {
			Static206.aClass358_16 = Static315.aClass358_20.method8429();
			Static315.aClass358_20 = Static206.aClass358_16;
		}
		if (Static315.aClass358_20 != null && Static250.aClass264_1.aClass358_26 != Static315.aClass358_20) {
			Static315.aClass358_20.method8434(Static250.aClass264_1.aClass358_26);
			return;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(II)V")
	public static void method7247(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub6_Sub9 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class133 local8 = Static126.aClass133Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static545.anInt8590; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static372.anInt5930; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static260.anInt4053;
							@Pc(32) int local32 = local12 << Static260.anInt4053;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class133 local41 = Static126.aClass133Array1[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8217(local15, local12) - local41.method8217(local15, local12);
									@Pc(71) int local71 = local8.method8217(local15 + 1, local12) - local41.method8217(local15 + 1, local12);
									@Pc(91) int local91 = local8.method8217(local15 + 1, local12 + 1) - local41.method8217(local15 + 1, local12 + 1);
									@Pc(107) int local107 = local8.method8217(local15, local12 + 1) - local41.method8217(local15, local12 + 1);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([B[BIIIIIII)V")
	public static void method7248(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(25) int local25 = -arg2; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local10; local29 < 0; local29++) {
				local33 = arg6++;
				arg1[local33] += arg0[arg5++];
				@Pc(45) int local45 = arg6++;
				arg1[local45] += arg0[arg5++];
				@Pc(57) int local57 = arg6++;
				arg1[local57] += arg0[arg5++];
				@Pc(69) int local69 = arg6++;
				arg1[local69] += arg0[arg5++];
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local33 = arg6++;
				arg1[local33] += arg0[arg5++];
			}
			arg6 += arg7;
			arg5 += arg4;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!sj;Z)V")
	public static void method7251(@OriginalArg(0) Class4_Sub2_Sub1_Sub2 arg0) {
		@Pc(8) Class53 local8 = arg0.aClass53_6;
		if (local8.method4094() && local8.method4077(1) && local8.method4098()) {
			if (arg0.aBoolean248) {
				local8.method4089(arg0.method2064(-74).method946());
				arg0.aBoolean248 = local8.method4094();
			}
			local8.method4087();
		}
		@Pc(72) Class53 local72;
		for (@Pc(55) int local55 = 0; local55 < arg0.aClass315Array3.length; local55++) {
			if (arg0.aClass315Array3[local55].anInt8456 != -1) {
				local72 = arg0.aClass315Array3[local55].aClass53_10;
				if (local72.method4075()) {
					@Pc(85) Class347 local85 = Static119.aClass209_1.method4570(arg0.aClass315Array3[local55].anInt8456);
					@Pc(89) Class307 local89 = local72.method4074();
					if (local85.aBoolean800) {
						if (local89.anInt8123 == 3) {
							if (arg0.anInt2370 > 0 && arg0.anInt2358 <= Static528.anInt8386 && Static528.anInt8386 > arg0.anInt2367) {
								local72.method4089(-1);
								arg0.aClass315Array3[local55].anInt8456 = -1;
								continue;
							}
						} else if (local89.anInt8123 == 1 && arg0.anInt2370 > 0 && Static528.anInt8386 >= arg0.anInt2358 && arg0.anInt2367 < Static528.anInt8386) {
							continue;
						}
					}
				}
				if (local72.method4077(1) && local72.method4098()) {
					local72.method4089(-1);
					arg0.aClass315Array3[local55].anInt8456 = -1;
				}
			}
		}
		local72 = arg0.aClass53_7;
		if (local72.method4094()) {
			label83: {
				@Pc(224) Class307 local224 = local72.method4074();
				if (local224.anInt8123 == 3) {
					if (arg0.anInt2370 > 0 && Static528.anInt8386 >= arg0.anInt2358 && Static528.anInt8386 > arg0.anInt2367) {
						arg0.anIntArray179 = null;
						local72.method4089(-1);
						break label83;
					}
				} else if (local224.anInt8123 == 1) {
					if (arg0.anInt2370 > 0 && arg0.anInt2358 <= Static528.anInt8386 && Static528.anInt8386 > arg0.anInt2367) {
						local72.method4090(1);
						break label83;
					}
					local72.method4090(0);
				}
				if (local72.method4077(1) && local72.method4098()) {
					arg0.anIntArray179 = null;
					local72.method4089(-1);
				}
			}
		}
		for (@Pc(331) int local331 = 0; local331 < arg0.aClass53_Sub1_Sub1Array3.length; local331++) {
			@Pc(338) Class53_Sub1_Sub1 local338 = arg0.aClass53_Sub1_Sub1Array3[local331];
			if (local338 != null) {
				if (local338.anInt4502 > 0) {
					local338.anInt4502--;
				} else if (local338.method4077(1) && local338.method4098()) {
					arg0.aClass53_Sub1_Sub1Array3[local331] = null;
				}
			}
		}
	}
}
