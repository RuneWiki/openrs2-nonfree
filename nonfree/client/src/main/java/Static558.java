import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_169 = new Class268(89, 5);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!vs;Lclient!ao;I)V")
	public static void method8052(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) Class21 arg2) {
		if (Static277.anInt5443 >= 50 || (arg2 == null || arg2.anIntArrayArray2 == null || arg0 >= arg2.anIntArrayArray2.length || arg2.anIntArrayArray2[arg0] == null)) {
			return;
		}
		@Pc(32) int local32 = arg2.anIntArrayArray2[arg0][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg2.anIntArrayArray2[arg0].length > 1) {
			local61 = (int) ((double) arg2.anIntArrayArray2[arg0].length * Math.random());
			if (local61 > 0) {
				local36 = arg2.anIntArrayArray2[arg0][local61];
			}
		}
		@Pc(74) int local74 = local32 & 0x1F;
		local61 = 256;
		if (arg2.anIntArray18 != null && arg2.anIntArray19 != null) {
			local61 = arg2.anIntArray18[arg0] + (int) (Math.random() * (double) (arg2.anIntArray19[arg0] - arg2.anIntArray18[arg0]));
		}
		@Pc(112) int local112 = arg2.anIntArray21 == null ? 255 : arg2.anIntArray21[arg0];
		if (local74 == 0) {
			if (arg1 == Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1) {
				if (arg2.aBoolean11) {
					Static4.method7049(local61, false, 0, local36, local112, local42);
					return;
				}
				Static513.method7613(local61, local112, local36, local42, 0);
			}
		} else if (Static348.aClass6_Sub22_19.lb.method5678() != 0) {
			@Pc(154) int local154 = arg1.anInt10725 - 256 >> 9;
			@Pc(161) int local161 = arg1.anInt10729 - 256 >> 9;
			@Pc(181) int local181 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 == arg1 ? 0 : (local154 << 16) + (arg1.aByte131 << 24) + (local161 << 8) + local74;
			Static280.aClass224Array1[Static277.anInt5443++] = new Class224((byte) (arg2.aBoolean11 ? 2 : 1), local36, local42, 0, local112, local181, local61, arg1);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ca;B)V")
	public static void method8053(@OriginalArg(0) Class6_Sub3 arg0) {
		arg0.aBoolean614 = false;
		if (arg0.aClass6_Sub37_6 != null) {
			arg0.aClass6_Sub37_6.anInt9839 = 0;
		}
		for (@Pc(18) Class6_Sub3 local18 = arg0.method7800(); local18 != null; local18 = arg0.method7803()) {
			method8053(local18);
		}
	}
}
