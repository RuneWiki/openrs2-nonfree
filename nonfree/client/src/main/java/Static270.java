import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
	public static int anInt7944;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "Lclient!fca;")
	public static final Class98 aClass98_11 = new Class98("", 17);

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_126 = new Class45(63, 7);

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "[I")
	public static final int[] anIntArray597 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IB)V")
	public static void method6580(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static2.aFloat122 = 3.0F;
		} else if (arg0 == 50) {
			Static2.aFloat122 = 4.0F;
		} else if (arg0 == 75) {
			Static2.aFloat122 = 6.0F;
		} else if (arg0 == 100) {
			Static2.aFloat122 = 8.0F;
		} else if (arg0 == 200) {
			Static2.aFloat122 = 16.0F;
		}
		Static265.anInt5303 = -1;
		Static265.anInt5303 = -1;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)Lclient!pg;")
	public static Class241 method6582() {
		try {
			return (Class241) Class.forName("Class241_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
	public static void method6585() {
		if (Static406.anInt7660 == -1) {
			return;
		}
		@Pc(11) int local11 = Static527.aClass6_1.method3754();
		@Pc(15) int local15 = Static527.aClass6_1.method3757();
		@Pc(24) Class12_Sub3 local24 = (Class12_Sub3) Static55.aClass73_13.method2005();
		if (local24 != null) {
			local11 = local24.method6279();
			local15 = local24.method6275();
		}
		Static110.method2276(0, Static406.anInt7660, 0, local15, Static127.anInt2936, 0, local11, Static169.anInt3893, 0);
		if (Static86.aClass198_3 != null) {
			Static289.method4714(local15, local11);
		}
	}
}
