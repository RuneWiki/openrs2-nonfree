import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "[Lclient!r;")
	public static final Class174[] aClass174Array1 = new Class174[29];

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "F")
	public static float aFloat76 = 0.0F;

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
	public static int anInt4933 = 100;

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
	public static int anInt4935 = -1;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
	public static int anInt4936 = 0;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)V")
	public static void method4492(@OriginalArg(0) int arg0) {
		Static337.anInt6164 = arg0;
		@Pc(7) Class70 local7 = Static340.aClass70_19;
		synchronized (Static340.aClass70_19) {
			Static340.aClass70_19.method1399();
		}
		local7 = Static227.aClass70_76;
		synchronized (Static227.aClass70_76) {
			Static227.aClass70_76.method1399();
		}
		local7 = Static183.aClass70_61;
		synchronized (Static183.aClass70_61) {
			Static183.aClass70_61.method1399();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIB)V")
	public static void method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(20) int local20 = -arg2;
		Static14.method247(arg0 + arg2, arg1, Static11.anIntArrayArray11[arg3], arg0 - arg2);
		@Pc(35) int local35 = -1;
		while (local15 < local17) {
			local35 += 2;
			local15++;
			local20 += local35;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(61) int[] local61 = Static11.anIntArrayArray11[arg3 + local17];
				@Pc(68) int[] local68 = Static11.anIntArrayArray11[arg3 - local17];
				@Pc(73) int local73 = arg0 + local15;
				@Pc(78) int local78 = arg0 - local15;
				Static14.method247(local73, arg1, local61, local78);
				Static14.method247(local73, arg1, local68, local78);
			}
			@Pc(95) int local95 = arg0 + local17;
			@Pc(100) int local100 = arg0 - local17;
			@Pc(106) int[] local106 = Static11.anIntArrayArray11[arg3 + local15];
			@Pc(113) int[] local113 = Static11.anIntArrayArray11[arg3 - local15];
			Static14.method247(local95, arg1, local106, local100);
			Static14.method247(local95, arg1, local113, local100);
		}
	}
}
