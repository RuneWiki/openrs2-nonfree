import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
	public static final int[] anIntArray499 = new int[4096];

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
	public static int anInt9084 = 0;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "[I")
	public static final int[] anIntArray500 = new int[8];

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_277 = new Class196(24, -1);

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "[F")
	public static final float[] aFloatArray66 = new float[2];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([BB)Lclient!mha;")
	public static Class5_Sub2_Sub12 method7644(@OriginalArg(0) byte[] arg0) {
		@Pc(7) Class5_Sub2_Sub12 local7 = new Class5_Sub2_Sub12();
		@Pc(12) Class5_Sub15 local12 = new Class5_Sub15(arg0);
		local12.anInt4144 = local12.aByteArray45.length - 2;
		@Pc(23) int local23 = local12.method3698();
		@Pc(34) int local34 = local12.aByteArray45.length - local23 - 16 - 2;
		local12.anInt4144 = local34;
		@Pc(43) int local43 = local12.method3671();
		local7.anInt6419 = local12.method3698();
		local7.anInt6422 = local12.method3698();
		local7.anInt6420 = local12.method3698();
		local7.anInt6414 = local12.method3698();
		local7.anInt6418 = local12.method3698();
		local7.anInt6415 = local12.method3698();
		@Pc(77) int local77 = local12.method3642();
		@Pc(88) int local88;
		@Pc(93) int local93;
		if (local77 > 0) {
			local7.aClass335Array1 = new Class335[local77];
			for (local88 = 0; local88 < local77; local88++) {
				local93 = local12.method3698();
				@Pc(100) Class335 local100 = new Class335(Static209.method2991(local93));
				local7.aClass335Array1[local88] = local100;
				while (local93-- > 0) {
					@Pc(110) int local110 = local12.method3671();
					@Pc(114) int local114 = local12.method3671();
					local100.method7770((long) local110, new Class5_Sub43(local114));
				}
			}
		}
		local12.anInt4144 = 0;
		local7.aString63 = local12.method3691();
		local7.anIntArray361 = new int[local43];
		local88 = 0;
		while (local34 > local12.anInt4144) {
			local93 = local12.method3698();
			if (local93 == 3) {
				if (local7.aStringArray21 == null) {
					local7.aStringArray21 = new String[local43];
				}
				local7.aStringArray21[local88] = local12.method3661().intern();
			} else if (local93 == 54) {
				if (local7.aLongArray14 == null) {
					local7.aLongArray14 = new long[local43];
				}
				local7.aLongArray14[local88] = local12.method3634();
			} else {
				if (local7.anIntArray360 == null) {
					local7.anIntArray360 = new int[local43];
				}
				if (local93 >= 150 || local93 == 21 || local93 == 38 || local93 == 39) {
					local7.anIntArray360[local88] = local12.method3642();
				} else {
					local7.anIntArray360[local88] = local12.method3671();
				}
			}
			local7.anIntArray361[local88++] = local93;
		}
		return local7;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public static void method7645() {
		for (@Pc(5) int local5 = 0; local5 < Static259.anInt4111; local5++) {
			@Pc(16) int local16 = Static460.method6810(Static259.anInt4111, local5 + Static675.anInt10637) * Static449.anInt7857;
			for (@Pc(18) int local18 = 0; local18 < Static449.anInt7857; local18++) {
				@Pc(29) int local29 = Static460.method6810(Static449.anInt7857, local18 + Static606.anInt9804) + local16;
				if (Static348.anIntArray433[local29] == Static244.anInt3958) {
					Static368.anInterface2Array1[local29].method8515(0, 0, Static586.anInt9622, Static77.anInt1204, Static586.anInt9622 * local18, local5 * Static77.anInt1204);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZLjava/lang/String;)V")
	public static void method7647(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static404.method5903();
		if (arg0 == 0) {
			Static563.aClass143_13 = Static553.method7615(0, Static498.aClass50_149, Static105.aCanvas2, Static218.anInterface3_3, Static655.aClass5_Sub36_29.aClass2_Sub28_1.method8721() * 2);
			if (arg2 != null) {
				Static563.aClass143_13.GA(0);
				@Pc(34) Class198 local34 = Static253.method3556(Static253.aClass50_66, Static90.anInt1505);
				@Pc(43) Class72 local43 = Static563.aClass143_13.method6194(local34, Static684.method7227(Static471.aClass50_136, Static90.anInt1505));
				Static587.method8002();
				Static193.method2763(local34, local43, Static563.aClass143_13, true, arg2);
			}
		} else {
			@Pc(57) Class143 local57 = null;
			@Pc(85) Class72 local85;
			if (arg2 != null) {
				local57 = Static553.method7615(0, Static498.aClass50_149, Static105.aCanvas2, Static218.anInterface3_3, 0);
				local57.GA(0);
				@Pc(76) Class198 local76 = Static253.method3556(Static253.aClass50_66, Static90.anInt1505);
				local85 = local57.method6194(local76, Static684.method7227(Static471.aClass50_136, Static90.anInt1505));
				Static587.method8002();
				Static193.method2763(local76, local85, local57, true, arg2);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static563.aClass143_13 = Static553.method7615(arg0, Static498.aClass50_149, Static105.aCanvas2, Static218.anInterface3_3, Static655.aClass5_Sub36_29.aClass2_Sub28_1.method8721() * 2);
					if (arg2 != null) {
						local57.GA(0);
						@Pc(120) Class198 local120 = Static253.method3556(Static253.aClass50_66, Static90.anInt1505);
						@Pc(129) Class72 local129 = local57.method6194(local120, Static684.method7227(Static471.aClass50_136, Static90.anInt1505));
						Static587.method8002();
						Static193.method2763(local120, local129, local57, true, arg2);
					}
					if (Static563.aClass143_13.method6213()) {
						@Pc(145) boolean local145 = true;
						try {
							local145 = Static87.aClass5_Sub30_1.anInt4369 > 256;
						} catch (@Pc(157) Throwable local157) {
						}
						@Pc(163) Class5_Sub26 local163;
						if (local145) {
							local163 = Static563.aClass143_13.method6268(146800640);
						} else {
							local163 = Static563.aClass143_13.method6268(104857600);
						}
						Static563.aClass143_13.method6217(local163);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(173) Throwable local173) {
					@Pc(178) int local178 = Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836();
					if (local178 == 2) {
						Static239.aBoolean271 = true;
					}
					Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_1, 0);
					method7647(local178, arg1, arg2);
					@Pc(195) Object local195 = null;
					var14 = false;
				} finally {
					if (var14) {
						local85 = null;
						if (local57 != null) {
							try {
								local57.method6225();
							} catch (@Pc(352) Throwable local352) {
							}
						}
					}
				}
				if (local57 != null) {
					try {
						local57.method6225();
					} catch (@Pc(328) Throwable local328) {
					}
				}
				return;
			}
			local85 = null;
			if (local57 != null) {
				try {
					local57.method6225();
				} catch (@Pc(340) Throwable local340) {
				}
			}
		}
		Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7840(!arg1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_1, arg0);
		Static608.method8177();
		Static563.aClass143_13.method6258();
		Static563.aClass143_13.X(32);
		Static108.aClass56_4 = Static563.aClass143_13.method6232();
		Static269.aClass56_5 = Static563.aClass143_13.method6232();
		Static304.method4152();
		Static563.aClass143_13.method6186(Static655.aClass5_Sub36_29.aClass2_Sub25_1.method8192() == 1);
		if (Static563.aClass143_13.method6260()) {
			Static178.method2617(Static655.aClass5_Sub36_29.aClass2_Sub13_1.method6692() == 1);
		}
		Static167.method2460(Static124.anInt2150 >> 3, Static64.anInt1015 >> 3, Static563.aClass143_13);
		Static3.method39();
		Static446.aBoolean570 = true;
		Static494.aClass96Array1 = null;
		Static97.aBoolean118 = false;
		Static90.method1397();
	}
}
