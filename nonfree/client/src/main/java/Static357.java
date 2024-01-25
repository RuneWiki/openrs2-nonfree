import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static357 {

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "Lclient!mg;")
	public static Class160 aClass160_70;

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "Lclient!rk;")
	public static Class215 aClass215_4;

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
	public static final int anInt6062 = 1400;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!em;III)V")
	public static void method4871(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte33 == 0) {
			arg0.anInt2214 = arg0.anInt2186;
		} else if (arg0.aByte33 == 1) {
			arg0.anInt2214 = arg0.anInt2186 + (arg1 - arg0.anInt2252) / 2;
		} else if (arg0.aByte33 == 2) {
			arg0.anInt2214 = arg1 - arg0.anInt2252 - arg0.anInt2186;
		} else if (arg0.aByte33 == 3) {
			arg0.anInt2214 = arg1 * arg0.anInt2186 >> 14;
		} else if (arg0.aByte33 == 4) {
			arg0.anInt2214 = (arg1 - arg0.anInt2252) / 2 + (arg0.anInt2186 * arg1 >> 14);
		} else {
			arg0.anInt2214 = arg1 - (arg1 * arg0.anInt2186 >> 14) - arg0.anInt2252;
		}
		if (arg0.aByte34 == 0) {
			arg0.anInt2244 = arg0.anInt2168;
		} else if (arg0.aByte34 == 1) {
			arg0.anInt2244 = (arg2 - arg0.anInt2188) / 2 + arg0.anInt2168;
		} else if (arg0.aByte34 == 2) {
			arg0.anInt2244 = arg2 - arg0.anInt2188 - arg0.anInt2168;
		} else if (arg0.aByte34 == 3) {
			arg0.anInt2244 = arg0.anInt2168 * arg2 >> 14;
		} else if (arg0.aByte34 == 4) {
			arg0.anInt2244 = (arg2 - arg0.anInt2188) / 2 + (arg0.anInt2168 * arg2 >> 14);
		} else {
			arg0.anInt2244 = arg2 - (arg0.anInt2168 * arg2 >> 14) - arg0.anInt2188;
		}
		if (!Static154.aBoolean245 || Static47.method787(arg0).anInt6837 == 0 && arg0.anInt2249 != 0) {
			return;
		}
		if (arg0.anInt2244 < 0) {
			arg0.anInt2244 = 0;
		} else if (arg2 < arg0.anInt2244 + arg0.anInt2188) {
			arg0.anInt2244 = arg2 - arg0.anInt2188;
		}
		if (arg0.anInt2214 < 0) {
			arg0.anInt2214 = 0;
		} else if (arg0.anInt2252 + arg0.anInt2214 > arg1) {
			arg0.anInt2214 = arg1 - arg0.anInt2252;
			return;
		}
	}
}
