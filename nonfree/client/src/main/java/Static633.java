import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
	public static int anInt10532;

	@OriginalMember(owner = "client!wj", name = "G", descriptor = "Lclient!tc;")
	public static Class113 aClass113_9;

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Z")
	public static boolean aBoolean755 = false;

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "[I")
	public static final int[] anIntArray598 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "Z")
	public static boolean aBoolean756 = false;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)V")
	public static void method8957() {
		if (Static505.aClass277_22 != null) {
			Static299.aClass347_1 = new Class347();
			Static299.aClass347_1.method8238(Static141.aLong70, Static505.aClass277_22.anInt7504, Static505.aClass277_22, Static505.aClass277_22.aClass120_63.method2690(Static266.anInt4796));
			Static37.aThread1 = new Thread(Static299.aClass347_1, "");
			Static37.aThread1.start();
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)Z")
	public static boolean method8959(@OriginalArg(0) int arg0) {
		if (Static490.aBooleanArray25[arg0]) {
			return true;
		} else if (Static546.aClass207_114.method4664(arg0)) {
			@Pc(23) int local23 = Static546.aClass207_114.method4672(arg0);
			if (local23 == 0) {
				Static490.aBooleanArray25[arg0] = true;
				return true;
			}
			if (Static519.aClass295ArrayArray2[arg0] == null) {
				Static519.aClass295ArrayArray2[arg0] = new Class295[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static519.aClass295ArrayArray2[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static546.aClass207_114.method4681(arg0, local50);
					if (local64 != null) {
						@Pc(76) Class295 local76 = Static519.aClass295ArrayArray2[arg0][local50] = new Class295();
						local76.anInt8022 = local50 + (arg0 << 16);
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method6990(new Class5_Sub22(local64));
					}
				}
			}
			Static490.aBooleanArray25[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method8960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14;
		if (method8959(arg5)) {
			local14 = 0;
			@Pc(34) int local34 = 0;
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = 0;
			@Pc(44) int local44 = 0;
			if (Static428.aBoolean526) {
				local44 = Static71.anInt1484;
				local40 = Static481.anInt8180;
				local42 = Static558.anInt9413;
				local14 = Static30.anInt373;
				local34 = Static218.anInt4108;
				Static71.anInt1484 = 1;
			}
			if (Static321.aClass295ArrayArray1[arg5] == null) {
				Static470.method7959(arg2, arg3, arg7, arg2 < 0, arg1, arg0, arg6, Static519.aClass295ArrayArray2[arg5], arg4, -1);
			} else {
				Static470.method7959(arg2, arg3, arg7, arg2 < 0, arg1, arg0, arg6, Static321.aClass295ArrayArray1[arg5], arg4, -1);
			}
			if (Static428.aBoolean526) {
				if (arg2 >= 0 && Static71.anInt1484 == 2) {
					Static562.method5062(Static218.anInt4108, Static558.anInt9413, Static481.anInt8180, Static30.anInt373);
				}
				Static218.anInt4108 = local34;
				Static71.anInt1484 = local44;
				Static481.anInt8180 = local40;
				Static558.anInt9413 = local42;
				Static30.anInt373 = local14;
			}
		} else if (arg2 == -1) {
			for (local14 = 0; local14 < 100; local14++) {
				Static264.aBooleanArray16[local14] = true;
			}
		} else {
			Static264.aBooleanArray16[arg2] = true;
		}
	}
}
