import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "Lclient!la;")
	public static Class29 aClass29_3;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
	public static int anInt1120;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "Lclient!aga;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_2 = new Class28(6, 0, 4, 2);

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZI)V")
	public static void method782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class216 local9 = Static423.aClass216ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static204.anInt3988 = local9.anInt6016;
			Static211.anInt8112 = local9.anInt6023;
			Static42.anInt1024 = local9.anInt6020;
		}
		Static21.method419();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIB)V")
	public static void method783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(28) Class346 local28 = Static389.aClass346ArrayArrayArray2[arg3][arg1][arg0];
		if (local28 != null) {
			if (arg2 == 1) {
				local28.aShort113 = 0;
			} else if (arg2 == 2) {
				local28.aShort112 = 0;
			}
		}
		Static211.method6710();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)V")
	public static void method784(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(8, arg0);
		local8.method6095();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
	public static void method785() {
		Static408.method5950(Static72.aClass2_Sub12_Sub1_1.aBoolean154);
		Static459.aClass2_Sub10_Sub2_4 = new Class2_Sub10_Sub2();
		Static459.aClass2_Sub10_Sub2_4.method1528();
		Static79.aClass14_1 = Static353.method5264(Static356.aClass287_5, 22050, Static471.aCanvas12, 0);
		Static79.aClass14_1.method5520(Static459.aClass2_Sub10_Sub2_4);
		Static268.method7983(Static459.aClass2_Sub10_Sub2_4, Static493.aClass259_155, Static223.aClass259_67, Static261.aClass259_146);
		Static417.aClass14_2 = Static353.method5264(Static356.aClass287_5, 2048, Static471.aCanvas12, 1);
		Static122.aClass2_Sub10_Sub1_2 = new Class2_Sub10_Sub1();
		Static417.aClass14_2.method5520(Static122.aClass2_Sub10_Sub1_2);
		Static275.aClass335_1 = new Class335(22050, Static162.anInt3474);
		Static62.anInt1437 = Static343.aClass259_88.method5961("scape main");
	}
}
