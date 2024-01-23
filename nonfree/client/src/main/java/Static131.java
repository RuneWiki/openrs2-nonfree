import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
	public static int anInt2471;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "[I")
	public static int[] anIntArray295;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public static int anInt2479;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString92 = "shake:";

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
	public static int anInt2477 = -1;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "[I")
	public static int[] anIntArray296 = new int[50];

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "Lclient!rg;")
	public static Class151 aClass151_4 = null;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method2211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static295.anInt4973 * 128) {
			arg0 = Static295.anInt4973 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static307.anInt6023 * 128) {
			arg2 = Static307.anInt6023 * 128 - 1;
		}
		Static296.anInt5883 = Class11.anIntArray26[arg3];
		Static259.anInt5353 = Class11.anIntArray27[arg3];
		Static279.anInt5606 = Class11.anIntArray26[arg4];
		Static27.anInt485 = Class11.anIntArray27[arg4];
		Static282.anInt5668 = arg0;
		Static112.anInt5733 = arg1;
		Static104.anInt1924 = arg2;
		Static19.anInt361 = arg0 / 128;
		Static289.anInt5787 = arg2 / 128;
		Static183.anInt3631 = Static19.anInt361 - Static285.anInt5736;
		if (Static183.anInt3631 < 0) {
			Static183.anInt3631 = 0;
		}
		Static198.anInt3862 = Static289.anInt5787 - Static285.anInt5736;
		if (Static198.anInt3862 < 0) {
			Static198.anInt3862 = 0;
		}
		Static11.anInt5176 = Static19.anInt361 + Static285.anInt5736;
		if (Static11.anInt5176 > Static295.anInt4973) {
			Static11.anInt5176 = Static295.anInt4973;
		}
		Static17.anInt338 = Static289.anInt5787 + Static285.anInt5736;
		if (Static17.anInt338 > Static307.anInt6023) {
			Static17.anInt338 = Static307.anInt6023;
		}
		@Pc(99) short local99;
		if (Static283.aBoolean393) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static285.anInt5736 + Static285.anInt5736 + 2; local104++) {
			for (local113 = 0; local113 < Static285.anInt5736 + Static285.anInt5736 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static285.anInt5736 << 7) - (Static282.anInt5668 & 0x7F);
				@Pc(140) int local140 = (local113 - Static285.anInt5736 << 7) - (Static104.anInt1924 & 0x7F);
				@Pc(146) int local146 = Static19.anInt361 + local104 - Static285.anInt5736;
				@Pc(152) int local152 = Static289.anInt5787 + local113 - Static285.anInt5736;
				if (local146 >= 0 && local152 >= 0 && local146 < Static295.anInt4973 && local152 < Static307.anInt6023) {
					@Pc(176) int local176;
					if (Static22.anIntArrayArrayArray1 == null) {
						local176 = Static258.anIntArrayArrayArray15[0][local146][local152] + 128 - Static112.anInt5733;
					} else {
						local176 = Static22.anIntArrayArrayArray1[0][local146][local152] + 128 - Static112.anInt5733;
					}
					@Pc(201) int local201 = Static258.anIntArrayArrayArray15[3][local146][local152] - Static112.anInt5733 - 1000;
					Static15.aBooleanArrayArray6[local104][local113] = Static199.method3281(local130, local201, local176, local140, local99);
				} else {
					Static15.aBooleanArrayArray6[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static285.anInt5736 + Static285.anInt5736 + 1; local104++) {
			for (local113 = 0; local113 < Static285.anInt5736 + Static285.anInt5736 + 1; local113++) {
				Static252.aBooleanArrayArray10[local104][local113] = Static15.aBooleanArrayArray6[local104][local113] || Static15.aBooleanArrayArray6[local104 + 1][local113] || Static15.aBooleanArrayArray6[local104][local113 + 1] || Static15.aBooleanArrayArray6[local104 + 1][local113 + 1];
			}
		}
		Static44.anIntArray65 = arg6;
		Static34.anIntArray53 = arg7;
		Static284.anIntArray593 = arg8;
		Static79.anIntArray191 = arg9;
		Static39.anIntArray60 = arg10;
		Static206.method3427();
		if (Static291.aClass3_Sub25ArrayArrayArray6 != null) {
			Static62.method976(true);
			Static114.method5020(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static283.aBoolean393) {
				Static91.aBoolean138 = false;
				Static53.method5036(0, 0);
				Static226.method3653(null);
				Static142.method2402();
			}
			Static62.method976(false);
		}
		Static114.method5020(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!ug;)Lclient!dh;")
	public static Class35 method2213(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(7) Class35 local7 = new Class35();
		local7.anInt1010 = arg0.method3948();
		local7.aClass3_Sub4_Sub9_1 = Static213.method3486(local7.anInt1010);
		return local7;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!rn;)V")
	public static void method2214(@OriginalArg(1) Class155 arg0) {
		Static98.aClass155_48 = arg0;
		Static163.anInt3083 = Static98.aClass155_48.method4131(4);
	}
}
