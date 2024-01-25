import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aha", name = "r", descriptor = "[I")
	public static final int[] anIntArray11 = new int[13];

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIII)Lclient!ida;")
	public static Class3_Sub26 method197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class3_Sub26 local5 = null;
		if (arg1 == 0) {
			local5 = Static640.method8636(Static323.aClass344_78, Static403.aClass294_3);
		}
		if (arg1 == 1) {
			local5 = Static640.method8636(Static183.aClass344_43, Static403.aClass294_3);
		}
		local5.aClass3_Sub15_Sub1_3.method8423(arg0 + Static124.anInt3150);
		local5.aClass3_Sub15_Sub1_3.method8431(arg2 + Static446.anInt8090);
		local5.aClass3_Sub15_Sub1_3.method8439(Static326.aClass238_1.method6948(82) ? 1 : 0);
		Static160.aBoolean329 = false;
		Static29.anInt565 = arg0;
		Static326.anInt6537 = arg2;
		Static159.method3385();
		return local5;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIB)Lclient!kba;")
	public static Class2_Sub3_Sub1_Sub2 method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class106 local11 = Static170.aClass106ArrayArrayArray1[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class2_Sub3_Sub1_Sub2 local17 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class243 local27 = local11.aClass243_1; local27 != null; local27 = local27.aClass243_3) {
			@Pc(31) Class2_Sub3_Sub1 local31 = local27.aClass2_Sub3_Sub1_1;
			if (local31 instanceof Class2_Sub3_Sub1_Sub2) {
				@Pc(37) Class2_Sub3_Sub1_Sub2 local37 = (Class2_Sub3_Sub1_Sub2) local31;
				@Pc(47) int local47 = (local37.method5308() - 1) * 256 + 252;
				@Pc(55) int local55 = local37.anInt10428 - local47 >> 9;
				@Pc(62) int local62 = local37.anInt10424 - local47 >> 9;
				@Pc(70) int local70 = local37.anInt10428 + local47 >> 9;
				@Pc(77) int local77 = local37.anInt10424 + local47 >> 9;
				if (local55 <= arg2 && arg0 >= local62 && local70 >= arg2 && arg0 <= local77) {
					@Pc(102) int local102 = (local70 + 1 - arg2) * (local77 + (1 - arg0));
					if (local102 > local24) {
						local17 = local37;
						local24 = local102;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)V")
	public static void method200(@OriginalArg(0) int arg0) {
		if (Static582.anInt9733 == arg0) {
			return;
		}
		Static394.anInt7540 = Static462.anInt8391 = Static413.anIntArray477[arg0];
		Static545.method7730();
		Static188.anIntArrayArray40 = new int[Static394.anInt7540][Static462.anInt8391];
		Static27.anIntArrayArrayArray1 = new int[4][Static394.anInt7540 >> 3][Static462.anInt8391 >> 3];
		Static396.anIntArrayArray74 = new int[Static394.anInt7540][Static462.anInt8391];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static334.aClass291Array20[local40] = Static441.method6696(Static394.anInt7540, Static462.anInt8391);
		}
		Static192.aByteArrayArrayArray3 = new byte[4][Static394.anInt7540][Static462.anInt8391];
		Static58.method1278(Static462.anInt8391, Static394.anInt7540);
		Static390.method6149(Static47.aClass33_3, Static394.anInt7540 >> 3, Static462.anInt8391 >> 3);
		Static582.anInt9733 = arg0;
	}
}
