import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "I")
	public static int anInt1366 = 0;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I[Lclient!vg;I)V")
	public static void method1205(@OriginalArg(0) int arg0, @OriginalArg(1) Class341[] arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg1.length; local10++) {
			@Pc(16) Class341 local16 = arg1[local10];
			if (local16 != null) {
				if (local16.anInt9309 == 0) {
					if (local16.aClass341Array2 != null) {
						method1205(arg0, local16.aClass341Array2);
					}
					@Pc(37) Class1_Sub44 local37 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local16.anInt9306);
					if (local37 != null) {
						Static474.method7346(arg0, local37.anInt7685);
					}
				}
				@Pc(53) Class1_Sub15 local53;
				if (arg0 == 0 && local16.anObjectArray27 != null) {
					local53 = new Class1_Sub15();
					local53.aClass341_10 = local16;
					local53.anObjectArray1 = local16.anObjectArray27;
					Static80.method1451(local53);
				}
				if (arg0 == 1 && local16.anObjectArray29 != null) {
					if (local16.anInt9270 >= 0) {
						@Pc(78) Class341 local78 = Static350.method4758(local16.anInt9306);
						if (local78 == null || local78.aClass341Array2 == null || local78.aClass341Array2.length <= local16.anInt9270 || local16 != local78.aClass341Array2[local16.anInt9270]) {
							continue;
						}
					}
					local53 = new Class1_Sub15();
					local53.aClass341_10 = local16;
					local53.anObjectArray1 = local16.anObjectArray29;
					Static80.method1451(local53);
				}
			}
		}
	}
}
