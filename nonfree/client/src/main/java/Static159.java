import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	public static int anInt3248;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "[Lclient!wf;")
	public static Class8_Sub1_Sub22[] aClass8_Sub1_Sub22Array3 = new Class8_Sub1_Sub22[14];

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
	public static int anInt3250 = 0;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "[Lclient!mf;")
	public static Class112[] aClass112Array1 = new Class112[4];

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method2557() {
		Static219.aClass25_1.method1352();
		@Pc(10) int local10;
		for (local10 = 0; local10 < 32; local10++) {
			Static202.aLongArray9[local10] = 0L;
		}
		for (local10 = 0; local10 < 32; local10++) {
			Static121.aLongArray8[local10] = 0L;
		}
		Static290.anInt5654 = 0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method2559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static24.anInt639 * 128) {
			arg0 = Static24.anInt639 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static27.anInt665 * 128) {
			arg2 = Static27.anInt665 * 128 - 1;
		}
		Static23.anInt625 = Class68.anIntArray137[arg3];
		Static230.anInt4681 = Class68.anIntArray139[arg3];
		Static79.anInt1719 = Class68.anIntArray137[arg4];
		Static227.anInt4635 = Class68.anIntArray139[arg4];
		Static228.anInt4644 = arg0;
		Static256.anInt5058 = arg1;
		Static64.anInt1382 = arg2;
		Static212.anInt4369 = arg0 / 128;
		Static136.anInt2745 = arg2 / 128;
		Static21.anInt579 = Static212.anInt4369 - Static260.anInt5236;
		if (Static21.anInt579 < 0) {
			Static21.anInt579 = 0;
		}
		Static270.anInt5342 = Static136.anInt2745 - Static260.anInt5236;
		if (Static270.anInt5342 < 0) {
			Static270.anInt5342 = 0;
		}
		Static257.anInt5096 = Static212.anInt4369 + Static260.anInt5236;
		if (Static257.anInt5096 > Static24.anInt639) {
			Static257.anInt5096 = Static24.anInt639;
		}
		Static93.anInt1950 = Static136.anInt2745 + Static260.anInt5236;
		if (Static93.anInt1950 > Static27.anInt665) {
			Static93.anInt1950 = Static27.anInt665;
		}
		@Pc(99) short local99;
		if (Static116.aBoolean188) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static260.anInt5236 + Static260.anInt5236 + 2; local104++) {
			for (local113 = 0; local113 < Static260.anInt5236 + Static260.anInt5236 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static260.anInt5236 << 7) - (Static228.anInt4644 & 0x7F);
				@Pc(140) int local140 = (local113 - Static260.anInt5236 << 7) - (Static64.anInt1382 & 0x7F);
				@Pc(146) int local146 = Static212.anInt4369 + local104 - Static260.anInt5236;
				@Pc(152) int local152 = Static136.anInt2745 + local113 - Static260.anInt5236;
				if (local146 >= 0 && local152 >= 0 && local146 < Static24.anInt639 && local152 < Static27.anInt665) {
					@Pc(176) int local176;
					if (Static222.anIntArrayArrayArray10 == null) {
						local176 = Static87.anIntArrayArrayArray5[0][local146][local152] + 128 - Static256.anInt5058;
					} else {
						local176 = Static222.anIntArrayArrayArray10[0][local146][local152] + 128 - Static256.anInt5058;
					}
					@Pc(201) int local201 = Static87.anIntArrayArrayArray5[3][local146][local152] - Static256.anInt5058 - 1000;
					Static51.aBooleanArrayArray4[local104][local113] = Static293.method4279(local130, local201, local176, local140, local99);
				} else {
					Static51.aBooleanArrayArray4[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static260.anInt5236 + Static260.anInt5236 + 1; local104++) {
			for (local113 = 0; local113 < Static260.anInt5236 + Static260.anInt5236 + 1; local113++) {
				Static41.aBooleanArrayArray2[local104][local113] = Static51.aBooleanArrayArray4[local104][local113] || Static51.aBooleanArrayArray4[local104 + 1][local113] || Static51.aBooleanArrayArray4[local104][local113 + 1] || Static51.aBooleanArrayArray4[local104 + 1][local113 + 1];
			}
		}
		Static204.anIntArray317 = arg6;
		Static202.anIntArray316 = arg7;
		Static137.anIntArray119 = arg8;
		Static95.anIntArray132 = arg9;
		Static146.anIntArray235 = arg10;
		Static195.method2231();
		if (Static228.aClass8_Sub27ArrayArrayArray3 != null) {
			Static174.method2689(true);
			Static295.method2907(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static116.aBoolean188) {
				Static248.aBoolean395 = false;
				Static108.method1772(0, 0);
				Static233.method3554(null);
				Static186.method2929();
			}
			Static174.method2689(false);
		}
		Static295.method2907(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}
}
