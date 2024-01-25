import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static144 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
	public static int anInt2710 = 0;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lclient!bd;")
	public static Class23_Sub1 method2280(@OriginalArg(0) int arg0) {
		return Static52.aBoolean58 && Static374.anInt6249 <= arg0 && Static382.anInt6411 >= arg0 ? Static135.aClass23_Sub1Array2[arg0 - Static374.anInt6249] : null;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!qq;I)V")
	public static void method2281(@OriginalArg(0) Class198 arg0) {
		Static261.aClass198_1 = arg0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!pl;)V")
	public static void method2283(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1) {
		Static337.aClass7Array3[arg0] = arg1;
	}
}
