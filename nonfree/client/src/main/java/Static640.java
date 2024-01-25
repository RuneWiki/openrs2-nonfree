import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
	public static int anInt11082;

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
	public static int anInt11084;

	@OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
	public static int anInt11085;

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "Lclient!vb;")
	public static final Class368 aClass368_24 = new Class368(6, 4);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZB)Z")
	public static boolean method9474(@OriginalArg(0) boolean arg0) {
		@Pc(6) boolean local6 = Static607.aClass101_15.method8101();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static607.aClass101_15.method8125();
		} else if (!Static607.aClass101_15.method8070()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub15_1, arg0 ? 1 : 0);
			Static482.method7663();
			return true;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZLclient!of;)V")
	public static void method9476(@OriginalArg(2) Class2_Sub26_Sub3 arg0) {
		Static451.aClass34_2.method6325(arg0);
		Static601.method9018(Static472.aClass124_101, Static40.aClass124_9, Static437.aClass124_88, Static451.aClass34_2, arg0);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII)V")
	public static void method9477(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		Static278.aFloat108 = (float) local15;
		if (Static484.anInt8685 == 2) {
			Static152.anInt3290 = local15;
			Static550.anInt9633 = local11;
			Static297.anInt5413 = 0;
		}
		Static320.aFloat118 = (float) local11;
		Static27.method474();
		Static561.aBoolean715 = true;
	}
}
