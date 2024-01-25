import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!st", name = "w", descriptor = "I")
	public static int anInt6885;

	@OriginalMember(owner = "client!st", name = "j", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_179 = new Class158("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([BBII)[B")
	public static byte[] method5230(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static469.method6021(arg0, arg1, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)V")
	public static void method5232() {
		Static118.method2017(10);
		Static209.method3318();
		System.gc();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!ia;I)Lclient!gf;")
	public static Class90_Sub1 method5233(@OriginalArg(0) Class1_Sub3 arg0) {
		return new Class90_Sub1(arg0.method1215(), arg0.method1215(), arg0.method1215(), arg0.method1215(), arg0.method1226(), arg0.method1226(), arg0.method1171());
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!ou;I)V")
	public static void method5237(@OriginalArg(0) Class30_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class30_Sub1_Sub1_Sub1) {
			@Pc(5) Class30_Sub1_Sub1_Sub1 local5 = (Class30_Sub1_Sub1_Sub1) arg0;
			if (local5.aClass11_1 != null) {
				Static454.method6161(local5.aByte102 != Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102, local5);
			}
		} else if (arg0 instanceof Class30_Sub1_Sub1_Sub2) {
			@Pc(31) Class30_Sub1_Sub1_Sub2 local31 = (Class30_Sub1_Sub1_Sub2) arg0;
			Static15.method166(local31, local31.aByte102 != Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102);
		}
	}
}
