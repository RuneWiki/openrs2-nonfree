import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
	public static int anInt4117;

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "Lclient!i;")
	public static Class41 aClass41_1079 = Static184.method2923(" ");

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
	public static int anInt4104 = 0;

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "Lclient!i;")
	public static Class41 aClass41_1080 = Static184.method2923("p11_full");

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "Lclient!i;")
	public static Class41 aClass41_1081 = Static184.method2923("Art");

	@OriginalMember(owner = "client!sc", name = "bb", descriptor = "Lclient!wi;")
	public static Class108 aClass108_14 = new Class108();

	@OriginalMember(owner = "client!sc", name = "cb", descriptor = "Lclient!i;")
	public static Class41 aClass41_1082 = Static184.method2923("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!nb;Lclient!nb;)V")
	public static void method2826(@OriginalArg(1) Class15 arg0, @OriginalArg(2) Class15 arg1) {
		Static39.aClass15_10 = arg0;
		Static114.aClass15_22 = arg1;
		Static21.anInt4636 = Static114.aClass15_22.method390(3);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IJ)V")
	public static void method2827(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
	public static void method2832() {
		for (@Pc(6) Class2_Sub2_Sub27 local6 = (Class2_Sub2_Sub27) Static38.aClass108_2.method3322(); local6 != null; local6 = (Class2_Sub2_Sub27) Static38.aClass108_2.method3331()) {
			@Pc(11) Class12_Sub1 local11 = local6.aClass12_Sub1_1;
			if (local11.anInt465 != Static134.anInt3147 || local11.aBoolean21) {
				local6.method3314();
			} else if (local11.anInt462 <= Static103.anInt2511) {
				local11.method326(Static16.anInt432);
				if (local11.aBoolean21) {
					local6.method3314();
				} else {
					Static111.method1899(local11.anInt465, local11.anInt468, local11.anInt463, local11.anInt467, 60, local11, 0, -1L, false);
				}
			}
		}
	}
}
