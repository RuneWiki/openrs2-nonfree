import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
	public static int anInt777;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!jk;")
	public static Class6_Sub27 aClass6_Sub27_1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lclient!vo;BI)V")
	public static void method786(@OriginalArg(0) Class381[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class381 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt10156 == 0) {
					if (local9.aClass381Array2 != null) {
						method786(local9.aClass381Array2, arg1);
					}
					@Pc(36) Class6_Sub25 local36 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local9.anInt10089);
					if (local36 != null) {
						Static490.method7251(arg1, local36.anInt5007);
					}
				}
				@Pc(56) Class6_Sub53 local56;
				if (arg1 == 0 && local9.anObjectArray20 != null) {
					local56 = new Class6_Sub53();
					local56.aClass381_11 = local9;
					local56.anObjectArray3 = local9.anObjectArray20;
					Static301.method4842(local56);
				}
				if (arg1 == 1 && local9.anObjectArray8 != null) {
					if (local9.anInt10112 >= 0) {
						@Pc(88) Class381 local88 = Static69.method899(local9.anInt10089);
						if (local88 == null || local88.aClass381Array1 == null || local88.aClass381Array1.length <= local9.anInt10112 || local88.aClass381Array1[local9.anInt10112] != local9) {
							continue;
						}
					}
					local56 = new Class6_Sub53();
					local56.anObjectArray3 = local9.anObjectArray8;
					local56.aClass381_11 = local9;
					Static301.method4842(local56);
				}
			}
		}
	}
}
