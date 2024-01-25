import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!nfa", name = "D", descriptor = "I")
	public static int anInt6168;

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "(Z)V")
	public static void method5171() {
		Static106.aClass356_8.method7802();
		Static268.aClass356_22.method7802();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	public static void method5172(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static326.anInt5840 = -1;
		Static590.anInt9527 = 1;
		Static296.method4673(false, arg0, arg1);
	}

	@OriginalMember(owner = "client!nfa", name = "g", descriptor = "(I)V")
	public static void method5173() {
		for (@Pc(10) Class1_Sub3_Sub14 local10 = (Class1_Sub3_Sub14) Static518.aClass361_93.method7854(); local10 != null; local10 = (Class1_Sub3_Sub14) Static518.aClass361_93.method7853()) {
			@Pc(20) Class20_Sub2_Sub4_Sub4 local20 = local10.aClass20_Sub2_Sub4_Sub4_1;
			if (Static81.anInt1910 > local20.anInt8181) {
				local10.method7878();
				local20.method6800();
			} else if (local20.anInt8185 <= Static81.anInt1910) {
				if (local20.anInt8192 > 0) {
					@Pc(56) Class1_Sub39 local56 = (Class1_Sub39) Static131.aClass356_32.method7796((long) (local20.anInt8192 - 1));
					if (local56 != null) {
						@Pc(61) Class20_Sub2_Sub4_Sub1_Sub2 local61 = local56.aClass20_Sub2_Sub4_Sub1_Sub2_2;
						if (local61.anInt8796 >= 0 && Static500.anInt6888 * 512 > local61.anInt8796 && local61.anInt8795 >= 0 && local61.anInt8795 < Static573.anInt9325 * 512) {
							local20.method6802(local61.anInt8795, local61.anInt8796, Static122.method2103(local20.aByte116, local61.anInt8796, local61.anInt8795) - local20.anInt8194, Static81.anInt1910);
						}
					}
				}
				if (local20.anInt8192 < 0) {
					@Pc(121) int local121 = -local20.anInt8192 - 1;
					@Pc(126) Class20_Sub2_Sub4_Sub1_Sub1 local126;
					if (Static594.anInt9653 == local121) {
						local126 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2;
					} else {
						local126 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local121];
					}
					if (local126 != null && local126.anInt8796 >= 0 && local126.anInt8796 < Static500.anInt6888 * 512 && local126.anInt8795 >= 0 && local126.anInt8795 < Static573.anInt9325 * 512) {
						local20.method6802(local126.anInt8795, local126.anInt8796, Static122.method2103(local20.aByte116, local126.anInt8796, local126.anInt8795) - local20.anInt8194, Static81.anInt1910);
					}
				}
				local20.method6796(Static236.anInt4451);
				Static567.method7645(local20, true);
			}
		}
	}
}
