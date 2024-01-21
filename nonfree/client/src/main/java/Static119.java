import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "[I")
	public static int[] anIntArray380;

	@OriginalMember(owner = "client!ud", name = "Y", descriptor = "Lclient!eb;")
	public static Class16_Sub1 aClass16_Sub1_17;

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "Lclient!he;")
	private static Class26 aClass26_1691 = Static6.method100("green:");

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "Lclient!he;")
	public static Class26 aClass26_1689 = aClass26_1691;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "Lclient!jf;")
	public static Class35 aClass35_2 = new Class35();

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "Lclient!he;")
	public static Class26 aClass26_1690 = aClass26_1691;

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "Lclient!he;")
	public static Class26 aClass26_1692 = Static6.method100("null");

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "Lclient!he;")
	public static Class26 aClass26_1693 = Static6.method100(" loggt sich ein)3");

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
	public static void method2134() {
		Static33.aClass3_Sub11_Sub1_2.method1036();
		@Pc(7) int local7 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
		if (local7 == 0) {
			return;
		}
		@Pc(27) int local27 = Static33.aClass3_Sub11_Sub1_2.method1031(2);
		if (local27 == 0) {
			Static76.anIntArray206[Static19.anInt512++] = 2047;
			return;
		}
		@Pc(50) int local50;
		@Pc(60) int local60;
		if (local27 == 1) {
			local50 = Static33.aClass3_Sub11_Sub1_2.method1031(3);
			Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.method1882(false, local50);
			local60 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
			if (local60 == 1) {
				Static76.anIntArray206[Static19.anInt512++] = 2047;
			}
			return;
		}
		@Pc(102) int local102;
		if (local27 == 2) {
			local50 = Static33.aClass3_Sub11_Sub1_2.method1031(3);
			Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.method1882(true, local50);
			local60 = Static33.aClass3_Sub11_Sub1_2.method1031(3);
			Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.method1882(true, local60);
			local102 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
			if (local102 == 1) {
				Static76.anIntArray206[Static19.anInt512++] = 2047;
			}
		} else if (local27 == 3) {
			Static132.anInt3270 = Static33.aClass3_Sub11_Sub1_2.method1031(2);
			local50 = Static33.aClass3_Sub11_Sub1_2.method1031(7);
			local60 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
			local102 = Static33.aClass3_Sub11_Sub1_2.method1031(7);
			@Pc(146) int local146 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
			if (local146 == 1) {
				Static76.anIntArray206[Static19.anInt512++] = 2047;
			}
			Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.method1881(local50, local60 == 1, local102);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IJ)V")
	public static void method2135(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static44.anInt1362; local17++) {
			if (Static14.aLongArray1[local17] == arg0) {
				Static44.anInt1362--;
				for (@Pc(39) int local39 = local17; local39 < Static44.anInt1362; local39++) {
					Static14.aLongArray1[local39] = Static14.aLongArray1[local39 + 1];
				}
				Static3.anInt81 = Static71.anInt2023;
				Static107.aClass3_Sub11_Sub1_3.method1029(214);
				Static107.aClass3_Sub11_Sub1_3.method1020(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([Lclient!he;I)Lclient!he;")
	public static Class26 method2136(@OriginalArg(0) Class26[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static105.method1952(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
	public static void method2137() {
		aClass16_Sub1_17 = null;
		anIntArray380 = null;
		aClass26_1689 = null;
		aClass26_1690 = null;
		aClass35_2 = null;
		aClass26_1693 = null;
		aClass26_1691 = null;
		aClass26_1692 = null;
	}
}
