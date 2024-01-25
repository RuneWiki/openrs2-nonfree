import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "[Lclient!nc;")
	public static Interface16[] anInterface16Array1;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "[Lclient!aba;")
	public static Class4[] aClass4Array4;

	@OriginalMember(owner = "client!lba", name = "h", descriptor = "[Lclient!re;")
	public static Class301[] aClass301Array1;

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "[I")
	public static final int[] anIntArray395 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)V")
	public static void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static139.method2092(local7.aClass14_Sub1_Sub3_1);
		Static139.method2092(local7.aClass14_Sub1_Sub3_2);
		if (local7.aClass14_Sub1_Sub3_1 != null) {
			local7.aClass14_Sub1_Sub3_1 = null;
		}
		if (local7.aClass14_Sub1_Sub3_2 != null) {
			local7.aClass14_Sub1_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BI)S")
	public static short method4936(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(42) int local42 = local24 <= 64 ? local24 * local20 >> 7 : local20 * (127 - local24) >> 7;
		@Pc(46) int local46 = local42 + local24;
		@Pc(55) int local55;
		if (local46 == 0) {
			local55 = local42 << 1;
		} else {
			local55 = (local42 << 8) / local46;
		}
		return (short) (local14 << 10 | local55 >> 4 << 7 | local46);
	}
}
