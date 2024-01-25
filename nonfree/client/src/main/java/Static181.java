import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_105 = new Class202("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
	public static int anInt3350 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIILclient!vo;I)V")
	public static void method2998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub46 arg3, @OriginalArg(5) int arg4) {
		if (arg3.anInt8977 == -1 && arg3.anIntArray690 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg0 > arg3.anInt8979) {
			local15 = arg0 - arg3.anInt8979;
		} else if (arg0 < arg3.anInt8984) {
			local15 = arg3.anInt8984 - arg0;
		}
		@Pc(48) int local48 = arg3.anInt8980 * Static281.aClass2_Sub19_Sub1_1.anInt2202 >> 8;
		if (arg2 > arg3.anInt8976) {
			local15 += arg2 - arg3.anInt8976;
		} else if (arg2 < arg3.anInt8990) {
			local15 += arg3.anInt8990 - arg2;
		}
		if (arg3.anInt8988 == 0 || local15 - 64 > arg3.anInt8988 || Static281.aClass2_Sub19_Sub1_1.anInt2202 == 0 || arg3.anInt8978 != arg1) {
			if (arg3.aClass2_Sub12_Sub3_4 != null) {
				Static288.aClass2_Sub12_Sub2_5.method2088(arg3.aClass2_Sub12_Sub3_4);
				arg3.aClass2_Sub12_Sub3_4 = null;
			}
			if (arg3.aClass2_Sub12_Sub3_3 != null) {
				Static288.aClass2_Sub12_Sub2_5.method2088(arg3.aClass2_Sub12_Sub3_3);
				arg3.aClass2_Sub12_Sub3_3 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(145) int local145 = local48 * (arg3.anInt8988 - local15) / arg3.anInt8988;
		if (arg3.aClass2_Sub12_Sub3_4 != null) {
			arg3.aClass2_Sub12_Sub3_4.method5574(local145);
		} else if (arg3.anInt8977 >= 0) {
			@Pc(160) Class70 local160 = Static550.method2068(Static383.aClass53_109, arg3.anInt8977, 0);
			if (local160 != null) {
				@Pc(167) Class2_Sub31_Sub1 local167 = local160.method2066().method4633(Static460.aClass250_41);
				@Pc(172) Class2_Sub12_Sub3 local172 = Static555.method5570(local167, local145);
				local172.method5579(-1);
				Static288.aClass2_Sub12_Sub2_5.method2086(local172);
				arg3.aClass2_Sub12_Sub3_4 = local172;
			}
		}
		if (arg3.aClass2_Sub12_Sub3_3 != null) {
			arg3.aClass2_Sub12_Sub3_3.method5574(local145);
			if (arg3.aClass2_Sub12_Sub3_3.method7799()) {
				return;
			}
			arg3.aClass2_Sub12_Sub3_3 = null;
		} else if (arg3.anIntArray690 != null && (arg3.anInt8991 -= arg4) <= 0) {
			@Pc(212) int local212 = (int) ((double) arg3.anIntArray690.length * Math.random());
			@Pc(220) Class70 local220 = Static550.method2068(Static383.aClass53_109, arg3.anIntArray690[local212], 0);
			if (local220 != null) {
				@Pc(227) Class2_Sub31_Sub1 local227 = local220.method2066().method4633(Static460.aClass250_41);
				@Pc(232) Class2_Sub12_Sub3 local232 = Static555.method5570(local227, local145);
				local232.method5579(0);
				Static288.aClass2_Sub12_Sub2_5.method2086(local232);
				arg3.anInt8991 = arg3.anInt8975 + (int) ((double) (arg3.anInt8987 - arg3.anInt8975) * Math.random());
				arg3.aClass2_Sub12_Sub3_3 = local232;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
	public static void method2999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub3_2 != null) {
			local7.aClass1_Sub3_2 = null;
		}
		if (local7.aClass1_Sub3_3 != null) {
			local7.aClass1_Sub3_3 = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)I")
	public static int method3001() {
		return Static185.anInt3399;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
	public static int method3002() {
		if (Static36.aFrame1 == null) {
			return Static212.aBoolean301 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
