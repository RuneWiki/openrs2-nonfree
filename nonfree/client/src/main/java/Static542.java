import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!tia", name = "l", descriptor = "I")
	public static int anInt9207;

	@OriginalMember(owner = "client!tia", name = "f", descriptor = "Lclient!ln;")
	public static final Class216 aClass216_15 = new Class216(10, 2, 2, 0);

	@OriginalMember(owner = "client!tia", name = "k", descriptor = "[I")
	public static final int[] anIntArray505 = new int[256];

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(B)V")
	public static void method7940() {
		@Pc(5) int local5 = 0;
		if (Static97.aClass5_Sub25_8.aClass6_Sub17_1.method5097() == 1) {
			local5 = 55;
		}
		if (Static97.aClass5_Sub25_8.aClass6_Sub16_1.method4732() == 0) {
			local5 |= 0x40;
		}
		Static82.method1380(local5);
		Static61.aClass246_7.method5489(local5);
		Static643.aClass275_2.method6640(local5);
		Static439.aClass92_2.method1920(local5);
		Static52.aClass10_1.method214(local5);
		Static176.method2706(local5);
		Static289.method4551(local5);
		Static145.method2129(local5);
		Static501.method7528(local5);
		Static608.method8684();
	}

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "(I)V")
	public static void method7942() {
		Static84.method1390();
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "([I[Ljava/lang/Object;B)V")
	public static void method7943(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static534.method7879(0, arg0, arg0.length - 1, arg1);
	}
}
