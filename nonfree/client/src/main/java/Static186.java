import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hl", name = "D", descriptor = "Lclient!kr;")
	public static Class171 aClass171_71;

	@OriginalMember(owner = "client!hl", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[128][128];

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)Lclient!qba;")
	public static Class72_Sub7 method2914(@OriginalArg(1) int arg0) {
		@Pc(7) Class299[] local7 = Class300.aClass299Array1;
		synchronized (Class300.aClass299Array1) {
			@Pc(23) Class72_Sub7 local23;
			if (Class300.aClass299Array1.length <= arg0 || Class300.aClass299Array1[arg0].method7035()) {
				local23 = new Class72_Sub7();
				local23.aClass72_Sub2Array1 = new Class72_Sub2[arg0];
				for (@Pc(29) int local29 = 0; local29 < arg0; local29++) {
					local23.aClass72_Sub2Array1[local29] = new Class72_Sub2();
				}
			} else {
				local23 = (Class72_Sub7) Class300.aClass299Array1[arg0].method7029();
				local23.method6719();
				@Pc(62) int local62 = Static287.anIntArray545[arg0]--;
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method2917(@OriginalArg(1) Class122 arg0) {
		if (Static467.aClass37_86.method965() == 0) {
			return;
		}
		@Pc(24) Class1_Sub23 local24;
		if (Static374.anInt6861 == 0) {
			for (local24 = (Class1_Sub23) Static467.aClass37_86.method977(); local24 != null; local24 = (Class1_Sub23) Static467.aClass37_86.method971()) {
				Static342.aClass250_2.method5971(arg0, false, local24.anInt3026, local24.anInt3028, local24.anInt3023, local24.aBoolean206 ? Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1 : null, local24.anInt3027, Static435.aClass67_11, arg0, false, local24.anInt3022);
				local24.method7525();
			}
			Static299.method4748();
			return;
		}
		if (Static291.aClass122_6 == null) {
			@Pc(71) Canvas local71 = new Canvas();
			local71.setSize(36, 32);
			Static291.aClass122_6 = Static379.method7208(0, 0, local71, Static313.aClass171_93, Static227.anInterface8_11);
			Static379.aClass67_13 = Static291.aClass122_6.method7270(Static372.method5725(Static11.anInt295, Static542.aClass171_152), Static552.method3538(Static543.aClass171_154, Static11.anInt295));
		}
		for (local24 = (Class1_Sub23) Static467.aClass37_86.method977(); local24 != null; local24 = (Class1_Sub23) Static467.aClass37_86.method971()) {
			Static342.aClass250_2.method5971(arg0, false, local24.anInt3026, local24.anInt3028, local24.anInt3023, local24.aBoolean206 ? Static63.aClass49_Sub2_Sub2_Sub1_1.aClass206_1 : null, local24.anInt3027, Static379.aClass67_13, Static291.aClass122_6, false, local24.anInt3022);
			local24.method7525();
		}
	}
}
