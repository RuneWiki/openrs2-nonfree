import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "J")
	public static long aLong163;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
	public static int anInt6137;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_108 = new Class268(48, -1);

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[100];

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
	public static int anInt6136 = -1;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!jo;ZIIILclient!vd;I)V")
	public static void method5341(@OriginalArg(0) Class6_Sub3_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class353 arg2, @OriginalArg(6) int arg3) {
		Static61.method1084(arg3, arg2, arg1);
		Static498.aClass6_Sub3_Sub4_3 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)Z")
	public static boolean method5342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static262.method4656(arg0, arg1) || Static494.method7392(arg1, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ds;)V")
	public static void method5343(@OriginalArg(0) Class68 arg0) {
		if (Static523.anInt9117 >= 65535) {
			return;
		}
		@Pc(6) Class6_Sub1 local6 = arg0.aClass6_Sub1_1;
		Static105.aClass68Array1[Static523.anInt9117] = arg0;
		Static612.aBooleanArray48[Static523.anInt9117] = false;
		Static523.anInt9117++;
		@Pc(21) int local21 = arg0.anInt2166;
		if (arg0.aBoolean162) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2166;
		if (arg0.aBoolean161) {
			local29 = Static535.anInt9275 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method8260() + Static557.anInt9470 - local6.method8268() >> Static643.anInt10682;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method8260() + local6.method8268() - Static557.anInt9470 >> Static643.anInt10682;
			if (local73 >= Static608.anInt10072) {
				local73 = Static608.anInt10072 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray49[local41++];
				@Pc(105) int local105 = (local6.method8264() + Static557.anInt9470 - local6.method8268() >> Static643.anInt10682) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static544.anInt9353) {
					local113 = Static544.anInt9353 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static85.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static85.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static523.anInt9117;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static85.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static523.anInt9117 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static85.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static523.anInt9117 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static85.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static523.anInt9117 << 48;
					}
				}
			}
		}
	}
}
