import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "[Lclient!ks;")
	public static final Class47_Sub2_Sub3_Sub2[] aClass47_Sub2_Sub3_Sub2Array1 = new Class47_Sub2_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "Z")
	public static boolean aBoolean549 = false;

	@OriginalMember(owner = "client!tu", name = "l", descriptor = "Lclient!h;")
	public static final Class114 aClass114_154 = new Class114("Loaded HW3D", "HW3D geladen", "HW3D chargé", "HW3D carregado");

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)V")
	public static void method6884(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(3, arg0);
		local8.method4925();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([Ljava/lang/String;B[S)V")
	public static void method6886(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static245.method4146(arg1, arg0.length - 1, 0, arg0);
	}
}
