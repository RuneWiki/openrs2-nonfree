import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1445 = Static187.method3089("Prepared visibility map");

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1446 = Static187.method3089("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
	public static volatile int anInt3015 = -1;

	@OriginalMember(owner = "client!pg", name = "Db", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1449 = Static187.method3089("as it was used to break our rules)3");

	@OriginalMember(owner = "client!pg", name = "eb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1447 = aClass92_1449;

	@OriginalMember(owner = "client!pg", name = "ob", descriptor = "I")
	public static int anInt3029 = -1;

	@OriginalMember(owner = "client!pg", name = "tb", descriptor = "I")
	public static int anInt3034 = 0;

	@OriginalMember(owner = "client!pg", name = "Cb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1448 = aClass92_1445;

	@OriginalMember(owner = "client!pg", name = "Eb", descriptor = "[I")
	public static final int[] anIntArray273 = new int[5];

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)Lclient!lg;")
	public static Class1_Sub3_Sub16 method2239(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub16 local10 = (Class1_Sub3_Sub16) Static108.aClass47_18.method1281((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static106.aClass3_19.method3265(5, arg0);
		local10 = new Class1_Sub3_Sub16();
		if (local25 != null) {
			local10.method1702(new Class1_Sub14(local25));
		}
		Static108.aClass47_18.method1273((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBIIII)V")
	public static void method2248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg1 - 32) * arg1 / arg2;
		if (local11 < 8) {
			local11 = 8;
		}
		Static56.aClass1_Sub3_Sub1_Sub5Array3[0].method3183(arg0, arg4);
		Static56.aClass1_Sub3_Sub1_Sub5Array3[1].method3183(arg0, arg4 + arg1 - 16);
		@Pc(51) int local51 = (arg1 - local11 - 32) * arg3 / (arg2 - arg1);
		Static46.method3173(arg0, arg4 + 16, 16, arg1 - 32, Static142.anInt2830);
		Static46.method3173(arg0, local51 + arg4 + 16, 16, local11, Static82.anInt1826);
		Static46.method3158(arg0, local51 + arg4 + 16, local11, Static205.anInt4446);
		Static46.method3158(arg0 + 1, local51 + (arg4 - -16), local11, Static205.anInt4446);
		Static46.method3162(arg0, local51 + arg4 + 16, 16, Static205.anInt4446);
		Static46.method3162(arg0, local51 + arg4 + 17, 16, Static205.anInt4446);
		Static46.method3158(arg0 + 15, local51 + (arg4 - -16), local11, Static180.anInt4484);
		Static46.method3158(arg0 + 14, arg4 + 17 - -local51, local11 - 1, Static180.anInt4484);
		Static46.method3162(arg0, local51 + arg4 + local11 + 15, 16, Static180.anInt4484);
		Static46.method3162(arg0 + 1, local11 + 14 + arg4 + local51, 15, Static180.anInt4484);
	}
}
