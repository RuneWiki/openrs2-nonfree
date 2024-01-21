import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!lc;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!vd;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!lc;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray1 = new byte[250][];

	@OriginalMember(owner = "client!a", name = "b", descriptor = "[I")
	public static int[] anIntArray1 = new int[200];

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1 = Static121.method2047("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!qc;")
	public static Class60 aClass60_2 = Static121.method2047("jolt");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_3 = Static121.method2047("Mem:");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method1() {
		aClass40_2 = null;
		aClass60_2 = null;
		anIntArray1 = null;
		aClass60_1 = null;
		aClass78_1 = null;
		aClass40_1 = null;
		aByteArrayArray1 = null;
		aClass60_3 = null;
		aClass40_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method2() {
		@Pc(1) Object local1 = Static66.anObject5;
		synchronized (Static66.anObject5) {
			if (Static38.anInt965 == 0) {
				Static129.aClass35_3.method981(5, new Class47());
			}
			Static38.anInt965 = 600;
		}
	}
}
