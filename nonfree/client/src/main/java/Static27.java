import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
	public static int anInt403;

	@OriginalMember(owner = "client!bn", name = "I", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
	public static int anInt402 = 2;

	@OriginalMember(owner = "client!bn", name = "H", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!bn", name = "L", descriptor = "Z")
	public static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!f;)V")
	public static void method383(@OriginalArg(1) Class53_Sub1_Sub1 arg0) {
		@Pc(20) Class4_Sub11 local20 = (Class4_Sub11) Static206.aClass85_18.method1845(Static108.method1747(arg0.aString88));
		if (local20 == null) {
			Static7.method109(null, arg0.anIntArray422[0], null, arg0.anIntArray426[0], arg0, 0, Static281.anInt5335);
		} else {
			local20.method1652();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V")
	public static void method384(@OriginalArg(0) boolean arg0) {
		Static138.anInt2644 = 0;
		Static113.aClass114_13 = null;
		Static121.aByteArrayArrayArray12 = null;
		if (arg0 && Static121.aClass4_Sub3_Sub22_3 != null) {
			Static132.anInt2554 = Static121.aClass4_Sub3_Sub22_3.anInt5997;
		} else {
			Static132.anInt2554 = -1;
		}
		Static224.aClass189_12 = null;
		Static121.anIntArray266 = null;
		Static121.anIntArrayArrayArray6 = null;
		Static121.aByteArrayArrayArray10 = null;
		Static121.aByteArrayArrayArray14 = null;
		Static121.anIntArrayArrayArray7 = null;
		Static121.aByteArrayArrayArray11 = null;
		Static121.aByteArrayArrayArray13 = null;
		Static121.aClass4_Sub3_Sub22_3 = null;
		Static121.aClass178_12.method4374();
		Static172.aClass108_5 = null;
		Static243.aClass108_8 = null;
		Static10.aClass108_1 = null;
		Static199.aClass108_6 = null;
		Static228.aClass108_7 = null;
		Static177.aClass4_Sub3_Sub14_3 = null;
		Static229.anInt4394 = -1;
		Static121.aClass141_6 = null;
		Static88.aClass108_2 = null;
		Static92.aClass4_Sub3_Sub14_Sub1_2 = null;
		Static170.aClass108_4 = null;
		Static142.aClass108_3 = null;
		Static16.anInt929 = -1;
		Static181.method2938();
		Static33.aClass132_1 = null;
		Static133.aClass85_10 = null;
		Static124.aClass85_9 = null;
		Static68.method1064(128, 64);
		Static85.method1501(64);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(14) int local14 = arg4 - arg1;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg6 - arg1;
		@Pc(25) int local25 = arg4 * arg4;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local14 * local14;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local37 << 1;
		@Pc(49) int local49 = local25 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg6 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = local25 * (1 - local57) + local41;
		@Pc(80) int local80 = local29 - local49 * (local57 - 1);
		@Pc(89) int local89 = local45 + (1 - local61) * local33;
		@Pc(98) int local98 = local37 - local53 * (local61 - 1);
		@Pc(102) int local102 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local37 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local41 * 3;
		@Pc(124) int local124 = local49 * (local57 - 3);
		@Pc(128) int local128 = local45 * 3;
		@Pc(130) int local130 = local106;
		@Pc(136) int local136 = (local61 - 3) * local53;
		@Pc(138) int local138 = local110;
		@Pc(144) int local144 = (arg6 - 1) * local102;
		@Pc(150) int local150 = local114 * (local21 - 1);
		@Pc(154) int[] local154 = Static220.anIntArrayArray36[arg3];
		Static99.method1656(local154, arg2, arg0 - arg4, -local14 + arg0);
		Static99.method1656(local154, arg5, arg0 - local14, local14 + arg0);
		Static99.method1656(local154, arg2, local14 + arg0, arg0 - -arg4);
		while (local9 > 0) {
			if (local71 < 0) {
				while (local71 < 0) {
					local71 += local118;
					local118 += local106;
					local7++;
					local80 += local130;
					local130 += local106;
				}
			}
			if (local80 < 0) {
				local71 += local118;
				local80 += local130;
				local118 += local106;
				local7++;
				local130 += local106;
			}
			local71 += -local144;
			@Pc(251) int local251 = arg0 - local7;
			@Pc(258) boolean local258 = local21 >= local9;
			@Pc(263) int local263 = arg0 + local7;
			local144 -= local102;
			local9--;
			local80 += -local124;
			@Pc(277) int local277 = local9 + arg3;
			local124 -= local102;
			if (local258) {
				if (local89 < 0) {
					while (local89 < 0) {
						local16++;
						local98 += local138;
						local89 += local128;
						local138 += local110;
						local128 += local110;
					}
				}
				if (local98 < 0) {
					local89 += local128;
					local128 += local110;
					local16++;
					local98 += local138;
					local138 += local110;
				}
				local98 += -local136;
				local89 += -local150;
				local150 -= local114;
				local136 -= local114;
			}
			@Pc(352) int local352 = arg3 - local9;
			if (local258) {
				@Pc(358) int local358 = arg0 - local16;
				Static99.method1656(Static220.anIntArrayArray36[local352], arg2, local251, local358);
				@Pc(371) int local371 = arg0 + local16;
				Static99.method1656(Static220.anIntArrayArray36[local352], arg5, local358, local371);
				Static99.method1656(Static220.anIntArrayArray36[local352], arg2, local371, local263);
				Static99.method1656(Static220.anIntArrayArray36[local277], arg2, local251, local358);
				Static99.method1656(Static220.anIntArrayArray36[local277], arg5, local358, local371);
				Static99.method1656(Static220.anIntArrayArray36[local277], arg2, local371, local263);
			} else {
				Static99.method1656(Static220.anIntArrayArray36[local352], arg2, local251, local263);
				Static99.method1656(Static220.anIntArrayArray36[local277], arg2, local251, local263);
			}
		}
	}
}
