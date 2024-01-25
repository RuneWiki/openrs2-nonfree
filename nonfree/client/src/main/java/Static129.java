import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_40 = new Class237(11, 6);

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!qi;")
	public static final Class188 aClass188_2 = new Class188();

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "[I")
	public static final int[] anIntArray212 = new int[5];

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
	public static int anInt2263 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)S")
	public static short method1883(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(41) int local41 = local24 > 64 ? (127 - local24) * local15 >> 7 : local24 * local15 >> 7;
		@Pc(46) int local46 = local24 + local41;
		@Pc(57) int local57;
		if (local46 == 0) {
			local57 = local41 << 1;
		} else {
			local57 = (local41 << 8) / local46;
		}
		return (short) (local9 << 10 | local57 >> 4 << 7 | local46);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!ss;II)V")
	public static void method1884(@OriginalArg(1) Class219 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class62 local10 = arg0.method5127(Static276.aClass109_10);
		if (local10 == null) {
			return;
		}
		Static276.aClass109_10.pa(arg1, arg2, arg1 + arg0.anInt6398, arg2 - -arg0.anInt6363);
		if (Static288.anInt5036 < 3) {
			Static164.aClass80_17.method6092((float) arg1 + (float) arg0.anInt6398 / 2.0F, (float) arg0.anInt6363 / 2.0F + (float) arg2, ((int) -Static274.aFloat78 & 0x3FFF) << 2, local10, arg1, arg2);
		} else {
			Static276.aClass109_10.j(-16777216, local10, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!em;)I")
	public static int method1885(@OriginalArg(1) Class1_Sub8 arg0) {
		@Pc(7) String local7 = Static125.method1868(arg0);
		@Pc(9) int[] local9 = null;
		if (Static396.method5372(arg0.anInt1758)) {
			local9 = Static196.aClass139_1.method3228((int) arg0.aLong50).anIntArray684;
		} else if (arg0.anInt1757 != -1) {
			local9 = Static196.aClass139_1.method3228(arg0.anInt1757).anIntArray684;
		} else if (Static302.method4317(arg0.anInt1758)) {
			@Pc(82) Class26_Sub2_Sub2_Sub2 local82 = Static410.aClass26_Sub2_Sub2_Sub2Array1[(int) arg0.aLong50];
			if (local82 != null) {
				@Pc(87) Class66 local87 = local82.aClass66_1;
				if (local87.anIntArray152 != null) {
					local87 = local87.method1454(Static51.aClass79_1);
				}
				if (local87 != null) {
					local9 = local87.anIntArray151;
				}
			}
		} else if (Static202.method3066(arg0.anInt1758)) {
			@Pc(50) Class182 local50;
			if (arg0.anInt1758 == 1003) {
				local50 = Static71.aClass105_6.method2336((int) arg0.aLong50);
			} else {
				local50 = Static71.aClass105_6.method2336((int) (arg0.aLong50 >>> 32 & 0x7FFFFFFFL));
			}
			if (local50.anIntArray425 != null) {
				local50 = local50.method4388(Static51.aClass79_1);
			}
			if (local50 != null) {
				local9 = local50.anIntArray430;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static31.method549(local9);
		}
		@Pc(136) int local136 = Static167.aClass101_3.method1966(local7, Static364.aClass80Array17);
		if (arg0.aBoolean95) {
			local136 += Static123.aClass80_5.UA() + 4;
		}
		return local136;
	}
}
