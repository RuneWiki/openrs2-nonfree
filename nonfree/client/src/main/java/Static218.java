import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!kr", name = "x", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kr", name = "B", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_150 = new Class184(65, -2);

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V")
	public static void method3482() {
		for (@Pc(8) Class3_Sub38 local8 = (Class3_Sub38) Static374.aClass229_41.method5328(); local8 != null; local8 = (Class3_Sub38) Static374.aClass229_41.method5325()) {
			if (method3489(local8.anInt6532)) {
				Static35.method4620(local8);
			}
		}
		if (Static169.anInt3551 == 1) {
			Static378.aBoolean462 = false;
			Static63.method5248(Static318.anInt3229, Static153.anInt3319, Static67.anInt1556, Static283.anInt5203);
			return;
		}
		Static63.method5248(Static318.anInt3229, Static153.anInt3319, Static67.anInt1556, Static283.anInt5203);
		@Pc(49) int local49 = Static222.aClass179_10.method4385(Static309.aClass175_185.method4201(Static216.anInt4257));
		for (@Pc(54) Class3_Sub38 local54 = (Class3_Sub38) Static374.aClass229_41.method5328(); local54 != null; local54 = (Class3_Sub38) Static374.aClass229_41.method5325()) {
			@Pc(59) int local59 = Static180.method3067(local54);
			if (local49 < local59) {
				local49 = local59;
			}
		}
		Static283.anInt5203 = local49 + 8;
		Static318.anInt3229 = Static169.anInt3551 * 16 + (Static126.aBoolean275 ? 26 : 22);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Z")
	private static boolean method3489(@OriginalArg(0) int arg0) {
		return arg0 == 18 || arg0 == 46 || arg0 == 1008 || arg0 == 45 || arg0 == 3;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!nh;")
	public static RuntimeException_Sub1 method3491(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString49 = local9.aString49 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
