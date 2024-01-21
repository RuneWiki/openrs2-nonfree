import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "Lclient!ke;")
	public static Class52 aClass52_32;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1330 = Static193.method3027("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1329 = aClass70_1330;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray21 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
	public static final int anInt2892 = 7759444;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
	public static void method2040() {
		Static35.anInt770 = 0;
		Static93.aClass3_Sub4_Sub1_18.anInt1758 = 0;
		Static141.anInt2853 = -1;
		Static134.aBoolean131 = false;
		Static190.anInt3871 = -1;
		Static82.anInt1626 = 0;
		Static139.anInt4131 = 0;
		Static155.anInt3189 = -1;
		Static65.anInt1365 = 0;
		Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
		Static192.anInt3908 = 0;
		Static211.anInt4256 = 0;
		Static121.anInt2459 = -1;
		for (@Pc(33) int local33 = 0; local33 < Static146.aClass26_Sub2_Sub1Array1.length; local33++) {
			if (Static146.aClass26_Sub2_Sub1Array1[local33] != null) {
				Static146.aClass26_Sub2_Sub1Array1[local33].anInt2620 = -1;
			}
		}
		for (@Pc(50) int local50 = 0; local50 < Static8.aClass26_Sub2_Sub2Array1.length; local50++) {
			if (Static8.aClass26_Sub2_Sub2Array1[local50] != null) {
				Static8.aClass26_Sub2_Sub2Array1[local50].anInt2620 = -1;
			}
		}
		Static30.method557();
		Static29.method515(30);
		for (@Pc(72) int local72 = 0; local72 < 100; local72++) {
			Static165.aBooleanArray14[local72] = true;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIII)I")
	public static int method2051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = 256 - arg2;
		return (arg2 * (arg0 & 0xFF00FF) + (arg1 & 0xFF00FF) * local12 & 0xFF00FF00) + ((arg1 & 0xFF00) * local12 + ((arg0 & 0xFF00) * arg2) & 0xFF0000) >> 8;
	}
}
