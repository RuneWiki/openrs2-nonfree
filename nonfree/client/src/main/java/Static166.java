import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!im", name = "N", descriptor = "Lclient!wl;")
	public static Class105 aClass105_2;

	@OriginalMember(owner = "client!im", name = "z", descriptor = "I")
	public static int anInt2964 = 0;

	@OriginalMember(owner = "client!im", name = "A", descriptor = "[I")
	public static final int[] anIntArray270 = new int[13];

	@OriginalMember(owner = "client!im", name = "O", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!oa;ZZLclient!oa;IZI)I")
	public static int method2709(@OriginalArg(0) Class184_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class184_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static381.method5250(arg0, arg4, arg5, arg2);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(43) int local43 = Static381.method5250(arg0, arg1, arg3, arg2);
			return arg1 ? -local43 : local43;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!qq;I)V")
	public static void method2710(@OriginalArg(0) Class28 arg0) {
		@Pc(7) int local7 = Static203.anInt3581;
		@Pc(9) int local9 = Static236.anInt4059;
		@Pc(11) int local11 = Static265.anInt4552;
		@Pc(13) int local13 = Static122.anInt2156;
		arg0.method3531(local7, -10660793, local9, local13, local11);
		arg0.method3531(local7 + 1, -16777216, local9 + 1, 16, local11 - 2);
		arg0.method3508(local11 - 2, -16777216, local7 + 1, local13 - 19, local9 + 18);
		Static45.aClass92_1.method5638(-10660793, local9 + 14, local7 + 3, Static329.aClass231_95.method5138(Static382.anInt6289), -1);
		@Pc(74) int local74 = Static37.aClass71_26.method1618();
		@Pc(78) int local78 = Static37.aClass71_26.method1624();
		@Pc(80) int local80 = 0;
		for (@Pc(91) Class6_Sub33 local91 = (Class6_Sub33) Static307.aClass88_23.method1882(); local91 != null; local91 = (Class6_Sub33) Static307.aClass88_23.method1891()) {
			@Pc(106) int local106 = local9 + (-local80 + -1 + Static228.anInt3878) * 16 + 31;
			@Pc(108) short local108 = -1;
			if (local7 < local74 && local74 < local7 + local11 && local78 > local106 - 13 && local106 + 3 > local78 && local91.aBoolean389) {
				local108 = -256;
			}
			@Pc(142) int[] local142 = null;
			if (Static305.method4412(local91.anInt5954)) {
				local142 = Static354.aClass170_2.method3865((int) local91.aLong176).anIntArray48;
			} else if (local91.anInt5955 != -1) {
				local142 = Static354.aClass170_2.method3865(local91.anInt5955).anIntArray48;
			} else if (Static302.method4398(local91.anInt5954)) {
				@Pc(206) Class3_Sub3_Sub6_Sub2 local206 = Static450.aClass3_Sub3_Sub6_Sub2Array1[(int) local91.aLong176];
				if (local206 != null) {
					@Pc(211) Class17 local211 = local206.aClass17_1;
					if (local211.anIntArray26 != null) {
						local211 = local211.method288(Static71.aClass126_1);
					}
					if (local211 != null) {
						local142 = local211.anIntArray27;
					}
				}
			} else if (Static259.method3996(local91.anInt5954)) {
				@Pc(178) Class118 local178;
				if (local91.anInt5954 == 1009) {
					local178 = Static113.aClass127_2.method2820((int) local91.aLong176);
				} else {
					local178 = Static113.aClass127_2.method2820((int) (local91.aLong176 >>> 32 & 0x7FFFFFFFL));
				}
				if (local178.anIntArray273 != null) {
					local178 = local178.method2718(Static71.aClass126_1);
				}
				if (local178 != null) {
					local142 = local178.anIntArray272;
				}
			}
			@Pc(245) String local245 = Static33.method703(local91);
			if (local142 != null) {
				local245 = local245 + Static420.method5693(local142);
			}
			Static45.aClass92_1.method5644(local108, Static136.aClass12Array7, Static320.anIntArray466, local7 + 3, local106, local245);
			if (local91.aBoolean390) {
				Static228.aClass12_10.method5665(local7 + Static252.aClass201_5.method4452(local245) + 5, local106 + -12);
			}
			local80++;
		}
		Static200.method3165(Static122.anInt2156, Static203.anInt3581, Static236.anInt4059, Static265.anInt4552);
	}
}
