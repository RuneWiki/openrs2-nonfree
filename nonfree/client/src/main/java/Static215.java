import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hha", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BI[Lclient!sha;)V")
	public static void method3135(@OriginalArg(1) int arg0, @OriginalArg(2) Class321[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class321 local13 = arg1[local7];
			if (local13 != null) {
				if (local13.anInt9105 == 0) {
					if (local13.aClass321Array1 != null) {
						method3135(arg0, local13.aClass321Array1);
					}
					@Pc(37) Class6_Sub51 local37 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local13.anInt9040);
					if (local37 != null) {
						Static363.method5233(arg0, local37.anInt9360);
					}
				}
				@Pc(53) Class6_Sub49 local53;
				if (arg0 == 0 && local13.anObjectArray17 != null) {
					local53 = new Class6_Sub49();
					local53.aClass321_44 = local13;
					local53.anObjectArray35 = local13.anObjectArray17;
					Static295.method4226(local53);
				}
				if (arg0 == 1 && local13.anObjectArray24 != null) {
					if (local13.anInt9061 >= 0) {
						@Pc(76) Class321 local76 = Static286.method4134(local13.anInt9040);
						if (local76 == null || local76.aClass321Array1 == null || local13.anInt9061 >= local76.aClass321Array1.length || local13 != local76.aClass321Array1[local13.anInt9061]) {
							continue;
						}
					}
					local53 = new Class6_Sub49();
					local53.aClass321_44 = local13;
					local53.anObjectArray35 = local13.anObjectArray24;
					Static295.method4226(local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IILclient!ae;)Lclient!ho;")
	public static Class9 method3139(@OriginalArg(1) int arg0, @OriginalArg(2) Class8 arg1) {
		@Pc(10) Class9 local10 = (Class9) Static435.aClass10_43.method373((long) arg0);
		if (local10 == null) {
			if (Static222.aBoolean223) {
				local10 = Static546.aClass132_13.method7488(Static681.method2317(arg1, arg0), true);
			} else {
				local10 = Static377.method5355(arg1.method267(arg0));
			}
			Static435.aClass10_43.method366(local10, (long) arg0);
		}
		return local10;
	}
}
