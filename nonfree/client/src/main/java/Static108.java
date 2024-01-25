import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!du", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)Z")
	public static boolean method1616() {
		@Pc(14) boolean local14 = true;
		if (Static288.aClass362_2 == null) {
			if (Static27.aClass126_18.method3077(Static320.anInt5471)) {
				Static288.aClass362_2 = Static692.method8276(Static27.aClass126_18, Static320.anInt5471);
			} else {
				local14 = false;
			}
		}
		if (Static420.aClass362_3 == null) {
			if (Static27.aClass126_18.method3077(Static110.anInt9538)) {
				Static420.aClass362_3 = Static692.method8276(Static27.aClass126_18, Static110.anInt9538);
			} else {
				local14 = false;
			}
		}
		if (Static69.aClass362_1 == null) {
			if (Static27.aClass126_18.method3077(Static405.anInt10900)) {
				Static69.aClass362_1 = Static692.method8276(Static27.aClass126_18, Static405.anInt10900);
			} else {
				local14 = false;
			}
		}
		if (Static653.aClass196_39 == null) {
			if (Static600.aClass126_275.method3077(Static516.anInt8203)) {
				Static653.aClass196_39 = Static321.method4907(Static600.aClass126_275, Static516.anInt8203);
			} else {
				local14 = false;
			}
		}
		if (Static315.aClass362Array1 == null) {
			if (Static27.aClass126_18.method3077(Static516.anInt8203)) {
				Static315.aClass362Array1 = Static692.method8270(Static27.aClass126_18, Static516.anInt8203);
			} else {
				local14 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method1617(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			local8[local17] = local17 + ": ";
			if (arg0 != null && arg0[local17] != null) {
				local8[local17] = local8[local17] + arg0[local17];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZLclient!vf;)V")
	public static void method1618(@OriginalArg(1) Class100_Sub3 arg0) {
		@Pc(21) byte[] local21;
		if (Static589.anObject18 == null) {
			@Pc(14) Class60_Sub1_Sub1 local14 = new Class60_Sub1_Sub1();
			local21 = local14.method5655();
			Static589.anObject18 = Static72.method1167(local21);
		}
		if (Static258.anObject11 == null) {
			@Pc(32) Class60_Sub2_Sub2 local32 = new Class60_Sub2_Sub2();
			local21 = local32.method8981();
			Static258.anObject11 = Static72.method1167(local21);
		}
		@Pc(47) Class271 local47 = arg0.aClass271_1;
		if (local47.method6195() && Static11.anObject1 == null) {
			local21 = Static308.method4794(0.6F, 4.0F, new Class198_Sub1(419684), 4.0F, 16.0F, 0.5F);
			Static11.anObject1 = Static72.method1167(local21);
		}
	}
}
