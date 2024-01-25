import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cp", name = "P", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!cp", name = "N", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_30 = new Class133(39, -2);

	@OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
	public static int anInt1507 = -1;

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
	public static void method1370() {
		Static278.method4791(Static364.aClass158_88);
		Static515.aClass3_Sub27_Sub1_2.method7600(Static22.anInt8151, 30364);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ICI)I")
	public static int method1371(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local12 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local12 = 1762;
		}
		return local12;
	}
}
