import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "J")
	public static long aLong5;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "[[[Lclient!no;")
	public static Class169[][][] aClass169ArrayArrayArray1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "[Lclient!ug;")
	public static final Class1_Sub28[] aClass1_Sub28Array1 = new Class1_Sub28[2048];

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_1 = new Class119("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)V")
	public static void method89(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static78.anInt3523 = arg1 - Static167.anInt2089;
		Static222.anInt3998 = arg0 - Static167.anInt2099;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public static void method90(@OriginalArg(1) int arg0) {
		Static379.anInt6356 = arg0;
		@Pc(7) Class102 local7 = Static394.aClass102_53;
		synchronized (Static394.aClass102_53) {
			Static394.aClass102_53.method2271();
		}
	}
}
