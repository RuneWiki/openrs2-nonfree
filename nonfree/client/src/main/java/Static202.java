import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "Lclient!ik;")
	public static Class182 aClass182_53;

	@OriginalMember(owner = "client!gea", name = "o", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_56 = new Class397(72, 2);

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "([IBIII)V")
	public static void method3077(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(17) int local17 = arg3 - 1;
		@Pc(20) int local20 = local17 - 7;
		while (local20 > arg1) {
			@Pc(24) int local24 = arg1 + 1;
			arg0[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg0[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg0[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg0[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg0[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg0[local49] = arg2;
			@Pc(54) int local54 = local49 + 1;
			arg0[local54] = arg2;
			arg1 = local54 + 1;
			arg0[arg1] = arg2;
		}
		while (local17 > arg1) {
			arg1++;
			arg0[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)I")
	public static int method3078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static723.anIntArrayArray72 == null ? 0 : Static723.anIntArrayArray72[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V")
	public static void method3079() {
		if (Static49.anInt1325 == -1 || Static314.anInt5069 == -1) {
			return;
		}
		if (Static49.anInt1325 == 1 || Static49.anInt1325 == 3 || Static314.anInt5069 != Static49.anInt1325 && (Static49.anInt1325 == 0 || Static314.anInt5069 == 0)) {
			Static568.anInt8629 = 0;
			Static28.anInt1087 = 0;
			Static94.aClass313_8.method7101();
		}
		Static314.anInt5069 = Static49.anInt1325;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IC)Z")
	public static boolean method3080(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLclient!kt;)V")
	public static void method3081(@OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt8811 - Static716.anInt11157;
		@Pc(20) int local20 = arg0.anInt8813 * 512 + arg0.method7485() * 256;
		@Pc(31) int local31 = arg0.anInt8806 * 512 + arg0.method7485() * 256;
		arg0.anInt10695 += (local31 - arg0.anInt10695) / local9;
		arg0.anInt10694 += (local20 - arg0.anInt10694) / local9;
		arg0.anInt8814 = 0;
		if (arg0.anInt8805 == 0) {
			arg0.method7479(8192);
		}
		if (arg0.anInt8805 == 1) {
			arg0.method7479(12288);
		}
		if (arg0.anInt8805 == 2) {
			arg0.method7479(0);
		}
		if (arg0.anInt8805 == 3) {
			arg0.method7479(4096);
		}
	}
}
