import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!us", name = "i", descriptor = "J")
	public static long aLong249;

	@OriginalMember(owner = "client!us", name = "g", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_234 = new Class87(4);

	@OriginalMember(owner = "client!us", name = "l", descriptor = "Z")
	public static boolean aBoolean699 = false;

	@OriginalMember(owner = "client!us", name = "n", descriptor = "[I")
	public static final int[] anIntArray551 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZB)V")
	public static void method8375(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static337.anInt5727 != -1) {
				Static431.method5476(Static337.anInt5727);
			}
			for (@Pc(14) Class5_Sub27 local14 = (Class5_Sub27) Static269.aClass273_11.method6577(); local14 != null; local14 = (Class5_Sub27) Static269.aClass273_11.method6589()) {
				if (!local14.method9048()) {
					local14 = (Class5_Sub27) Static269.aClass273_11.method6577();
					if (local14 == null) {
						break;
					}
				}
				Static609.method8688(true, local14, false);
			}
			Static337.anInt5727 = -1;
			Static269.aClass273_11 = new Class273(8);
			Static338.method5095();
			Static337.anInt5727 = Static470.anInt9222;
			Static555.method8083(false);
			Static472.method6995();
			Static370.method5466(Static337.anInt5727);
		}
		Static95.aString23 = "";
		Static221.aString43 = "";
		Static418.aBoolean515 = false;
		Static349.method5225();
		Static578.anInt4589 = -1;
		Static469.method6945(Static320.anInt5431);
		Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 = new Class4_Sub2_Sub1_Sub1_Sub1();
		Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 = Static448.anInt7637 * 512 / 2;
		Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 = Static326.anInt5541 * 512 / 2;
		Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0] = Static326.anInt5541 / 2;
		Static117.anInt2170 = 0;
		Static19.anInt277 = 0;
		Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0] = Static448.anInt7637 / 2;
		if (Static254.anInt4612 == 2) {
			Static19.anInt277 = Static578.anInt4590 << 9;
			Static117.anInt2170 = Static378.anInt6261 << 9;
		} else {
			Static218.method3708();
		}
		Static507.method7588();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZBLjava/lang/String;)V")
	public static void method8376(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static217.method3707(arg1, -1, -1, arg0);
	}
}
