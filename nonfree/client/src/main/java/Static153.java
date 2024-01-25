import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!za;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method2253(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class32 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static52.aClass34_1 = arg0;
		Static284.anInt4999 = arg1;
		Static270.aClass32_7 = arg3;
		Static69.aBoolean148 = Static52.aClass34_1.method5800() > 0;
		Static321.anInt5494 = arg4 >> Static215.anInt4460;
		Static64.anInt1211 = arg6 >> Static215.anInt4460;
		Static111.anInt2102 = arg4;
		Static330.anInt5627 = arg6;
		Static148.anInt2553 = arg5;
		Static235.anInt4212 = Static321.anInt5494 - Static179.anInt3132;
		if (Static235.anInt4212 < 0) {
			Static458.anInt6289 = -Static235.anInt4212;
			Static235.anInt4212 = 0;
		} else {
			Static458.anInt6289 = 0;
		}
		Static54.anInt974 = Static64.anInt1211 - Static179.anInt3132;
		if (Static54.anInt974 < 0) {
			Static309.anInt5375 = -Static54.anInt974;
			Static54.anInt974 = 0;
		} else {
			Static309.anInt5375 = 0;
		}
		Static181.anInt3166 = Static321.anInt5494 + Static179.anInt3132;
		if (Static181.anInt3166 > Static37.anInt666) {
			Static181.anInt3166 = Static37.anInt666;
		}
		Static202.anInt3561 = Static64.anInt1211 + Static179.anInt3132;
		if (Static202.anInt3561 > Static408.anInt6716) {
			Static202.anInt3561 = Static408.anInt6716;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static179.anInt3132 + Static179.anInt3132 + 2; local74++) {
			for (local77 = 0; local77 < Static179.anInt3132 + Static179.anInt3132 + 2; local77++) {
				local84 = Static321.anInt5494 + local74 - Static179.anInt3132;
				local90 = Static64.anInt1211 + local77 - Static179.anInt3132;
				if (local84 >= 0 && local90 >= 0 && local84 < Static37.anInt666 && local90 < Static408.anInt6716) {
					@Pc(104) int local104 = local84 << Static215.anInt4460;
					@Pc(108) int local108 = local90 << Static215.anInt4460;
					@Pc(124) int local124 = Static330.aClass157Array2[Static330.aClass157Array2.length - 1].ua(local84, local90) - (0x3E8 << Static215.anInt4460 - 7);
					@Pc(144) int local144 = Static343.aClass157Array3 == null ? Static330.aClass157Array2[0].ua(local84, local90) + Static5.anInt78 : Static343.aClass157Array3[0].ua(local84, local90) + Static5.anInt78;
					Static431.aBooleanArrayArray6[local74][local77] = Static52.aClass34_1.VA(local104, local124, local108, local104, local144, local108);
				} else {
					Static431.aBooleanArrayArray6[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static179.anInt3132 + Static179.anInt3132 + 1; local77++) {
			for (local84 = 0; local84 < Static179.anInt3132 + Static179.anInt3132 + 1; local84++) {
				Static44.aBooleanArrayArray1[local77][local84] = Static431.aBooleanArrayArray6[local77][local84] || Static431.aBooleanArrayArray6[local77 + 1][local84] || Static431.aBooleanArrayArray6[local77][local84 + 1] || Static431.aBooleanArrayArray6[local77 + 1][local84 + 1];
			}
		}
		Static68.anIntArray62 = arg8;
		Static211.anIntArray229 = arg9;
		Static291.anIntArray329 = arg10;
		Static159.anIntArray182 = arg11;
		Static397.anIntArray442 = arg12;
		Static29.method385();
		Static36.method5119();
		for (@Pc(260) Class4_Sub7 local260 = (Class4_Sub7) Static252.aClass262_10.method5819(); local260 != null; local260 = (Class4_Sub7) Static252.aClass262_10.method5813()) {
			local260.method5572();
			Static447.method3430(local260);
		}
		if (Static69.aBoolean148) {
			for (local90 = 0; local90 < Static358.anInt1533; local90++) {
				Static45.aClass137Array4[local90].method3151(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static52.aClass34_1.method5749(0);
			if (Static344.aClass58_1 == null || Static344.aClass58_1 instanceof Class58_Sub1) {
				Static344.aClass58_1 = new Class58_Sub2();
			}
		} else if (Static344.aClass58_1 == null || Static344.aClass58_1 instanceof Class58_Sub2) {
			Static344.aClass58_1 = new Class58_Sub1();
		}
		Static344.aClass58_1.method3493(arg2);
		Static344.aClass58_1.method3496();
		if (Static145.aClass169ArrayArrayArray4 != null) {
			Static253.method3631(true);
			Static344.aClass58_1.method3497(22);
			Static204.method2903(arg2, null, 0, (byte) 0, arg15, arg16);
			Static344.aClass58_1.method3496();
			Static344.aClass58_1.method3497(23);
			Static253.method3631(false);
		}
		Static204.method2903(arg2, arg7, arg13, arg14, arg15, arg16);
		Static344.aClass58_1.method3496();
		Static344.aClass58_1.method3491();
		Static344.aClass58_1.method3496();
		if (arg2 > 1) {
			Static52.aClass34_1.method5742(0);
		}
		Static52.aClass34_1.method5730(0, null);
	}
}
