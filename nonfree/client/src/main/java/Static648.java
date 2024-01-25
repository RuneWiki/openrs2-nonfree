import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!za", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray42;

	@OriginalMember(owner = "client!za", name = "n", descriptor = "Lclient!dh;")
	public static Class62 aClass62_16 = null;

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
	public static void method8673() {
		Static364.anInt7008++;
		Static333.anInt5422 = 0;
		Static111.anInt2930 = 0;
		Static642.method8646();
		Static130.method2915();
		Static438.method6669();
		@Pc(21) boolean local21 = false;
		@Pc(36) int local36;
		for (@Pc(30) int local30 = 0; local30 < Static333.anInt5422; local30++) {
			local36 = Static489.anIntArray546[local30];
			@Pc(43) Class3_Sub49 local43 = (Class3_Sub49) Static60.aClass307_6.method7424((long) local36);
			@Pc(46) Class2_Sub3_Sub1_Sub2_Sub1 local46 = local43.aClass2_Sub3_Sub1_Sub2_Sub1_2;
			if (Static433.aBoolean672 && Static5.method93(local36)) {
				Static251.method4763();
			}
			if (Static364.anInt7008 != local46.anInt6288) {
				if (local46.aClass22_1.method422()) {
					Static9.method113(local46);
				}
				local46.method2679(null);
				local43.method8671();
				local21 = true;
			}
		}
		if (local21) {
			Static234.anInt5314 = Static60.aClass307_6.method7420();
			Static60.aClass307_6.method7426(Static482.aClass3_Sub49Array1);
		}
		if (Static281.aClass3_Sub15_Sub1_4.anInt10282 != Static172.anInt4126) {
			throw new RuntimeException("gnp1 pos:" + Static281.aClass3_Sub15_Sub1_4.anInt10282 + " psize:" + Static172.anInt4126);
		}
		for (local36 = 0; local36 < Static377.anInt7132; local36++) {
			if (Static60.aClass307_6.method7424((long) Static176.anIntArray229[local36]) == null) {
				throw new RuntimeException("gnp2 pos:" + local36 + " size:" + Static377.anInt7132);
			}
		}
		if (Static234.anInt5314 - Static377.anInt7132 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static234.anInt5314 - Static377.anInt7132));
		}
		for (@Pc(169) int local169 = 0; local169 < Static234.anInt5314; local169++) {
			if (Static482.aClass3_Sub49Array1[local169].aClass2_Sub3_Sub1_Sub2_Sub1_2.anInt6288 != Static364.anInt7008) {
				throw new RuntimeException("gnp4 uk:" + Static482.aClass3_Sub49Array1[local169].aClass2_Sub3_Sub1_Sub2_Sub1_2.anInt6289);
			}
		}
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(III)V")
	public static void method8674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub1_Sub21 local13 = Static57.method8561(arg1, 16);
		local13.method8631();
		local13.anInt10489 = arg0;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IZIBI)Lclient!ub;")
	public static Class3_Sub50 method8675(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub50 local7 = new Class3_Sub50();
		local7.anInt9575 = arg3;
		local7.anInt9574 = arg0;
		Static40.aClass307_5.method7425((long) arg2, local7);
		Static415.method6509(arg3);
		@Pc(31) Class108 local31 = Static113.method8285(arg2);
		if (local31 != null) {
			Static139.method3135(local31);
		}
		if (Static529.aClass108_11 != null) {
			Static139.method3135(Static529.aClass108_11);
			Static529.aClass108_11 = null;
		}
		Static268.method4902();
		if (local31 != null) {
			Static62.method1330(!arg1, local31);
		}
		if (!arg1) {
			Static84.method2225(arg3);
		}
		if (!arg1 && Static530.anInt9144 != -1) {
			Static172.method3556(1, Static530.anInt9144);
		}
		return local7;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IZ)V")
	public static void method8676(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static553.anInt9450;
		@Pc(11) int local11 = Static378.anInt7159;
		if (arg0 && Static216.aBoolean440) {
			local5 <<= 0x1;
			local11 = -local5;
		}
		Static47.aClass33_3.f(local11, local5);
	}
}
