import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!rg;")
	public static Class310 aClass310_100;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "Lclient!tja;")
	public static Class350 aClass350_9;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public static int anInt8633;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_214 = new Class160(100, -1);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBI)Z")
	public static boolean method7459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static7.method105(arg1, arg0)) {
			return Static585.method8347(arg1, arg0) | (arg1 & 0xB000) != 0 | Static595.method8430(arg1, arg0) ? true : (arg0 & 0x37) == 0 & (Static511.method7646(arg0, arg1) | Static357.method5429(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method7461() {
		Static226.anIntArray312 = null;
		Static601.anIntArray534 = null;
		Static666.anIntArray584 = null;
		Static130.anIntArray134 = null;
		Static283.anIntArray290 = null;
		Static332.aBoolean410 = false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public static void method7462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class14_Sub2_Sub9 local16 = Static499.method7527((long) arg1, 17);
		local16.method4004();
		local16.anInt4595 = arg0;
	}
}
