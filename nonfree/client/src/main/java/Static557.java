import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!lja;")
	public static Class218 aClass218_3;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "Lclient!kda;")
	public static Class197 aClass197_1;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
	public static int anInt9396;

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "Lclient!dv;")
	public static final Class96 aClass96_22 = new Class96(15, 0, 1, 0);

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_104 = new Class387(41, 2);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZILjava/lang/String;ZLjava/lang/String;)V")
	public static void method8057(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3) {
		@Pc(11) Class5_Sub50 local11 = Static552.method7994();
		local11.aClass5_Sub23_Sub2_2.method8502(Static157.aClass45_6.anInt829);
		local11.aClass5_Sub23_Sub2_2.method8480(0);
		@Pc(26) int local26 = local11.aClass5_Sub23_Sub2_2.anInt9869;
		local11.aClass5_Sub23_Sub2_2.method8480(652);
		@Pc(35) int[] local35 = Static425.method6321(local11);
		@Pc(39) int local39 = local11.aClass5_Sub23_Sub2_2.anInt9869;
		local11.aClass5_Sub23_Sub2_2.method8538(arg2);
		local11.aClass5_Sub23_Sub2_2.method8480(Static456.anInt7813);
		local11.aClass5_Sub23_Sub2_2.method8538(arg3);
		local11.aClass5_Sub23_Sub2_2.method8517(Static294.aLong158);
		local11.aClass5_Sub23_Sub2_2.method8502(Static323.anInt5795);
		local11.aClass5_Sub23_Sub2_2.method8502(Static256.aClass333_3.anInt9710);
		Static335.method5112(local11.aClass5_Sub23_Sub2_2);
		@Pc(76) String local76 = Static461.aString125;
		local11.aClass5_Sub23_Sub2_2.method8502(local76 == null ? 0 : 1);
		if (local76 != null) {
			local11.aClass5_Sub23_Sub2_2.method8538(local76);
		}
		local11.aClass5_Sub23_Sub2_2.method8502(arg1);
		local11.aClass5_Sub23_Sub2_2.method8502(arg0 ? 1 : 0);
		local11.aClass5_Sub23_Sub2_2.anInt9869 += 7;
		local11.aClass5_Sub23_Sub2_2.method8534(local39, local11.aClass5_Sub23_Sub2_2.anInt9869, local35);
		local11.aClass5_Sub23_Sub2_2.method8533(local11.aClass5_Sub23_Sub2_2.anInt9869 - local26);
		Static494.method7120(local11);
		Static222.anInt3623 = 1;
		Static67.anInt1085 = -3;
		Static467.anInt7942 = 0;
		Static436.anInt7486 = 0;
		if (arg1 < 13) {
			Static581.aBoolean744 = true;
			Static112.method1624();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZIIIII)V")
	public static void method8059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class28[] local3 = Static598.aClass28Array1;
		for (@Pc(12) int local12 = 0; local12 < local3.length; local12++) {
			@Pc(18) Class28 local18 = local3[local12];
			if (local18 != null && local18.anInt500 == 2) {
				Static148.method2088(arg2 >> 1, arg0 >> 1, local18.anInt497 * 2, local18.anInt499, local18.anInt498, local18.anInt503);
				if (Static13.anIntArray19[0] > -1 && Static44.anInt740 % 20 < 10) {
					@Pc(71) Class134 local71 = Static56.aClass134Array10[local18.anInt505];
					@Pc(79) int local79 = arg1 + Static13.anIntArray19[0] - 12;
					@Pc(88) int local88 = arg3 + Static13.anIntArray19[1] - 28;
					local71.method9235(local79, local88);
					Static82.method9318(local88 + local71.method9232(), local88, local79 + local71.method9231(), local79);
				}
			}
		}
	}
}
