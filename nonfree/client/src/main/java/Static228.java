import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "Lclient!li;")
	public static Class3_Sub5_Sub1 aClass3_Sub5_Sub1_130;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
	public static int anInt7612;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_250 = new Class175("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "S")
	public static short aShort235 = 1;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_255 = new Class92(63, 8);

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_277 = new Class184(63, 0);

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray177 = new String[100];

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "Lclient!su;")
	public static final Class215 aClass215_131 = new Class215(2);

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public static void method5988() {
		Static304.method4491();
		Static143.method2556();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
	public static void method5989(@OriginalArg(0) boolean arg0) {
		Static378.anInt6656 = 0;
		Static229.anInt4389 = 0;
		Static348.method5828();
		Static3.method4779(arg0);
		Static298.method4388();
		@Pc(27) int local27;
		for (@Pc(22) int local22 = 0; local22 < Static378.anInt6656; local22++) {
			local27 = Static195.anIntArray297[local22];
			if (Static451.aClass1_Sub3_Sub3_Sub2Array1[local27].anInt6126 != Static290.anInt5325) {
				if (Static451.aClass1_Sub3_Sub3_Sub2Array1[local27].aClass47_1.method1305()) {
					Static5.method107(Static451.aClass1_Sub3_Sub3_Sub2Array1[local27]);
				}
				Static451.aClass1_Sub3_Sub3_Sub2Array1[local27].method4854(null);
				Static451.aClass1_Sub3_Sub3_Sub2Array1[local27] = null;
			}
		}
		if (Static110.aClass3_Sub2_Sub2_1.anInt7620 != Static113.anInt6862) {
			throw new RuntimeException("gnp1 pos:" + Static110.aClass3_Sub2_Sub2_1.anInt7620 + " psize:" + Static113.anInt6862);
		}
		for (local27 = 0; local27 < Static453.anInt7682; local27++) {
			if (Static451.aClass1_Sub3_Sub3_Sub2Array1[Static29.anIntArray56[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static453.anInt7682);
			}
		}
	}
}
