import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "Lclient!uq;")
	public static Class3_Sub43 aClass3_Sub43_2;

	@OriginalMember(owner = "client!rb", name = "M", descriptor = "Z")
	public static boolean aBoolean435 = false;

	@OriginalMember(owner = "client!rb", name = "P", descriptor = "Lclient!um;")
	public static final Class238 aClass238_5 = new Class238("WTRC", 1);

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
	public static int anInt6221 = -1;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)[Lclient!su;")
	public static Class215[] method4899() {
		return new Class215[] { Static154.aClass215_56, Static369.aClass215_112, Static228.aClass215_131 };
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V")
	public static void method4900() {
		@Pc(5) int local5 = 0;
		if (Static123.aClass21_Sub1_1.method780(Static347.anInt6318)) {
			local5 = 55;
		}
		if (!Static123.aClass21_Sub1_1.aBoolean67) {
			local5 |= 0x40;
		}
		Static129.method2230(local5);
		Static55.aClass25_1.method848(local5);
		Static89.aClass157_1.method3838(local5);
		Static154.aClass251_2.method5683(local5);
		Static102.aClass91_2.method2561(local5);
		Static124.method2211(local5);
		Static143.method2555(local5);
		Static306.method4511(local5);
		Static344.method4927(local5);
		if (Static142.anInt3209 == 10) {
			Static293.method2805(28);
		} else if (Static142.anInt3209 == 30) {
			Static293.method2805(25);
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)I")
	public static int method4902(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
