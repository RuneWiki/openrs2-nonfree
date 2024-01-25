import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!lba;")
	public static Class188 aClass188_1;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "Lclient!kn;")
	public static final Class181 aClass181_9 = new Class181(10, 8);

	@OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
	public static final int[] anIntArray394 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public static void method5604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg1, 6);
		local8.method3088();
		local8.anInt3368 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	public static void method5605() {
		Static140.anInt3408 = 0;
		Static33.anInt5425 = 0;
		Static431.anInt8060++;
		Static389.method6419();
		Static191.method3916();
		Static429.method6867();
		@Pc(21) boolean local21 = false;
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static140.anInt3408; local23++) {
			local29 = Static644.anIntArray716[local23];
			@Pc(36) Class2_Sub33 local36 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local29);
			@Pc(39) Class3_Sub1_Sub3_Sub3_Sub1 local39 = local36.aClass3_Sub1_Sub3_Sub3_Sub1_2;
			if (Static65.aBoolean754 && Static35.method826(local29)) {
				Static101.method2660();
			}
			if (local39.anInt6095 != Static431.anInt8060) {
				if (local39.aClass27_1.method726()) {
					Static189.method9237(local39);
				}
				local39.method3406(null);
				local36.method9253();
				local21 = true;
			}
		}
		if (local21) {
			Static474.anInt8881 = Static600.aClass99_79.method3050();
			Static600.aClass99_79.method3053(Static62.aClass2_Sub33Array1);
		}
		if (Static541.anInt9723 != Static627.aClass2_Sub11_Sub2_6.anInt10066) {
			throw new RuntimeException("gnp1 pos:" + Static627.aClass2_Sub11_Sub2_6.anInt10066 + " psize:" + Static541.anInt9723);
		}
		for (local29 = 0; local29 < Static398.anInt7589; local29++) {
			if (Static600.aClass99_79.method3056((long) Static301.anIntArray367[local29]) == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static398.anInt7589);
			}
		}
		if (Static474.anInt8881 - Static398.anInt7589 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static474.anInt8881 - Static398.anInt7589));
		}
		for (@Pc(165) int local165 = 0; local165 < Static474.anInt8881; local165++) {
			if (Static62.aClass2_Sub33Array1[local165].aClass3_Sub1_Sub3_Sub3_Sub1_2.anInt6095 != Static431.anInt8060) {
				throw new RuntimeException("gnp4 uk:" + Static62.aClass2_Sub33Array1[local165].aClass3_Sub1_Sub3_Sub3_Sub1_2.anInt6083);
			}
		}
	}
}
