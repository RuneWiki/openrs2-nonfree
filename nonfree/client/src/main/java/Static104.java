import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!eu", name = "M", descriptor = "I")
	public static int anInt1675;

	@OriginalMember(owner = "client!eu", name = "I", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_36 = new Class231("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!eu", name = "S", descriptor = "I")
	public static int anInt1681 = -1;

	@OriginalMember(owner = "client!eu", name = "T", descriptor = "I")
	public static int anInt1682 = 0;

	@OriginalMember(owner = "client!eu", name = "U", descriptor = "F")
	public static float aFloat13 = 0.0F;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(II)V")
	public static void method1542(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub6 local10 = Static267.method3705(arg0, 8);
		local10.method2578();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([BB)Lclient!aa;")
	public static Class2_Sub1_Sub1 method1543(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class2_Sub1_Sub1 local9 = new Class2_Sub1_Sub1();
		@Pc(14) Class2_Sub17 local14 = new Class2_Sub17(arg0);
		local14.anInt7523 = local14.aByteArray94.length - 2;
		@Pc(25) int local25 = local14.method6148();
		@Pc(36) int local36 = local14.aByteArray94.length - local25 - 2 - 12;
		local14.anInt7523 = local36;
		@Pc(43) int local43 = local14.method6129();
		local9.anInt30 = local14.method6148();
		local9.anInt34 = local14.method6148();
		local9.anInt29 = local14.method6148();
		local9.anInt28 = local14.method6148();
		@Pc(74) int local74 = local14.method6138();
		@Pc(82) int local82;
		@Pc(88) int local88;
		if (local74 > 0) {
			local9.aClass220Array1 = new Class220[local74];
			for (local82 = 0; local82 < local74; local82++) {
				local88 = local14.method6148();
				@Pc(95) Class220 local95 = new Class220(Static43.method654(local88));
				local9.aClass220Array1[local82] = local95;
				while (local88-- > 0) {
					@Pc(106) int local106 = local14.method6129();
					@Pc(110) int local110 = local14.method6129();
					local95.method5104(new Class2_Sub5(local110), (long) local106);
				}
			}
		}
		local14.anInt7523 = 0;
		local9.aString1 = local14.method6121();
		local9.anIntArray4 = new int[local43];
		local9.anIntArray5 = new int[local43];
		local9.aStringArray1 = new String[local43];
		local82 = 0;
		while (local14.anInt7523 < local36) {
			local88 = local14.method6148();
			if (local88 == 3) {
				local9.aStringArray1[local82] = local14.method6141().intern();
			} else if (local88 >= 100 || local88 == 21 || local88 == 38 || local88 == 39) {
				local9.anIntArray4[local82] = local14.method6138();
			} else {
				local9.anIntArray4[local82] = local14.method6129();
			}
			local9.anIntArray5[local82++] = local88;
		}
		return local9;
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)V")
	public static void method1544() {
		Static126.anInt2092 = 0;
		Static409.aClass253Array2 = new Class253[50];
	}

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "(I)V")
	public static void method1545() {
		if (Static126.method1972(Static433.anInt7309) || Static203.method2864(Static433.anInt7309)) {
			Static128.method2035(Static120.anInt2052 >> 10, 5000, Static263.anInt4619 >> 10);
		} else {
			@Pc(27) int local27 = Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray632[0] >> 3;
			@Pc(34) int local34 = Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray633[0] >> 3;
			if (local27 >= 0 && Static234.anInt3949 >> 3 > local27 && local34 >= 0 && Static371.anInt6492 >> 3 > local34) {
				Static128.method2035(local34, 5000, local27);
			} else {
				Static128.method2035(Static371.anInt6492 >> 4, 0, Static234.anInt3949 >> 4);
			}
		}
		Static397.method5502();
		Static433.method5871();
		Static352.method4953();
		Static99.method1442();
	}
}
