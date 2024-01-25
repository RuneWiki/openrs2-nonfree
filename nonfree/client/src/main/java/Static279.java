import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
	public static int anInt2976;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "[I")
	public static final int[] anIntArray258 = new int[1];

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_14 = new Class54(4, 5);

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "[I")
	public static final int[] anIntArray259 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "[I")
	public static int[] anIntArray261 = new int[2];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!os;I)Lclient!gk;")
	public static Class115 method2788(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(7) Class115 local7 = new Class115();
		local7.anInt3092 = arg0.method4494();
		local7.aClass1_Sub2_Sub11_1 = Static221.aClass41_1.method1404(local7.anInt3092);
		return local7;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)V")
	public static void method2789(@OriginalArg(1) int arg0) {
		Static9.anInt229 = arg0;
		Static39.anInt1113 = -1;
		Static360.anInt6507 = 3;
		Static486.anInt8594 = 100;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public static void method2790() {
		@Pc(12) Class1_Sub32 local12 = (Class1_Sub32) Static77.aClass295_9.method7543();
		@Pc(20) boolean local20 = Static360.aClass91_10 != null || Static462.anInt7983 > 0;
		if (local20) {
			Static121.anInt2501 = 1;
		}
		if (Static451.aBoolean585 && Static25.aClass241_1.method6303(81) && Static197.anInt4015 > 2) {
			if (local20) {
				Static32.aClass1_Sub25_1 = (Class1_Sub25) Static105.aClass295_10.aClass1_260.aClass1_284.aClass1_284;
			} else {
				Static318.method5462(local12.method5772(), (Class1_Sub25) Static105.aClass295_10.aClass1_260.aClass1_284.aClass1_284, local12.method5774());
			}
		} else if (local20) {
			Static32.aClass1_Sub25_1 = (Class1_Sub25) Static105.aClass295_10.aClass1_260.aClass1_284;
		} else {
			Static318.method5462(local12.method5772(), (Class1_Sub25) Static105.aClass295_10.aClass1_260.aClass1_284, local12.method5774());
		}
	}
}
