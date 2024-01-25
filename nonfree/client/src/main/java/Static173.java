import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
	public static int anInt2815;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	public static int anInt2817 = -1;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZII)V")
	public static void method2428(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static185.aClass34_7 = Static459.method5776(Static183.aClass83_2, Static392.aCanvas5, Static310.anInterface6_4, arg1, Static453.aClass136_Sub1_1.anInt4443 * 2);
		} else {
			if (arg0) {
				Static185.aClass34_7 = Static459.method5776(Static183.aClass83_2, Static392.aCanvas5, Static310.anInterface6_4, 0, 0);
				Static185.aClass34_7.t(0);
				@Pc(35) Class89 local35 = Static341.method4571(Static364.anInt3532, Static332.aClass82_76);
				@Pc(44) Class76 local44 = Static185.aClass34_7.method5754(local35, Static460.method1579(Static448.aClass82_104, Static364.anInt3532));
				Static163.method4683(true, local44, Static277.aClass119_130.method2673(Static394.anInt6582));
				Static185.aClass34_7.method5781();
				Static263.method3723();
				Static185.aClass34_7.method5782();
			}
			try {
				Static185.aClass34_7 = Static459.method5776(Static183.aClass83_2, Static392.aCanvas5, Static310.anInterface6_4, arg1, Static453.aClass136_Sub1_1.anInt4443 * 2);
				if (Static185.aClass34_7.method5755()) {
					@Pc(75) boolean local75 = true;
					try {
						local75 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(85) Throwable local85) {
					}
					@Pc(91) Class1_Sub12 local91;
					if (local75) {
						local91 = Static185.aClass34_7.method5795(146800640);
					} else {
						local91 = Static185.aClass34_7.method5795(104857600);
					}
					Static185.aClass34_7.method5791(local91);
				}
			} catch (@Pc(102) Throwable local102) {
				arg1 = 0;
				Static185.aClass34_7 = Static459.method5776(Static183.aClass83_2, Static392.aCanvas5, Static310.anInterface6_4, 0, 0);
			}
		}
		Static14.anInt293 = arg1;
		Static186.method2672();
		if (!Static185.aClass34_7.method5732()) {
			Static126.anInt2335 = 1;
		}
		Static185.aClass34_7.method5757(Static126.anInt2335);
		Static185.aClass34_7.method5742(0);
		Static185.aClass34_7.ya(8);
		Static148.aClass32_6 = Static185.aClass34_7.method5736();
		Static281.aClass32_4 = Static185.aClass34_7.method5736();
		Static10.method143();
		Static185.aClass34_7.method5768(!Static453.aClass136_Sub1_1.aBoolean498);
		if (Static185.aClass34_7.method5794()) {
			Static18.method276(Static453.aClass136_Sub1_1.aBoolean511);
		}
		Static143.method2018(Static185.aClass34_7, Static206.anInt3607 >> 3, Static296.anInt5187 >> 3);
		Static129.method2031();
		Static303.aBoolean816 = false;
	}
}
