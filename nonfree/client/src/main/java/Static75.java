import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
	public static int anInt1456;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "Lclient!al;")
	public static final Class15 aClass15_5 = new Class15();

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_58 = new Class194(121, -1);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method1269(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static568.aClass82_14 = arg0;
		Static67.anInt1336 = arg1;
		Static302.aBoolean437 = Static67.anInt1336 > 1 && Static568.aClass82_14.method6104();
		Static485.anInt8241 = 9;
		Static188.anInt3555 = 0x1 << Static485.anInt8241;
		Static493.anInt8365 = Static188.anInt3555 >> 1;
		Math.sqrt((double) (Static493.anInt8365 * Static493.anInt8365 + Static493.anInt8365 * Static493.anInt8365));
		Static603.anInt9778 = 4;
		Static573.anInt6750 = arg2;
		Static547.anInt9143 = arg3;
		Static361.anInt6683 = arg4;
		Static471.aClass166_1 = Static509.method6929();
		Static139.method2381();
		Static303.aClass351ArrayArrayArray3 = new Class351[4][Static573.anInt6750][Static547.anInt9143];
		Static518.aClass91Array2 = new Class91[4];
		if (arg5) {
			Static411.anIntArrayArray48 = new int[Static573.anInt6750][Static547.anInt9143];
			Static52.aByteArrayArray4 = new byte[Static573.anInt6750][Static547.anInt9143];
			Static616.aShortArrayArray20 = new short[Static573.anInt6750][Static547.anInt9143];
			Static126.aClass351ArrayArrayArray1 = new Class351[1][Static573.anInt6750][Static547.anInt9143];
			Static485.aClass91Array1 = new Class91[1];
		} else {
			Static411.anIntArrayArray48 = null;
			Static52.aByteArrayArray4 = null;
			Static616.aShortArrayArray20 = null;
			Static126.aClass351ArrayArrayArray1 = null;
			Static485.aClass91Array1 = null;
		}
		if (arg6) {
			Static387.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static209.aClass339Array1 = new Class339[65535];
			Static79.aBooleanArray2 = new boolean[65535];
			Static162.anInt3228 = 0;
		} else {
			Static387.aLongArrayArrayArray1 = null;
			Static209.aClass339Array1 = null;
			Static79.aBooleanArray2 = null;
			Static162.anInt3228 = 0;
		}
		Static623.method8471(false);
		Static463.aClass9_Sub2Array6 = new Class9_Sub2[2];
		Static250.aClass9_Sub2Array5 = new Class9_Sub2[2];
		Static164.aClass9_Sub2Array1 = new Class9_Sub2[2];
		Static275.aClass9_Sub2Array3 = new Class9_Sub2[10000];
		Static141.anInt2883 = 0;
		Static578.aClass9_Sub2Array7 = new Class9_Sub2[5000];
		Static521.anInt8817 = 0;
		Static513.aClass9_Sub2_Sub1Array1 = new Class9_Sub2_Sub1[5000];
		Static135.anInt2825 = 0;
		Static140.aBooleanArrayArray2 = new boolean[Static361.anInt6683 + Static361.anInt6683 + 1][Static361.anInt6683 + Static361.anInt6683 + 1];
		Static642.aBooleanArrayArray7 = new boolean[Static361.anInt6683 + Static361.anInt6683 + 2][Static361.anInt6683 + Static361.anInt6683 + 2];
		Static549.anIntArray573 = new int[Static361.anInt6683 + Static361.anInt6683 + 2];
		Static460.aClass47_3 = Static460.aClass47_2;
		if (Static302.aBoolean437) {
			Static38.aBooleanArrayArrayArray1 = new boolean[4][Static361.anInt6683 + Static361.anInt6683 + 1][Static361.anInt6683 + Static361.anInt6683 + 1];
			Static412.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static70.aClass301Array1 != null) {
				Static636.method8571();
			}
			Static70.aClass301Array1 = new Class301[Static67.anInt1336];
			Static568.aClass82_14.method6165(Static70.aClass301Array1.length + 1);
			Static568.aClass82_14.method6098(0);
			for (@Pc(205) int local205 = 0; local205 < Static70.aClass301Array1.length; local205++) {
				Static70.aClass301Array1[local205] = new Class301(local205 + 1, Static568.aClass82_14);
				(new Thread(Static70.aClass301Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static67.anInt1336 == 2) {
				local240 = 4;
				Static376.anInt10191 = 2;
			} else if (Static67.anInt1336 == 3) {
				local240 = 6;
				Static376.anInt10191 = 3;
			} else {
				local240 = 8;
				Static376.anInt10191 = 4;
			}
			Static197.aClass250Array1 = new Class250[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static197.aClass250Array1[local260] = new Class250(Static50.aStringArrayArray1[Static67.anInt1336 - 2][local260]);
			}
		} else {
			Static376.anInt10191 = 1;
		}
		Static127.anIntArray170 = new int[Static376.anInt10191 - 1];
		Static48.anIntArray589 = new int[Static376.anInt10191 - 1];
	}
}
