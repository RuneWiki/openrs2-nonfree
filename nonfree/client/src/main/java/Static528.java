import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!su", name = "n", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!su", name = "p", descriptor = "I")
	public static int anInt9126;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_59 = new Class43();

	@OriginalMember(owner = "client!su", name = "i", descriptor = "[J")
	public static final long[] aLongArray13 = new long[100];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
	public static void method7469() {
		@Pc(14) int local14;
		if (Static75.aClass372Array2 != null) {
			for (local14 = 0; local14 < Static160.anInt4007; local14++) {
				Static75.aClass372Array2[local14] = null;
			}
			Static75.aClass372Array2 = null;
		}
		if (Static476.aClass372Array3 != null) {
			for (local14 = 0; local14 < Static128.anInt3432; local14++) {
				Static476.aClass372Array3[local14] = null;
			}
			Static476.aClass372Array3 = null;
		}
		if (Static619.aClass372Array4 != null) {
			for (local14 = 0; local14 < Static134.anInt3553; local14++) {
				Static619.aClass372Array4[local14] = null;
			}
			Static619.aClass372Array4 = null;
		}
		Static46.anInt1571 = -1;
		Static225.anInt10572 = -1;
		Static169.anIntArray223 = null;
		Static275.anIntArrayArrayArray9 = null;
		Static16.aClass372Array1 = null;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)I")
	public static int method7470(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg1 < 1 || Static372.anInt7082 - 2 < arg0 || Static218.anInt5023 - 2 < arg1) {
			return;
		}
		@Pc(32) int local32 = arg2;
		if (arg2 < 3 && Static61.method1675(arg1, arg0)) {
			local32 = arg2 + 1;
		}
		if (Static155.aClass8_Sub25_6.aClass36_Sub13_1.method4838() == 0 && !Static116.method2609(Static591.anInt10125, local32, arg0, arg1)) {
			return;
		}
		if (Static405.aClass56ArrayArrayArray2 == null) {
			return;
		}
		Static32.aClass19_Sub1_1.method3011(Static171.aClass16_5, arg2, arg6, Static204.aClass48Array1[arg2], arg0, arg1);
		if (arg7 < 0) {
			return;
		}
		@Pc(80) int local80 = Static155.aClass8_Sub25_6.aClass36_Sub1_1.method1349();
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub1_1, 1);
		Static32.aClass19_Sub1_1.method3006(local32, Static204.aClass48Array1[arg2], arg3, arg4, arg7, arg5, arg1, Static171.aClass16_5, arg0, arg2);
		Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub1_1, local80);
		return;
	}
}
