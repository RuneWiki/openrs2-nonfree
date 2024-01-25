import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!sk", name = "H", descriptor = "Lclient!qt;")
	public static Class258 aClass258_2;

	@OriginalMember(owner = "client!sk", name = "N", descriptor = "Lclient!an;")
	public static Class16 aClass16_105;

	@OriginalMember(owner = "client!sk", name = "J", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_77 = new Class77(3, 3);

	@OriginalMember(owner = "client!sk", name = "Q", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_131 = new Class45(3, -1);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!daa;)V")
	public static void method6834(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub8 arg1) {
		if (Static243.aClass38_1 == null) {
			return;
		}
		try {
			Static243.aClass38_1.method858(0L);
			Static243.aClass38_1.method860(arg1.aByteArray82, 24, arg0);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
	public static void method6835() {
		Static231.method4123(Static243.aClass42_4, (long) Static409.anInt7683);
		if (Static406.anInt7660 != -1) {
			Static111.method2303(Static406.anInt7660);
		}
		for (@Pc(27) int local27 = 0; local27 < Static24.anInt388; local27++) {
			if (Static154.aBooleanArray31[local27]) {
				Static49.aBooleanArray8[local27] = true;
			}
			Static101.aBooleanArray21[local27] = Static154.aBooleanArray31[local27];
			Static154.aBooleanArray31[local27] = false;
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
		@Pc(78) int local78 = Static481.method7157();
		if (local78 == -1) {
			local78 = Static4.anInt69;
		}
		if (local78 == -1) {
			local78 = Static125.anInt2925;
		}
		Static269.method4559(local78);
		Static481.anInt8697 = 0;
	}
}
