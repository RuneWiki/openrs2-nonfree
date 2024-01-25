import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
	public static int anInt5050 = -1;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Z")
	public static boolean aBoolean338 = false;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "Z")
	public static boolean aBoolean339 = true;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "[Lclient!sd;")
	public static final Class10_Sub3_Sub3_Sub1[] aClass10_Sub3_Sub3_Sub1Array1 = new Class10_Sub3_Sub3_Sub1[32768];

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
	public static int anInt5054 = -1;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4534(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class14_Sub2_Sub13 local16 = Static1.method5711(2, arg1);
		local16.method3540();
		local16.aString132 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Lclient!jg;Z)I")
	public static int method4535(@OriginalArg(0) String arg0, @OriginalArg(1) Class14_Sub4 arg1) {
		@Pc(6) int local6 = arg1.anInt2637;
		@Pc(17) byte[] local17 = Static352.method5923(arg0);
		arg1.method2521(local17.length);
		arg1.anInt2637 += Static56.aClass218_1.method5921(local17, 0, local17.length, arg1.aByteArray74, arg1.anInt2637);
		return arg1.anInt2637 - local6;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)V")
	public static void method4536(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static126.method2624(arg1)) {
			Static66.method1648(arg0, Static182.aClass146ArrayArray1[arg1]);
		}
	}
}
