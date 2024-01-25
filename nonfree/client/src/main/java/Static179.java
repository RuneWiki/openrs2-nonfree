import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
	public static int anInt3467;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!wv;")
	public static Class366 aClass366_1;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_41 = new Class303(67, 2);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V")
	public static void method3105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg0 * Static405.aClass3_Sub3_Sub1_1.anInt7553 >> 8;
		if (arg2 == -1 && !Static6.aBoolean1) {
			Static524.method7017();
		} else if (arg2 != -1 && (Static416.anInt7067 != arg2 || !Static580.method7784()) && local6 != 0 && !Static6.aBoolean1) {
			Static38.method622(arg2, Static287.aClass322_120, arg1, local6);
		}
		Static416.anInt7067 = arg2;
	}
}
