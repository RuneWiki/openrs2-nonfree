import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	public static int anInt5391;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
	public static int anInt5396;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
	public static int anInt5397;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "[I")
	public static final int[] anIntArray256 = new int[14];

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_88 = new Class287(76, 7);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static289.aBoolean370) {
			return false;
		}
		@Pc(27) int local27 = arg1 >> 16;
		@Pc(31) int local31 = arg1 & 0xFFFF;
		if (Static449.aClass251ArrayArray1[local27] == null || Static449.aClass251ArrayArray1[local27][local31] == null) {
			return false;
		}
		@Pc(49) Class251 local49 = Static449.aClass251ArrayArray1[local27][local31];
		@Pc(61) Class3_Sub13 local61;
		if (arg0 == -1 && local49.anInt7231 == 0) {
			for (local61 = (Class3_Sub13) Static260.aClass244_40.method5572(); local61 != null; local61 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
				if (local61.anInt2364 == 5 || local61.anInt2364 == 1006 || local61.anInt2364 == 58 || local61.anInt2364 == 12 || local61.anInt2364 == 57) {
					for (@Pc(96) Class251 local96 = Static105.method2180(local61.anInt2359); local96 != null; local96 = Static136.method2656(local96)) {
						if (local96.anInt7279 == local49.anInt7279) {
							return true;
						}
					}
				}
			}
		} else {
			for (local61 = (Class3_Sub13) Static260.aClass244_40.method5572(); local61 != null; local61 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
				if (arg0 == local61.anInt2362 && local61.anInt2359 == local49.anInt7279 && (local61.anInt2364 == 5 || local61.anInt2364 == 1006 || local61.anInt2364 == 58 || local61.anInt2364 == 12 || local61.anInt2364 == 57)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBC)I")
	public static int method4328(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(21) char local21 = Character.toLowerCase(arg1);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public static void method4330() {
		Static83.aClass125_1.method8178();
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static369.aLongArray13[local18] = 0L;
		}
		for (@Pc(32) int local32 = 0; local32 < 32; local32++) {
			Static545.aLongArray15[local32] = 0L;
		}
		Static335.anInt6045 = 0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public static void method4331() {
		Static465.aClass63_10 = null;
		Static308.aClass73Array8 = null;
		Static148.aClass73Array6 = null;
		Static2.aClass63_1 = null;
		Static393.aClass63_9 = null;
		Static386.aClass73_36 = null;
		Static132.aClass73Array4 = null;
		Static410.aClass73Array10 = null;
		Static20.aClass73Array2 = null;
		Static340.aClass73Array9 = null;
		Static459.aClass73Array12 = null;
		Static516.aClass73Array14 = null;
		Static112.aClass73Array3 = null;
		Static463.aClass73Array13 = null;
		Static565.aClass73Array15 = null;
		Static34.aClass73_9 = null;
		Static286.aClass73Array7 = null;
		Static8.aClass73Array1 = null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method4332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 < 512 || arg2 < 512 || Static345.anInt6228 * 512 - 1024 < arg3 || arg2 > Static535.anInt9341 * 512 - 1024) {
			Static468.anIntArray481[0] = Static468.anIntArray481[1] = -1;
			return;
		}
		@Pc(57) int local57 = Static78.method3298(arg3, arg1, arg2) - arg6;
		Static585.aClass42_6.U(arg5, 0, 0);
		Static319.aClass31_11.method8062(Static585.aClass42_6);
		Static319.aClass31_11.AA(arg3, local57, arg2, Static468.anIntArray481);
		Static585.aClass42_6.U(-arg5, 0, 0);
		Static319.aClass31_11.method8062(Static585.aClass42_6);
	}
}
