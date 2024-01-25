import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Lclient!gba;")
	public static Class119 aClass119_5;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!cfa;")
	public static final Class54 aClass54_6 = new Class54();

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
	public static int anInt10426 = 100;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "[I")
	public static final int[] anIntArray765 = new int[200];

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	public static int anInt10427 = 0;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_176 = new Class44(95, 10);

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
	public static int anInt10428 = 0;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "Z")
	public static boolean aBoolean728 = true;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
	public static void method8695() {
		Static54.anInt1357 = 0;
		Static476.aClass296Array1 = new Class296[500];
		Static673.aClass296Array4 = new Class296[2000];
		Static552.anInt9411 = Static222.anInt4166;
		Static200.aBoolean279 = false;
		Static297.anInt5234 = 0;
		Static275.anInt4779 = 0;
		Static622.aClass296Array3 = new Class296[500];
		Static157.anInt3110 = 0;
		Static382.anInt7019 = Static222.anInt4166;
		Static505.aClass296Array2 = new Class296[1000];
		Static369.anIntArrayArrayArray11 = new int[Static613.anInt10338][Static28.anInt704 + 1][Static55.anInt1384 + 1];
		if (Static533.aClass137_41 instanceof oa) {
			Static12.aBoolean9 = false;
		} else {
			Static12.aBoolean9 = true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
	public static int method8696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local7;
	}
}
