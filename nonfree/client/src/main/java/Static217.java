import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hga", name = "C", descriptor = "Lclient!nr;")
	public static Class14_Sub5_Sub3 aClass14_Sub5_Sub3_1;

	@OriginalMember(owner = "client!hga", name = "E", descriptor = "[Lclient!it;")
	public static Class12_Sub2_Sub2[] aClass12_Sub2_Sub2Array1;

	@OriginalMember(owner = "client!hga", name = "F", descriptor = "I")
	public static int anInt4095;

	@OriginalMember(owner = "client!hga", name = "G", descriptor = "Lclient!ega;")
	public static Class90 aClass90_1;

	@OriginalMember(owner = "client!hga", name = "A", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_63 = new Class100(46, 1);

	@OriginalMember(owner = "client!hga", name = "B", descriptor = "I")
	public static int anInt4094 = 0;

	@OriginalMember(owner = "client!hga", name = "D", descriptor = "Lclient!mca;")
	public static final Class14_Sub33 aClass14_Sub33_1 = new Class14_Sub33(0, -1);

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIIII)V")
	public static void method3393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(23) Class58 local23 = Static486.aClass58ArrayArrayArray2[arg5][arg1][arg2];
			if (local23 == null) {
				local23 = new Class58(arg5);
			}
			if (arg3 == 1) {
				local23.aShort23 = (short) arg4;
				local23.aShort21 = (short) arg0;
			} else if (arg3 == 2) {
				local23.aShort24 = (short) arg4;
				local23.aShort22 = (short) arg0;
			}
			if (Static200.aBoolean279) {
				Static469.method9293();
			}
			return;
		}
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(84) int local84;
		@Pc(88) int local88;
		@Pc(98) int local98;
		@Pc(108) int local108;
		if (arg3 != 8) {
			local75 = Static222.anInt4166 + (arg1 << Static579.anInt9935);
			local80 = local75 - Static222.anInt4166;
			local84 = arg2 << Static579.anInt9935;
			local88 = Static222.anInt4166 + local84;
			local98 = Static343.aClass51Array1[arg5].method7857(arg2, arg1 + 1);
			local108 = Static343.aClass51Array1[arg5].method7857(arg2 + 1, arg1);
			Static505.aClass296Array2[Static297.anInt5234++] = new Class296(arg3, arg5, local75, local80, local80, local75, local98, local108, local108 - arg4, local98 - arg4, local84, local88, local88, local84);
			return;
		}
		local75 = arg1 << Static579.anInt9935;
		local80 = Static222.anInt4166 + local75;
		local84 = arg2 << Static579.anInt9935;
		local88 = local84 + Static222.anInt4166;
		local98 = Static343.aClass51Array1[arg5].method7857(arg2, arg1);
		local108 = Static343.aClass51Array1[arg5].method7857(arg2 + 1, arg1 + 1);
		Static505.aClass296Array2[Static297.anInt5234++] = new Class296(arg3, arg5, local75, local80, local80, local75, local98, local108, local108 - arg4, -arg4 + local98, local84, local88, local88, local84);
	}
}
