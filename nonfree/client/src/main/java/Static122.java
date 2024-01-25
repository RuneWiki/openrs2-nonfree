import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
	public static int anInt2173;

	@OriginalMember(owner = "client!eda", name = "q", descriptor = "[Lclient!fh;")
	public static Interface8[] anInterface8Array1;

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "Lclient!eaa;")
	public static final Class80 aClass80_1 = new Class80("LOCAL", 4);

	@OriginalMember(owner = "client!eda", name = "p", descriptor = "[I")
	public static final int[] anIntArray154 = new int[3];

	@OriginalMember(owner = "client!eda", name = "r", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_13 = new Class109();

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!kc;IIIB)V")
	public static void method1774(@OriginalArg(0) Class13_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = arg0.anIntArray307[0];
		@Pc(19) int local19 = arg0.anIntArray306[0];
		if (local14 < 0 || local14 >= Static228.anInt3704 || local19 < 0 || local19 >= Static162.anInt2911 || (arg1 < 0 || arg1 >= Static228.anInt3704 || arg2 < 0 || Static162.anInt2911 <= arg2)) {
			return;
		}
		@Pc(76) int local76 = Static183.method2679(-4, Static210.anIntArray231, Static75.anIntArray107, 0, arg1, true, Static230.aClass240Array1[arg0.aByte127], 0, local14, 0, arg0.method3950(), arg2, local19, 0);
		if (local76 >= 1 && local76 <= 3) {
			for (@Pc(90) int local90 = 0; local90 < local76 - 1; local90++) {
				arg0.method3971(Static75.anIntArray107[local90], Static210.anIntArray231[local90], (byte) 2);
			}
		}
	}
}
