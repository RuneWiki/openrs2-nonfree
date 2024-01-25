import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "[Lclient!kw;")
	public static Class4_Sub4[] aClass4_Sub4Array139;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	public static int anInt9484 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZ)V")
	public static void method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub10_Sub16 local8 = Static362.method5701(0, 15);
		local8.method6211();
		local8.anInt7557 = arg1;
		local8.anInt7561 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V")
	public static void method7822() {
		try {
			if (Static429.anInt7900 == 1) {
				@Pc(17) int local17 = Static345.aClass3_Sub9_Sub1_2.method1186();
				if (local17 > 0 && Static345.aClass3_Sub9_Sub1_2.method1184()) {
					local17 -= Static32.anInt815;
					if (local17 < 0) {
						local17 = 0;
					}
					Static345.aClass3_Sub9_Sub1_2.method1209(local17);
				} else {
					Static345.aClass3_Sub9_Sub1_2.method1202();
					Static345.aClass3_Sub9_Sub1_2.method1181();
					Static229.aClass3_Sub39_2 = null;
					Static85.aClass286_1 = null;
					if (Static492.aClass161_108 == null) {
						Static429.anInt7900 = 0;
					} else {
						Static429.anInt7900 = 2;
					}
				}
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static345.aClass3_Sub9_Sub1_2.method1202();
			Static85.aClass286_1 = null;
			Static429.anInt7900 = 0;
			Static229.aClass3_Sub39_2 = null;
			Static492.aClass161_108 = null;
		}
	}
}
