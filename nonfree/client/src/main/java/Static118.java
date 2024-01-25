import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array2;

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "[Lclient!lr;")
	public static Class154[] aClass154Array1;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "[I")
	public static final int[] anIntArray189 = new int[3];

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Lclient!tr;")
	public static final Class237 aClass237_7 = new Class237(7, 4);

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public static int anInt2419 = 104;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public static void method2145() {
		@Pc(5) Class141[] local5 = Class1_Sub4_Sub10.aClass141Array1;
		synchronized (Class1_Sub4_Sub10.aClass141Array1) {
			for (@Pc(9) int local9 = 0; local9 < Class1_Sub4_Sub10.aClass141Array1.length; local9++) {
				Class1_Sub4_Sub10.aClass141Array1[local9] = new Class141();
				Static455.anIntArray659[local9] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
	public static void method2146() {
		for (@Pc(14) Class1_Sub35 local14 = (Class1_Sub35) Static298.aClass181_57.method4112(); local14 != null; local14 = (Class1_Sub35) Static298.aClass181_57.method4104()) {
			if (local14.aBoolean381) {
				local14.method4370();
			}
		}
		for (@Pc(34) Class1_Sub35 local34 = (Class1_Sub35) Static77.aClass181_15.method4112(); local34 != null; local34 = (Class1_Sub35) Static77.aClass181_15.method4104()) {
			if (local34.aBoolean381) {
				local34.method4370();
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)V")
	public static void method2147(@OriginalArg(1) int arg0) {
		Static257.anIntArray392 = new int[arg0];
		Static188.anIntArray301 = new int[arg0];
		Static19.anIntArray42 = new int[arg0];
		Static24.anIntArray48 = new int[arg0];
		Static397.anIntArray590 = new int[arg0];
	}
}
