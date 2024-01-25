import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "[I")
	public static int[] anIntArray737;

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_295 = new Class235(57, 0);

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
	public static int anInt9639 = 0;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB)I")
	public static int method7860(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!r;Lclient!tca;I)I")
	public static int method7862(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class314 arg1) {
		if (arg1.anInt8502 != -1) {
			return arg1.anInt8502;
		}
		if (arg1.anInt8500 != -1) {
			@Pc(23) Class3 local23 = arg0.anInterface7_10.method3874(arg1.anInt8500);
			if (!local23.aBoolean14) {
				return local23.aShort1;
			}
		}
		return arg1.anInt8497;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!r;IIIIIIZZ)V")
	public static void method7863(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static402.aClass134_11 = arg0;
		Static503.anInt8607 = arg1;
		Static514.aBoolean677 = Static503.anInt8607 > 1 && Static402.aClass134_11.method6952();
		Static351.anInt5832 = 9;
		Static379.anInt6307 = 0x1 << Static351.anInt5832;
		Static142.anInt2687 = Static379.anInt6307 >> 1;
		Math.sqrt((double) (Static142.anInt2687 * Static142.anInt2687 + Static142.anInt2687 * Static142.anInt2687));
		Static175.anInt9133 = 4;
		Static27.anInt373 = arg2;
		Static507.anInt8645 = arg3;
		Static240.anInt4447 = arg4;
		Static295.aClass286_1 = Static424.method5867();
		Static472.method6447();
		Static293.aClass39ArrayArrayArray3 = new Class39[4][Static27.anInt373][Static507.anInt8645];
		Static216.aClass47Array2 = new Class47[4];
		if (arg5) {
			Static114.anIntArrayArray59 = new int[Static27.anInt373][Static507.anInt8645];
			Static548.aByteArrayArray32 = new byte[Static27.anInt373][Static507.anInt8645];
			Static535.aShortArrayArray12 = new short[Static27.anInt373][Static507.anInt8645];
			Static23.aClass39ArrayArrayArray1 = new Class39[1][Static27.anInt373][Static507.anInt8645];
			Static557.aClass47Array3 = new Class47[1];
		} else {
			Static114.anIntArrayArray59 = null;
			Static548.aByteArrayArray32 = null;
			Static535.aShortArrayArray12 = null;
			Static23.aClass39ArrayArrayArray1 = null;
			Static557.aClass47Array3 = null;
		}
		if (arg6) {
			Static91.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static172.aClass79Array1 = new Class79[65535];
			Static571.aBooleanArray25 = new boolean[65535];
			Static369.anInt6129 = 0;
		} else {
			Static91.aLongArrayArrayArray1 = null;
			Static172.aClass79Array1 = null;
			Static571.aBooleanArray25 = null;
			Static369.anInt6129 = 0;
		}
		Static98.method5017(false);
		Static34.aClass8_Sub3ArrayArray4 = new Class8_Sub3[2][];
		Static34.aClass8_Sub3ArrayArray4[0] = new Class8_Sub3[Static274.anIntArray38[0]];
		Static34.aClass8_Sub3ArrayArray4[1] = new Class8_Sub3[Static274.anIntArray38[1]];
		Static11.anIntArray12 = new int[2];
		Static471.aClass8_Sub3ArrayArray3 = new Class8_Sub3[2][];
		Static471.aClass8_Sub3ArrayArray3[0] = new Class8_Sub3[Static484.anIntArray627[0]];
		Static471.aClass8_Sub3ArrayArray3[1] = new Class8_Sub3[Static484.anIntArray627[1]];
		Static437.anIntArray588 = new int[2];
		Static88.aClass8_Sub3ArrayArray2 = new Class8_Sub3[2][];
		Static88.aClass8_Sub3ArrayArray2[0] = new Class8_Sub3[Static196.anIntArray316[0]];
		Static88.aClass8_Sub3ArrayArray2[1] = new Class8_Sub3[Static196.anIntArray316[1]];
		Static583.anIntArray731 = new int[2];
		Static547.aClass8_Sub3Array2 = new Class8_Sub3[10000];
		Static157.anInt2854 = 0;
		Static72.aClass8_Sub3Array1 = new Class8_Sub3[5000];
		Static404.anInt7075 = 0;
		Static410.aClass8_Sub3_Sub3Array1 = new Class8_Sub3_Sub3[5000];
		Static16.anInt203 = 0;
		Static44.aBooleanArrayArray1 = new boolean[Static240.anInt4447 + Static240.anInt4447 + 1][Static240.anInt4447 + Static240.anInt4447 + 1];
		Static228.aBooleanArrayArray2 = new boolean[Static240.anInt4447 + Static240.anInt4447 + 2][Static240.anInt4447 + Static240.anInt4447 + 2];
		if (Static514.aBoolean677) {
			Static587.aBooleanArrayArrayArray2 = new boolean[4][Static240.anInt4447 + Static240.anInt4447 + 1][Static240.anInt4447 + Static240.anInt4447 + 1];
			Static49.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static218.aClass144Array1 != null) {
				Static382.method5221();
			}
			Static218.aClass144Array1 = new Class144[Static503.anInt8607];
			Static402.aClass134_11.method6966(Static218.aClass144Array1.length + 1);
			Static402.aClass134_11.method6943(0);
			for (@Pc(247) int local247 = 0; local247 < Static218.aClass144Array1.length; local247++) {
				Static218.aClass144Array1[local247] = new Class144(local247 + 1, Static402.aClass134_11);
				(new Thread(Static218.aClass144Array1[local247], "wr" + local247)).start();
			}
			@Pc(282) byte local282;
			if (Static503.anInt8607 == 2) {
				local282 = 4;
				Static477.anInt8065 = 2;
			} else if (Static503.anInt8607 == 3) {
				local282 = 6;
				Static477.anInt8065 = 3;
			} else {
				local282 = 8;
				Static477.anInt8065 = 4;
			}
			Static465.aClass160Array1 = new Class160[local282];
			for (@Pc(302) int local302 = 0; local302 < local282; local302++) {
				Static465.aClass160Array1[local302] = new Class160(Static228.aStringArrayArray1[Static503.anInt8607 - 2][local302]);
			}
		} else {
			Static477.anInt8065 = 1;
		}
		Static397.anIntArray736 = new int[Static477.anInt8065 - 1];
		anIntArray737 = new int[Static477.anInt8065 - 1];
	}
}
