import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Lclient!qba;")
	public static Class259 aClass259_1;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "[Lclient!pu;")
	public static Class255[] aClass255Array1;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "Lclient!fc;")
	public static Class98 aClass98_28;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_22 = new Class316(32, -1);

	@OriginalMember(owner = "client!du", name = "h", descriptor = "Z")
	public static boolean aBoolean128 = false;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)Z")
	public static boolean method1702(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!jr;B)Lclient!ks;")
	public static Class65_Sub3 method1703(@OriginalArg(0) Class6_Sub12 arg0) {
		@Pc(7) Class65 local7 = Static4.method73(arg0);
		@Pc(11) int local11 = arg0.method6044();
		@Pc(23) int local23 = arg0.method6044();
		@Pc(27) int local27 = arg0.method6044();
		@Pc(31) int local31 = arg0.method6044();
		@Pc(35) int local35 = arg0.method6044();
		@Pc(39) int local39 = arg0.method6044();
		return new Class65_Sub3(local7.aClass114_6, local7.aClass72_6, local7.anInt4922, local7.anInt4923, local7.anInt4919, local7.anInt4916, local7.anInt4917, local11, local23, local27, local31, local35, local39);
	}
}
