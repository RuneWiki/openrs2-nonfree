import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!aa;")
	public static Class2 aClass2_12;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Lclient!ul;")
	public static Class255 aClass255_2;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "[Lclient!is;")
	public static Class113[] aClass113Array1;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_88 = new Class214(48, 7);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)V")
	public static void method2204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static425.anInt3667 / (float) Static425.anInt3659;
		@Pc(11) int local11 = arg2;
		@Pc(22) int local22 = arg0;
		if (local9 < 1.0F) {
			local22 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(49) int local49 = arg3 - (arg0 - local22) / 2;
		@Pc(57) int local57 = arg1 - (arg2 - local11) / 2;
		Static97.anInt2096 = Static425.anInt3659 * local57 / local11;
		Static241.anInt4715 = Static425.anInt3667 - local49 * Static425.anInt3667 / local22;
		Static113.anInt2426 = -1;
		Static245.anInt4781 = -1;
		Static142.method2614();
	}
}
