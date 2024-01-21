import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!ga;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "Lclient!lh;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_486 = Static177.method3050("mapscene");

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_488 = Static177.method3050("To create a new account you need to");

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!jd;")
	public static Class46 aClass46_487 = aClass46_488;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
	public static final int[] anIntArray124 = new int[50];

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
	public static int anInt1275 = 0;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "[Lclient!h;")
	public static final Class4_Sub11[] aClass4_Sub11Array1 = new Class4_Sub11[2048];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method953() {
		Static175.aClass4_Sub2_Sub4_2.method2806();
		Static140.aClass62_35 = null;
		Static71.anInt1861 = 1;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!nh;I)Lclient!rf;")
	public static Class4_Sub1_Sub7_Sub2 method955(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return Static178.method3063(arg0, arg1) ? Static126.method2228() : null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Lclient!ch;")
	public static Class4_Sub1_Sub5 method958(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub5 local10 = (Class4_Sub1_Sub5) Static17.aClass66_8.method2225((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static33.aClass62_9.method2878(16, arg0);
		local10 = new Class4_Sub1_Sub5();
		if (local20 != null) {
			local10.method413(new Class4_Sub11(local20));
		}
		Static17.aClass66_8.method2222(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([BI)[B")
	public static byte[] method960(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static189.method187(arg0, 0, local14, 0, local11);
		return local14;
	}
}
