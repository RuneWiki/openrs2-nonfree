import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
	public static int anInt6963;

	@OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
	public static int anInt6964;

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
	public static int anInt6966;

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_254 = new Class184(4, -1);

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_230 = new Class92(59, 8);

	@OriginalMember(owner = "client!ud", name = "cb", descriptor = "J")
	public static long aLong202 = 0L;

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
	public static final int anInt6965 = 1400;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;Lclient!eo;Lclient!oa;IIIILclient!ov;Lclient!ea;III)V")
	public static void method5404(@OriginalArg(0) String arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class179 arg7, @OriginalArg(8) Class32 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(15) int local15;
		if (Static107.anInt2382 == 4) {
			local15 = (int) Static235.aFloat60 & 0x3FFF;
		} else {
			local15 = (int) Static235.aFloat60 + Static397.anInt6876 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg1.anInt2178 / 2, arg1.lb / 2) + 10;
		@Pc(42) int local42 = arg3 * arg3 + arg10 * arg10;
		if (local42 > local34 * local34) {
			return;
		}
		@Pc(52) int local52 = Applet_Sub1.anIntArray85[local15];
		@Pc(56) int local56 = Applet_Sub1.anIntArray87[local15];
		if (Static107.anInt2382 != 4) {
			local56 = local56 * 256 / (Static317.anInt5759 + 256);
			local52 = local52 * 256 / (Static317.anInt5759 + 256);
		}
		@Pc(87) int local87 = local52 * arg3 + local56 * arg10 >> 15;
		@Pc(103) int local103 = arg3 * local56 - arg10 * local52 >> 15;
		@Pc(110) int local110 = arg7.method4392(100, arg0, null);
		@Pc(116) int local116 = local87 - local110 / 2;
		@Pc(124) int local124 = arg7.method4387(arg0, null);
		if (-arg1.anInt2178 <= local116 && local116 <= arg1.anInt2178 && local103 >= -arg1.lb && local103 <= arg1.lb) {
			arg2.method5809(arg8, arg0, arg4, 0, arg6 + arg1.lb / 2 - arg5 - local103 - local124, null, arg6, arg9 + local116 + arg1.anInt2178 / 2, local110, null, 0, 50, arg9);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method5405(@OriginalArg(1) Class75 arg0) {
		@Pc(7) int local7 = Static67.anInt1556;
		@Pc(9) int local9 = Static153.anInt3319;
		@Pc(11) int local11 = Static283.anInt5203;
		@Pc(13) int local13 = Static318.anInt3229;
		arg0.method2600(local13, local7, local11, local9, -10660793);
		arg0.method2600(16, local7 + 1, local11 + -2, local9 + 1, -16777216);
		arg0.method2625(-16777216, local9 + 18, local13 + -19, local11 - 2, local7 + 1);
		Static399.aClass65_7.method5818(local9 + 14, local7 + 3, -1, -10660793, Static309.aClass175_185.method4201(Static216.anInt4257));
		@Pc(74) int local74 = Static155.aClass74_1.method1870();
		@Pc(78) int local78 = Static155.aClass74_1.method1865();
		@Pc(80) int local80 = 0;
		for (@Pc(87) Class3_Sub38 local87 = (Class3_Sub38) Static374.aClass229_41.method5328(); local87 != null; local87 = (Class3_Sub38) Static374.aClass229_41.method5325()) {
			@Pc(102) int local102 = (Static169.anInt3551 - local80 - 1) * 16 + local9 + 31;
			@Pc(104) short local104 = -1;
			if (local74 > local7 && local74 < local11 + local7 && local102 - 13 < local78 && local78 < local102 + 3 && local87.aBoolean452) {
				local104 = -256;
			}
			@Pc(141) int[] local141 = null;
			if (Static54.method1102(local87.anInt6532)) {
				local141 = Static89.aClass157_1.method3832((int) local87.aLong192).anIntArray434;
			} else if (local87.anInt6528 != -1) {
				local141 = Static89.aClass157_1.method3832(local87.anInt6528).anIntArray434;
			} else if (Static116.method5249(local87.anInt6532)) {
				@Pc(207) Class1_Sub3_Sub3_Sub2 local207 = Static451.aClass1_Sub3_Sub3_Sub2Array1[(int) local87.aLong192];
				if (local207 != null) {
					@Pc(212) Class47 local212 = local207.aClass47_1;
					if (local212.anIntArray134 != null) {
						local212 = local212.method1296(Static369.aClass11_1);
					}
					if (local212 != null) {
						local141 = local212.anIntArray137;
					}
				}
			} else if (Static34.method820(local87.anInt6532)) {
				@Pc(177) Class128 local177;
				if (local87.anInt6532 == 1004) {
					local177 = Static55.aClass25_1.method855((int) local87.aLong192);
				} else {
					local177 = Static55.aClass25_1.method855((int) (local87.aLong192 >>> 32 & 0x7FFFFFFFL));
				}
				if (local177.anIntArray307 != null) {
					local177 = local177.method3307(Static369.aClass11_1);
				}
				if (local177 != null) {
					local141 = local177.anIntArray303;
				}
			}
			@Pc(246) String local246 = Static262.method3968(local87);
			if (local141 != null) {
				local246 = local246 + Static39.method921(local141);
			}
			Static399.aClass65_7.method5802(Static270.aClass22Array21, Static184.anIntArray285, local7 + 3, local246, local104, local102);
			local80++;
			if (local87.aBoolean453) {
				Static55.aClass22_2.method6074(local7 + Static222.aClass179_10.method4385(local246) + 5, local102 - 12);
			}
		}
		Static9.method241(Static153.anInt3319, Static318.anInt3229, Static283.anInt5203, Static67.anInt1556);
	}
}
