import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "[I")
	public static int[] anIntArray552;

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "[I")
	public static final int[] anIntArray551 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZLclient!mc;)V")
	public static void method8315(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (Static573.aClass151_9 == null) {
			return;
		}
		try {
			Static573.aClass151_9.method3649(0L);
			Static573.aClass151_9.method3650(arg0, arg1.aByteArray93, 24);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V")
	public static void method8318() {
		Static182.method3063();
		Static542.aClass359_128 = null;
		Static433.aClass359_154 = null;
		Static288.anInt5619 = 0;
		Static198.anInt8358 = 0;
		Static42.aClass359_12 = null;
		Static474.aClass5_Sub41_Sub2_2.anInt9230 = 0;
		Static630.anInt10261 = 0;
		Static476.aClass359_174 = null;
		Static377.method5635();
		Static315.method2581();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local30] = null;
		}
		Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 = null;
		for (@Pc(43) int local43 = 0; local43 < Static37.anInt617; local43++) {
			@Pc(49) Class28_Sub1_Sub4_Sub2_Sub1 local49 = Static317.aClass5_Sub25Array1[local43].aClass28_Sub1_Sub4_Sub2_Sub1_1;
			if (local49 != null) {
				local49.anInt5500 = -1;
			}
		}
		Static598.method8189();
		Static660.anInt10605 = 1;
		Static493.anInt8261 = -1;
		Static513.anInt8562 = -1;
		Static271.method4671(10);
		for (@Pc(71) int local71 = 0; local71 < 100; local71++) {
			Static57.aBooleanArray2[local71] = true;
		}
		Static640.method8649();
		Static207.aClass5_Sub29_2 = null;
		Static340.aLong164 = (long) 0;
	}
}
