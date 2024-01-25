import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "Lclient!br;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "Lclient!ko;")
	public static final Class142 aClass142_8 = new Class142();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)Lclient!fr;")
	public static Class91 method500(@OriginalArg(1) int arg0) {
		@Pc(10) Class91 local10 = (Class91) Static11.aClass151_9.method3288((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static330.aClass109_75.method2349(0, arg0);
		local10 = new Class91();
		if (local20 != null) {
			local10.method1801(arg0, new Class1_Sub14(local20));
		}
		Static11.aClass151_9.method3291((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)I")
	public static int method501(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static201.method3104(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!ti;)Lclient!ii;")
	public static Class9_Sub3 method504(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class9_Sub3(arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4496(), arg0.method4548());
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!iv;)V")
	public static void method506(@OriginalArg(1) Class1_Sub21 arg0) {
		if (Static131.aClass137ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface11 local8 = null;
		if (arg0.anInt3374 == 0) {
			local8 = (Interface11) Static208.method3165(arg0.anInt3378, arg0.anInt3367, arg0.anInt3366);
		}
		if (arg0.anInt3374 == 1) {
			local8 = (Interface11) Static170.method2638(arg0.anInt3378, arg0.anInt3367, arg0.anInt3366);
		}
		if (arg0.anInt3374 == 2) {
			local8 = (Interface11) Static286.method3918(arg0.anInt3378, arg0.anInt3367, arg0.anInt3366, rq.class);
		}
		if (arg0.anInt3374 == 3) {
			local8 = (Interface11) Static112.method1764(arg0.anInt3378, arg0.anInt3367, arg0.anInt3366);
		}
		if (local8 == null) {
			arg0.anInt3377 = 0;
			arg0.anInt3379 = 0;
			arg0.anInt3380 = -1;
		} else {
			arg0.anInt3380 = local8.method5744();
			arg0.anInt3379 = local8.method5747();
			arg0.anInt3377 = local8.method5742();
		}
	}
}
