import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
	public static int anInt5825;

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)V")
	public static void method4827(@OriginalArg(0) boolean arg0) {
		if (client.lb != null) {
			client.lb.method4920();
			client.lb = null;
		}
		Static118.anInt2542 = 0;
		Static452.method6364();
		Static36.method830();
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static71.aClass10Array3[local21].method303();
		}
		Static515.method2859(false);
		System.gc();
		Static152.method2793();
		Static161.anInt3277 = -1;
		Static359.aBoolean477 = false;
		Static174.method3030(true);
		Static515.anInt3214 = 0;
		Static100.anInt2262 = 0;
		Static338.anInt6353 = 0;
		Static56.anInt1176 = 0;
		Static329.anInt6278 = 0;
		Static381.anInt6974 = 0;
		for (@Pc(65) int local65 = 0; local65 < Static531.aClass34Array1.length; local65++) {
			Static531.aClass34Array1[local65] = null;
		}
		Static120.method2284();
		for (@Pc(84) int local84 = 0; local84 < 2048; local84++) {
			Static10.aClass15_Sub2_Sub1_Sub1Array1[local84] = null;
		}
		Static438.anInt7689 = 0;
		Static521.aClass42_42.method1108();
		Static310.anInt6066 = 0;
		Static181.aClass42_11.method1108();
		Static448.method6330();
		Static39.anInt914 = 0;
		Static540.aClass242_1.method5718();
		Static315.method5087();
		Static294.method6015();
		Static287.aLong157 = 0L;
		Static485.aClass5_Sub38_2 = null;
		if (arg0) {
			Static287.method4831(11);
			return;
		}
		Static287.method4831(2);
		try {
			Static555.method5217(Static159.aClass9_10.anApplet1, "loggedout");
		} catch (@Pc(138) Throwable local138) {
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)V")
	public static void method4828(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub2_Sub7 local12 = Static144.method2728(arg0, 8);
		local12.method1324();
	}
}
