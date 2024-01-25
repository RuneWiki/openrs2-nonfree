import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public static int anInt2521;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[128][128];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Lclient!n;")
	public static Class1_Sub6 method2417() {
		@Pc(8) Class1_Sub6 local8 = (Class1_Sub6) Static86.aClass126_2.method3391();
		if (local8 == null) {
			return new Class1_Sub6();
		} else {
			Static312.anInt6027--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
	public static void method2419() {
		if (Static289.aBoolean368) {
			return;
		}
		if (Static61.aBoolean94) {
			Static274.aFloat100 = (int) Static274.aFloat100 + 47 & 0xFFFFFFF0;
		} else {
			Static232.aFloat44 += (12.0F - Static232.aFloat44) / 2.0F;
		}
		Static72.aBoolean114 = true;
		Static289.aBoolean368 = true;
	}
}
