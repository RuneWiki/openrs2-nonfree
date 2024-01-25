import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ija", name = "j", descriptor = "Lclient!iga;")
	public static Class176 aClass176_1;

	@OriginalMember(owner = "client!ija", name = "w", descriptor = "I")
	public static int anInt4230 = 0;

	@OriginalMember(owner = "client!ija", name = "g", descriptor = "Lclient!sm;")
	public static final Class342 aClass342_1 = Static596.method8185();

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static67.method9535(Static617.anInt9501, arg1, Static519.anInt8267);
		@Pc(17) int local17 = Static67.method9535(Static617.anInt9501, arg4, Static519.anInt8267);
		@Pc(23) int local23 = Static67.method9535(Static8.anInt99, arg3, Static14.anInt206);
		@Pc(29) int local29 = Static67.method9535(Static8.anInt99, arg0, Static14.anInt206);
		@Pc(38) int local38 = Static67.method9535(Static617.anInt9501, arg1 + arg2, Static519.anInt8267);
		@Pc(47) int local47 = Static67.method9535(Static617.anInt9501, arg4 - arg2, Static519.anInt8267);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static494.method7075(local23, arg6, local29, Static449.anIntArrayArray48[local49], 18601);
		}
		for (@Pc(67) int local67 = local17; local67 > local47; local67--) {
			Static494.method7075(local23, arg6, local29, Static449.anIntArrayArray48[local67], 18601);
		}
		@Pc(99) int local99 = Static67.method9535(Static8.anInt99, arg2 + arg3, Static14.anInt206);
		@Pc(108) int local108 = Static67.method9535(Static8.anInt99, arg0 - arg2, Static14.anInt206);
		for (@Pc(110) int local110 = local38; local110 <= local47; local110++) {
			@Pc(120) int[] local120 = Static449.anIntArrayArray48[local110];
			Static494.method7075(local23, arg6, local99, local120, 18601);
			Static494.method7075(local99, arg5, local108, local120, 18601);
			Static494.method7075(local108, arg6, local29, local120, 18601);
		}
	}

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "(B)[Lclient!gja;")
	public static Class139[] method3834() {
		return new Class139[] { Static541.aClass139_4, Static426.aClass139_2, Static391.aClass139_1 };
	}

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "(Z)V")
	public static void method3837() {
		Static433.aClass231_36.method5326();
		Static101.aClass100_12.method2137();
		Static91.aClass7_1.method203();
		Static148.aClass153_3.method3343();
		Static192.aClass41_1.method746();
		Static543.aClass37_2.method602();
		Static89.aClass274_1.method6622();
		Static119.aClass209_1.method4571();
		Static153.aClass79_3.method1604();
		Static13.aClass119_1.method2607();
		Static80.aClass90_1.method1860();
		Static202.aClass31_1.method560();
		Static378.aClass314_2.method7453();
		Static591.aClass351_6.method8336();
		Static117.aClass196_2.method4188();
		Static412.aClass344_1.method8189();
		Static97.aClass328_2.method7808();
		Static120.aClass232_1.method5475();
		Static271.aClass25_1.method438();
		Static298.aClass266_1.method6366();
		Static506.aClass327_2.method7802();
		Static481.aClass280_1.method6726();
		Static159.aClass346_1.method8212();
		Static334.method4632();
		Static387.method8350();
		Static309.method4311();
		Static591.method8378();
		Static6.method5189();
		Static126.aClass85_16.method1741();
		Static444.aClass85_47.method1741();
		Static408.aClass85_44.method1741();
		Static288.aClass85_33.method1741();
		Static484.aClass85_51.method1741();
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(Z[IILclient!sj;I)V")
	public static void method3838(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub2_Sub1_Sub2 arg3, @OriginalArg(4) int arg4) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg3.anIntArray179 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg3.anIntArray179.length; local8++) {
				if (arg3.anIntArray179[local8] != arg1[local8]) {
					local6 = false;
					break;
				}
			}
			@Pc(35) Class53 local35 = arg3.aClass53_7;
			if (local6 && local35.method4094()) {
				@Pc(50) Class307 local50 = arg3.aClass53_7.method4074();
				@Pc(53) int local53 = local50.anInt8120;
				if (local53 == 1) {
					local35.method4086(arg2);
				}
				if (local53 == 2) {
					local35.method4081();
				}
			}
		}
		local6 = true;
		if (arg4 != 29498) {
			method3837();
		}
		for (local8 = 0; local8 < arg1.length; local8++) {
			if (arg1[local8] != -1) {
				local6 = false;
			}
			if (arg3.anIntArray179 == null || arg3.anIntArray179[local8] == -1 || Static89.aClass274_1.method6626(arg1[local8]).anInt8124 >= Static89.aClass274_1.method6626(arg3.anIntArray179[local8]).anInt8124) {
				arg3.anIntArray179 = arg1;
				arg3.aClass53_7.method4090(arg2);
				if (arg0) {
					arg3.anInt2370 = arg3.anInt2371;
				}
			}
		}
		if (!local6) {
			return;
		}
		arg3.anIntArray179 = arg1;
		arg3.aClass53_7.method4090(arg2);
		if (arg0) {
			arg3.anInt2370 = arg3.anInt2371;
			return;
		}
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "([BII)[B")
	public static byte[] method3839(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static728.method274(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
