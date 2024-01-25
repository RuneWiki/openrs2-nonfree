import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "Lclient!mp;")
	public static final Class242 aClass242_10 = new Class242("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([Ljava/lang/Object;II[II)V")
	public static void method8008(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local34;
		@Pc(52) int local52 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg1; local54 < arg2; local54++) {
			if (local20 + (local54 & local52) > arg3[local54]) {
				@Pc(72) int local72 = arg3[local54];
				arg3[local54] = arg3[local16];
				arg3[local16] = local72;
				@Pc(86) Object local86 = arg0[local54];
				arg0[local54] = arg0[local16];
				arg0[local16++] = local86;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg2] = arg0[local16];
		arg0[local16] = local34;
		method8008(arg0, arg1, local16 - 1, arg3);
		method8008(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B[Lclient!mj;I)V")
	public static void method8011(@OriginalArg(1) Class238[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class238 local18 = arg0[local12];
			if (local18 != null && local18.anInt5963 == arg1 && !Static73.method1224(local18)) {
				if (local18.anInt5976 == 0) {
					method8011(arg0, local18.anInt5971);
					if (local18.aClass238Array2 != null) {
						method8011(local18.aClass238Array2, local18.anInt5971);
					}
					@Pc(62) Class5_Sub38 local62 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local18.anInt5971);
					if (local62 != null) {
						Static57.method1021(local62.anInt6418);
					}
				}
				if (local18.anInt5976 == 6 && local18.anInt5996 != -1) {
					@Pc(86) Class264 local86 = Static315.aClass14_1.method227(local18.anInt5996);
					if (local86 != null) {
						local18.anInt6023 += Static675.anInt10854;
						@Pc(97) int local97 = local18.anInt5968;
						while (local18.anInt6023 > local86.anIntArray425[local18.anInt5968]) {
							local18.anInt6023 -= local86.anIntArray425[local18.anInt5968];
							local18.anInt5968++;
							if (local86.anIntArray423.length <= local18.anInt5968) {
								local18.anInt5968 -= local86.anInt7050;
								if (local18.anInt5968 < 0 || local18.anInt5968 >= local86.anIntArray423.length) {
									local18.anInt5968 = 0;
								}
							}
							local18.anInt6022 = local18.anInt5968 + 1;
							if (local86.anIntArray423.length <= local18.anInt6022) {
								local18.anInt6022 -= local86.anInt7050;
								if (local18.anInt6022 < 0 || local86.anIntArray423.length <= local18.anInt6022) {
									local18.anInt6022 = -1;
								}
							}
							Static333.method5032(local18);
						}
						if (local97 != local18.anInt5968) {
							Static179.method3121(local18.anInt5968, local86);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[[[Lclient!gf;)V")
	public static void method8013(@OriginalArg(1) Class128[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class128[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class128 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass4_Sub1_Sub3_1 instanceof Interface9) {
							((Interface9) local27.aClass4_Sub1_Sub3_1).method8362();
						}
						if (local27.aClass4_Sub1_Sub5_2 instanceof Interface9) {
							((Interface9) local27.aClass4_Sub1_Sub5_2).method8362();
						}
						if (local27.aClass4_Sub1_Sub5_1 instanceof Interface9) {
							((Interface9) local27.aClass4_Sub1_Sub5_1).method8362();
						}
						if (local27.aClass4_Sub1_Sub2_2 instanceof Interface9) {
							((Interface9) local27.aClass4_Sub1_Sub2_2).method8362();
						}
						if (local27.aClass4_Sub1_Sub2_1 instanceof Interface9) {
							((Interface9) local27.aClass4_Sub1_Sub2_1).method8362();
						}
						for (@Pc(91) Class299 local91 = local27.aClass299_2; local91 != null; local91 = local91.aClass299_3) {
							@Pc(96) Class4_Sub1_Sub1 local96 = local91.aClass4_Sub1_Sub1_1;
							if (local96 instanceof Interface9) {
								((Interface9) local96).method8362();
							}
						}
					}
				}
			}
		}
	}
}
