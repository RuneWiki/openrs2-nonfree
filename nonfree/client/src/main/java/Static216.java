import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
	public static int anInt4293 = 0;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
	public static int anInt4296 = -1;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public static void method3984() {
		if (!Static243.aBoolean373) {
			return;
		}
		while (true) {
			while (Static51.anInt1312 < Static164.aClass135_Sub1Array2.length) {
				@Pc(21) Class135_Sub1 local21 = Static164.aClass135_Sub1Array2[Static51.anInt1312];
				if (local21 != null && local21.anInt4038 == -1) {
					if (Static331.aClass1_Sub12_3 == null) {
						Static331.aClass1_Sub12_3 = Static149.aClass117_1.method3399(local21.aString40);
					}
					@Pc(44) int local44 = Static331.aClass1_Sub12_3.anInt930;
					if (local44 == -1) {
						return;
					}
					local21.anInt4038 = local44;
					Static331.aClass1_Sub12_3 = null;
					Static51.anInt1312++;
				} else {
					Static51.anInt1312++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIBI)V")
	public static void method3985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static146.anInt6825 == 1) {
			Static91.aClass4Array23[Static87.anInt1925 / 100].method5948(Static132.anInt2873 - 8, Static175.anInt3671 + -8);
		}
		if (Static146.anInt6825 == 2) {
			Static91.aClass4Array23[Static87.anInt1925 / 100 + 4].method5948(Static132.anInt2873 - 8, Static175.anInt3671 + -8);
		}
		Static154.method2925();
	}
}
