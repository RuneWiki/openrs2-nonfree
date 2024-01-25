import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "[Lclient!ha;")
	public static Class25[] aClass25Array16;

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "Z")
	public static boolean aBoolean546 = false;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_72 = new Class236(4, -1);

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray11 = new int[2][][];

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
	public static int anInt7689 = 0;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!oh;IIIIIILclient!qa;Lclient!pa;)V")
	public static void method6226(@OriginalArg(0) Class220 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class62 arg6, @OriginalArg(8) Class87 arg7) {
		@Pc(10) Class101 local10 = Static358.aClass246_3.method5847(arg4);
		if (local10 == null || !local10.aBoolean186 || !local10.method2603(Static540.aClass242_1)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray235 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray235.length];
			@Pc(42) int local42;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static166.anInt3343 == 4) {
					local42 = (int) Static476.aFloat339 & 0x3FFF;
				} else {
					local42 = (int) Static476.aFloat339 + Static352.anInt6565 & 0x3FFF;
				}
				@Pc(56) int local56 = Class5_Sub2_Sub16.anIntArray411[local42];
				@Pc(60) int local60 = Class5_Sub2_Sub16.anIntArray410[local42];
				if (Static166.anInt3343 != 4) {
					local56 = local56 * 256 / (Static145.anInt3048 + 256);
					local60 = local60 * 256 / (Static145.anInt3048 + 256);
				}
				local28[local30 * 2] = ((arg2 + local10.anIntArray235[local30 * 2] * 4) * local60 + (arg1 + local10.anIntArray235[local30 * 2 + 1] * 4) * local56 >> 15) + arg0.anInt6627 / 2 + arg3;
				local28[local30 * 2 + 1] = arg0.anInt6681 / 2 + arg5 - (local60 * (arg1 + local10.anIntArray235[local30 * 2 + 1] * 4) + -((arg2 + local10.anIntArray235[local30 * 2] * 4) * local56) >> 15);
			}
			Static251.method4270(arg6, local28, local10.anInt2863, arg0.anIntArray492, arg0.anIntArray499);
			for (local42 = 0; local42 < local28.length / 2 - 1; local42++) {
				arg6.method7057(local28[local42 * 2], local28[local42 * 2 + 1], local28[local42 * 2 + 2], local28[(local42 + 1) * 2 + 1], local10.anInt2884, arg7, arg3, arg5);
			}
			arg6.method7057(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt2884, arg7, arg3, arg5);
		}
		@Pc(261) Class25 local261 = null;
		if (local10.anInt2867 != -1) {
			local261 = local10.method2604(false, arg6);
			if (local261 != null) {
				Static295.method4921(arg2, arg0, arg1, arg7, local261, arg3, arg5);
			}
		}
		if (local10.aString34 == null) {
			return;
		}
		local30 = 0;
		if (local261 != null) {
			local30 = local261.la();
		}
		@Pc(295) Class13 local295 = Static121.aClass13_1;
		@Pc(297) Class256 local297 = Static291.aClass256_6;
		if (local10.anInt2878 == 1) {
			local297 = Static73.aClass256_3;
			local295 = Static492.aClass13_3;
		}
		if (local10.anInt2878 == 2) {
			local295 = Static130.aClass13_2;
			local297 = Static312.aClass256_7;
		}
		Static181.method3081(local30, local297, arg1, arg3, local295, arg2, local10.anInt2879, local10.aString34, arg5, arg0, arg7);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
	public static void method6228() {
		Static409.aBoolean517 = true;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V")
	public static void method6229() {
		Static350.anInt4879 = Static312.aClass256_7.anInt7541 + Static312.aClass256_7.anInt7540 + 2;
		Static193.aStringArray19 = new String[500];
		Static297.anInt7036 = Static73.aClass256_3.anInt7540 + Static73.aClass256_3.anInt7541 + 2;
		for (@Pc(30) int local30 = 0; local30 < Static193.aStringArray19.length; local30++) {
			Static193.aStringArray19[local30] = "";
		}
	}
}
