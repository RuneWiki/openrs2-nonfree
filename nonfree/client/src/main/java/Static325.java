import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_132 = new Class163(22, 3);

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	public static int anInt5446 = 0;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "Lclient!wh;")
	public static final Class267 aClass267_2 = new Class267("LIVE", 0);

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "Lclient!ps;")
	public static final Class193 aClass193_54 = new Class193();

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBLclient!ga;)Ljava/lang/String;")
	public static String method4505(@OriginalArg(0) int arg0, @OriginalArg(2) Class82 arg1) {
		if (!Static54.method1060(arg1).method5457(arg0) && arg1.anObjectArray9 == null) {
			return null;
		} else if (arg1.aStringArray13 == null || arg1.aStringArray13.length <= arg0 || arg1.aStringArray13[arg0] == null || arg1.aStringArray13[arg0].trim().length() == 0) {
			return Static64.aBoolean82 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray13[arg0];
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ga;ZI)V")
	public static void method4506(@OriginalArg(0) Class82 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt2242 == 0 ? arg0.anInt2192 : arg0.anInt2242;
		@Pc(24) int local24 = arg0.anInt2249 == 0 ? arg0.anInt2216 : arg0.anInt2249;
		Static343.method4798(arg0.anInt2208, local15, Static298.aClass82ArrayArray2[arg0.anInt2208 >> 16], local24, arg1);
		if (arg0.aClass82Array1 != null) {
			Static343.method4798(arg0.anInt2208, local15, arg0.aClass82Array1, local24, arg1);
		}
		@Pc(66) Class3_Sub10 local66 = (Class3_Sub10) Static32.aClass140_5.method3490((long) arg0.anInt2208);
		if (local66 != null) {
			Static162.method2550(local24, arg1, local15, local66.anInt827);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "()V")
	public static void method4507() {
		for (@Pc(1) int local1 = 0; local1 < Static17.anInt290; local1++) {
			@Pc(6) Class1_Sub2 local6 = Static424.aClass1_Sub2Array3[local1];
			Static429.method5842(local6);
			Static424.aClass1_Sub2Array3[local1] = null;
		}
		Static17.anInt290 = 0;
	}
}
