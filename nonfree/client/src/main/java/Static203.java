import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_37 = new Class240(29, 2);

	@OriginalMember(owner = "client!gka", name = "c", descriptor = "[I")
	public static final int[] anIntArray187 = new int[14];

	@OriginalMember(owner = "client!gka", name = "d", descriptor = "[I")
	public static final int[] anIntArray188 = new int[14];

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIIBIII)V")
	public static void method3048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static166.method2620(arg5, Static229.anInt4089, Static617.anInt6260);
		@Pc(17) int local17 = Static166.method2620(arg1, Static229.anInt4089, Static617.anInt6260);
		@Pc(23) int local23 = Static166.method2620(arg2, Static629.anInt10412, Static300.anInt5091);
		@Pc(29) int local29 = Static166.method2620(arg4, Static629.anInt10412, Static300.anInt5091);
		@Pc(37) int local37 = Static166.method2620(arg3 + arg5, Static229.anInt4089, Static617.anInt6260);
		@Pc(45) int local45 = Static166.method2620(arg1 - arg3, Static229.anInt4089, Static617.anInt6260);
		for (@Pc(47) int local47 = local11; local47 < local37; local47++) {
			Static578.method7640(arg0, local23, local29, Static276.anIntArrayArray32[local47]);
		}
		for (@Pc(68) int local68 = local17; local68 > local45; local68--) {
			Static578.method7640(arg0, local23, local29, Static276.anIntArrayArray32[local68]);
		}
		@Pc(90) int local90 = Static166.method2620(arg2 + arg3, Static629.anInt10412, Static300.anInt5091);
		@Pc(98) int local98 = Static166.method2620(arg4 - arg3, Static629.anInt10412, Static300.anInt5091);
		for (@Pc(100) int local100 = local37; local100 <= local45; local100++) {
			@Pc(106) int[] local106 = Static276.anIntArrayArray32[local100];
			Static578.method7640(arg0, local23, local90, local106);
			Static578.method7640(arg0, local98, local29, local106);
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Z)V")
	public static void method3049() {
		Static317.anInt5304 = 0;
		Static502.anInt7943 = 0;
		Static630.anInt10418++;
		Static185.method2901();
		Static629.method8499();
		Static461.method8783();
		@Pc(21) boolean local21 = false;
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static502.anInt7943; local27++) {
			local33 = Static545.anIntArray466[local27];
			@Pc(40) Class3_Sub52 local40 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local33);
			@Pc(43) Class34_Sub1_Sub1_Sub2_Sub2 local43 = local40.aClass34_Sub1_Sub1_Sub2_Sub2_2;
			if (Static532.aBoolean580 && Static503.method6581(local33)) {
				Static505.method6597();
			}
			if (local43.anInt9667 != Static630.anInt10418) {
				if (local43.aClass261_1.method5767()) {
					Static487.method6426(local43);
				}
				local43.method7886((Class261) null);
				local21 = true;
				local40.method9034();
			}
		}
		if (local21) {
			Static331.anInt5501 = Static105.aClass333_11.method7486();
			Static105.aClass333_11.method7483(Static129.aClass3_Sub52Array3);
		}
		if (Static459.aClass3_Sub4_Sub1_1.anInt9739 != Static147.anInt2709) {
			throw new RuntimeException("gnp1 pos:" + Static459.aClass3_Sub4_Sub1_1.anInt9739 + " psize:" + Static147.anInt2709);
		}
		for (local33 = 0; local33 < Static52.anInt1140; local33++) {
			if (Static105.aClass333_11.method7489((long) Static603.anIntArray537[local33]) == null) {
				throw new RuntimeException("gnp2 pos:" + local33 + " size:" + Static52.anInt1140);
			}
		}
		if (Static331.anInt5501 - Static52.anInt1140 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static331.anInt5501 - Static52.anInt1140));
		}
		for (@Pc(162) int local162 = 0; local162 < Static331.anInt5501; local162++) {
			if (Static129.aClass3_Sub52Array3[local162].aClass34_Sub1_Sub1_Sub2_Sub2_2.anInt9667 != Static630.anInt10418) {
				throw new RuntimeException("gnp4 uk:" + Static129.aClass3_Sub52Array3[local162].aClass34_Sub1_Sub1_Sub2_Sub2_2.anInt9671);
			}
		}
	}
}
