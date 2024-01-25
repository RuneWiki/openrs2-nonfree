import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Z)I")
	public static int method3493() {
		return Static255.anInt4904 == 1 ? Static307.anInt5554 : Static588.anInt10265;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILclient!ha;IIII)V")
	public static void method3494(@OriginalArg(1) int arg0, @OriginalArg(2) Class101 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if ((Static91.aClass71_5 == null || Static434.aClass71_11 == null || Static486.aClass71_31 == null) && Static409.aClass124_84.method3627(Static132.anInt2525) && Static409.aClass124_84.method3627(Static287.anInt5264) && Static409.aClass124_84.method3627(Static411.anInt7658)) {
			@Pc(27) Class67 local27 = Static676.method1693(Static409.aClass124_84, Static287.anInt5264, 0);
			Static434.aClass71_11 = arg1.method8063(local27, true);
			local27.method1686();
			Static358.aClass71_15 = arg1.method8063(local27, true);
			Static91.aClass71_5 = arg1.method8063(Static676.method1693(Static409.aClass124_84, Static132.anInt2525, 0), true);
			@Pc(52) Class67 local52 = Static676.method1693(Static409.aClass124_84, Static411.anInt7658, 0);
			Static486.aClass71_31 = arg1.method8063(local52, true);
			local52.method1686();
			Static618.aClass71_36 = arg1.method8063(local52, true);
		}
		if (Static91.aClass71_5 == null || Static434.aClass71_11 == null || Static486.aClass71_31 == null) {
			return;
		}
		@Pc(88) int local88 = (arg0 - Static486.aClass71_31.method7691() * 2) / Static91.aClass71_5.method7691();
		for (@Pc(90) int local90 = 0; local90 < local88; local90++) {
			Static91.aClass71_5.method7703(arg4 + Static486.aClass71_31.method7691() + local90 * Static91.aClass71_5.method7691(), -Static91.aClass71_5.method7707() + arg2 + arg3);
		}
		@Pc(126) int local126 = (arg2 - Static486.aClass71_31.method7707() - 20) / Static434.aClass71_11.method7707();
		for (@Pc(128) int local128 = 0; local128 < local126; local128++) {
			Static434.aClass71_11.method7703(arg4, local128 * Static434.aClass71_11.method7707() + arg3 + 20);
			Static358.aClass71_15.method7703(arg0 + arg4 - Static358.aClass71_15.method7691(), arg3 + 20 + Static434.aClass71_11.method7707() * local128);
		}
		Static486.aClass71_31.method7703(arg4, arg3 + arg2 - Static486.aClass71_31.method7707());
		Static618.aClass71_36.method7703(arg4 + arg0 - Static486.aClass71_31.method7691(), arg2 + arg3 + -Static486.aClass71_31.method7707());
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3495(@OriginalArg(1) String arg0) {
		@Pc(6) Class2_Sub52 local6 = Static550.method8448();
		local6.aClass2_Sub8_Sub2_2.method5170(Static527.aClass361_12.anInt10749);
		local6.aClass2_Sub8_Sub2_2.method5192(0);
		@Pc(21) int local21 = local6.aClass2_Sub8_Sub2_2.anInt5725;
		local6.aClass2_Sub8_Sub2_2.method5192(643);
		@Pc(34) int[] local34 = Static619.method9236(local6);
		@Pc(38) int local38 = local6.aClass2_Sub8_Sub2_2.anInt5725;
		local6.aClass2_Sub8_Sub2_2.method5212(arg0);
		local6.aClass2_Sub8_Sub2_2.method5170(Static204.anInt8130);
		local6.aClass2_Sub8_Sub2_2.anInt5725 += 7;
		local6.aClass2_Sub8_Sub2_2.method5229(local6.aClass2_Sub8_Sub2_2.anInt5725, local34, local38);
		local6.aClass2_Sub8_Sub2_2.method5162(local6.aClass2_Sub8_Sub2_2.anInt5725 - local21);
		Static38.method791(local6);
		Static113.anInt2042 = 0;
		Static387.anInt7336 = 1;
		Static276.anInt5123 = 0;
		Static532.anInt9332 = -3;
	}
}
