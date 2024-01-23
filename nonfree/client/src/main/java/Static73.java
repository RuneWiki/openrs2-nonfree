import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
	public static int anInt1413;

	@OriginalMember(owner = "client!fg", name = "db", descriptor = "I")
	public static int anInt1414;

	@OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
	public static int anInt1415;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "Lclient!ad;")
	public static Class5 aClass5_9 = new Class5();

	@OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
	public static int anInt1409 = 0;

	@OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
	public static int anInt1412 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIZIII)V")
	public static void method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		Static109.method1795(arg2 - arg1, Static51.anIntArrayArray1[arg4], arg2 + arg1, arg0);
		@Pc(18) int local18 = arg3;
		@Pc(33) int local33 = arg1 * arg1;
		@Pc(37) int local37 = arg3 * arg3;
		@Pc(41) int local41 = local33 << 1;
		@Pc(45) int local45 = local37 << 1;
		@Pc(49) int local49 = arg3 << 1;
		@Pc(58) int local58 = local37 - (local49 - 1) * local41;
		@Pc(67) int local67 = local33 * (1 - local49) + local45;
		@Pc(75) int local75 = local45 * 3;
		@Pc(79) int local79 = local33 << 2;
		@Pc(83) int local83 = local37 << 2;
		@Pc(91) int local91 = local41 * ((arg3 << 1) - 3);
		@Pc(97) int local97 = local83;
		@Pc(103) int local103 = (arg3 - 1) * local79;
		while (local18 > 0) {
			if (local67 < 0) {
				while (local67 < 0) {
					local58 += local97;
					local67 += local75;
					local97 += local83;
					local75 += local83;
					local3++;
				}
			}
			if (local58 < 0) {
				local67 += local75;
				local58 += local97;
				local75 += local83;
				local3++;
				local97 += local83;
			}
			local58 += -local91;
			local18--;
			local91 -= local79;
			@Pc(171) int local171 = arg4 - local18;
			local67 += -local103;
			@Pc(180) int local180 = local18 + arg4;
			@Pc(184) int local184 = local3 + arg2;
			local103 -= local79;
			@Pc(193) int local193 = arg2 - local3;
			Static109.method1795(local193, Static51.anIntArrayArray1[local171], local184, arg0);
			Static109.method1795(local193, Static51.anIntArrayArray1[local180], local184, arg0);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ph;ILclient!ph;)V")
	public static void method1182(@OriginalArg(0) Class138 arg0, @OriginalArg(2) Class138 arg1) {
		Static2.aClass138_1 = arg0;
		Static194.aClass138_51 = arg1;
		Static194.aClass138_51.method3365(34);
		@Pc(19) int local19 = (int) (Math.random() * 21.0D) - 10;
		@Pc(26) int local26 = (int) (Math.random() * 21.0D) - 10;
		@Pc(38) int local38 = (int) (Math.random() * 41.0D) - 20;
		Static61.anInt1210 = local26 + local38;
		Static30.anInt553 = local38 + local19;
		@Pc(54) int local54 = (int) (Math.random() * 21.0D) - 10;
		anInt1414 = local38 + local54;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[F")
	public static float[] method1183(@OriginalArg(0) int arg0) {
		@Pc(7) float local7 = Static96.method1389() + Static96.method1394();
		@Pc(9) float local9 = 0.58823526F;
		@Pc(11) int local11 = Static96.method1398();
		@Pc(20) float local20 = (float) (local11 >> 16 & 0xFF) / 255.0F;
		Static9.aFloatArray19[0] = local7 * (float) (arg0 >> 16 & 0xFF) / 255.0F * local20 * local9;
		Static9.aFloatArray19[3] = 1.0F;
		@Pc(50) float local50 = (float) (local11 >> 8 & 0xFF) / 255.0F;
		Static9.aFloatArray19[1] = local7 * (float) (arg0 >> 8 & 0xFF) / 255.0F * local50 * local9;
		@Pc(74) float local74 = (float) (local11 & 0xFF) / 255.0F;
		Static9.aFloatArray19[2] = local74 * ((float) (arg0 & 0xFF) / 255.0F) * local9 * local7;
		return Static9.aFloatArray19;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIILclient!bo;)V")
	public static void method1184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class24 arg2) {
		Static234.aClass24_23.method462();
		if (Static222.aBoolean295) {
			return;
		}
		for (@Pc(16) Class1_Sub1_Sub10 local16 = (Class1_Sub1_Sub10) arg2.method460(); local16 != null; local16 = (Class1_Sub1_Sub10) arg2.method464()) {
			@Pc(27) Class81 local27 = Static50.method874(local16.anInt1638);
			if (Static288.method4283(local27)) {
				Static244.method3786(arg0, arg1, local16, local27);
				if (local16.aBoolean127) {
					Static212.method3354(local16, local27);
				}
			}
		}
	}
}
