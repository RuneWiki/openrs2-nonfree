import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fi", name = "D", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_50 = new Class322(94, 0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method3198(@OriginalArg(0) Class75 arg0) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		if (Static93.aBoolean113) {
			local12 = Static24.method290();
			local14 = Static488.method7227();
		}
		Static632.method8585(local14 + Static243.anInt4678, Static49.anInt592, arg0, local12 + Static25.anInt354, Static406.anInt7073);
		Static205.aClass67_6.method8294(local14 + Static243.anInt4678 + 14, Static50.aClass43_24.method596(Static601.anInt9518), -1, Static25.anInt354 + local12 + 3, -10660793);
		@Pc(63) int local63 = local12 + Static331.aClass42_8.method6019();
		@Pc(69) int local69 = local14 + Static331.aClass42_8.method6014();
		@Pc(73) int local73;
		@Pc(96) int local96;
		if (Static84.aBoolean110) {
			local73 = 0;
			for (@Pc(133) Class6_Sub2_Sub2 local133 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2071(); local133 != null; local133 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2078()) {
				local96 = local73 * 16 + local14 + Static243.anInt4678 + 31;
				local73++;
				if (local133.anInt618 == 1) {
					Static77.method1038(local96, local69, Static243.anInt4678 + local14, Static49.anInt592, local63, (Class6_Sub2_Sub11) local133.aClass82_1.aClass6_Sub2_17.aClass6_Sub2_65, -1, -256, Static406.anInt7073, arg0, local12 + Static25.anInt354);
				} else {
					Static140.method2720(local63, Static49.anInt592, local96, local133, local69, Static25.anInt354 + local12, -1, Static406.anInt7073, arg0, Static243.anInt4678 + local14, -256);
				}
			}
			if (Static310.aClass6_Sub2_Sub2_1 != null) {
				Static632.method8585(Static145.anInt3045, Static587.anInt9342, arg0, Static421.anInt7230, Static69.anInt919);
				Static205.aClass67_6.method8294(Static145.anInt3045 + 14, Static310.aClass6_Sub2_Sub2_1.aString10, -1, Static421.anInt7230 + 3, -10660793);
				local73 = 0;
				for (@Pc(245) Class6_Sub2_Sub11 local245 = (Class6_Sub2_Sub11) Static310.aClass6_Sub2_Sub2_1.aClass82_1.method2071(); local245 != null; local245 = (Class6_Sub2_Sub11) Static310.aClass6_Sub2_Sub2_1.aClass82_1.method2078()) {
					@Pc(257) int local257 = Static145.anInt3045 + local73 * 16 + 31;
					Static77.method1038(local257, local69, Static145.anInt3045, Static587.anInt9342, local63, local245, -1, -256, Static69.anInt919, arg0, Static421.anInt7230);
					local73++;
				}
				Static315.method4981(Static69.anInt919, Static145.anInt3045, Static587.anInt9342, Static421.anInt7230);
			}
		} else {
			local73 = 0;
			for (@Pc(78) Class6_Sub2_Sub11 local78 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8124(); local78 != null; local78 = (Class6_Sub2_Sub11) Static116.aClass340_17.method8134()) {
				local96 = Static243.anInt4678 + local14 + (-local73 + Static539.anInt8776 + -1) * 16 + 31;
				local73++;
				Static77.method1038(local96, local69, Static243.anInt4678 + local14, Static49.anInt592, local63, local78, -1, -256, Static406.anInt7073, arg0, Static25.anInt354 + local12);
			}
		}
		Static315.method4981(Static406.anInt7073, local14 + Static243.anInt4678, Static49.anInt592, local12 + Static25.anInt354);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!aa;Lclient!vo;Lclient!tb;IIIII)V")
	public static void method3199(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class381 arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static526.anInt8626 == 4) {
			local18 = (int) Static409.aFloat135 & 0x3FFF;
		} else {
			local18 = (int) Static409.aFloat135 + Static51.anInt622 & 0x3FFF;
		}
		@Pc(44) int local44 = Math.max(arg1.anInt10159 / 2, arg1.anInt10131 / 2) + 10;
		@Pc(52) int local52 = arg6 * arg6 + arg4 * arg4;
		if (local52 > local44 * local44) {
			return;
		}
		@Pc(67) int local67 = Class6_Sub2_Sub12.anIntArray293[local18];
		@Pc(71) int local71 = Class6_Sub2_Sub12.anIntArray292[local18];
		if (Static526.anInt8626 != 4) {
			local71 = local71 * 256 / (Static41.anInt542 + 256);
			local67 = local67 * 256 / (Static41.anInt542 + 256);
		}
		@Pc(102) int local102 = local71 * arg4 + arg6 * local67 >> 14;
		@Pc(113) int local113 = local71 * arg6 - arg4 * local67 >> 14;
		arg2.method8979(local102 + arg1.anInt10159 / 2 + arg5 - arg2.method8991() / 2, arg3 + arg1.anInt10131 / 2 + -local113 - arg2.method8987() / 2, arg0, arg5, arg3);
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
	public static void method3200() {
		@Pc(10) Class260 local10 = Static629.method8573();
		@Pc(16) Class6_Sub13 local16 = Static30.method353(Static613.aClass241_114, local10.aClass270_2);
		local16.aClass6_Sub15_Sub1_1.method3016(0);
		local10.method6404(local16);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method3202(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static287.anInt5151 >= 100) {
			Static298.method4814(Static50.aClass43_38.method596(Static601.anInt9518));
			return;
		}
		@Pc(32) String local32 = Static273.method4625(arg1);
		if (local32 == null) {
			return;
		}
		@Pc(82) String local82;
		for (@Pc(38) int local38 = 0; local38 < Static287.anInt5151; local38++) {
			@Pc(48) String local48 = Static273.method4625(Static73.aStringArray11[local38]);
			if (local48 != null && local48.equals(local32)) {
				Static298.method4814(arg1 + Static50.aClass43_39.method596(Static601.anInt9518));
				return;
			}
			if (Static433.aStringArray31[local38] != null) {
				local82 = Static273.method4625(Static433.aStringArray31[local38]);
				if (local82 != null && local82.equals(local32)) {
					Static298.method4814(arg1 + Static50.aClass43_39.method596(Static601.anInt9518));
					return;
				}
			}
		}
		for (@Pc(120) int local120 = 0; local120 < Static265.anInt5023; local120++) {
			local82 = Static273.method4625(Static35.aStringArray5[local120]);
			if (local82 != null && local82.equals(local32)) {
				Static298.method4814(Static50.aClass43_44.method596(Static601.anInt9518) + arg1 + Static50.aClass43_45.method596(Static601.anInt9518));
				return;
			}
			if (Static665.aStringArray45[local120] != null) {
				@Pc(171) String local171 = Static273.method4625(Static665.aStringArray45[local120]);
				if (local171 != null && local171.equals(local32)) {
					Static298.method4814(Static50.aClass43_44.method596(Static601.anInt9518) + arg1 + Static50.aClass43_45.method596(Static601.anInt9518));
					return;
				}
			}
		}
		if (Static273.method4625(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString23).equals(local32)) {
			Static298.method4814(Static50.aClass43_41.method596(Static601.anInt9518));
			return;
		}
		@Pc(231) Class260 local231 = Static629.method8573();
		@Pc(237) Class6_Sub13 local237 = Static30.method353(Static111.aClass241_31, local231.aClass270_2);
		local237.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(arg1) + 1);
		local237.aClass6_Sub15_Sub1_1.method2991(arg1);
		local237.aClass6_Sub15_Sub1_1.method3016(arg0 ? 1 : 0);
		local231.method6404(local237);
	}
}
