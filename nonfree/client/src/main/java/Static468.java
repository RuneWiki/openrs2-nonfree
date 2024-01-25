import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_81 = new Class70(38, 4);

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!kj;")
	public static final Class192 aClass192_3 = new Class192();

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
	public static boolean aBoolean614 = false;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
	public static boolean aBoolean615 = false;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public static void method6431() {
		@Pc(10) int local10 = Static348.aClass1_Sub30_Sub1_1.method3916(Static113.anInt2222);
		if (local10 == 0) {
			Static165.aByteArrayArrayArray13 = null;
			Static527.method7251(0);
		} else if (local10 == 1) {
			Static408.method5641((byte) 0);
			Static527.method7251(512);
			if (Static455.aByteArrayArrayArray17 != null) {
				Static279.method3929();
			}
		} else {
			Static408.method5641((byte) (Static350.anInt5818 - 4 & 0xFF));
			Static527.method7251(2);
		}
		Static244.anInt4499 = Static433.anInt7592;
	}
}
