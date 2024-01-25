import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Lclient!jd;")
	public static final Class153 aClass153_7 = new Class153(5, 1);

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_77 = new Class73(108, 6);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)Z")
	public static boolean method3163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!kaa;IILclient!oa;Lclient!fca;IILclient!ki;)V")
	public static void method3164(@OriginalArg(0) Class168 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14 arg2, @OriginalArg(4) Class6_Sub17 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class176 arg6) {
		@Pc(15) int local15 = arg3.anInt2969 - arg5 / 2 - 5;
		@Pc(19) int local19 = arg4 + 2;
		if (arg6.anInt5083 != 0) {
			arg2.method6859(arg5 + 10, local19, local15, arg6.anInt5083, arg0.method4250() * arg1 + arg4 + 1 - local19);
		}
		if (arg6.anInt5072 != 0) {
			arg2.method6904(arg1 * arg0.method4250() + arg4 + 1 - local19, arg6.anInt5072, local15, local19, arg5 + 10);
		}
		@Pc(74) int local74 = arg6.anInt5074;
		if (arg3.aBoolean212 && arg6.anInt5059 != -1) {
			local74 = arg6.anInt5059;
		}
		for (@Pc(86) int local86 = 0; local86 < arg1; local86++) {
			@Pc(92) String local92 = Static192.aStringArray9[local86];
			if (arg1 - 1 > local86) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg0.method4251(arg2, local92, arg3.anInt2969, arg4, local74);
			arg4 += arg0.method4250();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method3165(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static339.anInt6128 = 9;
		Static112.anInt2178 = 0x1 << Static339.anInt6128;
		Static108.anInt2068 = Static112.anInt2178 >> 1;
		Static138.anInt3089 = (int) Math.sqrt((double) (Static108.anInt2068 * Static108.anInt2068 + Static108.anInt2068 * Static108.anInt2068));
		Static546.anInt9050 = Static112.anInt2178 >> 2;
		Static286.anInt5388 = Static112.anInt2178;
		Static401.anInt7022 = arg0;
		Static555.anInt9182 = arg1;
		Static156.anInt3342 = arg2;
		Static572.aClass276ArrayArrayArray3 = new Class276[4][Static401.anInt7022][Static555.anInt9182];
		Static273.aClass59Array4 = new Class59[4];
		if (arg3) {
			Static314.anIntArrayArray53 = new int[Static401.anInt7022][Static555.anInt9182];
			Static305.aByteArrayArray4 = new byte[Static401.anInt7022][Static555.anInt9182];
			Static132.aShortArrayArray1 = new short[Static401.anInt7022][Static555.anInt9182];
			Static48.aClass276ArrayArrayArray1 = new Class276[1][Static401.anInt7022][Static555.anInt9182];
			Static49.aClass59Array2 = new Class59[1];
		} else {
			Static314.anIntArrayArray53 = null;
			Static305.aByteArrayArray4 = null;
			Static132.aShortArrayArray1 = null;
			Static48.aClass276ArrayArrayArray1 = null;
			Static49.aClass59Array2 = null;
		}
		if (arg4) {
			Static362.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static478.aClass78Array1 = new Class78[65535];
			Static599.aBooleanArray44 = new boolean[65535];
			Static573.anInt9406 = 0;
		} else {
			Static362.aLongArrayArrayArray1 = null;
			Static478.aClass78Array1 = null;
			Static599.aBooleanArray44 = null;
			Static573.anInt9406 = 0;
		}
		Static428.method6156(false);
		Static185.aClass197Array1 = new Class197[1000];
		Static478.anInt8127 = 0;
		Static291.aClass197Array2 = new Class197[1000];
		Static333.anInt6046 = 0;
		Static450.anIntArrayArrayArray4 = new int[4][Static401.anInt7022 + 1][Static555.anInt9182 + 1];
		Static216.aClass4_Sub1Array1 = new Class4_Sub1[5000];
		Static325.anInt5957 = 0;
		Static211.aBooleanArrayArray2 = new boolean[Static156.anInt3342 + Static156.anInt3342 + 1][Static156.anInt3342 + Static156.anInt3342 + 1];
		Static472.aBooleanArrayArray8 = new boolean[Static156.anInt3342 + Static156.anInt3342 + 2][Static156.anInt3342 + Static156.anInt3342 + 2];
		Static476.aClass1_1 = null;
	}
}
