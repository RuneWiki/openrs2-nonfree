import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!mv", name = "q", descriptor = "I")
	public static int anInt4799;

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_61 = new Class44(54, 3);

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "[I")
	public static final int[] anIntArray324 = new int[25];

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "[I")
	public static final int[] anIntArray325 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!mv", name = "n", descriptor = "[F")
	public static final float[] aFloatArray26 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)Z")
	public static boolean method3873() {
		return Static168.anInt3255 > 0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)V")
	public static void method3876(@OriginalArg(0) int arg0) {
		Static158.method2504();
		@Pc(19) int local19 = Static417.aClass237_1.method5379(arg0).anInt5160;
		if (local19 == 0) {
			return;
		}
		@Pc(27) int local27 = Static215.aClass225_1.anIntArray439[arg0];
		if (local19 == 5) {
			Static296.anInt5336 = local27;
		}
		if (local19 == 6) {
			Static264.anInt4916 = local27;
		}
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V")
	public static void method3879() {
		Static184.aClass26_4.ua(((float) Static399.aClass167_Sub1_1.anInt5554 * 0.1F + 0.7F) * 1.1523438F);
		Static184.aClass26_4.XA(Static166.anInt3219, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static184.aClass26_4.V(Static75.anInt1859, -1, 256);
		Static184.aClass26_4.method2283(Static376.aClass21_3);
	}
}
