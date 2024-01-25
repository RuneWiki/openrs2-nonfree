import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
	public static int anInt5724;

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "Lclient!aa;")
	public static Class2 aClass2_9 = null;

	@OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
	public static int anInt5719 = 127;

	@OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
	public static int anInt5731 = 0;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)V")
	public static void method4816() {
		Static17.aClass58_2.method1011();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZC)I")
	public static int method4817(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local7 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
