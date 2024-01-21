import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!c", name = "U", descriptor = "I")
	public static int anInt442;

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
	public static int anInt446;

	@OriginalMember(owner = "client!c", name = "db", descriptor = "[I")
	public static int[] anIntArray41;

	@OriginalMember(owner = "client!c", name = "R", descriptor = "Lclient!lf;")
	public static Class49 aClass49_272 = Static32.method683("weiss:");

	@OriginalMember(owner = "client!c", name = "T", descriptor = "[I")
	public static int[] anIntArray40 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!c", name = "V", descriptor = "I")
	public static int anInt443 = -1;

	@OriginalMember(owner = "client!c", name = "X", descriptor = "I")
	public static int anInt445 = 0;

	@OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
	public static int anInt449 = 0;

	@OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
	public static final int anInt455 = 3353893;

	@OriginalMember(owner = "client!c", name = "lb", descriptor = "[I")
	public static int[] anIntArray42 = new int[4000];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!df;B)V")
	public static void method389(@OriginalArg(0) Class2_Sub2_Sub2_Sub2 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static167.anIntArray323.length; local9++) {
			Static167.anIntArray323[local9] = 0;
		}
		@Pc(41) int local41;
		for (@Pc(31) int local31 = 0; local31 < 5000; local31++) {
			local41 = (int) (Math.random() * 128.0D * (double) 256);
			Static167.anIntArray323[local41] = (int) (Math.random() * 256.0D);
		}
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(72) int local72;
		for (local41 = 0; local41 < 20; local41++) {
			for (local60 = 1; local60 < 255; local60++) {
				for (local64 = 1; local64 < 127; local64++) {
					local72 = (local60 << 7) + local64;
					Static9.anIntArray12[local72] = (Static167.anIntArray323[local72 + 128] + Static167.anIntArray323[local72 - 128] + Static167.anIntArray323[local72 + 1] + Static167.anIntArray323[local72 + -1]) / 4;
				}
			}
			@Pc(112) int[] local112 = Static167.anIntArray323;
			Static167.anIntArray323 = Static9.anIntArray12;
			Static9.anIntArray12 = local112;
		}
		if (arg0 == null) {
			return;
		}
		local60 = 0;
		for (local64 = 0; local64 < arg0.anInt881; local64++) {
			for (local72 = 0; local72 < arg0.anInt878; local72++) {
				if (arg0.aByteArray11[local60++] != 0) {
					@Pc(146) int local146 = local64 + arg0.anInt882 + 16;
					@Pc(153) int local153 = local72 + arg0.anInt879 + 16;
					@Pc(159) int local159 = (local146 << 7) + local153;
					Static167.anIntArray323[local159] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(B)V")
	public static void method391() {
		anIntArray41 = null;
		anIntArray40 = null;
		anIntArray42 = null;
		aClass49_272 = null;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)V")
	public static void method393(@OriginalArg(1) int arg0) {
		if (Static78.anInt1631 == 0) {
			Static61.aClass2_Sub14_Sub3_1.method2574(arg0);
		} else {
			Static7.anInt133 = arg0;
		}
	}
}
