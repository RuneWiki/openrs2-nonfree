import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
	public static int anInt2907;

	@OriginalMember(owner = "client!fba", name = "A", descriptor = "Z")
	public static boolean aBoolean189;

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_5 = new Class337(9, 7);

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
	public static int anInt2895 = 0;

	@OriginalMember(owner = "client!fba", name = "x", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_44 = new Class130(69, 3);

	@OriginalMember(owner = "client!fba", name = "y", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
	public static void method2666() {
		@Pc(12) Class3_Sub14 local12 = Static139.method2308(Static529.aClass130_118, Static24.aClass233_1);
		local12.aClass3_Sub3_Sub2_2.method4220(0);
		Static562.method8096(local12);
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(II)V")
	public static void method2670(@OriginalArg(1) int arg0) {
		Static380.anInt7101 = -1;
		Static632.anInt10105 = -1;
		Static365.anInt6941 = arg0;
		Static509.method7605();
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!vo;I)V")
	public static void method2678(@OriginalArg(1) Class361 arg0, @OriginalArg(2) int arg1) {
		if (Static393.anInt7276 >= 50 || (arg0 == null || arg0.anIntArrayArray62 == null || arg0.anIntArrayArray62.length <= arg1 || arg0.anIntArrayArray62[arg1] == null)) {
			return;
		}
		@Pc(30) int local30 = arg0.anIntArrayArray62[arg1][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(57) int local57;
		if (arg0.anIntArrayArray62[arg1].length > 1) {
			local57 = (int) (Math.random() * (double) arg0.anIntArrayArray62[arg1].length);
			if (local57 > 0) {
				local34 = arg0.anIntArrayArray62[arg1][local57];
			}
		}
		local57 = 256;
		if (arg0.anIntArray640 != null && arg0.anIntArray637 != null) {
			local57 = Static109.method2232(arg0.anIntArray640[arg1], arg0.anIntArray637[arg1]);
		}
		if (arg0.aBoolean708) {
			Static533.method7799(local40, local34, 0, false, local57, 255);
		} else {
			Static137.method2968(local34, 0, local57, 255, local40);
		}
	}
}
