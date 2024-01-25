import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
	public static int anInt3866;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	public static int anInt3855 = 0;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "Lclient!wo;")
	public static final Class375 aClass375_4 = new Class375();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
	public static void method3381() {
		@Pc(10) int local10 = Static552.aClass3_Sub48_30.aClass23_Sub25_1.method7082();
		if (local10 == 0) {
			Static192.aByteArrayArrayArray3 = null;
			Static306.method5198(0);
		} else if (local10 == 1) {
			Static340.method5634((byte) 0);
			Static306.method5198(512);
			if (Static244.aByteArrayArrayArray10 != null) {
				Static137.method3122();
			}
		} else {
			Static340.method5634((byte) (Static469.anInt8476 - 4 & 0xFF));
			Static306.method5198(2);
		}
		Static362.anInt6989 = Static552.anInt9440;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V")
	public static void method3385() {
		@Pc(14) Class3_Sub1_Sub21 local14 = Static57.method8561(0, 15);
		local14.method8628();
	}
}
