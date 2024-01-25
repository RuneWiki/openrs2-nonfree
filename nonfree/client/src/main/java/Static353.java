import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "[I")
	public static final int[] anIntArray324 = new int[1];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)B")
	public static byte method5741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(JI)V")
	public static void method5745(@OriginalArg(0) long arg0) {
		if (Static26.aClass186ArrayArrayArray1 != null) {
			if (Static554.anInt9497 == 1 || Static554.anInt9497 == 5) {
				Static292.method5022(arg0);
			} else if (Static554.anInt9497 == 4) {
				Static94.method2322(arg0);
			}
		}
		Static91.method2289((long) Static384.anInt7234, Static467.aClass5_13);
		if (Static30.anInt830 != -1) {
			Static600.method8299(Static30.anInt830);
		}
		for (@Pc(47) int local47 = 0; local47 < Static588.anInt9948; local47++) {
			if (Static366.aBooleanArray16[local47]) {
				Static337.aBooleanArray15[local47] = true;
			}
			Static412.aBooleanArray20[local47] = Static366.aBooleanArray16[local47];
			Static366.aBooleanArray16[local47] = false;
		}
		Static394.anInt7366 = Static384.anInt7234;
		Static13.method524(-1, -1, (Class302) null);
		Static527.method7491(-1, (Class302) null, -1);
		if (Static30.anInt830 != -1) {
			Static588.anInt9948 = 0;
			Static384.method6054();
		}
		Static467.aClass5_13.la();
		Static380.method6021(Static467.aClass5_13);
		@Pc(103) int local103 = Static154.method3057();
		if (local103 == -1) {
			local103 = Static329.anInt6606;
		}
		if (local103 == -1) {
			local103 = Static538.anInt9322;
		}
		Static86.method8588(local103);
		@Pc(123) int local123 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3620() << 8;
		Static315.method5291(Static492.anInt8597, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 + local123, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 + local123);
		Static492.anInt8597 = 0;
	}
}
