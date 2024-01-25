import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
	public static int anInt1145;

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_19 = new Class177(35, 7);

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_24 = new Class263(68, 19);

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
	public static final int anInt1142 = 1406;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)V")
	public static void method855(@OriginalArg(0) int arg0) {
		Static125.anInt2777 = arg0;
		Static11.aClass91_4.method1999();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!al;FFFIZIIFF)[B")
	public static byte[] method856(@OriginalArg(1) Class12 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) float arg5) {
		@Pc(18) byte[] local18 = new byte[262144];
		Static23.method496(arg5, arg2, 0, local18, arg3, arg1, arg4, arg0);
		return local18;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)I")
	public static int method857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static113.method1824(arg1 + 91923, 4, arg0 + 45365) + (Static113.method1824(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (Static113.method1824(arg1, 1, arg0) + -128 >> 2) - 128;
		local42 = (int) ((double) local42 * 0.3D) + 35;
		if (local42 < 10) {
			local42 = 10;
		} else if (local42 > 60) {
			local42 = 60;
		}
		return local42;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ec;ZII)V")
	public static void method858(@OriginalArg(0) Class68 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte44 == 0) {
			arg0.anInt2170 = arg0.anInt2110;
		} else if (arg0.aByte44 == 1) {
			arg0.anInt2170 = (arg1 - arg0.anInt2107) / 2 + arg0.anInt2110;
		} else if (arg0.aByte44 == 2) {
			arg0.anInt2170 = arg1 - arg0.anInt2107 - arg0.anInt2110;
		} else if (arg0.aByte44 == 3) {
			arg0.anInt2170 = arg1 * arg0.anInt2110 >> 14;
		} else if (arg0.aByte44 == 4) {
			arg0.anInt2170 = (arg1 - arg0.anInt2107) / 2 + (arg0.anInt2110 * arg1 >> 14);
		} else {
			arg0.anInt2170 = arg1 - arg0.anInt2107 - (arg1 * arg0.anInt2110 >> 14);
		}
		if (arg0.aByte43 == 0) {
			arg0.anInt2175 = arg0.anInt2132;
		} else if (arg0.aByte43 == 1) {
			arg0.anInt2175 = (arg2 - arg0.anInt2149) / 2 + arg0.anInt2132;
		} else if (arg0.aByte43 == 2) {
			arg0.anInt2175 = arg2 - arg0.anInt2149 - arg0.anInt2132;
		} else if (arg0.aByte43 == 3) {
			arg0.anInt2175 = arg0.anInt2132 * arg2 >> 14;
		} else if (arg0.aByte43 == 4) {
			arg0.anInt2175 = (arg0.anInt2132 * arg2 >> 14) + (arg2 - arg0.anInt2149) / 2;
		} else {
			arg0.anInt2175 = arg2 - (arg0.anInt2132 * arg2 >> 14) - arg0.anInt2149;
		}
		if (!Static226.aBoolean281 || Static55.method1059(arg0).anInt5243 == 0 && arg0.anInt2153 != 0) {
			return;
		}
		if (arg0.anInt2170 < 0) {
			arg0.anInt2170 = 0;
		} else if (arg1 < arg0.anInt2107 + arg0.anInt2170) {
			arg0.anInt2170 = arg1 - arg0.anInt2107;
		}
		if (arg0.anInt2175 < 0) {
			arg0.anInt2175 = 0;
		} else if (arg0.anInt2175 + arg0.anInt2149 > arg2) {
			arg0.anInt2175 = arg2 - arg0.anInt2149;
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(II)V")
	public static void method859(@OriginalArg(0) int arg0) {
		Static341.anInt6237 = arg0;
		@Pc(7) Class91 local7 = Static117.aClass91_39;
		synchronized (Static117.aClass91_39) {
			Static117.aClass91_39.method1999();
		}
		local7 = Static406.aClass91_61;
		synchronized (Static406.aClass91_61) {
			Static406.aClass91_61.method1999();
		}
	}
}
