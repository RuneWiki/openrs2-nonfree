import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!be", name = "A", descriptor = "I")
	public static int anInt908 = 16777215;

	@OriginalMember(owner = "client!be", name = "B", descriptor = "Z")
	public static final boolean aBoolean56 = false;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)Z")
	public static boolean method929(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
	public static void method930() {
		Static373.anIntArray489 = Static440.method6255(0.4F);
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
	public static void method931() {
		Static499.method6761();
		Static462.aClass73_148 = null;
		Static385.aClass73_128 = null;
		Static261.aClass73_98 = null;
		Static97.anInt1865 = 0;
		Static530.anInt8824 = 0;
		Static177.anInt3710 = 0;
		Static282.aClass6_Sub21_Sub2_1.anInt7338 = 0;
		Static108.aClass73_41 = null;
		Static50.method1123();
		Static470.method897();
		for (@Pc(34) int local34 = 0; local34 < 2048; local34++) {
			Static588.aClass4_Sub1_Sub1_Sub2Array3[local34] = null;
		}
		Static328.aClass4_Sub1_Sub1_Sub2_2 = null;
		for (@Pc(48) int local48 = 0; local48 < Static535.anInt8885; local48++) {
			@Pc(55) Class4_Sub1_Sub1_Sub1 local55 = Static76.aClass6_Sub34Array7[local48].aClass4_Sub1_Sub1_Sub1_2;
			if (local55 != null) {
				local55.anInt7123 = -1;
			}
		}
		Static32.method909();
		Static346.anInt6215 = 1;
		Static449.method6350(10);
		for (@Pc(77) int local77 = 0; local77 < 100; local77++) {
			Static31.aBooleanArray17[local77] = true;
		}
		Static180.method3269();
		Class273.lb = null;
		Static182.aLong95 = 0L;
	}
}
