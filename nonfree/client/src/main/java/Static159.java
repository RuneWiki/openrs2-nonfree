import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "[Lclient!pe;")
	public static final Class75[] aClass75Array1 = new Class75[50];

	@OriginalMember(owner = "client!ri", name = "P", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1371 = Static120.method1824("<col=40ff00>");

	@OriginalMember(owner = "client!ri", name = "eb", descriptor = "I")
	public static int anInt3558 = 0;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Z")
	public static boolean method2534(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!rd;Z)Z")
	public static boolean method2538(@OriginalArg(0) Class80 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static116.anInt4479; local16++) {
			if (arg0.method2432(Static141.aClass80Array20[local16])) {
				return true;
			}
		}
		return arg0.method2432(Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.aClass80_1689);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!a;Lclient!lb;)V")
	public static void method2539(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1 arg1, @OriginalArg(3) Class53 arg2) {
		@Pc(7) Class3_Sub12 local7 = new Class3_Sub12();
		local7.anInt1546 = 1;
		local7.aLong154 = arg0;
		local7.aClass1_Sub1_11 = arg1;
		local7.aClass53_3 = arg2;
		@Pc(22) Class70 local22 = Static118.aClass70_14;
		synchronized (Static118.aClass70_14) {
			Static118.aClass70_14.method1958(local7);
		}
		Static29.method489();
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)V")
	public static void method2541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class3_Sub15 local28 = Static185.aClass3_Sub15ArrayArrayArray1[local9][arg0][arg1] = Static185.aClass3_Sub15ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt2003--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt2014; local38++) {
					@Pc(44) Class4 local44 = local28.aClass4Array3[local38];
					if ((local44.aLong4 >> 29 & 0x3L) == 2L && local44.anInt185 == arg0 && local44.anInt188 == arg1) {
						local44.anInt180--;
					}
				}
			}
		}
		if (Static185.aClass3_Sub15ArrayArrayArray1[0][arg0][arg1] == null) {
			Static185.aClass3_Sub15ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub15(0, arg0, arg1);
		}
		Static185.aClass3_Sub15ArrayArrayArray1[0][arg0][arg1].aClass3_Sub15_1 = local7;
		Static185.aClass3_Sub15ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
