import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public static int anInt334;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public static int anInt333 = 0;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	public static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!sc;")
	public static Class107 aClass107_125 = Static231.method3737(":tradereq:");

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	public static int[] anIntArray36 = new int[5];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method334() {
		if (Static167.aClass82_3 != null) {
			Static167.aClass82_3.method2395();
			Static167.aClass82_3 = null;
		}
		Static62.method1192();
		Static201.method3227();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static107.aClass60Array1[local17].method1686();
		}
		Static21.method396();
		System.gc();
		Static230.method3727();
		Static179.aBoolean356 = false;
		Static10.anInt276 = -1;
		Static29.method583(true);
		Static36.anInt764 = 0;
		Static152.anInt3377 = 0;
		Static181.aBoolean381 = false;
		for (@Pc(59) int local59 = 0; local59 < Static76.aClass68Array1.length; local59++) {
			Static76.aClass68Array1[local59] = null;
		}
		Static189.anInt4168 = 0;
		Static10.anInt285 = 0;
		for (@Pc(76) int local76 = 0; local76 < 2048; local76++) {
			Static198.aClass5_Sub5_Sub1Array1[local76] = null;
			Static29.aClass1_Sub26Array1[local76] = null;
		}
		for (@Pc(92) int local92 = 0; local92 < 32768; local92++) {
			Static33.aClass5_Sub5_Sub2Array1[local92] = null;
		}
		for (@Pc(106) int local106 = 0; local106 < 4; local106++) {
			for (@Pc(110) int local110 = 0; local110 < 104; local110++) {
				for (@Pc(114) int local114 = 0; local114 < 104; local114++) {
					Static195.aClass120ArrayArrayArray2[local106][local110][local114] = null;
				}
			}
		}
		Static85.method1436();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lclient!cc;")
	public static Class1_Sub2_Sub3 method336(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = (Class1_Sub2_Sub3) Static98.aClass61_37.method1693((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static100.method1673(Static212.aClass28_73, arg0, Static54.aClass28_24);
		if (local10 != null) {
			Static98.aClass61_37.method1694((long) arg0, local10);
		}
		return local10;
	}
}
