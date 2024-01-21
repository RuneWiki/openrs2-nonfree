import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!fd", name = "eb", descriptor = "Lclient!hd;")
	public static Class3_Sub8 aClass3_Sub8_2;

	@OriginalMember(owner = "client!fd", name = "kb", descriptor = "Lclient!jh;")
	public static Class3_Sub2_Sub2_Sub1_Sub1 aClass3_Sub2_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "[Lclient!md;")
	public static Class51[] aClass51Array1 = new Class51[50];

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
	public static int anInt1212 = 1;

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "[I")
	public static int[] anIntArray229 = new int[1000];

	@OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_383 = Static170.method3101("::gc");

	@OriginalMember(owner = "client!fd", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_384 = Static170.method3101("Angreifen");

	@OriginalMember(owner = "client!fd", name = "ob", descriptor = "Lclient!eh;")
	public static Class28 aClass28_385 = Static170.method3101(" <col=00ff80>");

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!eg;IIIIII)V")
	public static void method1037(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray207.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray207[local5] - Static34.anInt1037;
			local20 = arg0.anIntArray204[local5] - Static125.anInt3217;
			local27 = arg0.anIntArray212[local5] - Static76.anInt2272;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray210 != null) {
				Static40.anIntArray205[local5] = local37;
				Static40.anIntArray215[local5] = local59;
				Static40.anIntArray214[local5] = local69;
			}
			Static40.anIntArray208[local5] = Static13.anInt475 + (local37 << 9) / local69;
			Static40.anIntArray209[local5] = Static13.anInt468 + (local59 << 9) / local69;
		}
		Static13.anInt472 = 0;
		local3 = arg0.anIntArray211.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray211[local13];
			local27 = arg0.anIntArray217[local13];
			local37 = arg0.anIntArray213[local13];
			@Pc(142) int local142 = Static40.anIntArray208[local20];
			@Pc(146) int local146 = Static40.anIntArray208[local27];
			@Pc(150) int local150 = Static40.anIntArray208[local37];
			@Pc(154) int local154 = Static40.anIntArray209[local20];
			@Pc(158) int local158 = Static40.anIntArray209[local27];
			@Pc(162) int local162 = Static40.anIntArray209[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static163.aBoolean187 && Static60.method1403(Static181.anInt4285, Static166.anInt4029, local154, local158, local162, local142, local146, local150)) {
					Static94.anInt2609 = arg5;
					Static17.anInt512 = arg6;
				}
				Static13.aBoolean29 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static13.anInt467 || local146 > Static13.anInt467 || local150 > Static13.anInt467) {
					Static13.aBoolean29 = true;
				}
				if (arg0.anIntArray210 == null || arg0.anIntArray210[local13] == -1) {
					if (arg0.anIntArray216[local13] != 12345678) {
						Static13.method521(local154, local158, local162, local142, local146, local150, arg0.anIntArray216[local13], arg0.anIntArray203[local13], arg0.anIntArray206[local13]);
					}
				} else if (Static92.aBoolean194) {
					@Pc(363) int local363 = Static13.anInterface2_1.method1825(arg0.anIntArray210[local13]);
					Static13.method521(local154, local158, local162, local142, local146, local150, Static7.method215(local363, arg0.anIntArray216[local13]), Static7.method215(local363, arg0.anIntArray203[local13]), Static7.method215(local363, arg0.anIntArray206[local13]));
				} else if (arg0.aBoolean58) {
					Static13.method508(local154, local158, local162, local142, local146, local150, arg0.anIntArray216[local13], arg0.anIntArray203[local13], arg0.anIntArray206[local13], Static40.anIntArray205[0], Static40.anIntArray205[1], Static40.anIntArray205[3], Static40.anIntArray215[0], Static40.anIntArray215[1], Static40.anIntArray215[3], Static40.anIntArray214[0], Static40.anIntArray214[1], Static40.anIntArray214[3], arg0.anIntArray210[local13]);
				} else {
					Static13.method508(local154, local158, local162, local142, local146, local150, arg0.anIntArray216[local13], arg0.anIntArray203[local13], arg0.anIntArray206[local13], Static40.anIntArray205[local20], Static40.anIntArray205[local27], Static40.anIntArray205[local37], Static40.anIntArray215[local20], Static40.anIntArray215[local27], Static40.anIntArray215[local37], Static40.anIntArray214[local20], Static40.anIntArray214[local27], Static40.anIntArray214[local37], arg0.anIntArray210[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!sh;Z)V")
	public static void method1038(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0) {
		if (Static14.anInt481 == arg0.anInt1840 || arg0.anInt1833 == -1 || arg0.anInt1832 != 0 || arg0.anInt1813 + 1 > Static21.method594(arg0.anInt1833).anIntArray139[arg0.anInt1799]) {
			@Pc(30) int local30 = arg0.anInt1840 - arg0.anInt1794;
			@Pc(36) int local36 = Static14.anInt481 - arg0.anInt1794;
			@Pc(46) int local46 = arg0.anInt1787 * 64 + arg0.anInt1818 * 128;
			@Pc(56) int local56 = arg0.anInt1787 * 64 + arg0.anInt1798 * 128;
			@Pc(66) int local66 = arg0.anInt1806 * 128 + arg0.anInt1787 * 64;
			arg0.anInt1800 = (local36 * local66 + local56 * (local30 - local36)) / local30;
			@Pc(91) int local91 = arg0.anInt1834 * 128 + arg0.anInt1787 * 64;
			arg0.anInt1792 = (local46 * (local30 - local36) + local36 * local91) / local30;
		}
		arg0.anInt1784 = 0;
		if (arg0.anInt1820 == 0) {
			arg0.anInt1793 = 1024;
		}
		if (arg0.anInt1820 == 1) {
			arg0.anInt1793 = 1536;
		}
		if (arg0.anInt1820 == 2) {
			arg0.anInt1793 = 0;
		}
		if (arg0.anInt1820 == 3) {
			arg0.anInt1793 = 512;
		}
		arg0.anInt1795 = arg0.anInt1793;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	public static void method1039() {
		aClass51Array1 = null;
		aClass28_383 = null;
		aClass3_Sub2_Sub2_Sub1_Sub1_2 = null;
		aClass28_384 = null;
		anIntArray229 = null;
		aClass28_385 = null;
		aClass3_Sub8_2 = null;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)Z")
	public static boolean method1041(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public static void method1042() {
		Static138.aClass63_25.method2344();
		Static140.aClass63_26.method2344();
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(III)Lclient!ee;")
	public static Class25 method1047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_1;
	}
}
