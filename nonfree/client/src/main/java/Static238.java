import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "J")
	public static long aLong424;

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public static int anInt9537;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([Ljava/lang/Object;I[I)V")
	public static void method7876(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static14.method459(arg1.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!ir;[Lclient!qea;)V")
	public static void method7879(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
		@Pc(6) int local6;
		if (Static192.aBoolean328) {
			local6 = arg0.method7258(arg1);
			Static63.aClass12_5.method6402(local6, arg1);
		}
		if (Static499.aClass17Array3 == Static20.aClass17Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class20_Sub2_Sub4) {
				local6 = ((Class20_Sub2_Sub4) arg0).aShort100;
				local28 = ((Class20_Sub2_Sub4) arg0).aShort97;
			} else {
				local6 = arg0.anInt8796 >> Static378.anInt6665;
				local28 = arg0.anInt8795 >> Static378.anInt6665;
			}
			Static63.aClass12_5.YA(Static158.aClass17Array2[0].method6637(arg0.anInt8796, arg0.anInt8795), Static390.method5576(local6, local28), Static144.method2347(local6, local28), Static579.method7773(local6, local28));
		}
		@Pc(64) Class20_Sub8 local64 = arg0.method7253(Static63.aClass12_5);
		if (local64 == null) {
			return;
		}
		local64.aClass20_Sub2_1 = arg0;
		if (Static50.aBoolean95) {
			@Pc(73) Class349 local73 = Static312.aClass349_8;
			synchronized (Static312.aClass349_8) {
				@Pc(77) boolean local77 = false;
				for (@Pc(82) Class20_Sub8 local82 = (Class20_Sub8) Static312.aClass349_8.method7653(); local82 != null; local82 = (Class20_Sub8) Static312.aClass349_8.method7660()) {
					if (arg0.anInt8787 >= local82.aClass20_Sub2_1.anInt8787) {
						Static392.method5596(local64, local82);
						local77 = true;
						break;
					}
				}
				if (!local77) {
					Static312.aClass349_8.method7655(local64);
				}
				return;
			}
		}
		@Pc(117) boolean local117 = false;
		for (@Pc(122) Class20_Sub8 local122 = (Class20_Sub8) Static312.aClass349_8.method7653(); local122 != null; local122 = (Class20_Sub8) Static312.aClass349_8.method7660()) {
			if (arg0.anInt8787 >= local122.aClass20_Sub2_1.anInt8787) {
				Static392.method5596(local64, local122);
				local117 = true;
				break;
			}
		}
		if (!local117) {
			Static312.aClass349_8.method7655(local64);
		}
	}
}
