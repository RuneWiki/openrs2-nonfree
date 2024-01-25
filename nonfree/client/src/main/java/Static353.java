import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public static int anInt5829;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BJII)V")
	public static void method5197(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = (int) arg0 >> 14 & 0x1F;
		@Pc(24) int local24 = (int) arg0 >> 20 & 0x3;
		@Pc(31) int local31 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local17 != 10 && local17 != 11 && local17 != 22) {
			Static467.method6578(0, arg2, arg1, 0, 0, local24, true, local17);
			return;
		}
		@Pc(66) Class354 local66 = Static528.aClass243_3.method5556(local31);
		@Pc(81) int local81;
		@Pc(84) int local84;
		if (local24 == 0 || local24 == 2) {
			local81 = local66.anInt9385;
			local84 = local66.anInt9410;
		} else {
			local84 = local66.anInt9385;
			local81 = local66.anInt9410;
		}
		@Pc(95) int local95 = local66.anInt9415;
		if (local24 != 0) {
			local95 = (local95 << local24 & 0xF) + (local95 >> 4 - local24);
		}
		Static467.method6578(local95, arg2, arg1, local81, local84, 0, true, 0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!ip;)V")
	public static void method5199(@OriginalArg(1) Class4_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(11) Class5_Sub20 local11 = (Class5_Sub20) Static342.aClass306_24.method6943((long) arg0.anInt6843);
		if (local11 == null) {
			Static114.method1694((Class4_Sub1_Sub1_Sub2_Sub2) null, (Class354) null, 0, arg0.aByte139, arg0.anIntArray405[0], arg0, arg0.anIntArray404[0]);
		} else {
			local11.method2784();
		}
	}
}
