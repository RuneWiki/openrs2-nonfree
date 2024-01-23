import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!td", name = "fb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1370 = Static200.method3116(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1371 = Static200.method3116("sch-Utteln:");

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
	public static int anInt4072 = 1;

	@OriginalMember(owner = "client!td", name = "kb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1372 = Static200.method3116("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!td", name = "mb", descriptor = "[I")
	public static int[] anIntArray530 = new int[1000];

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	public static void method2975() {
		if (Static184.aClass55_3 != null) {
			Static184.aClass55_3.method1754();
			Static184.aClass55_3 = null;
		}
		Static138.method2372();
		Static26.method432();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static153.aClass3Array1[local17].method43();
		}
		Static49.method958();
		System.gc();
		Static24.method419();
		Static105.aBoolean134 = false;
		Static163.anInt3583 = -1;
		Static50.method1424();
		Static85.method1486(10);
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(B)V")
	public static void method2977() {
		if (Static115.anIntArray331 != null && Static55.anIntArray169 != null) {
			return;
		}
		Static115.anIntArray331 = new int[256];
		Static55.anIntArray169 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static115.anIntArray331[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static55.anIntArray169[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}
}
