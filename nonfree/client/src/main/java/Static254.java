import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!pq;")
	public static Class251 aClass251_75;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lclient!pca;")
	public static Class242 method3577(@OriginalArg(1) int arg0) {
		@Pc(10) Class242 local10 = (Class242) Static156.aClass332_70.method7502((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = aClass251_75.method5860(0, arg0);
		local10 = new Class242();
		if (local20 != null) {
			local10.method5526(new Class6_Sub14(local20));
		}
		local10.method5530();
		Static156.aClass332_70.method7498((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIII)V")
	public static void method3586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg2, 10);
		local8.method776();
		local8.anInt979 = arg3;
		local8.anInt974 = arg1;
		local8.anInt972 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FI)F")
	public static float method3588(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}
}
