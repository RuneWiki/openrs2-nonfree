import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!er", name = "J", descriptor = "J")
	public static long aLong59;

	@OriginalMember(owner = "client!er", name = "T", descriptor = "I")
	public static int anInt3071;

	@OriginalMember(owner = "client!er", name = "Q", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_27 = new Class305(66, 11);

	@OriginalMember(owner = "client!er", name = "S", descriptor = "Lclient!gp;")
	public static final Class139 aClass139_3 = new Class139(4, 1);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method2713(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static10.aClass65_1 = arg0;
		Static581.anInt9529 = arg1;
		Static23.aBoolean21 = Static581.anInt9529 > 1 && Static10.aClass65_1.method6883();
		Static588.anInt9672 = 9;
		Static671.anInt10769 = 0x1 << Static588.anInt9672;
		Static558.anInt7322 = Static671.anInt10769 >> 1;
		Math.sqrt((double) (Static558.anInt7322 * Static558.anInt7322 + Static558.anInt7322 * Static558.anInt7322));
		Static219.anInt4088 = 4;
		Static216.anInt4042 = arg2;
		Static233.anInt4238 = arg3;
		Static187.anInt6996 = arg4;
		Static178.aClass85_1 = Static27.method334();
		Static326.method5071();
		Static606.aClass226ArrayArrayArray2 = new Class226[4][Static216.anInt4042][Static233.anInt4238];
		Static605.aClass109Array5 = new Class109[4];
		if (arg5) {
			Static390.anIntArrayArray33 = new int[Static216.anInt4042][Static233.anInt4238];
			Static25.aByteArrayArray1 = new byte[Static216.anInt4042][Static233.anInt4238];
			Static293.aShortArrayArray7 = new short[Static216.anInt4042][Static233.anInt4238];
			Static413.aClass226ArrayArrayArray1 = new Class226[1][Static216.anInt4042][Static233.anInt4238];
			Static111.aClass109Array3 = new Class109[1];
		} else {
			Static390.anIntArrayArray33 = null;
			Static25.aByteArrayArray1 = null;
			Static293.aShortArrayArray7 = null;
			Static413.aClass226ArrayArrayArray1 = null;
			Static111.aClass109Array3 = null;
		}
		if (arg6) {
			Static101.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static50.aClass199Array1 = new Class199[65535];
			Static221.aBooleanArray41 = new boolean[65535];
			Static667.anInt10686 = 0;
		} else {
			Static101.aLongArrayArrayArray1 = null;
			Static50.aClass199Array1 = null;
			Static221.aBooleanArray41 = null;
			Static667.anInt10686 = 0;
		}
		Static13.method7332(false);
		Static654.aClass28_Sub1Array5 = new Class28_Sub1[2];
		Static135.aClass28_Sub1Array2 = new Class28_Sub1[2];
		Static110.aClass28_Sub1Array1 = new Class28_Sub1[2];
		Static248.aClass28_Sub1Array3 = new Class28_Sub1[10000];
		Static679.anInt10885 = 0;
		Static393.aClass28_Sub1Array4 = new Class28_Sub1[5000];
		Static195.anInt3757 = 0;
		Static213.aClass28_Sub1_Sub4Array4 = new Class28_Sub1_Sub4[5000];
		Static518.anInt8629 = 0;
		Static453.aBooleanArrayArray4 = new boolean[Static187.anInt6996 + Static187.anInt6996 + 1][Static187.anInt6996 + Static187.anInt6996 + 1];
		Static422.aBooleanArrayArray3 = new boolean[Static187.anInt6996 + Static187.anInt6996 + 2][Static187.anInt6996 + Static187.anInt6996 + 2];
		Static112.anIntArray83 = new int[Static187.anInt6996 + Static187.anInt6996 + 2];
		Static296.aClass270_3 = Static296.aClass270_2;
		if (Static23.aBoolean21) {
			Static376.aBooleanArrayArrayArray11 = new boolean[4][Static187.anInt6996 + Static187.anInt6996 + 1][Static187.anInt6996 + Static187.anInt6996 + 1];
			Static194.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static393.aClass204Array1 != null) {
				Static404.method5946();
			}
			Static393.aClass204Array1 = new Class204[Static581.anInt9529];
			Static10.aClass65_1.method6931(Static393.aClass204Array1.length + 1);
			Static10.aClass65_1.method6956(0);
			for (@Pc(205) int local205 = 0; local205 < Static393.aClass204Array1.length; local205++) {
				Static393.aClass204Array1[local205] = new Class204(local205 + 1, Static10.aClass65_1);
				(new Thread(Static393.aClass204Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static581.anInt9529 == 2) {
				local240 = 4;
				Static306.anInt5853 = 2;
			} else if (Static581.anInt9529 == 3) {
				local240 = 6;
				Static306.anInt5853 = 3;
			} else {
				local240 = 8;
				Static306.anInt5853 = 4;
			}
			Static198.aClass289Array2 = new Class289[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static198.aClass289Array2[local260] = new Class289(Static478.aStringArrayArray2[Static581.anInt9529 - 2][local260]);
			}
		} else {
			Static306.anInt5853 = 1;
		}
		Static481.anIntArray450 = new int[Static306.anInt5853 - 1];
		Static661.anIntArray603 = new int[Static306.anInt5853 - 1];
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(II)I")
	public static int method2714(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method2715(@OriginalArg(1) byte[] arg0) {
		return Static602.method8247(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
	public static void method2716() {
		Static23.method291();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLclient!tia;)V")
	public static void method2717(@OriginalArg(1) Class5_Sub41_Sub2 arg0) {
		arg0.method7869();
		@Pc(8) int local8 = Static216.anInt4046;
		@Pc(23) Class28_Sub1_Sub4_Sub2_Sub2 local23 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local8] = new Class28_Sub1_Sub4_Sub2_Sub2();
		local23.anInt5512 = local8;
		@Pc(31) int local31 = arg0.method7871(30);
		@Pc(36) byte local36 = (byte) (local31 >> 28);
		@Pc(42) int local42 = local31 >> 14 & 0x3FFF;
		@Pc(46) int local46 = local31 & 0x3FFF;
		local23.anIntArray308[0] = local42 - Static153.anInt3147;
		local23.anInt10781 = (local23.anIntArray308[0] << 9) + (local23.method4599() << 8);
		local23.anIntArray307[0] = local46 - Static201.anInt3839;
		local23.anInt10784 = (local23.anIntArray307[0] << 9) + (local23.method4599() << 8);
		Static481.anInt8082 = local23.aByte145 = local23.aByte144 = local36;
		if (Static599.method8200(local23.anIntArray307[0], local23.anIntArray308[0])) {
			local23.aByte144++;
		}
		if (Static271.aClass5_Sub41Array2[local8] != null) {
			local23.method4605(Static271.aClass5_Sub41Array2[local8]);
		}
		Static105.anInt2258 = 0;
		Static321.anIntArray339[Static105.anInt2258++] = local8;
		Static199.aByteArray29[local8] = 0;
		Static139.anInt2696 = 0;
		for (@Pc(145) int local145 = 1; local145 < 2048; local145++) {
			if (local145 != local8) {
				@Pc(158) int local158 = arg0.method7871(18);
				@Pc(162) int local162 = local158 >> 16;
				@Pc(168) int local168 = local158 >> 8 & 0xFF;
				@Pc(172) int local172 = local158 & 0xFF;
				@Pc(180) Class33 local180 = Static95.aClass33Array8[local145] = new Class33();
				local180.aBoolean44 = false;
				local180.anInt618 = -1;
				local180.anInt620 = local172 + (local168 << 14) + (local162 << 28);
				local180.aBoolean42 = false;
				local180.anInt616 = 0;
				Static442.anIntArray431[Static139.anInt2696++] = local145;
				Static199.aByteArray29[local145] = 0;
			}
		}
		arg0.method7878();
	}
}
