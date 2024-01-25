import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!hp", name = "cb", descriptor = "Lclient!rd;")
	public static Class168 aClass168_1;

	@OriginalMember(owner = "client!hp", name = "rb", descriptor = "[Lclient!gj;")
	public static Class31[] aClass31Array6;

	@OriginalMember(owner = "client!hp", name = "xb", descriptor = "Z")
	public static boolean aBoolean236;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	public static void method2610() {
		for (@Pc(7) int local7 = -1; local7 < Static214.anInt4133; local7++) {
			@Pc(17) int local17;
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static103.anIntArray218[local7];
			}
			@Pc(25) Class62_Sub1_Sub2_Sub2 local25 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local17];
			if (local25 != null && local25.anInt5340 > 0) {
				local25.anInt5340--;
				if (local25.anInt5340 == 0) {
					local25.aString46 = null;
				}
			}
		}
		for (@Pc(60) int local60 = 0; local60 < Static169.anInt3463; local60++) {
			@Pc(66) int local66 = Static98.anIntArray215[local60];
			@Pc(70) Class62_Sub1_Sub2_Sub1 local70 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local66];
			if (local70 != null && local70.anInt5340 > 0) {
				local70.anInt5340--;
				if (local70.anInt5340 == 0) {
					local70.aString46 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!tq;I)Lclient!th;")
	public static Class188 method2613(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1) {
		@Pc(8) byte[] local8 = arg1.method5448(arg0);
		return local8 == null ? null : new Class188(local8);
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(II)V")
	public static void method2616(@OriginalArg(0) int arg0) {
		if (Static263.anInt5396 == arg0) {
			return;
		}
		if (Static263.anInt5396 == 0) {
			Static237.method4082();
		}
		if (arg0 == 40) {
			Static40.method946();
		}
		if (arg0 != 40 && Static192.aClass173_4 != null) {
			Static192.aClass173_4.method5027();
			Static192.aClass173_4 = null;
		}
		if (Static263.anInt5396 == 25 || Static263.anInt5396 == 28) {
			Static31.aClass191_18.anInt6270 = 2;
			Static233.aClass191_150.anInt6270 = 2;
			Static184.aClass191_116.anInt6270 = 2;
			Static85.aClass191_53.anInt6270 = 2;
			Static68.aClass191_41.anInt6270 = 2;
			Static278.aClass191_182.anInt6270 = 2;
			Static137.aClass191_88.anInt6270 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static79.anInt1746 = 1;
			Static348.anInt6911 = 1;
			Static97.anInt6861 = 0;
			Static203.anInt3381 = 0;
			Static179.anInt3568 = 0;
			Static12.method424(true);
			Static31.aClass191_18.anInt6270 = 1;
			Static233.aClass191_150.anInt6270 = 1;
			Static184.aClass191_116.anInt6270 = 1;
			Static85.aClass191_53.anInt6270 = 1;
			Static68.aClass191_41.anInt6270 = 1;
			Static278.aClass191_182.anInt6270 = 1;
			Static137.aClass191_88.anInt6270 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static139.method2751();
		}
		if (arg0 == 5) {
			Static146.method2863(Static59.aClass191_35, Static147.aClass4_2);
		} else {
			Static32.method796();
		}
		@Pc(152) boolean local152 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(169) boolean local169 = Static263.anInt5396 == 5 || Static263.anInt5396 == 10 || Static263.anInt5396 == 28;
		if (local152 != local169) {
			if (local152) {
				Static216.anInt4152 = Static102.anInt2329;
				if (Static287.anInt5818 == 0) {
					Static169.method3192();
				} else {
					Static114.method5713(Static102.anInt2329, Static91.aClass191_59, 255);
				}
				Static193.aClass165_1.method4805(false);
			} else {
				Static169.method3192();
				Static193.aClass165_1.method4805(true);
				if (Static313.aClass83_1 != null) {
					Static313.aClass83_1.method2507();
					Static313.aClass83_1 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static147.aClass4_2.method4285();
		}
		Static263.anInt5396 = arg0;
	}
}
