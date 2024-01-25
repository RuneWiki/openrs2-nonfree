import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "Lclient!tca;")
	public static final Class307 aClass307_11 = new Class307(4, 1);

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public static final int anInt5529 = 4;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!r;IIIIIIZZ)V")
	public static void method4716(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static63.aClass12_5 = arg0;
		Static38.anInt1024 = arg1;
		Static50.aBoolean95 = Static38.anInt1024 > 1 && Static63.aClass12_5.method6415();
		Static378.anInt6665 = 9;
		Static47.anInt1239 = 0x1 << Static378.anInt6665;
		Static159.anInt2896 = Static47.anInt1239 >> 1;
		Math.sqrt((double) (Static159.anInt2896 * Static159.anInt2896 + Static159.anInt2896 * Static159.anInt2896));
		Static101.anInt2104 = 4;
		Static446.anInt7725 = arg2;
		Static218.anInt4229 = arg3;
		Static246.anInt8757 = arg4;
		Static301.aClass132_1 = Static93.method1779();
		Static207.method6636();
		Static373.aClass293ArrayArrayArray25 = new Class293[4][Static446.anInt7725][Static218.anInt4229];
		Static158.aClass17Array2 = new Class17[4];
		if (arg5) {
			Static105.anIntArrayArray12 = new int[Static446.anInt7725][Static218.anInt4229];
			Static208.aByteArrayArray27 = new byte[Static446.anInt7725][Static218.anInt4229];
			Static395.aShortArrayArray8 = new short[Static446.anInt7725][Static218.anInt4229];
			Static80.aClass293ArrayArrayArray35 = new Class293[1][Static446.anInt7725][Static218.anInt4229];
			Static499.aClass17Array3 = new Class17[1];
		} else {
			Static105.anIntArrayArray12 = null;
			Static208.aByteArrayArray27 = null;
			Static395.aShortArrayArray8 = null;
			Static80.aClass293ArrayArrayArray35 = null;
			Static499.aClass17Array3 = null;
		}
		if (arg6) {
			Static579.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static502.aClass237Array1 = new Class237[65535];
			Static503.aBooleanArray26 = new boolean[65535];
			Static64.anInt1565 = 0;
		} else {
			Static579.aLongArrayArrayArray1 = null;
			Static502.aClass237Array1 = null;
			Static503.aBooleanArray26 = null;
			Static64.anInt1565 = 0;
		}
		Static200.method3430(false);
		Static166.aClass20_Sub2ArrayArray1 = new Class20_Sub2[2][];
		Static166.aClass20_Sub2ArrayArray1[0] = new Class20_Sub2[Static123.anIntArray153[0]];
		Static166.aClass20_Sub2ArrayArray1[1] = new Class20_Sub2[Static123.anIntArray153[1]];
		Static464.anIntArray526 = new int[2];
		Static386.aClass20_Sub2ArrayArray3 = new Class20_Sub2[2][];
		Static386.aClass20_Sub2ArrayArray3[0] = new Class20_Sub2[Static520.anIntArray589[0]];
		Static386.aClass20_Sub2ArrayArray3[1] = new Class20_Sub2[Static520.anIntArray589[1]];
		Static288.anIntArray327 = new int[2];
		Static379.aClass20_Sub2ArrayArray2 = new Class20_Sub2[2][];
		Static379.aClass20_Sub2ArrayArray2[0] = new Class20_Sub2[Static311.anIntArray358[0]];
		Static379.aClass20_Sub2ArrayArray2[1] = new Class20_Sub2[Static311.anIntArray358[1]];
		Static431.anIntArray499 = new int[2];
		Static128.aClass20_Sub2Array1 = new Class20_Sub2[10000];
		Static132.anInt2643 = 0;
		Static365.aClass20_Sub2Array2 = new Class20_Sub2[5000];
		Static335.anInt5960 = 0;
		Static316.aClass20_Sub2_Sub4Array1 = new Class20_Sub2_Sub4[5000];
		Static428.anInt4959 = 0;
		Static116.aBooleanArrayArray4 = new boolean[Static246.anInt8757 + Static246.anInt8757 + 1][Static246.anInt8757 + Static246.anInt8757 + 1];
		Static89.aBooleanArrayArray3 = new boolean[Static246.anInt8757 + Static246.anInt8757 + 2][Static246.anInt8757 + Static246.anInt8757 + 2];
		if (Static50.aBoolean95) {
			Static471.aBooleanArrayArrayArray2 = new boolean[4][Static246.anInt8757 + Static246.anInt8757 + 1][Static246.anInt8757 + Static246.anInt8757 + 1];
			Static316.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static89.aClass328Array1 != null) {
				Static79.method1646();
			}
			Static89.aClass328Array1 = new Class328[Static38.anInt1024];
			Static63.aClass12_5.method6399(Static89.aClass328Array1.length + 1);
			Static63.aClass12_5.method6428(0);
			for (@Pc(247) int local247 = 0; local247 < Static89.aClass328Array1.length; local247++) {
				Static89.aClass328Array1[local247] = new Class328(local247 + 1, Static63.aClass12_5);
				(new Thread(Static89.aClass328Array1[local247], "wr" + local247)).start();
			}
			@Pc(282) byte local282;
			if (Static38.anInt1024 == 2) {
				local282 = 4;
				Static62.anInt1534 = 2;
			} else if (Static38.anInt1024 == 3) {
				local282 = 6;
				Static62.anInt1534 = 3;
			} else {
				local282 = 8;
				Static62.anInt1534 = 4;
			}
			Static384.aClass294Array3 = new Class294[local282];
			for (@Pc(302) int local302 = 0; local302 < local282; local302++) {
				Static384.aClass294Array3[local302] = new Class294(Static132.aStringArrayArray1[Static38.anInt1024 - 2][local302]);
			}
		} else {
			Static62.anInt1534 = 1;
		}
		Static364.anIntArray427 = new int[Static62.anInt1534 - 1];
		Static208.anIntArray595 = new int[Static62.anInt1534 - 1];
	}
}
