import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!vf;")
	public static Class1_Sub24_Sub3 aClass1_Sub24_Sub3_1;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	public static int anInt3912;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
	public static int anInt3910 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Z")
	public static boolean method3266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(22) Class71 local22 = Static255.method4052(arg0);
		return local22.method2040(arg1);
	}
}
