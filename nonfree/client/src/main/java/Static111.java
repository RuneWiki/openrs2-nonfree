import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dt", name = "J", descriptor = "[I")
	public static int[] anIntArray141;

	@OriginalMember(owner = "client!dt", name = "Q", descriptor = "Lclient!sp;")
	public static Class323 aClass323_1;

	@OriginalMember(owner = "client!dt", name = "N", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[16];

	@OriginalMember(owner = "client!dt", name = "O", descriptor = "I")
	public static int anInt2031 = 0;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)V")
	public static void method1666() {
		for (@Pc(6) Class2_Sub2_Sub12 local6 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1573(); local6 != null; local6 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1568()) {
			if (local6.anInt4924 > 1) {
				local6.anInt4924 = 0;
				Static446.aClass32_79.method629(local6, ((Class2_Sub2_Sub11) local6.aClass75_9.aClass2_Sub2_26.aClass2_Sub2_67).aLong123);
				local6.aClass75_9.method1567();
			}
		}
		Static474.anInt7600 = 0;
		Static121.anInt2166 = 0;
		Static115.aClass109_11.method2329();
		Static257.aClass118_25.method2599();
		Static453.aClass75_10.method1567();
		Static627.aBoolean736 = false;
	}
}
