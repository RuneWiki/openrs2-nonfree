import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "Lclient!qo;")
	public static Class279 aClass279_2;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "Lclient!f;")
	public static Class14 aClass14_5;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	public static int anInt1594;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public static int anInt1593 = 0;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "[I")
	public static final int[] anIntArray70 = new int[250];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLclient!wp;I)V")
	public static void method1495(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class361 arg1) {
		@Pc(15) int local15 = arg1.anInt9595 == 0 ? arg1.anInt9668 : arg1.anInt9595;
		@Pc(24) int local24 = arg1.anInt9651 == 0 ? arg1.anInt9650 : arg1.anInt9651;
		Static385.method5694(arg0, local15, local24, arg1.anInt9594, Static380.aClass361ArrayArray2[arg1.anInt9594 >> 16]);
		if (arg1.aClass361Array2 != null) {
			Static385.method5694(arg0, local15, local24, arg1.anInt9594, arg1.aClass361Array2);
		}
		@Pc(63) Class3_Sub49 local63 = (Class3_Sub49) Static216.aClass354_18.method7689((long) arg1.anInt9594);
		if (local63 != null) {
			Static496.method6704(local63.anInt8836, arg0, local15, local24);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
	public static void method1496(@OriginalArg(1) int arg0) {
		Static406.anInt7005 = -1;
		if (arg0 == 37) {
			Static44.aFloat203 = 3.0F;
		} else if (arg0 == 50) {
			Static44.aFloat203 = 4.0F;
		} else if (arg0 == 75) {
			Static44.aFloat203 = 6.0F;
		} else if (arg0 == 100) {
			Static44.aFloat203 = 8.0F;
		} else if (arg0 == 200) {
			Static44.aFloat203 = 16.0F;
		}
		Static406.anInt7005 = -1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
	public static void method1497() {
		Static54.aClass361Array1 = null;
		Static406.method5862(Static40.anInt758, Static308.anInt5171, Static353.anInt6188, 0, 0, 0, -1, 0);
		if (Static54.aClass361Array1 != null) {
			Static90.method1712(Static308.anInt5171, 0, Static40.anInt758, Static54.aClass361Array1, Static504.aClass361_14.anInt9578, 0, -1412584499, Static155.anInt3253, Static317.anInt5410);
			Static54.aClass361Array1 = null;
		}
	}
}
