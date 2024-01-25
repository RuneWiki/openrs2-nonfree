import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static290 {

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
	public static int anInt5356;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "[I")
	public static final int[] anIntArray346 = new int[1000];

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "Z")
	public static boolean aBoolean413 = false;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "[I")
	public static final int[] anIntArray347 = new int[16];

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!cn;ZZ)V")
	public static void method4529(@OriginalArg(0) Class23_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean743 = arg1;
		if (Static284.aBoolean410) {
			Static94.aClass224Array1[Static94.aClass224Array1.length - 1].method5157(arg0);
		} else {
			Static583.method7849(arg0, Static288.aClass3_Sub7Array4);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static void method4540() {
		Static428.aClass279_39.method6637();
		Static81.aClass279_9.method6637();
		Static384.aClass279_3.method6637();
		Static268.aClass279_27.method6637();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!fca;I)Lclient!dd;")
	public static Class74_Sub1 method4542(@OriginalArg(0) Class3_Sub17 arg0) {
		return new Class74_Sub1(arg0.method4869(), arg0.method4869(), arg0.method4869(), arg0.method4869(), arg0.method4862(), arg0.method4888());
	}
}
