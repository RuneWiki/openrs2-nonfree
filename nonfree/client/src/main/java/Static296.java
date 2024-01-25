import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ss", name = "y", descriptor = "Lclient!nq;")
	public static Class144 aClass144_94;

	@OriginalMember(owner = "client!ss", name = "v", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_53 = new Class26(4);

	@OriginalMember(owner = "client!ss", name = "w", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_99 = new Class117("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ss", name = "z", descriptor = "[I")
	public static final int[] anIntArray484 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILclient!km;I)V")
	public static void method4894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67_Sub3_Sub3_Sub1 arg2) {
		if (arg2.anInt5013 == arg0 && arg0 != -1) {
			@Pc(75) Class111 local75 = Static306.method5143(arg0);
			@Pc(78) int local78 = local75.anInt2720;
			if (local78 == 1) {
				arg2.anInt5001 = arg1;
				arg2.anInt5060 = 0;
				arg2.anInt5005 = 0;
				arg2.anInt5015 = 1;
				arg2.anInt5000 = 0;
				Static354.method5681(arg2.anInt6310, arg2.anInt6308, local75, false, arg2.anInt5060);
			}
			if (local78 == 2) {
				arg2.anInt5000 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt5013 == -1 || Static306.method5143(arg0).anInt2716 >= Static306.method5143(arg2.anInt5013).anInt2716) {
			arg2.anInt5005 = 0;
			arg2.anInt5000 = 0;
			arg2.anInt5001 = arg1;
			arg2.anInt5015 = 1;
			arg2.anInt5013 = arg0;
			arg2.anInt5063 = arg2.anInt5074;
			arg2.anInt5060 = 0;
			if (arg2.anInt5013 != -1) {
				Static354.method5681(arg2.anInt6310, arg2.anInt6308, Static306.method5143(arg2.anInt5013), false, arg2.anInt5060);
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIII)V")
	public static void method4896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class11_Sub4_Sub12 local13 = Static35.method512(4, arg2);
		local13.method3858();
		local13.anInt4388 = arg1;
		local13.anInt4390 = arg3;
		local13.anInt4398 = arg0;
	}
}
