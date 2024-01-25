import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "F")
	public static float aFloat176;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	public static int anInt6422;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Lclient!em;")
	public static final Class83 aClass83_135 = new Class83(68, 0);

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
	public static int anInt6424 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
	public static void method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static120.anInt2491 && arg0 <= Static71.anInt1350) {
			@Pc(28) int local28 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1);
			@Pc(34) int local34 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg2);
			Static92.method1403(local34, local28, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method5201(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub8_Sub9 local10 = Static465.method6470(arg0, 14);
		local10.method4835();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!cr;IIZILclient!da;)V")
	public static void method5202(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class52 arg4) {
		if (arg4 != null) {
			arg0.method1173(arg2, arg3, arg4.KA(), arg4.OA(), arg4.H(), arg4.za(), arg4.l(), arg4.K(), arg1, arg4.J());
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBI)Z")
	public static boolean method5204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
