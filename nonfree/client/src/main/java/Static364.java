import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "F")
	public static float aFloat117;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	public static int anInt6282 = 0;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "[I")
	public static int[] anIntArray410 = new int[1];

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_140 = new Class200(60, 7);

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "Lclient!waa;")
	public static final Class373 aClass373_5 = new Class373("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "Lclient!de;")
	public static final Class69 aClass69_35 = new Class69(4);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method5411(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static380.aClass13_86 = arg0;
		Static601.anInt9959 = arg1;
		Static573.aBoolean668 = Static601.anInt9959 > 1 && Static380.aClass13_86.method8167();
		Static326.anInt5713 = 9;
		Static519.anInt8387 = 0x1 << Static326.anInt5713;
		Static620.anInt10145 = Static519.anInt8387 >> 1;
		Math.sqrt((double) (Static620.anInt10145 * Static620.anInt10145 + Static620.anInt10145 * Static620.anInt10145));
		Static395.anInt6810 = 4;
		Static595.anInt9881 = arg2;
		Static389.anInt6693 = arg3;
		Static621.anInt10151 = arg4;
		Static220.aClass124_1 = Static277.method4491();
		Static151.method2658();
		Static313.aClass84ArrayArrayArray6 = new Class84[4][Static595.anInt9881][Static389.anInt6693];
		Static124.aClass91Array1 = new Class91[4];
		if (arg5) {
			Static356.anIntArrayArray72 = new int[Static595.anInt9881][Static389.anInt6693];
			Static216.aByteArrayArray9 = new byte[Static595.anInt9881][Static389.anInt6693];
			Static348.aShortArrayArray5 = new short[Static595.anInt9881][Static389.anInt6693];
			Static230.aClass84ArrayArrayArray4 = new Class84[1][Static595.anInt9881][Static389.anInt6693];
			Static332.aClass91Array2 = new Class91[1];
		} else {
			Static356.anIntArrayArray72 = null;
			Static216.aByteArrayArray9 = null;
			Static348.aShortArrayArray5 = null;
			Static230.aClass84ArrayArrayArray4 = null;
			Static332.aClass91Array2 = null;
		}
		if (arg6) {
			Static573.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static547.aClass342Array1 = new Class342[65535];
			Static420.aBooleanArray20 = new boolean[65535];
			Static4.anInt53 = 0;
		} else {
			Static573.aLongArrayArrayArray1 = null;
			Static547.aClass342Array1 = null;
			Static420.aBooleanArray20 = null;
			Static4.anInt53 = 0;
		}
		Static192.method3293(false);
		Static524.aClass16_Sub1Array5 = new Class16_Sub1[2];
		Static451.aClass16_Sub1Array3 = new Class16_Sub1[2];
		Static518.aClass16_Sub1Array4 = new Class16_Sub1[2];
		Static330.aClass16_Sub1Array2 = new Class16_Sub1[10000];
		Static627.anInt10196 = 0;
		Static256.aClass16_Sub1Array1 = new Class16_Sub1[5000];
		Static388.anInt6686 = 0;
		Static489.aClass16_Sub1_Sub1Array5 = new Class16_Sub1_Sub1[5000];
		Static184.anInt3672 = 0;
		Static447.aBooleanArrayArray9 = new boolean[Static621.anInt10151 + Static621.anInt10151 + 1][Static621.anInt10151 + Static621.anInt10151 + 1];
		Static139.aBooleanArrayArray3 = new boolean[Static621.anInt10151 + Static621.anInt10151 + 2][Static621.anInt10151 + Static621.anInt10151 + 2];
		Static622.anIntArray715 = new int[Static621.anInt10151 + Static621.anInt10151 + 2];
		Static141.aClass25_2 = Static141.aClass25_1;
		if (Static573.aBoolean668) {
			Static598.aBooleanArrayArrayArray2 = new boolean[4][Static621.anInt10151 + Static621.anInt10151 + 1][Static621.anInt10151 + Static621.anInt10151 + 1];
			Static268.aBooleanArrayArrayArray3 = new boolean[4][][];
			if (Static569.aClass380Array1 != null) {
				Static456.method6481();
			}
			Static569.aClass380Array1 = new Class380[Static601.anInt9959];
			Static380.aClass13_86.method8099(Static569.aClass380Array1.length + 1);
			Static380.aClass13_86.method8139(0);
			for (@Pc(205) int local205 = 0; local205 < Static569.aClass380Array1.length; local205++) {
				Static569.aClass380Array1[local205] = new Class380(local205 + 1, Static380.aClass13_86);
				(new Thread(Static569.aClass380Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static601.anInt9959 == 2) {
				local240 = 4;
				Static17.anInt398 = 2;
			} else if (Static601.anInt9959 == 3) {
				local240 = 6;
				Static17.anInt398 = 3;
			} else {
				local240 = 8;
				Static17.anInt398 = 4;
			}
			Static307.aClass182Array1 = new Class182[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static307.aClass182Array1[local260] = new Class182(Static629.aStringArrayArray1[Static601.anInt9959 - 2][local260]);
			}
		} else {
			Static17.anInt398 = 1;
		}
		Static192.anIntArray247 = new int[Static17.anInt398 - 1];
		Static194.anIntArray248 = new int[Static17.anInt398 - 1];
	}
}
