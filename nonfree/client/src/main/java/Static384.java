import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
	public static int anInt7269;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!ha;IIII)V")
	public static void method6478(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.KA(arg3, arg2, arg3 + arg4, arg2 - -arg0);
		arg1.method8061(arg2, arg0, -16777216, arg3, arg4);
		if (Static95.anInt1689 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static331.anInt10594 / (float) Static331.anInt10587;
		@Pc(36) int local36 = arg4;
		@Pc(38) int local38 = arg0;
		if (local34 < 1.0F) {
			local38 = (int) (local34 * (float) arg4);
		} else {
			local36 = (int) ((float) arg0 / local34);
		}
		@Pc(65) int local65 = arg2 + (arg0 - local38) / 2;
		@Pc(74) int local74 = arg3 + (arg4 - local36) / 2;
		if (Static328.aClass71_12 == null || Static328.aClass71_12.method7691() != arg4 || Static328.aClass71_12.method7707() != arg0) {
			Static331.method9067(Static331.anInt10589, Static331.anInt10590 + Static331.anInt10594, Static331.anInt10587 + Static331.anInt10589, Static331.anInt10590, local74, local65, local74 + local36, local65 - -local38);
			Static331.method9069(arg1);
			Static328.aClass71_12 = arg1.method8077(local74, local65, local36, local38, false);
		}
		Static328.aClass71_12.method7703(local74, local65);
		@Pc(123) int local123 = Static203.anInt4264 * local36 / Static331.anInt10587;
		@Pc(129) int local129 = Static322.anInt5896 * local38 / Static331.anInt10594;
		@Pc(137) int local137 = local36 * Static251.anInt4886 / Static331.anInt10587 + local74;
		@Pc(151) int local151 = local65 + local38 - local129 - local38 * Static261.anInt4995 / Static331.anInt10594;
		@Pc(153) int local153 = -1996554240;
		if (Static534.aClass229_16 == Static551.aClass229_15) {
			local153 = -1996488705;
		}
		arg1.aa(local137, local151, local123, local129, local153, 1);
		arg1.method8129(local137, local151, local123, local129, local153, 0);
		if (Static240.anInt4759 <= 0) {
			return;
		}
		@Pc(186) int local186;
		if (Static542.anInt9479 <= 50) {
			local186 = Static542.anInt9479 * 5;
		} else {
			local186 = (100 - Static542.anInt9479) * 5;
		}
		for (@Pc(200) Class2_Sub33 local200 = (Class2_Sub33) Static331.aClass271_65.method7177(); local200 != null; local200 = (Class2_Sub33) Static331.aClass271_65.method7175()) {
			@Pc(208) Class218 local208 = Static331.aClass5_4.method94(local200.anInt5215);
			if (Static385.method6487(local208)) {
				@Pc(242) int local242;
				@Pc(255) int local255;
				if (Static36.anInt626 == local200.anInt5215) {
					local242 = local74 + local36 * local200.anInt5213 / Static331.anInt10587;
					local255 = local65 + (Static331.anInt10594 - local200.anInt5210) * local38 / Static331.anInt10594;
					arg1.method8061(local255 - 2, 4, local186 << 24 | 0xFFFF00, local242 - 2, 4);
				} else if (Static58.anInt1135 != -1 && Static58.anInt1135 == local208.anInt6683) {
					local242 = local200.anInt5213 * local36 / Static331.anInt10587 + local74;
					local255 = local65 + local38 * (Static331.anInt10594 - local200.anInt5210) / Static331.anInt10594;
					arg1.method8061(local255 - 2, 4, local186 << 24 | 0xFFFF00, local242 - 2, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)I")
	public static int method6479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)V")
	public static void method6480() {
		for (@Pc(18) Class2_Sub1_Sub13 local18 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7177(); local18 != null; local18 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7175()) {
			if (Static290.method6760(local18.anInt6866)) {
				Static176.method3476(local18);
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
	public static void method6481() {
		if (Static355.aClass101_8 != null) {
			Static355.aClass101_8.method8148();
			Static355.aClass101_8 = null;
			Static639.aClass59_14 = null;
		}
	}
}
