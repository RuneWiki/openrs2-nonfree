import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	public static int anInt8224;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Lclient!pl;")
	public static Class259 aClass259_150;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_142 = new Class286(62, -1);

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
	public static int anInt8225 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ks;II)V")
	public static void method6807(@OriginalArg(0) Class2_Sub15_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static572.anInt9306 = 0;
		Static232.aBoolean351 = false;
		Static49.method819(arg0);
		Static152.method2475(arg0);
		if (Static232.aBoolean351) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt5241 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt5241 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
	public static void method6810() {
		@Pc(12) Class2_Sub42 local12 = Static249.method3910(Static545.aClass286_155, Static400.aClass145_2);
		local12.aClass2_Sub15_Sub2_2.method4350(Static444.anInt7770);
		Static531.method7296(local12);
	}
}
