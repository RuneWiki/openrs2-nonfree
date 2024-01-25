import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
	public static int anInt1480;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "Lclient!cv;")
	public static Class51 aClass51_5 = new Class51(8);

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_89 = new Class12(19, 8);

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_27 = new Class96("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[128][128];

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!nk;I)Z")
	public static boolean method1174(@OriginalArg(0) Class174 arg0) {
		return Static251.aClass174_6 == arg0 || Static61.aClass174_1 == arg0 || Static300.aClass174_8 == arg0 || Static182.aClass174_4 == arg0;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([BI)Lclient!ss;")
	public static Class1_Sub1_Sub14 method1175(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class1_Sub1_Sub14 local9 = new Class1_Sub1_Sub14();
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		local14.anInt5695 = local14.aByteArray65.length - 2;
		@Pc(30) int local30 = local14.method4498();
		@Pc(40) int local40 = local14.aByteArray65.length - local30 - 2 - 12;
		local14.anInt5695 = local40;
		@Pc(47) int local47 = local14.method4500();
		local9.anInt6723 = local14.method4498();
		local9.anInt6725 = local14.method4498();
		local9.anInt6724 = local14.method4498();
		local9.anInt6719 = local14.method4498();
		@Pc(71) int local71 = local14.method4548();
		@Pc(82) int local82;
		@Pc(88) int local88;
		if (local71 > 0) {
			local9.aClass51Array1 = new Class51[local71];
			for (local82 = 0; local82 < local71; local82++) {
				local88 = local14.method4498();
				@Pc(95) Class51 local95 = new Class51(Static30.method427(local88));
				local9.aClass51Array1[local82] = local95;
				while (local88-- > 0) {
					@Pc(108) int local108 = local14.method4500();
					@Pc(114) int local114 = local14.method4500();
					local95.method931(new Class1_Sub37(local114), (long) local108);
				}
			}
		}
		local14.anInt5695 = 0;
		local9.aString77 = local14.method4550();
		local9.anIntArray497 = new int[local47];
		local9.anIntArray496 = new int[local47];
		local9.aStringArray38 = new String[local47];
		local82 = 0;
		while (local40 > local14.anInt5695) {
			local88 = local14.method4498();
			if (local88 == 3) {
				local9.aStringArray38[local82] = local14.method4509().intern();
			} else if (local88 >= 100 || local88 == 21 || local88 == 38 || local88 == 39) {
				local9.anIntArray497[local82] = local14.method4548();
			} else {
				local9.anIntArray497[local82] = local14.method4500();
			}
			local9.anIntArray496[local82++] = local88;
		}
		return local9;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
	public static void method1176() {
		Static201.aClass1_Sub14_Sub2_2.anInt5695 = 0;
		Static397.aClass12_345 = null;
		Static108.anInt2094 = 0;
		Static225.anInt3905 = 0;
		Static369.aClass12_329 = null;
		Static133.aClass12_129 = null;
		Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
		Static282.anInt4732 = 0;
		Static84.aClass12_300 = null;
		Static195.method3036();
		Static47.method640();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static362.aClass47_Sub1_Sub5_Sub2Array1[local31] = null;
		}
		Static255.aClass47_Sub1_Sub5_Sub2_2 = null;
		for (@Pc(54) int local54 = 0; local54 < Static307.aClass47_Sub1_Sub5_Sub1Array1.length; local54++) {
			@Pc(60) Class47_Sub1_Sub5_Sub1 local60 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local54];
			if (local60 != null) {
				local60.anInt5378 = -1;
			}
		}
		Static224.method3276();
		Static57.anInt883 = 1;
		Static169.method2637(30);
		for (@Pc(83) int local83 = 0; local83 < 100; local83++) {
			Static204.aBooleanArray15[local83] = true;
		}
		Static294.method4014();
		Static396.aLong208 = 0L;
		Static205.aClass1_Sub4_4 = null;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)I")
	public static int method1178(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}
}
