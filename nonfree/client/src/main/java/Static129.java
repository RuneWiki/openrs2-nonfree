import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public static int anInt2724;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "[Lclient!qr;")
	public static final Class62_Sub1_Sub2_Sub2[] aClass62_Sub1_Sub2_Sub2Array1 = new Class62_Sub1_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!op;")
	public static final Class148 aClass148_1 = new Class148(250);

	@OriginalMember(owner = "client!i", name = "n", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!i", name = "q", descriptor = "I")
	public static int anInt2728 = 0;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "[I")
	public static final int[] anIntArray236 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)I")
	public static int method2627() {
		if (Static335.aFrame1 == null) {
			return Static58.aBoolean117 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tq;Z)V")
	public static void method2630(@OriginalArg(0) Class191 arg0) {
		Static169.anInt3464 = 0;
		Static7.anInt156 = 0;
		Static28.aClass67_3 = new Class67();
		Static124.aClass55_Sub8_Sub1_Sub1Array2 = new Class55_Sub8_Sub1_Sub1[1024];
		Static280.method5068(arg0);
		Static335.method5806(arg0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!dg;)V")
	public static void method2631(@OriginalArg(1) Class2_Sub10 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static168.anInt3424; local11++) {
			@Pc(17) int local17 = arg0.method4441();
			@Pc(21) int local21 = arg0.method4464();
			if (local21 == 65535) {
				local21 = -1;
			}
			if (Static181.aClass20_Sub1Array2[local17] != null) {
				Static181.aClass20_Sub1Array2[local17].anInt497 = local21;
			}
		}
	}
}
