import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!he", name = "N", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!he", name = "R", descriptor = "[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] aClass3_Sub2_Sub3_Sub3Array4;

	@OriginalMember(owner = "client!he", name = "U", descriptor = "Lclient!kb;")
	private static Class46 aClass46_547 = Static65.method1172("Examine");

	@OriginalMember(owner = "client!he", name = "V", descriptor = "Lclient!kb;")
	private static Class46 aClass46_548 = Static65.method1172("Login server offline)3");

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
	public static int anInt1634 = 0;

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_549 = aClass46_547;

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
	public static int anInt1635 = 0;

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_550 = aClass46_548;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIILclient!dg;II)V")
	public static void method1122(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static88.anInt2165 >= 50 || (arg2.anIntArray77 == null || arg2.anIntArray77.length <= arg1)) {
			return;
		}
		@Pc(25) int local25 = arg2.anIntArray77[arg1];
		if (local25 == 0) {
			return;
		}
		@Pc(32) int local32 = local25 & 0xF;
		@Pc(38) int local38 = local25 >> 4 & 0x7;
		@Pc(42) int local42 = local25 >> 8;
		if (local32 == 0) {
			if (arg0) {
				Static13.method292(local38, 0, local42);
			}
		} else if (Static147.anInt3353 != 0) {
			@Pc(67) int local67 = (arg3 - 64) / 128;
			Static123.anIntArray332[Static88.anInt2165] = local42;
			Static49.anIntArray126[Static88.anInt2165] = local38;
			Static90.anIntArray225[Static88.anInt2165] = 0;
			@Pc(85) int local85 = (arg4 - 64) / 128;
			Static146.aClass24Array1[Static88.anInt2165] = null;
			Static63.anIntArray155[Static88.anInt2165] = (local85 << 8) + (local67 << 16) + local32;
			Static88.anInt2165++;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IIZ)V")
	public static void method1123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static97.anInt1739 != 0 && Static97.anInt1739 != 3 || Static127.anInt3013 != 1) {
			return;
		}
		@Pc(22) int local22 = Static77.anInt1923 - arg0 - 25;
		@Pc(29) int local29 = Static48.anInt1329 - arg1 - 5;
		if (local22 < 0 || local29 < 0 || local22 >= 146 || local29 >= 151) {
			return;
		}
		@Pc(48) int local48 = Static29.anInt697 + Static81.anInt2039 & 0x7FF;
		local22 -= 73;
		local29 -= 75;
		@Pc(54) int local54 = Class3_Sub2_Sub3_Sub4.anIntArray347[local48];
		@Pc(62) int local62 = (Static172.anInt3773 + 256) * local54 >> 8;
		@Pc(66) int local66 = Class3_Sub2_Sub3_Sub4.anIntArray346[local48];
		@Pc(74) int local74 = (Static172.anInt3773 + 256) * local66 >> 8;
		@Pc(85) int local85 = local62 * local29 + local74 * local22 >> 11;
		@Pc(92) int local92 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 + local85 >> 7;
		@Pc(103) int local103 = local29 * local74 - local22 * local62 >> 11;
		@Pc(111) int local111 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 - local103 >> 7;
		@Pc(131) boolean local131 = Static6.method100(0, true, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 0, 1, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local111, 0, 0, 0, local92);
		if (!local131) {
			return;
		}
		Static133.aClass3_Sub4_Sub1_3.method206(local22);
		Static133.aClass3_Sub4_Sub1_3.method206(local29);
		Static133.aClass3_Sub4_Sub1_3.method198(Static29.anInt697);
		Static133.aClass3_Sub4_Sub1_3.method206(57);
		Static133.aClass3_Sub4_Sub1_3.method206(Static81.anInt2039);
		Static133.aClass3_Sub4_Sub1_3.method206(Static172.anInt3773);
		Static133.aClass3_Sub4_Sub1_3.method206(89);
		Static133.aClass3_Sub4_Sub1_3.method198(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700);
		Static133.aClass3_Sub4_Sub1_3.method198(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711);
		Static133.aClass3_Sub4_Sub1_3.method206(Static182.anInt4005);
		Static133.aClass3_Sub4_Sub1_3.method206(63);
		return;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	public static void method1124() {
		aClass46_548 = null;
		aClass46_547 = null;
		aClass3_Sub2_Sub3_Sub3Array4 = null;
		aClass46_550 = null;
		aByteArrayArrayArray4 = null;
		aClass46_549 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)V")
	public static void method1125(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static150.aBoolean146) {
			Static4.method2684();
		} else if (arg0 != -1 && (Static170.anInt3767 != arg0 || !Static74.method1246()) && Static68.anInt1768 != 0 && !Static150.aBoolean146) {
			Static88.method1473(arg0, Static53.aClass44_Sub1_5, Static68.anInt1768, 0);
		}
		Static170.anInt3767 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IBI)I")
	public static int method1126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7 local8 = (Class3_Sub7) Static28.aClass54_2.method1602((long) arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < local8.anIntArray69.length; local33++) {
				if (arg1 == local8.anIntArray70[local33]) {
					local31 += local8.anIntArray69[local33];
				}
			}
			return local31;
		}
	}
}
