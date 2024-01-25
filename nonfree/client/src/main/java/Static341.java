import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
	public static int[] anIntArray409;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public static int anInt6053;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
	public static final int[] anIntArray410 = new int[4096];

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	public static int anInt6056 = 2;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(JI)V")
	public static void method5076(@OriginalArg(0) long arg0) {
		@Pc(14) int local14 = Static120.anInt2411 + Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796;
		@Pc(19) int local19 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 + Static388.anInt6771;
		if (Static82.anInt9165 - local14 < -2000 || Static82.anInt9165 - local14 > 2000 || Static536.anInt8844 - local19 < -2000 || Static536.anInt8844 - local19 > 2000) {
			Static82.anInt9165 = local14;
			Static536.anInt8844 = local19;
		}
		@Pc(61) int local61;
		@Pc(69) int local69;
		if (Static82.anInt9165 != local14) {
			local61 = local14 - Static82.anInt9165;
			local69 = (int) (arg0 * (long) local61 / 320L);
			if (local61 > 0) {
				if (local69 == 0) {
					local69 = 1;
				} else if (local61 < local69) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = -1;
			} else if (local69 < local61) {
				local69 = local61;
			}
			Static82.anInt9165 += local69;
		}
		if (Static536.anInt8844 != local19) {
			local61 = local19 - Static536.anInt8844;
			local69 = (int) (arg0 * (long) local61 / 320L);
			if (local61 > 0) {
				if (local69 == 0) {
					local69 = 1;
				} else if (local61 < local69) {
					local69 = local61;
				}
			} else if (local69 == 0) {
				local69 = -1;
			} else if (local69 < local61) {
				local69 = local61;
			}
			Static536.anInt8844 += local69;
		}
		if (!Static479.aClass1_Sub7_Sub1_1.aBoolean231) {
			Static143.aFloat61 += (float) arg0 * Static327.aFloat150 / 6.0F;
			Static79.aFloat37 += Static257.aFloat111 * (float) arg0 / 6.0F;
		}
		Static21.method551();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	public static void method5077() {
		if (Static222.anInt1235 < 0) {
			Static248.anInt4641 = -1;
			Static582.anInt9419 = -1;
			Static222.anInt1235 = 0;
		}
		if (Static313.anInt4095 < Static222.anInt1235) {
			Static248.anInt4641 = -1;
			Static582.anInt9419 = -1;
			Static222.anInt1235 = Static313.anInt4095;
		}
		if (Static536.anInt8850 < 0) {
			Static582.anInt9419 = -1;
			Static248.anInt4641 = -1;
			Static536.anInt8850 = 0;
		}
		if (Static313.anInt4087 < Static536.anInt8850) {
			Static248.anInt4641 = -1;
			Static582.anInt9419 = -1;
			Static536.anInt8850 = Static313.anInt4087;
		}
	}
}
