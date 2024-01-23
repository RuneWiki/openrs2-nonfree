import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt2792;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "[[Lclient!rc;")
	public static Class1_Sub25[][] aClass1_Sub25ArrayArray2;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	public static int anInt2791 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method2344() {
		if (!Static39.method718() && Static92.anInt1754 != Static159.anInt2978) {
			Static210.method3348(false, Static28.aClass6_Sub6_Sub2_1.anIntArray516[0], Static159.anInt2978, Static179.anInt3322, Static75.anInt1495, Static28.aClass6_Sub6_Sub2_1.anIntArray519[0], false);
		} else if (Static98.anInt1879 != Static159.anInt2978 && Static207.method3229(Static159.anInt2978)) {
			Static98.anInt1879 = Static159.anInt2978;
			Static232.method3814();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IJ)V")
	public static void method2345(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static28.aClass6_Sub6_Sub2_1.anInt4562 + Static276.anInt5541;
		if (!Static290.aBoolean436) {
			Static177.aFloat97 += (float) arg0 * Static149.aFloat80 / 40.0F;
			Static152.aFloat81 += (float) arg0 * Static70.aFloat38 / 40.0F;
		}
		@Pc(32) int local32 = Static103.anInt1938 + Static28.aClass6_Sub6_Sub2_1.anInt4569;
		if (Static139.anInt2614 - local7 < -500 || Static139.anInt2614 - local7 > 500 || Static242.anInt4995 - local32 < -500 || Static242.anInt4995 - local32 > 500) {
			Static139.anInt2614 = local7;
			Static242.anInt4995 = local32;
		}
		@Pc(80) int local80;
		@Pc(88) int local88;
		if (Static139.anInt2614 != local7) {
			local80 = local7 - Static139.anInt2614;
			local88 = (int) ((long) local80 * arg0 / 320L);
			if (local80 > 0) {
				if (local88 == 0) {
					local88 = 1;
				} else if (local80 < local88) {
					local88 = local80;
				}
			} else if (local88 == 0) {
				local88 = -1;
			} else if (local88 < local80) {
				local88 = local80;
			}
			Static139.anInt2614 += local88;
		}
		if (Static242.anInt4995 != local32) {
			local80 = local32 - Static242.anInt4995;
			local88 = (int) ((long) local80 * arg0 / 320L);
			if (local80 > 0) {
				if (local88 == 0) {
					local88 = 1;
				} else if (local88 > local80) {
					local88 = local80;
				}
			} else if (local88 == 0) {
				local88 = -1;
			} else if (local88 < local80) {
				local88 = local80;
			}
			Static242.anInt4995 += local88;
		}
		Static62.method1041();
	}
}
