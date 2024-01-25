import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "F")
	public static float aFloat93;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!naa;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "[I")
	public static final int[] anIntArray351 = new int[200];

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)Z")
	public static boolean method4280(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBLclient!wn;)V")
	public static void method4282(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22_Sub2 arg1) {
		Static31.aBoolean57 = false;
		Static620.anInt9966 = 0;
		Static356.method4779(arg1);
		Static200.method2849(arg1);
		if (Static31.aBoolean57) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt10247 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt10247 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)I")
	public static int method4287() {
		@Pc(7) Class95 local7 = Static192.aClass95_4;
		@Pc(9) boolean local9 = false;
		if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() != 0) {
			@Pc(20) Canvas local20 = new Canvas();
			local20.setSize(100, 100);
			local9 = true;
			local7 = Static562.method7703(0, 0, null, local20, null);
		}
		@Pc(37) long local37 = Static476.method6413();
		for (@Pc(44) int local44 = 0; local44 < 10000; local44++) {
			local7.method6927();
		}
		@Pc(71) int local71 = (int) (Static476.method6413() - local37);
		local7.method6936(100, 100, 0, -16777216, 0);
		if (local9) {
			local7.method6930();
		}
		return local71;
	}
}
