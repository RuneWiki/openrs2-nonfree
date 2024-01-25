import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "Lclient!ig;")
	public static Class12 aClass12_8;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "[I")
	public static int[] anIntArray260;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "[Lclient!oa;")
	public static Class184_Sub1[] aClass184_Sub1Array1 = new Class184_Sub1[0];

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ta;Z)V")
	public static void method2456(@OriginalArg(0) Class3_Sub3_Sub6 arg0) {
		@Pc(9) int local9 = arg0.anInt6686 - Static125.anInt2225;
		@Pc(21) int local21 = arg0.anInt6719 * 128 + arg0.method5512() * 64;
		@Pc(33) int local33 = arg0.anInt6734 * 128 + arg0.method5512() * 64;
		arg0.anInt6675 += (local21 - arg0.anInt6675) / local9;
		arg0.anInt6757 = 0;
		arg0.anInt6677 += (local33 - arg0.anInt6677) / local9;
		if (arg0.anInt6718 == 0) {
			arg0.method5516(8192);
		}
		if (arg0.anInt6718 == 1) {
			arg0.method5516(12288);
		}
		if (arg0.anInt6718 == 2) {
			arg0.method5516(0);
		}
		if (arg0.anInt6718 == 3) {
			arg0.method5516(4096);
		}
	}
}
