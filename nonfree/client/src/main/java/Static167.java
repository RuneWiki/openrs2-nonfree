import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "B")
	public static byte aByte8;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!d;")
	public static Class1_Sub6_Sub1 aClass1_Sub6_Sub1_3 = new Class1_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public static int anInt4526 = 1;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
	public static int anInt4529 = 0;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
	public static int[] anIntArray412 = new int[50];

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "[I")
	public static int[] anIntArray413 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	public static void method3065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static169.anInt4604 != 0 && Static169.anInt4604 != 3 || Static145.anInt4043 != 1) {
			return;
		}
		@Pc(25) int local25 = Static74.anInt2247 - arg0 - 25;
		@Pc(31) int local31 = Static91.anInt2764 - arg1 - 5;
		if (local25 < 0 || local31 < 0 || local25 >= 146 || local31 >= 151) {
			return;
		}
		@Pc(50) int local50 = Static180.anInt4777 + Static98.anInt3021 & 0x7FF;
		local25 -= 73;
		@Pc(55) int local55 = Class1_Sub1_Sub8_Sub4.anIntArray212[local50];
		local31 -= 75;
		@Pc(64) int local64 = (Static160.anInt4384 + 256) * local55 >> 8;
		@Pc(68) int local68 = Class1_Sub1_Sub8_Sub4.anIntArray216[local50];
		@Pc(76) int local76 = local68 * (Static160.anInt4384 + 256) >> 8;
		@Pc(87) int local87 = local76 * local31 - local25 * local64 >> 11;
		@Pc(97) int local97 = local31 * local64 + local25 * local76 >> 11;
		@Pc(105) int local105 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 - local87 >> 7;
		@Pc(112) int local112 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 + local97 >> 7;
		@Pc(132) boolean local132 = Static12.method3143(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray315[0], 0, local112, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray314[0], true, 1, 0, 0, 0, local105, 0);
		if (!local132) {
			return;
		}
		Static95.aClass1_Sub6_Sub1_1.method530(local25);
		Static95.aClass1_Sub6_Sub1_1.method530(local31);
		Static95.aClass1_Sub6_Sub1_1.method531(Static98.anInt3021);
		Static95.aClass1_Sub6_Sub1_1.method530(57);
		Static95.aClass1_Sub6_Sub1_1.method530(Static180.anInt4777);
		Static95.aClass1_Sub6_Sub1_1.method530(Static160.anInt4384);
		Static95.aClass1_Sub6_Sub1_1.method530(89);
		Static95.aClass1_Sub6_Sub1_1.method531(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579);
		Static95.aClass1_Sub6_Sub1_1.method531(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558);
		Static95.aClass1_Sub6_Sub1_1.method530(Static51.anInt1671);
		Static95.aClass1_Sub6_Sub1_1.method530(63);
		return;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!ob;)V")
	public static void method3066(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1) {
		if (Static144.aClass1_Sub6_5 == null) {
			Static37.method764(true, 255, 0, null, (byte) 0, 255);
			Static21.aClass16_Sub1Array1[arg0] = arg1;
		} else {
			Static144.aClass1_Sub6_5.anInt839 = arg0 * 8 + 5;
			@Pc(18) int local18 = Static144.aClass1_Sub6_5.method499();
			@Pc(22) int local22 = Static144.aClass1_Sub6_5.method499();
			arg1.method2262(local18, local22);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method3067() {
		anIntArray412 = null;
		anIntArray413 = null;
		aClass1_Sub6_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method3068(@OriginalArg(1) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static24.anInt867 > 0) {
			local24 = Static21.aByteArrayArray3[--Static24.anInt867];
			Static21.aByteArrayArray3[Static24.anInt867] = null;
			return local24;
		} else if (arg0 == 5000 && Static48.anInt1567 > 0) {
			local24 = Static57.aByteArrayArray10[--Static48.anInt1567];
			Static57.aByteArrayArray10[Static48.anInt1567] = null;
			return local24;
		} else if (arg0 == 30000 && Static29.anInt975 > 0) {
			local24 = Static47.aByteArrayArray18[--Static29.anInt975];
			Static47.aByteArrayArray18[Static29.anInt975] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}
}
