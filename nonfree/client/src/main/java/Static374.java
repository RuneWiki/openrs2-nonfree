import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "Lclient!l;")
	public static final Class213 aClass213_29 = new Class213();

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!nh;Z)V")
	public static void method5793(@OriginalArg(0) Class4_Sub3_Sub3_Sub3 arg0) {
		@Pc(8) int local8 = arg0.anInt3287 - Static530.anInt9105;
		@Pc(20) int local20 = arg0.anInt3292 * 512 + arg0.method2870(0) * 256;
		@Pc(32) int local32 = arg0.anInt3294 * 512 + arg0.method2870(0) * 256;
		arg0.anInt3299 = 0;
		arg0.anInt11178 += (local32 - arg0.anInt11178) / local8;
		arg0.anInt11184 += (local20 - arg0.anInt11184) / local8;
		if (arg0.anInt3290 == 0) {
			arg0.method2881(8192);
		}
		if (arg0.anInt3290 == 1) {
			arg0.method2881(12288);
		}
		if (arg0.anInt3290 == 2) {
			arg0.method2881(0);
		}
		if (arg0.anInt3290 == 3) {
			arg0.method2881(4096);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
	public static void method5795() {
		for (@Pc(10) Class14_Sub2_Sub17 local10 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6494(); local10 != null; local10 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6491()) {
			if (local10.anInt9298 > 1) {
				local10.anInt9298 = 0;
				Static103.aClass317_9.method7875(((Class14_Sub2_Sub20) local10.aClass269_142.aClass14_Sub2_42.aClass14_Sub2_67).aLong280, local10);
				local10.aClass269_142.method6492();
			}
		}
		Static164.anInt2537 = 0;
		Static638.anInt10454 = 0;
		Static111.aClass32_7.method588();
		Static468.aClass125_32.method2628();
		Static440.aClass269_60.method6492();
		if (-25765 == -25765) {
			Static528.method7837(Static270.aClass14_Sub2_Sub20_1);
		}
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)V")
	public static void method5796() {
		@Pc(7) int local7 = Static258.anInt4846;
		@Pc(9) int[] local9 = Static43.anIntArray35;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class4_Sub3_Sub3_Sub3_Sub2 local26 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local9[local18]];
			if (local26 != null) {
				Static597.method8453(local26.method2870(0), local26);
			}
		}
	}
}
