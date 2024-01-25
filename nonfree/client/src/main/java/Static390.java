import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
	public static int anInt6077;

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_95 = new Class397(57, 12);

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "[I")
	public static final int[] anIntArray446 = new int[13];

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z")
	public static boolean method5298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)Lclient!pm;")
	public static Class3_Sub48 method5300() {
		if (Static327.aClass342_14 == null || Static226.aClass304_1 == null) {
			return null;
		}
		Static226.aClass304_1.method6982(Static327.aClass342_14);
		@Pc(31) Class3_Sub48 local31 = (Class3_Sub48) Static226.aClass304_1.method6983();
		if (local31 == null) {
			return null;
		} else {
			@Pc(42) Class198 local42 = Static327.aClass111_2.method2739(local31.anInt8050);
			return local42 != null && local42.aBoolean336 && local42.method4667(Static327.anInterface12_2) ? local31 : Static464.method8628();
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(III)Lclient!fe;")
	public static Class109 method5301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class109 local7 = new Class109();
		local7.anInt2985 = arg1 + 5 + 1;
		local7.anInt2978 = -1;
		local7.anInt2990 = arg0 + 1 + 5;
		local7.anInt2989 = -1;
		local7.anIntArrayArray9 = new int[local7.anInt2990][local7.anInt2985];
		local7.method2731();
		return local7;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIII)V")
	public static void method5303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(37) int local37 = local21 + local13 * (1 - local29);
		@Pc(45) int local45 = local17 - local25 * (local29 - 1);
		@Pc(49) int local49 = local13 << 2;
		@Pc(53) int local53 = local17 << 2;
		@Pc(73) int local73 = local21 * 3;
		@Pc(81) int local81 = local25 * ((arg2 << 1) - 3);
		@Pc(87) int local87 = local53;
		Static202.method3077(Static118.anIntArrayArray7[arg1], arg4 - arg3, arg0, arg4 + arg3);
		@Pc(106) int local106 = local49 * (arg2 - 1);
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local73;
					local45 += local87;
					local7++;
					local87 += local53;
					local73 += local53;
				}
			}
			if (local45 < 0) {
				local45 += local87;
				local37 += local73;
				local7++;
				local73 += local53;
				local87 += local53;
			}
			local45 += -local81;
			local37 += -local106;
			local106 -= local49;
			local9--;
			local81 -= local49;
			@Pc(179) int local179 = arg1 - local9;
			@Pc(183) int local183 = local9 + arg1;
			@Pc(187) int local187 = local7 + arg4;
			@Pc(192) int local192 = arg4 - local7;
			Static202.method3077(Static118.anIntArrayArray7[local179], local192, arg0, local187);
			Static202.method3077(Static118.anIntArrayArray7[local183], local192, arg0, local187);
		}
	}
}
