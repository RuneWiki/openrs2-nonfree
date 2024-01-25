import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "Lclient!xa;")
	public static Class71 aClass71_5;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
	public static int anInt582;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_8 = new Class98(67, -2);

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
	public static int anInt577 = -1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
	public static void method501(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub5_Sub8 local12 = Static49.method760(14, arg0);
		local12.method3257();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!uea;)V")
	public static void method502(@OriginalArg(1) Class15_Sub2_Sub4_Sub2 arg0) {
		@Pc(19) Class6_Sub34 local19 = (Class6_Sub34) Static149.aClass234_31.method5464((long) arg0.anInt8924);
		if (local19 == null) {
			return;
		}
		if (local19.aClass6_Sub15_Sub2_3 != null) {
			Static204.aClass6_Sub15_Sub1_1.method2421(local19.aClass6_Sub15_Sub2_3);
			local19.aClass6_Sub15_Sub2_3 = null;
		}
		local19.method7948();
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(Z)I")
	public static int method504() {
		@Pc(7) Class90 local7 = Static554.aClass90_12;
		@Pc(9) boolean local9 = false;
		if (Static79.anInt2700 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local7 = Static359.method7473(0, local15, 0, null, null);
			local9 = true;
		}
		@Pc(32) long local32 = Static416.method5922();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method7512();
		}
		@Pc(61) int local61 = (int) (Static416.method5922() - local32);
		local7.method7482(0, -16777216, 100, 100, 0);
		if (local9) {
			local7.method7462();
		}
		return local61;
	}
}
