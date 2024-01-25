import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!cw;")
	public static Class45 aClass45_3;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!l;")
	public static Class95 aClass95_9;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!up;")
	public static final Class250 aClass250_13 = new Class250(3, 15);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
	public static void method2870(@OriginalArg(1) int arg0) {
		Static69.anInt3210 = arg0;
		@Pc(7) Class137 local7 = Static31.aClass137_5;
		synchronized (Static31.aClass137_5) {
			Static31.aClass137_5.method2739();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZBI[ILclient!ug;)Lclient!nq;")
	public static Class65_Sub2_Sub1 method2874(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) Class135_Sub2 arg3) {
		if (arg3.aBoolean473 || Static280.method3692(arg0) && Static280.method3692(arg1)) {
			return new Class65_Sub2_Sub1(arg3, 3553, arg0, arg1, false, arg2);
		} else if (arg3.aBoolean479) {
			return new Class65_Sub2_Sub1(arg3, 34037, arg0, arg1, false, arg2);
		} else {
			return new Class65_Sub2_Sub1(arg3, arg0, arg1, Static171.method2382(arg0), Static171.method2382(arg1), arg2);
		}
	}
}
