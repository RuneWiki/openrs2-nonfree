import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "Lclient!di;")
	public static final Class54 aClass54_85 = new Class54(42, 3);

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_132 = new Class209("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZI)V")
	public static void method4686(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static82.anInt1800++;
			Static277.method4068();
		}
		if (arg0) {
			Static252.anInt4749++;
			Static279.method4093();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method4687(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static79.anInt1766;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class264 local22 = Static250.aClass78_1.method1963(arg0[local13]);
			if (local22.anInt7225 != -1) {
				@Pc(34) Class17 local34 = (Class17) Static236.aClass171_38.method3941((long) local22.anInt7225);
				if (local34 == null) {
					@Pc(42) Class85 local42 = Static459.method2069(Static153.aClass160_25, local22.anInt7225, 0);
					if (local42 != null) {
						local34 = Static33.aClass49_1.method4435(local42);
						Static236.aClass171_38.method3940((long) local22.anInt7225, local34);
					}
				}
				if (local34 != null) {
					Static90.aClass17Array3[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
