import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "[Lclient!xa;")
	public static Class4[] aClass4Array4;

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "Lclient!jv;")
	public static final Class165 aClass165_4 = new Class165(5, 1);

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(FIIIIZIII)[[I")
	public static int[][] method2252(@OriginalArg(0) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class6_Sub3_Sub30 local13 = new Class6_Sub3_Sub30();
		local13.aBoolean527 = false;
		local13.anInt7726 = (int) (arg0 * 4096.0F);
		local13.anInt7727 = 3;
		local13.anInt7734 = 8;
		local13.anInt7733 = 4;
		local13.method7832();
		Static261.method3651(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method6388(local9[local40], local40);
		}
		return local9;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
	public static void method2254() {
		aClient1.method842();
		Static218.aClass6_Sub14_Sub2_1.anInt7244 = 0;
		Static105.anInt1967 = 0;
		Static142.aClass40_65 = null;
		Static418.anInt7398 = 0;
		Static420.aClass6_Sub14_Sub2_2.anInt7244 = 0;
		Static218.aClass40_86 = null;
		Static163.aClass40_71 = null;
		Static5.method121();
		Static483.aString100 = null;
		Static300.anInt4872 = 0;
		Static469.anInt7945 = 0;
		Static163.anInt2861 = 0;
		Static296.aClass153Array3 = null;
	}
}
