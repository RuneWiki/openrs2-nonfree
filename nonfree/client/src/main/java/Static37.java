import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!be", name = "i", descriptor = "I")
	public static int anInt839;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_12 = new Class180(49, -2);

	@OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
	public static final int[] anIntArray72 = new int[32];

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public static int anInt840 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)Lclient!cha;")
	public static Class59 method940(@OriginalArg(0) int arg0) {
		@Pc(10) Class59 local10 = (Class59) Static160.aClass165_21.method4389((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static71.aClass15_20.method517(arg0, 1);
		local10 = new Class59();
		local10.anInt1344 = arg0;
		if (local20 != null) {
			local10.method1381(new Class3_Sub25(local20));
		}
		local10.method1375();
		if (local10.anInt1355 == 2 && Static672.aClass83_47.method2368((long) arg0) == null) {
			Static672.aClass83_47.method2377((long) arg0, new Class3_Sub33(Static201.anInt3959));
			Static178.aClass59Array1[Static201.anInt3959++] = local10;
		}
		Static160.aClass165_21.method4392(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!or;B)V")
	public static void method942(@OriginalArg(0) Class260 arg0) {
		if (!Static624.aBoolean698) {
			return;
		}
		if (arg0.anObjectArray6 != null) {
			@Pc(18) Class260 local18 = Static245.method4101(Static531.anInt8767, Static287.anInt4913);
			if (local18 != null) {
				@Pc(24) Class3_Sub17 local24 = new Class3_Sub17();
				local24.anObjectArray2 = arg0.anObjectArray6;
				local24.aClass260_5 = local18;
				local24.aClass260_6 = arg0;
				Static565.method8015(local24);
			}
		}
		@Pc(46) Class3_Sub34 local46 = Static172.method3123(Static163.aClass375_1, Static114.aClass218_24);
		local46.aClass3_Sub25_Sub1_2.method8588(arg0.anInt6930);
		local46.aClass3_Sub25_Sub1_2.method8630(Static531.anInt8767);
		local46.aClass3_Sub25_Sub1_2.method8649(arg0.anInt6964);
		local46.aClass3_Sub25_Sub1_2.method8596(Static287.anInt4913);
		local46.aClass3_Sub25_Sub1_2.method8596(Static658.anInt10730);
		local46.aClass3_Sub25_Sub1_2.method8597(arg0.anInt6985);
		Static441.method6275(local46);
	}
}
