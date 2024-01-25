import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "[Lclient!dv;")
	public static Class88_Sub1[] aClass88_Sub1Array3;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
	public static int anInt10711;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Lclient!pm;")
	public static final Class295 aClass295_16 = new Class295(3);

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	public static int anInt10709 = 0;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	public static int anInt10710 = 2;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	public static void method9374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == Static357.anInt5722) {
			return;
		}
		if (arg1 == 14 || arg1 == 15) {
			Static73.method1141();
		}
		if (arg1 != 14 && Static162.aClass5_1 != null) {
			Static162.aClass5_1.method108();
			Static162.aClass5_1 = null;
		}
		if (arg1 == 3) {
			Static547.method7638(Static519.aClass132_1.anInt3151 != Static542.anInt8552);
		}
		if (arg1 == 7) {
			Static6.method5190(Static542.anInt8552 != Static519.aClass132_1.anInt3154);
		}
		if (arg1 == 5 || arg1 == 13) {
			Static429.method1394();
		} else if (arg1 == 6 || arg1 == 9 && Static357.anInt5722 != 10) {
			Static73.method1141();
		}
		if (Static633.method8621(Static357.anInt5722)) {
			Static1.aClass254_144.anInt6802 = 2;
			Static566.aClass254_142.anInt6802 = 2;
			Static529.aClass254_132.anInt6802 = 2;
			Static307.aClass254_95.anInt6802 = 2;
			Static625.aClass254_156.anInt6802 = 2;
			Static565.aClass254_141.anInt6802 = 2;
			Static191.aClass254_69.anInt6802 = 2;
		}
		if (Static633.method8621(arg1)) {
			Static118.anInt1985 = 1;
			Static512.anInt8137 = 0;
			Static367.anInt5880 = 0;
			Static343.anInt5305 = 1;
			Static458.anInt7470 = 0;
			Static529.method7451(true);
			Static1.aClass254_144.anInt6802 = 1;
			Static566.aClass254_142.anInt6802 = 1;
			Static529.aClass254_132.anInt6802 = 1;
			Static307.aClass254_95.anInt6802 = 1;
			Static625.aClass254_156.anInt6802 = 1;
			Static565.aClass254_141.anInt6802 = 1;
			Static191.aClass254_69.anInt6802 = 1;
		}
		if (arg1 == 12 || arg1 == 3) {
			Static64.method959();
		}
		@Pc(222) boolean local222 = arg1 == 2 || Static243.method3435(arg1) || Static459.method6651(-870, arg1);
		@Pc(242) boolean local242 = Static357.anInt5722 == 2 || Static243.method3435(Static357.anInt5722) || Static459.method6651(-870, Static357.anInt5722);
		if (arg0 > -51) {
			method9374(27, -8);
		}
		if (local222 != local242) {
			if (local222) {
				Static717.anInt10936 = Static37.anInt9263;
				if (Static650.aClass2_Sub30_29.aClass11_Sub5_3.method1696(1) == 0) {
					Static418.method6114();
				} else {
					Static645.method8738(Static37.anInt9263, Static650.aClass2_Sub30_29.aClass11_Sub5_3.method1696(1), Static177.aClass254_66);
					Static321.method4455(3712);
				}
				Static190.aClass309_1.method7263(false);
			} else {
				Static418.method6114();
				Static190.aClass309_1.method7263(true);
			}
		}
		if (Static633.method8621(arg1) || arg1 == 14 || arg1 == 15) {
			Static396.aClass145_6.method9636();
		}
		Static357.anInt5722 = arg1;
	}
}
