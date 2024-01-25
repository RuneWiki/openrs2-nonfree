import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
	public static int anInt9462;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "Lclient!vea;")
	public static final Class363 aClass363_14 = new Class363(1);

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "[I")
	public static final int[] anIntArray696 = new int[1000];

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[4];

	@OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
	public static int anInt9463 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!ha;I)V")
	public static void method7822(@OriginalArg(1) int arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) int arg2) {
		Static610.aClass304ArrayArray1 = new Class304[arg0][arg2];
		Static354.aClass137_31 = arg1;
		if (Static1.anIntArray747 != null) {
			Static626.aClass144_4 = Static524.method7530(Static1.anIntArray747[2], Static1.anIntArray747[0], Static1.anIntArray747[1], Static1.anIntArray747[5], Static1.anIntArray747[4], Static1.anIntArray747[3]);
		}
		Static543.aClass304_2 = new Class304();
		Static451.method6547();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(III)Z")
	public static boolean method7824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static379.method9308(arg1, arg0) || Static385.method5715(arg1, arg0);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)I")
	public static int method7828(@OriginalArg(0) int arg0) {
		@Pc(15) byte local15;
		if (arg0 > 12000) {
			local15 = 4;
			Static501.method7348();
		} else if (arg0 > 5000) {
			local15 = 3;
			Static424.method6264();
		} else if (arg0 <= 2000) {
			Static126.method2100();
			local15 = 1;
		} else {
			local15 = 2;
			Static597.method8448();
		}
		if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() != 2) {
			Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, 2);
			Static155.method2506(2, false);
		}
		Static169.method2762();
		return local15;
	}
}
