import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!ur", name = "I", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_141 = new Class45(54, -2);

	@OriginalMember(owner = "client!ur", name = "J", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_266 = new Class88("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "Lclient!vf;")
	public static final Class302 aClass302_4 = new Class302();

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(JI)V")
	public static void method7414(@OriginalArg(0) long arg0) {
		if (Static120.aClass37ArrayArrayArray1 != null) {
			if (Static242.anInt4993 == 1 || Static242.anInt4993 == 5) {
				Static223.method3749(arg0);
			} else if (Static242.anInt4993 == 4) {
				Static56.method1420(arg0);
			}
		}
		Static231.method4123(Static243.aClass42_4, (long) Static409.anInt7683);
		if (Static406.anInt7660 != -1) {
			Static111.method2303(Static406.anInt7660);
		}
		for (@Pc(40) int local40 = 0; local40 < Static24.anInt388; local40++) {
			if (Static154.aBooleanArray31[local40]) {
				Static49.aBooleanArray8[local40] = true;
			}
			Static101.aBooleanArray21[local40] = Static154.aBooleanArray31[local40];
			Static154.aBooleanArray31[local40] = false;
		}
		Static308.anInt5972 = Static409.anInt7683;
		if (Static243.aClass42_4.method5843()) {
			Static515.aBoolean655 = true;
		}
		if (Static406.anInt7660 != -1) {
			Static24.anInt388 = 0;
			Static437.method6658();
		}
		Static243.aClass42_4.n();
		Static230.method4118(Static243.aClass42_4);
		@Pc(87) int local87 = Static481.method7157();
		if (local87 == -1) {
			local87 = Static4.anInt69;
		}
		if (local87 == -1) {
			local87 = Static125.anInt2925;
		}
		Static269.method4559(local87);
		Static188.method3651(Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418, Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99, Static481.anInt8697, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416);
		Static481.anInt8697 = 0;
	}
}
