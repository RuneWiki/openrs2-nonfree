import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
	public static int anInt853;

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "Lclient!ki;")
	public static final Class183 aClass183_2 = new Class183();

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!jq;IIIIZI)V")
	public static void method957(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (Static228.anInt4641 >= 50 || (arg0 == null || arg0.anIntArrayArray40 == null || arg0.anIntArrayArray40.length <= arg5 || arg0.anIntArrayArray40[arg5] == null)) {
			return;
		}
		@Pc(30) int local30 = arg0.anIntArrayArray40[arg5][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(59) int local59;
		if (arg0.anIntArrayArray40[arg5].length > 1) {
			local59 = (int) (Math.random() * (double) arg0.anIntArrayArray40[arg5].length);
			if (local59 > 0) {
				local34 = arg0.anIntArrayArray40[arg5][local59];
			}
		}
		@Pc(75) int local75 = local30 & 0x1F;
		if (local75 == 0) {
			if (arg4) {
				if (!arg0.aBoolean469) {
					Static546.method7996(255, local34, local40, 0);
					return;
				}
				Static148.method2905(local40, local34, 0, false, 255);
			}
		} else if (Static455.aClass3_Sub27_Sub1_1.anInt4797 != 0) {
			local59 = arg3 - 256 >> 9;
			@Pc(116) int local116 = arg2 - 256 >> 9;
			Static200.aClass64Array1[Static228.anInt4641++] = new Class64((byte) (arg0.aBoolean469 ? 2 : 1), local34, local40, 0, 255, local75 + (local116 << 8) + (local59 << 16) + (arg1 << 24));
		}
	}
}
