import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "Lclient!us;")
	public static final Class344 aClass344_23 = new Class344(40, 3);

	@OriginalMember(owner = "client!cl", name = "O", descriptor = "Z")
	public static volatile boolean aBoolean147 = true;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[S)[S")
	public static short[] method1782(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static655.method6402(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZLclient!eq;)V")
	public static void method1784(@OriginalArg(1) Class33_Sub3 arg0) {
		@Pc(24) byte[] local24;
		if (Static514.anObject17 == null) {
			@Pc(17) Class43_Sub1_Sub2 local17 = new Class43_Sub1_Sub2();
			local24 = local17.method8137();
			Static514.anObject17 = Static368.method5897(local24);
		}
		if (Static153.anObject8 == null) {
			@Pc(35) Class43_Sub2_Sub1 local35 = new Class43_Sub2_Sub1();
			local24 = local35.method4551();
			Static153.anObject8 = Static368.method5897(local24);
		}
		@Pc(50) Class365 local50 = arg0.aClass365_1;
		if (local50.method8392() && Static192.anObject9 == null) {
			local24 = Static191.method3804(0.5F, 16.0F, 0.6F, 4.0F, 4.0F, new Class134_Sub1(419684));
			Static192.anObject9 = Static368.method5897(local24);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBIZIIII)V")
	public static void method1785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static552.aClass3_Sub48_30.aClass23_Sub8_2.method3378() != 0 && arg4 != 0 && Static224.anInt5125 < 50 && arg3 != -1) {
			Static620.aClass208Array1[Static224.anInt5125++] = new Class208((byte) 2, arg3, arg4, arg1, arg2, arg0, arg5, null);
		}
	}
}
