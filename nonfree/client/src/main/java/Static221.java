import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_29 = new Class179(0, -1);

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	public static int anInt2659 = -1;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_88 = new Class107(95, 2);

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_89 = new Class107(56, 6);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!cf;Lclient!cf;Z)V")
	public static void method2301(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg0.aClass1_262 != null) {
			arg0.method6020();
		}
		arg0.aClass1_262 = arg1.aClass1_262;
		arg0.aClass1_261 = arg1;
		arg0.aClass1_262.aClass1_261 = arg0;
		arg0.aClass1_261.aClass1_262 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ag;)V")
	public static void method2304(@OriginalArg(1) Class4_Sub1 arg0) {
		arg0.aClass31_1 = null;
		@Pc(10) int local10 = arg0.aClass4_Sub5Array1.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			arg0.aClass4_Sub5Array1[local12].aBoolean227 = false;
		}
		@Pc(25) Class141[] local25 = Class1_Sub4_Sub10.aClass141Array1;
		synchronized (Class1_Sub4_Sub10.aClass141Array1) {
			if (local10 < Class1_Sub4_Sub10.aClass141Array1.length && Static455.anIntArray659[local10] < 200) {
				Class1_Sub4_Sub10.aClass141Array1[local10].method3356(arg0);
				@Pc(52) int local52 = Static455.anIntArray659[local10]++;
			}
		}
	}
}
