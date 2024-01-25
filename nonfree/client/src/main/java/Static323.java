import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
	public static int anInt6216 = 1;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
	public static void method5269() {
		for (@Pc(15) Class1_Sub22 local15 = (Class1_Sub22) Static148.aClass16_14.method410(); local15 != null; local15 = (Class1_Sub22) Static148.aClass16_14.method419()) {
			if (local15.aBoolean291) {
				local15.method2812();
			}
		}
		for (@Pc(35) Class1_Sub22 local35 = (Class1_Sub22) Static150.aClass16_15.method410(); local35 != null; local35 = (Class1_Sub22) Static150.aClass16_15.method419()) {
			if (local35.aBoolean291) {
				local35.method2812();
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIZZ)V")
	public static void method5270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static242.anInt6744 = arg0;
		Static315.anInt6124 = arg1;
		Static77.anInt2009 = arg2;
		Static313.aClass194ArrayArrayArray3 = new Class194[4][Static242.anInt6744][Static315.anInt6124];
		Static190.aClass53Array1 = new Class53[4];
		if (arg3) {
			Static91.aClass194ArrayArrayArray2 = new Class194[1][Static242.anInt6744][Static315.anInt6124];
			Static85.anIntArrayArray56 = new int[Static242.anInt6744][Static315.anInt6124];
			Static269.aClass53Array2 = new Class53[1];
		} else {
			Static91.aClass194ArrayArrayArray2 = null;
			Static85.anIntArrayArray56 = null;
			Static269.aClass53Array2 = null;
		}
		if (arg4) {
			Static150.anIntArrayArrayArray9 = new int[4][arg0][arg1];
			Static309.aClass1_Sub30_Sub1Array2 = new Class1_Sub30_Sub1[255];
			Static295.aBooleanArray26 = new boolean[255];
			Static305.anInt6023 = 0;
		} else {
			Static150.anIntArrayArrayArray9 = null;
			Static309.aClass1_Sub30_Sub1Array2 = null;
			Static295.aBooleanArray26 = null;
			Static305.anInt6023 = 0;
		}
		Static177.method3703(false);
		Static121.aClass23Array2 = new Class23[500];
		Static28.anInt1030 = 0;
		Static91.aClass23Array1 = new Class23[500];
		Static318.anInt6133 = 0;
		Static154.anIntArrayArrayArray10 = new int[4][Static242.anInt6744 + 1][Static315.anInt6124 + 1];
		Static245.aClass17_Sub1Array2 = new Class17_Sub1[5000];
		Static19.anInt573 = 0;
		Static253.aBooleanArrayArray6 = new boolean[Static77.anInt2009 + Static77.anInt2009 + 1][Static77.anInt2009 + Static77.anInt2009 + 1];
		Static203.aBooleanArrayArray4 = new boolean[Static77.anInt2009 + Static77.anInt2009 + 2][Static77.anInt2009 + Static77.anInt2009 + 2];
		Static231.aClass42_1 = null;
	}
}
