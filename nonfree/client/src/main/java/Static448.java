import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
	public static int anInt7415;

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)V")
	public static void method6559() {
		@Pc(17) Class3_Sub34 local17 = Static172.method3123(Static163.aClass375_1, Static272.aClass218_68);
		local17.aClass3_Sub25_Sub1_2.method8649(Static611.anInt9850);
		Static441.method6275(local17);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BB)V")
	public static void method6560(@OriginalArg(1) byte arg0) {
		if (Static302.aByteArrayArrayArray18 == null) {
			Static302.aByteArrayArrayArray18 = new byte[4][Static158.anInt927][Static515.anInt8292];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(26) int local26 = 0; local26 < Static158.anInt927; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static515.anInt8292; local30++) {
					Static302.aByteArrayArrayArray18[local14][local26][local30] = arg0;
				}
			}
		}
	}
}
