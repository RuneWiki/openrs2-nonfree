import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	public static int anInt4924;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
	public static int anInt4919 = -1;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Lclient!tm;")
	public static final Class197 aClass197_23 = new Class197(8);

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[I")
	public static final int[] anIntArray442 = new int[5];

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	public static int anInt4927 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
	public static void method4345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class116 local7 = Static102.method2118(arg1);
		@Pc(10) int local10 = local7.anInt3530;
		@Pc(13) int local13 = local7.anInt3529;
		@Pc(19) int local19 = local7.anInt3531;
		@Pc(25) int local25 = Class1_Sub25.anIntArray365[local19 - local13];
		if (arg0 < 0 || local25 < arg0) {
			arg0 = 0;
		}
		local25 <<= local13;
		Static173.method3435(local10, arg0 << local13 & local25 | ~local25 & Static91.anIntArray217[local10]);
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	public static void method4346() {
		Static191.aClass216_62.anInt6797 = 1;
		Static93.aClient1.method992();
		Static175.aBoolean350 = true;
		Static179.aBoolean359 = true;
		Static26.method723();
		Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
		Static314.anInt6117 = 0;
		Static107.anInt2548 = -1;
		Static74.anInt1958 = -1;
		Static5.anInt197 = -1;
		Static311.aClass1_Sub8_Sub1_8.anInt5182 = 0;
		Static324.anInt6225 = 0;
		Static111.anInt2599 = 0;
		Static53.anInt1593 = -1;
		for (@Pc(4208) int local4208 = 0; local4208 < Static340.aClass105Array1.length; local4208++) {
			Static340.aClass105Array1[local4208] = null;
		}
		for (@Pc(4230) int local4230 = 0; local4230 < 100; local4230++) {
			Static271.aStringArray57[local4230] = null;
		}
		Static123.anInt2804 = (int) (Math.random() * 110.0D) - 55;
		Static148.anInt3244 = (int) (Math.random() * 100.0D) - 50;
		Static312.anInt4575 = 0;
		Static75.aFloat13 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static91.aBoolean214 = false;
		Static225.anInt4698 = 0;
		Static287.anInt5748 = (int) (Math.random() * 30.0D) - 20;
		Static337.anInt6461 = (int) (Math.random() * 120.0D) - 60;
		Static36.anInt1199 = (int) (Math.random() * 80.0D) - 40;
		Static314.method5207();
		Static5.anInt200 = 0;
		Static357.anInt4331 = 0;
		for (@Pc(4301) int local4301 = 0; local4301 < 2048; local4301++) {
			Static102.aClass17_Sub1_Sub1_Sub1Array1[local4301] = null;
			Static313.aClass1_Sub8Array1[local4301] = null;
		}
		for (@Pc(4319) int local4319 = 0; local4319 < 32768; local4319++) {
			Static140.aClass17_Sub1_Sub1_Sub2Array1[local4319] = null;
		}
		Static198.aClass17_Sub1_Sub1_Sub1_3 = Static102.aClass17_Sub1_Sub1_Sub1Array1[2047] = new Class17_Sub1_Sub1_Sub1();
		Static198.aClass17_Sub1_Sub1_Sub1_3.anInt4867 = 2047;
		Static294.aClass16_36.method421();
		Static34.aClass16_3.method421();
		Static64.aClass217_2.method5688();
		Static339.aClass197_30.method5155();
		Static290.aClass16_35 = new Class16();
		Static191.anInt4095 = 0;
		Static309.anInt6063 = 0;
		Static178.method3528();
		Static108.method2334();
		Static271.anInt5526 = 0;
		Static219.anInt4615 = 0;
		Static354.anInt6757 = 0;
		Static355.anInt6783 = 0;
		Static41.anInt1307 = 0;
		Static44.anInt1404 = 0;
		Static107.anInt2549 = 0;
		Static330.anInt6322 = 0;
		Static301.anInt5960 = 0;
		Static121.anInt2760 = 0;
		for (@Pc(4390) int local4390 = 0; local4390 < Static183.anIntArray351.length; local4390++) {
			if (!Static197.aBooleanArray20[local4390]) {
				Static183.anIntArray351[local4390] = -1;
			}
		}
		if (Static89.anInt2231 != -1) {
			Static327.method5307(Static89.anInt2231);
		}
		for (@Pc(4424) Class1_Sub37 local4424 = (Class1_Sub37) Static351.aClass197_33.method5161(); local4424 != null; local4424 = (Class1_Sub37) Static351.aClass197_33.method5154()) {
			if (!local4424.method5627()) {
				local4424 = (Class1_Sub37) Static351.aClass197_33.method5161();
				if (local4424 == null) {
					break;
				}
			}
			Static107.method2331(true, false, local4424);
		}
		Static89.anInt2231 = -1;
		Static351.aClass197_33 = new Class197(8);
		Static324.method5273();
		Static111.aClass12_7 = null;
		Static98.aClass60_2.method1717(false, new int[5], null, -1, -1);
		for (@Pc(4477) int local4477 = 0; local4477 < 8; local4477++) {
			Static7.aStringArray1[local4477] = null;
			Static74.aBooleanArray10[local4477] = false;
			Static132.anIntArray258[local4477] = -1;
		}
		Static144.method2870();
		Static190.aBoolean378 = true;
		for (@Pc(4503) int local4503 = 0; local4503 < 100; local4503++) {
			Static223.aBooleanArray28[local4503] = true;
		}
		Static56.aString19 = null;
		Static156.aClass215Array1 = null;
		Static353.anInt6722 = 0;
		for (@Pc(4523) int local4523 = 0; local4523 < 6; local4523++) {
			Static336.aClass125Array1[local4523] = new Class125();
		}
		for (@Pc(4539) int local4539 = 0; local4539 < 25; local4539++) {
			Static122.anIntArray252[local4539] = 0;
			Static20.anIntArray76[local4539] = 0;
			Static120.anIntArray249[local4539] = 0;
		}
		Static308.method2772();
		Static329.aBoolean614 = true;
		Static53.aShortArray11 = Static274.aShortArray112 = Static54.aShortArray12 = Static15.aShortArray2 = new short[256];
		Static328.aString61 = Static59.aClass34_47.method1285(Static259.anInt2907);
		Static190.anInt4079 = 0;
		Static1.aBoolean7 = false;
		Static234.method4276();
		Static64.method1564();
		Static191.aClass216_62.anInt6797 = 2;
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)Lclient!bg;")
	public static Class1_Sub8 method4348() {
		@Pc(8) Class1_Sub8 local8 = new Class1_Sub8(38);
		local8.method4562(15);
		local8.method4562(Static13.anInt489);
		local8.method4562(Static17.aBoolean55 ? 1 : 0);
		local8.method4562(Static221.aBoolean435 ? 1 : 0);
		local8.method4562(Static84.aBoolean195 ? 1 : 0);
		local8.method4562(Static125.aBoolean268 ? 1 : 0);
		local8.method4562(0);
		local8.method4562(Static111.aBoolean254 ? 1 : 0);
		local8.method4562(Static336.aBoolean628 ? 1 : 0);
		local8.method4562(Static282.aBoolean648 ? 1 : 0);
		local8.method4562(Static163.anInt3549);
		local8.method4562(Static129.aBoolean269 ? 1 : 0);
		local8.method4562(Static304.aBoolean580 ? 1 : 0);
		local8.method4562(Static306.aBoolean584 ? 1 : 0);
		local8.method4562(Static279.anInt5666);
		local8.method4562(Static259.aBoolean281 ? 1 : 0);
		local8.method4562(Static80.anInt2078);
		local8.method4562(Static167.anInt3605);
		local8.method4562(Static114.anInt4335);
		local8.method4542(Static252.anInt5211);
		local8.method4542(Static327.anInt6283);
		local8.method4562(Static144.method2876());
		local8.method4529(Static34.anInt1164);
		local8.method4562(Static168.anInt3612);
		local8.method4562(Static45.aBoolean140 ? 1 : 0);
		local8.method4562(Static327.aBoolean607 ? 1 : 0);
		local8.method4562(Static324.anInt6232);
		local8.method4562(Static278.aBoolean547 ? 1 : 0);
		local8.method4562(Static332.aBoolean626 ? 1 : 0);
		local8.method4562(Static323.anInt6216);
		local8.method4562(Static348.aBoolean657 ? 1 : 0);
		local8.method4562(Static204.anInt4306);
		local8.method4562(Static218.anInt4605);
		return local8;
	}
}
