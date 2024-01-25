import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
	public static final int anInt4594 = 1408;

	@OriginalMember(owner = "client!jd", name = "J", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_57 = new Class187(87, -1);

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "[I")
	public static final int[] anIntArray269 = new int[13];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	public static void method4050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(6, (long) arg1);
		local9.method2438();
		local9.anInt2749 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)I")
	public static int method4051(@OriginalArg(1) boolean arg0) {
		if (Static596.anIntArray547 == null) {
			return 0;
		} else if (arg0 || Static429.aClass176Array1 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < Static596.anIntArray547.length; local20++) {
				@Pc(25) int local25 = Static596.anIntArray547[local20];
				if (Static663.aClass50_187.method897(local25)) {
					local18++;
				}
				if (Static108.aClass50_31.method897(local25)) {
					local18++;
				}
			}
			return local18;
		} else {
			return Static596.anIntArray547.length * 2;
		}
	}
}
