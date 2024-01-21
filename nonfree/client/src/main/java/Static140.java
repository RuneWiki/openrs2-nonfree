import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!oi", name = "M", descriptor = "[I")
	public static final int[] anIntArray293 = new int[50];

	@OriginalMember(owner = "client!oi", name = "R", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_872 = Static181.method2795("Please enter your username)3");

	@OriginalMember(owner = "client!oi", name = "N", descriptor = "Lclient!qe;")
	public static Class83 aClass83_871 = aClass83_872;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
	public static void method2273() {
		@Pc(13) int local13 = Static143.anInt3007 - (int) ((double) Static42.aClass5_8.anInt157 / Static131.aDouble11);
		@Pc(22) int local22 = (int) ((double) Static42.aClass5_8.anInt157 / Static131.aDouble11) + Static143.anInt3007;
		@Pc(32) int local32 = Static62.anInt1512 - (int) ((double) Static42.aClass5_8.anInt100 / Static131.aDouble11);
		@Pc(41) int local41 = Static62.anInt1512 + (int) ((double) Static42.aClass5_8.anInt100 / Static131.aDouble11);
		if (local13 < 0) {
			Static121.anInt2748 = -1;
			Static143.anInt3007 = (int) ((double) Static42.aClass5_8.anInt157 / Static131.aDouble11);
			Static113.anInt2598 = -1;
		}
		if (Static127.anInt2810 < local22) {
			Static121.anInt2748 = -1;
			Static113.anInt2598 = -1;
			Static143.anInt3007 = Static127.anInt2810 - (int) ((double) Static42.aClass5_8.anInt157 / Static131.aDouble11);
		}
		if (local32 < 0) {
			Static113.anInt2598 = -1;
			Static121.anInt2748 = -1;
			Static62.anInt1512 = (int) ((double) Static42.aClass5_8.anInt100 / Static131.aDouble11);
		}
		if (local41 > Static177.anInt3615) {
			Static113.anInt2598 = -1;
			Static121.anInt2748 = -1;
			Static62.anInt1512 = Static177.anInt3615 - (int) ((double) Static42.aClass5_8.anInt100 / Static131.aDouble11);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBLclient!eh;)[Lclient!gg;")
	public static Class29_Sub1[] method2274(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1) {
		return Static161.method222(arg1, arg0) ? Static93.method1607() : null;
	}
}
