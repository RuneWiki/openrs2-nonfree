import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Lclient!wv;")
	public static final Class269 aClass269_6 = new Class269("WTQA", 2);

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_64 = new Class256("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!mk;I)V")
	public static void method2941(@OriginalArg(0) Class2_Sub26 arg0) {
		if (!Static237.aBoolean384) {
			arg0.method6072();
			Static168.anInt3255--;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!sq;Z)V")
	public static void method2943(@OriginalArg(1) Class4_Sub2_Sub2_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static168.anInt3255 >= 400) {
			return;
		}
		@Pc(14) Class215 local14 = arg0.aClass215_1;
		if (local14.anIntArray400 != null) {
			local14 = local14.method4795(Static215.aClass225_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean530) {
			return;
		}
		@Pc(40) String local40 = local14.aString51;
		if (local14.anInt6009 != 0) {
			@Pc(59) String local59 = Static107.aClass209_1 == Static389.aClass209_2 ? Static337.aClass256_119.method5720(Static272.anInt7537) : Static156.aClass256_54.method5720(Static272.anInt7537);
			local40 = local40 + Static206.method3174(local14.anInt6009, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5730) + " (" + local59 + local14.anInt6009 + ")";
		}
		if (!Static428.aBoolean637) {
			if (!arg1) {
				@Pc(89) String[] local89 = local14.aStringArray30;
				if (Static226.aBoolean363) {
					local89 = Static205.method3172(local89);
				}
				@Pc(99) int local99;
				if (local89 != null) {
					for (local99 = 4; local99 >= 0; local99--) {
						if (local89[local99] != null && (Static107.aClass209_1 != Static407.aClass209_3 || !local89[local99].equalsIgnoreCase(Static389.aClass256_140.method5720(Static272.anInt7537)))) {
							@Pc(119) byte local119 = 0;
							if (local99 == 0) {
								local119 = 21;
							}
							@Pc(128) int local128 = Static340.anInt5988;
							if (local99 == 1) {
								local119 = 44;
							}
							if (local99 == 2) {
								local119 = 13;
							}
							if (local99 == 3) {
								local119 = 5;
							}
							if (local99 == 4) {
								local119 = 48;
							}
							if (local14.anInt6008 == local99) {
								local128 = local14.anInt6030;
							}
							if (local99 == local14.anInt6012) {
								local128 = local14.anInt6029;
							}
							Static333.method4738(-1, "<col=ffff00>" + local40, true, 0, local119, local89[local99], local128, (long) arg0.anInt6456, 0, false);
						}
					}
				}
				if (Static107.aClass209_1 == Static407.aClass209_3 && local89 != null) {
					for (local99 = 4; local99 >= 0; local99--) {
						if (local89[local99] != null && local89[local99].equalsIgnoreCase(Static389.aClass256_140.method5720(Static272.anInt7537))) {
							@Pc(225) short local225 = 0;
							if (local14.anInt6009 > Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5730) {
								local225 = 2000;
							}
							@Pc(238) short local238 = 0;
							if (local99 == 0) {
								local238 = 21;
							}
							if (local99 == 1) {
								local238 = 44;
							}
							if (local99 == 2) {
								local238 = 13;
							}
							if (local99 == 3) {
								local238 = 5;
							}
							if (local99 == 4) {
								local238 = 48;
							}
							if (local238 != 0) {
								local238 += local225;
							}
							Static333.method4738(-1, "<col=ffff00>" + local40, true, 0, local238, local89[local99], local14.anInt6014, (long) arg0.anInt6456, 0, false);
						}
					}
				}
			}
			Static333.method4738(-1, "<col=ffff00>" + local40, true, 0, 1004, Static313.aClass256_113.method5720(Static272.anInt7537), Static408.anInt7081, (long) arg0.anInt6456, 0, arg1);
		} else if (!arg1) {
			@Pc(346) Class47 local346 = Static21.anInt432 == -1 ? null : Static150.aClass43_1.method1210(Static21.anInt432);
			if ((Static248.anInt4731 & 0x2) != 0) {
				if (local346 == null || local14.method4804(local346.anInt1781, Static21.anInt432) != local346.anInt1781) {
					Static333.method4738(-1, Static179.aString56 + " -> <col=ffff00>" + local40, true, 0, 4, Static174.aString23, Static445.anInt7767, (long) arg0.anInt6456, 0, false);
				}
				return;
			}
		}
	}
}
