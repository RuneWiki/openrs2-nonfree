import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
	public static int anInt1296;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "Lclient!rc;")
	public static Class2_Sub2_Sub16 aClass2_Sub2_Sub16_1;

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
	public static int anInt1299;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
	public static int anInt1300;

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "Lclient!ca;")
	public static Class16 aClass16_1 = new Class16(30);

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "Lclient!i;")
	public static Class41 aClass41_373 = Static184.method2923("sl_arrows");

	@OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
	public static int anInt1295 = 0;

	@OriginalMember(owner = "client!eb", name = "Y", descriptor = "Lclient!i;")
	public static Class41 aClass41_374 = Static184.method2923("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!nb;Lclient!nb;)V")
	public static void method899(@OriginalArg(1) Class15 arg0, @OriginalArg(2) Class15 arg1) {
		Static185.aClass15_39 = arg0;
		Static152.aClass15_32 = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!nb;II)Z")
	public static boolean method900(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) byte[] local21 = arg0.method387(arg2, arg1);
		if (local21 == null) {
			return false;
		} else {
			Static216.method3293(local21);
			return true;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = 2048 - arg2 & 0x7FF;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = arg4;
		@Pc(28) int local28 = 2048 - arg3 & 0x7FF;
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (local28 != 0) {
			local34 = Class79.anIntArray377[local28];
			local38 = Class79.anIntArray375[local28];
			local19 = local34 * -arg4 >> 16;
			local21 = local38 * arg4 >> 16;
		}
		if (local10 != 0) {
			local34 = Class79.anIntArray377[local10];
			local38 = Class79.anIntArray375[local10];
			local17 = local21 * local34 >> 16;
			local21 = local38 * local21 >> 16;
		}
		Static94.anInt2320 = arg1 - local19;
		Static69.anInt1817 = arg0 - local17;
		Static163.anInt3822 = arg6 - local21;
		Static152.anInt3512 = arg2;
		Static183.anInt1325 = arg3;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public static void method904() {
		if (Static39.aClass11_1 != null) {
			@Pc(3) Class11 local3 = Static39.aClass11_1;
			synchronized (Static39.aClass11_1) {
				Static39.aClass11_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	public static void method905() {
		if (!Static9.aBoolean16) {
			return;
		}
		@Pc(15) Class80 local15 = Static34.method675(Static31.anInt811, Static15.anInt425);
		if (local15 != null && local15.anObjectArray13 != null) {
			@Pc(24) Class2_Sub5 local24 = new Class2_Sub5();
			local24.aClass80_3 = local15;
			local24.anObjectArray3 = local15.anObjectArray13;
			Static176.method2835(local24);
		}
		Static9.aBoolean16 = false;
		Static176.method2833(local15);
	}
}
