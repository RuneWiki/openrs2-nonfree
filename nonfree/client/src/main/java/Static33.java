import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!ai;")
	public static final Class2_Sub3_Sub1 aClass2_Sub3_Sub1_1 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array19 = new Class83[100];

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!nc;")
	public static Class63 aClass63_3 = new Class63(8);

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	public static int anInt869 = 0;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
	public static int anInt870 = 0;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_278 = Static181.method2795(":trade:");

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
	public static int anInt872 = 0;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_279 = Static181.method2795("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBILclient!qa;II)V")
	public static void method680(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class24_Sub4 arg2, @OriginalArg(6) int arg3) {
		Static124.method1908(arg2.anInt3349, arg3, arg0, arg1, arg2.anInt3316);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method681() {
		Static174.aClass2_Sub2_Sub17_Sub1_4.method1907(0, 0);
		Static93.aClass2_Sub2_Sub17_Sub1_3.method1907(382, 0);
		Static184.aClass29_3.method1184(382 - Static184.aClass29_3.anInt1518 / 2, 18);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
	public static void method687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static126.method2119(arg2, arg1, arg0 + arg2, arg1 + arg3);
		Static24.method464();
		Static126.method2138(arg2, arg1, arg0, arg3, 0);
		if (Static83.anInt1856 < 100) {
			return;
		}
		if (Static27.aClass2_Sub2_Sub17_2 == null) {
			@Pc(35) Class2_Sub2_Sub17_Sub1 local35 = new Class2_Sub2_Sub17_Sub1(arg0, arg3);
			Static126.method2131(local35.anIntArray252, arg0, arg3);
			Static110.method1952(arg3, 0, Static177.anInt3615, 0, 0, arg0, 0, Static127.anInt2810);
			Static27.aClass2_Sub2_Sub17_2 = local35;
			Static191.aClass34_1.method2581();
		}
		Static27.aClass2_Sub2_Sub17_2.method1907(arg2, arg1);
		@Pc(70) int local70 = arg2 + arg0 * Static165.anInt3383 / Static127.anInt2810;
		@Pc(76) int local76 = arg0 * Static62.anInt1513 / Static127.anInt2810;
		@Pc(82) int local82 = Static46.anInt1116 * arg3 / Static177.anInt3615;
		@Pc(90) int local90 = Static31.anInt824 * arg3 / Static177.anInt3615 + arg1;
		Static126.method2124(local70, local90, local76, local82, 16711680, 128);
		Static126.method2120(local70, local90, local76, local82, 16711680);
		if (Static206.anInt4068 <= 0 || Static206.anInt4068 % 10 >= 5) {
			return;
		}
		for (@Pc(118) Class2_Sub12 local118 = (Class2_Sub12) Static91.aClass19_9.method691(); local118 != null; local118 = (Class2_Sub12) Static91.aClass19_9.method686()) {
			if (local118.anInt1425 == Static127.anInt2806) {
				@Pc(137) int local137 = arg3 * local118.anInt1424 / Static177.anInt3615 + arg1;
				@Pc(146) int local146 = arg2 + local118.anInt1432 * arg0 / Static127.anInt2810;
				Static126.method2138(local146 - 2, local137 + -2, 4, 4, 16776960);
			}
		}
	}
}
