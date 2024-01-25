import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!og", name = "P", descriptor = "[Lclient!vc;")
	public static Class370[] aClass370Array1;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "Lclient!pt;")
	public static Class3_Sub9_Sub5 aClass3_Sub9_Sub5_3;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_142 = new Class126(94, 6);

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)Z")
	public static boolean method6042() {
		if (Static133.aBoolean207) {
			try {
				Static685.method3974(Static287.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIII)V")
	public static void method6043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static574.anInt8364 / (float) Static574.anInt8360;
		@Pc(16) int local16 = arg3;
		@Pc(18) int local18 = arg0;
		if (local9 < 1.0F) {
			local18 = (int) ((float) arg3 * local9);
		} else {
			local16 = (int) ((float) arg0 / local9);
		}
		@Pc(45) int local45 = arg2 - (arg0 - local18) / 2;
		@Pc(54) int local54 = arg1 - (arg3 - local16) / 2;
		Static296.anInt8194 = -1;
		Static577.anInt9150 = -1;
		Static462.anInt7931 = Static574.anInt8364 - Static574.anInt8364 * local45 / local18;
		Static176.anInt3320 = local54 * Static574.anInt8360 / local16;
		Static109.method2090();
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
	public static void method6044() {
		for (@Pc(11) int local11 = 0; local11 < Static308.anInt5687; local11++) {
			@Pc(17) int local17 = Static390.anIntArray424[local11];
			@Pc(24) Class3_Sub11 local24 = (Class3_Sub11) Static500.aClass62_40.method1682((long) local17);
			if (local24 != null) {
				@Pc(29) Class23_Sub2_Sub1_Sub2_Sub2 local29 = local24.aClass23_Sub2_Sub1_Sub2_Sub2_1;
				Static249.method3942(local29.aClass5_1.anInt66, local29);
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V")
	public static void method6045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg1 - arg4;
		@Pc(15) int local15 = arg2 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static81.method1706(arg4, arg3, arg1, arg0);
			}
		} else if (local10 == 0) {
			Static567.method7679(arg0, arg3, arg4, arg2);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(62) boolean local62 = local15 < local10;
			@Pc(70) int local70;
			if (local62) {
				@Pc(66) int local66 = arg3;
				arg3 = arg4;
				local70 = arg2;
				arg4 = local66;
				arg2 = arg1;
				arg1 = local70;
			}
			@Pc(95) int local95;
			if (arg3 > arg2) {
				local70 = arg3;
				local95 = arg4;
				arg3 = arg2;
				arg4 = arg1;
				arg2 = local70;
				arg1 = local95;
			}
			local70 = arg4;
			local95 = arg2 - arg3;
			@Pc(114) int local114 = arg1 - arg4;
			@Pc(119) int local119 = -(local95 >> 1);
			@Pc(126) int local126 = arg1 > arg4 ? 1 : -1;
			if (local114 < 0) {
				local114 = -local114;
			}
			@Pc(138) int local138;
			if (local62) {
				for (local138 = arg3; local138 <= arg2; local138++) {
					local119 += local114;
					Static299.anIntArrayArray58[local138][local70] = arg0;
					if (local119 > 0) {
						local119 -= local95;
						local70 += local126;
					}
				}
			} else {
				for (local138 = arg3; local138 <= arg2; local138++) {
					local119 += local114;
					Static299.anIntArrayArray58[local70][local138] = arg0;
					if (local119 > 0) {
						local119 -= local95;
						local70 += local126;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)I")
	public static int method6048() {
		@Pc(7) Class16 local7 = Static582.aClass16_12;
		@Pc(9) boolean local9 = false;
		if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local9 = true;
			local7 = Static13.method132((Class143) null, (Interface5) null, 0, 0, local21);
		}
		@Pc(38) long local38 = Static131.method2268();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local7.method8171();
		}
		@Pc(75) int local75 = (int) (Static131.method2268() - local38);
		local7.method8113(100, 0, 100, -16777216, 0);
		if (local9) {
			local7.method8199();
		}
		return local75;
	}
}
