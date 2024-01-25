import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!pba", name = "m", descriptor = "I")
	public static int anInt7666;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method6608(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static404.aClass22_6 = arg0;
		Static347.anInt5553 = arg1;
		Static539.aBoolean563 = Static347.anInt5553 > 1 && Static404.aClass22_6.method9386();
		Static626.anInt9669 = 9;
		Static308.anInt4969 = 0x1 << Static626.anInt9669;
		Static434.anInt10639 = Static308.anInt4969 >> 1;
		Math.sqrt((double) (Static434.anInt10639 * Static434.anInt10639 + Static434.anInt10639 * Static434.anInt10639));
		Static169.anInt2992 = 4;
		Static128.anInt2531 = arg2;
		Static448.anInt6835 = arg3;
		Static720.anInt11190 = arg4;
		Static310.aClass157_1 = Static605.method7777();
		Static196.method3480();
		Static422.aClass364ArrayArrayArray1 = new Class364[4][Static128.anInt2531][Static448.anInt6835];
		Static43.aClass259Array1 = new Class259[4];
		if (arg5) {
			Static723.anIntArrayArray72 = new int[Static128.anInt2531][Static448.anInt6835];
			Static393.aByteArrayArray8 = new byte[Static128.anInt2531][Static448.anInt6835];
			Static329.aShortArrayArray2 = new short[Static128.anInt2531][Static448.anInt6835];
			Static660.aClass364ArrayArrayArray3 = new Class364[1][Static128.anInt2531][Static448.anInt6835];
			Static378.aClass259Array2 = new Class259[1];
		} else {
			Static723.anIntArrayArray72 = null;
			Static393.aByteArrayArray8 = null;
			Static329.aShortArrayArray2 = null;
			Static660.aClass364ArrayArrayArray3 = null;
			Static378.aClass259Array2 = null;
		}
		if (arg6) {
			Static136.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static660.aClass8Array1 = new Class8[65535];
			Static677.aBooleanArray33 = new boolean[65535];
			Static309.anInt4982 = 0;
		} else {
			Static136.aLongArrayArrayArray1 = null;
			Static660.aClass8Array1 = null;
			Static677.aBooleanArray33 = null;
			Static309.anInt4982 = 0;
		}
		Static204.method3094(false);
		Static356.aClass9_Sub1Array4 = new Class9_Sub1[2];
		Static120.aClass9_Sub1Array2 = new Class9_Sub1[2];
		Static52.aClass9_Sub1Array1 = new Class9_Sub1[2];
		Static245.aClass9_Sub1Array3 = new Class9_Sub1[10000];
		Static493.anInt7806 = 0;
		Static688.aClass9_Sub1Array5 = new Class9_Sub1[5000];
		Static607.anInt9203 = 0;
		Static656.aClass9_Sub1_Sub1Array1 = new Class9_Sub1_Sub1[5000];
		Static101.anInt2152 = 0;
		Static181.aBooleanArrayArray2 = new boolean[Static720.anInt11190 + Static720.anInt11190 + 1][Static720.anInt11190 + Static720.anInt11190 + 1];
		Static696.aBooleanArrayArray7 = new boolean[Static720.anInt11190 + Static720.anInt11190 + 2][Static720.anInt11190 + Static720.anInt11190 + 2];
		Static419.anIntArray745 = new int[Static720.anInt11190 + Static720.anInt11190 + 2];
		Static673.aClass386_67 = Static673.aClass386_66;
		if (Static539.aBoolean563) {
			Static194.aBooleanArrayArrayArray1 = new boolean[4][Static720.anInt11190 + Static720.anInt11190 + 1][Static720.anInt11190 + Static720.anInt11190 + 1];
			Static232.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static647.aClass405Array1 != null) {
				Static595.method7679();
			}
			Static647.aClass405Array1 = new Class405[Static347.anInt5553];
			Static404.aClass22_6.method9373(Static647.aClass405Array1.length + 1);
			Static404.aClass22_6.method9357(0);
			for (@Pc(214) int local214 = 0; local214 < Static647.aClass405Array1.length; local214++) {
				Static647.aClass405Array1[local214] = new Class405(local214 + 1, Static404.aClass22_6);
				(new Thread(Static647.aClass405Array1[local214], "wr" + local214)).start();
			}
			@Pc(253) byte local253;
			if (Static347.anInt5553 == 2) {
				local253 = 4;
				Static174.anInt3082 = 2;
			} else if (Static347.anInt5553 == 3) {
				local253 = 6;
				Static174.anInt3082 = 3;
			} else {
				local253 = 8;
				Static174.anInt3082 = 4;
			}
			Static306.aClass353Array1 = new Class353[local253];
			for (@Pc(273) int local273 = 0; local273 < local253; local273++) {
				Static306.aClass353Array1[local273] = new Class353(Static372.aStringArrayArray2[Static347.anInt5553 - 2][local273]);
			}
		} else {
			Static174.anInt3082 = 1;
		}
		Static124.anIntArray148 = new int[Static174.anInt3082 - 1];
		Static583.anIntArray646 = new int[Static174.anInt3082 - 1];
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!d;Ljava/awt/Canvas;III)Lclient!ha;")
	public static Class22 method6615(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg3 > -7 ? null : new oa(arg1, arg0, arg4, arg2);
	}
}
