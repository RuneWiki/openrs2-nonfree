import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	public static int anInt12 = 0;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString1 = "purple:";

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method11() {
		Static206.anInt4322 = -1;
		Static38.anInt3168 = 0;
		Static307.anInt6146 = -1;
		Static14.anInt229 = -1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fb;Lclient!fb;I)V")
	public static void method13(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg0.aClass1_248 != null) {
			arg0.method5796();
		}
		arg0.aClass1_248 = arg1.aClass1_248;
		arg0.aClass1_247 = arg1;
		arg0.aClass1_248.aClass1_247 = arg0;
		arg0.aClass1_247.aClass1_248 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Lclient!il;")
	public static Class107 method14(@OriginalArg(0) int arg0) {
		@Pc(17) Class107 local17 = (Class107) Static25.aClass37_11.method915((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static192.aClass134_91.method3009(arg0, 1);
		local17 = new Class107();
		if (local27 != null) {
			local17.method2204(new Class1_Sub21(local27), arg0);
		}
		Static25.aClass37_11.method922((long) arg0, local17);
		return local17;
	}
}
