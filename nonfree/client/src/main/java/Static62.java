import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
	public static int anInt1302;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_433 = Static151.method2243("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!mb;")
	public static Class62 aClass62_431 = aClass62_433;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "[Lclient!og;")
	public static final Class7_Sub2_Sub2[] aClass7_Sub2_Sub2Array1 = new Class7_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_432 = Static151.method2243("Click to switch");

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_435 = Static151.method2243("Take");

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Lclient!mb;")
	public static Class62 aClass62_434 = aClass62_435;

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "Lclient!mb;")
	public static Class62 aClass62_436 = aClass62_432;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
	public static final int[] anIntArray102 = new int[5];

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array33 = new Class62[200];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([BB)V")
	public static void method861(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub11 local10 = new Class2_Sub11(arg0);
		@Pc(14) int local14 = local10.method1557();
		for (@Pc(20) int local20 = 0; local20 < local14; local20++) {
			@Pc(26) Class2_Sub10 local26 = new Class2_Sub10();
			@Pc(30) Class62 local30 = local10.method1538();
			local26.anInt2040 = local10.method1557();
			local26.anInt2038 = local10.method1557();
			local26.anInt2039 = local10.method1534();
			local26.aClass62_721 = local30.method1844();
			local26.aClass62Array63 = local30.method1839(47);
			Static125.aClass13_8.method304(local26);
		}
	}
}
