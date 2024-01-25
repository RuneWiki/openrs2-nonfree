import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "Lclient!jc;")
	public static Class14_Sub5_Sub2 aClass14_Sub5_Sub2_2;

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "Lclient!saa;")
	public static final Class310 aClass310_16 = new Class310(4, 1);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)V")
	public static void method7838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg1 != Static371.anInt6835) {
			Static160.anIntArray258 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static160.anIntArray258[local13] = (local13 << 12) / arg1;
			}
			Static192.anInt3590 = arg1 - 1;
			Static371.anInt6835 = arg1;
			Static391.anInt7194 = arg1 * 32;
		}
		if (arg0 == Static535.anInt9239) {
			return;
		}
		if (arg0 == Static371.anInt6835) {
			Static336.anIntArray458 = Static160.anIntArray258;
		} else {
			Static336.anIntArray458 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static336.anIntArray458[local13] = (local13 << 12) / arg0;
			}
		}
		Static52.anInt1266 = arg0 - 1;
		Static535.anInt9239 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BILclient!js;)Z")
	public static boolean method7841(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub29_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method4289(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		if (local8 == 0) {
			if (arg1.method4289(1) != 0) {
				method7841(arg0, arg1);
			}
			local31 = arg1.method4289(6);
			local36 = arg1.method4289(6);
			@Pc(46) boolean local46 = arg1.method4289(1) == 1;
			if (local46) {
				Static403.anIntArray537[Static537.anInt9246++] = arg0;
			}
			if (Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(69) Class2 local69 = Static360.aClass2Array1[arg0];
			@Pc(77) Class12_Sub2_Sub2_Sub1_Sub2 local77 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[arg0] = new Class12_Sub2_Sub2_Sub1_Sub2();
			local77.anInt2945 = arg0;
			if (Static308.aClass14_Sub29Array1[arg0] != null) {
				local77.method2433(Static308.aClass14_Sub29Array1[arg0]);
			}
			local77.method2423(true, local69.anInt9);
			local77.anInt2903 = local69.anInt4;
			local103 = local69.anInt8;
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			@Pc(117) int local117 = local103 & 0xFF;
			@Pc(126) int local126 = (local113 << 6) + local31 - Static329.anInt6225;
			local77.aBoolean231 = local69.aBoolean1;
			local77.aBoolean229 = local69.aBoolean2;
			@Pc(143) int local143 = local36 + (local117 << 6) - Static202.anInt3755;
			local77.aByteArray43[0] = Static243.aByteArray56[arg0];
			local77.aByte146 = local77.aByte145 = (byte) local107;
			if (Static329.method5158(local143, local126)) {
				local77.aByte145++;
			}
			local77.method2442(local126, local143);
			local77.aBoolean227 = false;
			Static360.aClass2Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg1.method4289(2);
			local36 = Static360.aClass2Array1[arg0].anInt8;
			Static360.aClass2Array1[arg0].anInt8 = (local36 & 0xFFFFFFF) + (((local36 >> 28) + local31 & 0x3) << 28);
			return false;
		} else {
			@Pc(233) int local233;
			@Pc(238) int local238;
			@Pc(246) int local246;
			if (local8 != 2) {
				local31 = arg1.method4289(18);
				local36 = local31 >> 16;
				local233 = local31 >> 8 & 0xFF;
				local238 = local31 & 0xFF;
				local246 = Static360.aClass2Array1[arg0].anInt8;
				local103 = local36 + (local246 >> 28) & 0x3;
				local107 = (local246 >> 14) + local233 & 0xFF;
				local113 = local238 + local246 & 0xFF;
				Static360.aClass2Array1[arg0].anInt8 = (local103 << 28) + (local107 << 14) + local113;
				return false;
			}
			local31 = arg1.method4289(5);
			local36 = local31 >> 3;
			local233 = local31 & 0x7;
			local238 = Static360.aClass2Array1[arg0].anInt8;
			local246 = (local238 >> 28) + local36 & 0x3;
			local103 = local238 >> 14 & 0xFF;
			local107 = local238 & 0xFF;
			if (local233 == 0) {
				local107--;
				local103--;
			}
			if (local233 == 1) {
				local107--;
			}
			if (local233 == 2) {
				local103++;
				local107--;
			}
			if (local233 == 3) {
				local103--;
			}
			if (local233 == 4) {
				local103++;
			}
			if (local233 == 5) {
				local107++;
				local103--;
			}
			if (local233 == 6) {
				local107++;
			}
			if (local233 == 7) {
				local103++;
				local107++;
			}
			Static360.aClass2Array1[arg0].anInt8 = (local103 << 14) + (local246 << 28) + local107;
			return false;
		}
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(III)Z")
	public static boolean method7844(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static193.method2994(arg0, arg1) || Static385.method5715(arg1, arg0);
	}
}
