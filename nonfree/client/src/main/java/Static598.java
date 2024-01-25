import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "Lclient!rt;")
	public static Class297 aClass297_13;

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "Lclient!nea;")
	public static final Class240 aClass240_5 = new Class240();

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "[Lclient!iv;")
	public static final Class167[] aClass167Array1 = new Class167[16];

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
	public static int anInt9831 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public static void method8031() {
		if (Static185.aClass66_14 == null) {
			return;
		}
		Static350.aClass8_4.method106();
		Static564.method7257();
		Static180.method3365();
		Static452.method6399();
		Static421.method7827();
		Static139.method2840();
		if (Static122.aClass255_3 != null) {
			Static122.aClass255_3.method5707();
		}
		Static404.method5839();
		Static409.method7475();
		Static458.method6437();
		Static23.method440();
		Static245.method4153(false);
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(48) Class10_Sub1_Sub2_Sub2 local48 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local42];
			if (local48 != null) {
				local48.aClass4_Sub44_3 = null;
				for (@Pc(55) int local55 = 0; local55 < local48.aClass9Array3.length; local55++) {
					local48.aClass9Array3[local55] = null;
				}
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static566.anInt9466; local74++) {
			@Pc(81) Class10_Sub1_Sub2_Sub1 local81 = Static161.aClass4_Sub50Array1[local74].aClass10_Sub1_Sub2_Sub1_1;
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < local81.aClass9Array3.length; local85++) {
					local81.aClass9Array3[local85] = null;
				}
			}
		}
		Static186.aClass134_4 = null;
		Static488.aClass134_6 = null;
		Static185.aClass66_14.method6838();
		Static185.aClass66_14 = null;
	}
}
