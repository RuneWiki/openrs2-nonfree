import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!rd", name = "eb", descriptor = "Lclient!ak;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!rd", name = "L", descriptor = "[F")
	public static final float[] aFloatArray59 = new float[16];

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
	public static int anInt7303 = 0;

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
	public static int anInt7305 = -1;

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "[I")
	public static final int[] anIntArray703 = new int[256];

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
	public static void method6564() {
		if (!Static181.aBoolean310) {
			return;
		}
		@Pc(15) Class91 local15 = Static429.method6657(Static49.anInt1304, Static119.anInt2478);
		if (local15 != null && local15.anObjectArray18 != null) {
			@Pc(24) Class1_Sub10 local24 = new Class1_Sub10();
			local24.aClass91_2 = local15;
			local24.anObjectArray4 = local15.anObjectArray18;
			Static173.method3207(local24);
		}
		Static245.anInt4711 = -1;
		Static189.anInt3926 = -1;
		Static181.aBoolean310 = false;
		if (local15 != null) {
			Static243.method4316(local15);
		}
	}
}
