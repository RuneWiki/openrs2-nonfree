import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
	public static int anInt102;

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!bd;")
	public static final Class10 aClass10_8 = new Class10();

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "[I")
	public static final int[] anIntArray2 = new int[128];

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	public static void method88() {
		if (Static148.aClass33_2 != null) {
			Static148.aClass33_2.method925();
			Static148.aClass33_2 = null;
		}
		Static46.method744();
		Static61.method944();
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			Static28.aClass77Array1[local15].method2164();
		}
		Static182.method2847();
		System.gc();
		Static35.method615();
		Static80.aBoolean91 = false;
		Static141.anInt2849 = -1;
		Static199.method3156();
		Static29.method515(10);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
	public static void method92(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static127.anInt2495; local1++) {
			if (arg0 < Static35.anIntArray38[local1] + Static150.anIntArray225[local1] && arg0 + arg1 > Static35.anIntArray38[local1] && Static59.anIntArray136[local1] + Static175.anIntArray292[local1] > arg2 && arg3 + arg2 > Static59.anIntArray136[local1]) {
				Static165.aBooleanArray14[local1] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)Z")
	public static boolean method93(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
