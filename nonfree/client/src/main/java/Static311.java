import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!ko", name = "di", descriptor = "[I")
	public static final int[] anIntArray433 = new int[25];

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIBI)V")
	public static void method4969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = arg2; local3 <= arg0; local3++) {
			Static679.method9323(Static274.anIntArrayArray34[local3], arg4, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method4971(@OriginalArg(1) Class137 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = 0;
		if (Static128.aBoolean202) {
			local7 = Static619.method8679();
			local14 = Static571.method8194();
		}
		Static154.method2474(local7 + Static222.anInt4164, Static624.anInt10515, arg0, Static189.anInt3555, Static370.anInt10482 + local14);
		Static448.aClass38_10.method8985(Static514.aClass303_26.method7473(Static232.anInt4258), -10660793, -1, Static370.anInt10482 + local14 + 14, local7 + 3 + Static222.anInt4164);
		@Pc(62) int local62 = Static666.aClass79_1.method3361() + local7;
		@Pc(68) int local68 = local14 + Static666.aClass79_1.method3358();
		@Pc(72) int local72;
		@Pc(89) int local89;
		if (Static436.aBoolean534) {
			local72 = 0;
			for (@Pc(77) Class14_Sub3_Sub21 local77 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1826(); local77 != null; local77 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1827()) {
				local89 = local72 * 16 + Static370.anInt10482 + local14 + 31;
				if (local77.anInt11129 == 1) {
					Static634.method8858(Static624.anInt10515, local62, local7 + Static222.anInt4164, arg0, Static370.anInt10482 + local14, local68, -256, Static189.anInt3555, -1, local89, (Class14_Sub3_Sub11) local77.aClass73_13.aClass14_Sub3_20.aClass14_Sub3_67);
				} else {
					Static13.method127(local77, Static624.anInt10515, local7 + Static222.anInt4164, local68, arg0, -256, Static189.anInt3555, local14 + Static370.anInt10482, -1, local62, local89);
				}
				local72++;
			}
			if (Static665.aClass14_Sub3_Sub21_4 != null) {
				Static154.method2474(Static652.anInt10893, Static623.anInt10488, arg0, Static62.anInt9091, Static539.anInt9256);
				local72 = 0;
				Static448.aClass38_10.method8985(Static665.aClass14_Sub3_Sub21_4.aString119, -10660793, -1, Static539.anInt9256 + 14, Static652.anInt10893 + 3);
				for (@Pc(174) Class14_Sub3_Sub11 local174 = (Class14_Sub3_Sub11) Static665.aClass14_Sub3_Sub21_4.aClass73_13.method1826(); local174 != null; local174 = (Class14_Sub3_Sub11) Static665.aClass14_Sub3_Sub21_4.aClass73_13.method1827()) {
					@Pc(184) int local184 = Static539.anInt9256 + local72 * 16 + 31;
					Static634.method8858(Static623.anInt10488, local62, Static652.anInt10893, arg0, Static539.anInt9256, local68, -256, Static62.anInt9091, -1, local184, local174);
					local72++;
				}
				Static555.method7801(Static652.anInt10893, Static623.anInt10488, Static539.anInt9256, Static62.anInt9091);
			}
		} else {
			local72 = 0;
			for (@Pc(225) Class14_Sub3_Sub11 local225 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6318(); local225 != null; local225 = (Class14_Sub3_Sub11) Static16.aClass262_68.method6311()) {
				local89 = local14 + Static370.anInt10482 + (-local72 + Static313.anInt9044 - 1) * 16 + 31;
				local72++;
				Static634.method8858(Static624.anInt10515, local62, local7 + Static222.anInt4164, arg0, local14 + Static370.anInt10482, local68, -256, Static189.anInt3555, -1, local89, local225);
			}
		}
		Static555.method7801(local7 + Static222.anInt4164, Static624.anInt10515, Static370.anInt10482 + local14, Static189.anInt3555);
	}

	@OriginalMember(owner = "client!ko", name = "bb", descriptor = "(I)Lclient!bea;")
	public static Class29 method4972() {
		return Static433.method8533();
	}

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "(B)V")
	public static void method4977() {
		Static354.aClass137_31.method7915(Static74.aFloat48, Static324.aFloat148, Static587.aFloat263);
	}
}
