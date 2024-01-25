import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
	public static int anInt8162;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "[I")
	public static int[] anIntArray438;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_109 = new Class71(1, 2);

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "[I")
	public static final int[] anIntArray439 = new int[1];

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method6712(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static269.aClass16_11 = arg0;
		Static151.anInt3713 = arg1;
		Static403.aBoolean556 = Static151.anInt3713 > 1 && Static269.aClass16_11.method6115();
		Static172.anInt4156 = 9;
		Static572.anInt9827 = 0x1 << Static172.anInt4156;
		Static180.anInt4229 = Static572.anInt9827 >> 1;
		Math.sqrt((double) (Static180.anInt4229 * Static180.anInt4229 + Static180.anInt4229 * Static180.anInt4229));
		Static192.anInt4507 = 4;
		Static489.anInt8688 = arg2;
		Static596.anInt10195 = arg3;
		Static183.anInt4307 = arg4;
		Static227.aClass10_1 = Static234.method4322();
		Static75.method1957();
		Static383.aClass56ArrayArrayArray1 = new Class56[4][Static489.anInt8688][Static596.anInt10195];
		Static86.aClass86Array2 = new Class86[4];
		if (arg5) {
			Static442.anIntArrayArray43 = new int[Static489.anInt8688][Static596.anInt10195];
			Static117.aByteArrayArray48 = new byte[Static489.anInt8688][Static596.anInt10195];
			Static431.aShortArrayArray10 = new short[Static489.anInt8688][Static596.anInt10195];
			Static591.aClass56ArrayArrayArray3 = new Class56[1][Static489.anInt8688][Static596.anInt10195];
			Static253.aClass86Array4 = new Class86[1];
		} else {
			Static442.anIntArrayArray43 = null;
			Static117.aByteArrayArray48 = null;
			Static431.aShortArrayArray10 = null;
			Static591.aClass56ArrayArrayArray3 = null;
			Static253.aClass86Array4 = null;
		}
		if (arg6) {
			Static528.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static626.aClass204Array1 = new Class204[65535];
			Static489.aBooleanArray25 = new boolean[65535];
			Static171.anInt4135 = 0;
		} else {
			Static528.aLongArrayArrayArray1 = null;
			Static626.aClass204Array1 = null;
			Static489.aBooleanArray25 = null;
			Static171.anInt4135 = 0;
		}
		Static287.method4821(false);
		Static234.aClass15_Sub1Array3 = new Class15_Sub1[2];
		Static351.aClass15_Sub1Array4 = new Class15_Sub1[2];
		Static16.aClass15_Sub1Array1 = new Class15_Sub1[2];
		Static76.aClass15_Sub1Array2 = new Class15_Sub1[10000];
		Static42.anInt1523 = 0;
		Static453.aClass15_Sub1Array5 = new Class15_Sub1[5000];
		Static132.anInt3519 = 0;
		Static322.aClass15_Sub1_Sub2Array1 = new Class15_Sub1_Sub2[5000];
		Static1.anInt10286 = 0;
		Static100.aBooleanArrayArray3 = new boolean[Static183.anInt4307 + Static183.anInt4307 + 1][Static183.anInt4307 + Static183.anInt4307 + 1];
		Static565.aBooleanArrayArray8 = new boolean[Static183.anInt4307 + Static183.anInt4307 + 2][Static183.anInt4307 + Static183.anInt4307 + 2];
		Static152.anIntArray197 = new int[Static183.anInt4307 + Static183.anInt4307 + 2];
		Static40.aClass194_2 = Static40.aClass194_1;
		if (Static403.aBoolean556) {
			Static320.aBooleanArrayArrayArray2 = new boolean[4][Static183.anInt4307 + Static183.anInt4307 + 1][Static183.anInt4307 + Static183.anInt4307 + 1];
			Static121.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static394.aClass124Array1 != null) {
				Static163.method3268();
			}
			Static394.aClass124Array1 = new Class124[Static151.anInt3713];
			Static269.aClass16_11.method6099(Static394.aClass124Array1.length + 1);
			Static269.aClass16_11.method6101(0);
			for (@Pc(205) int local205 = 0; local205 < Static394.aClass124Array1.length; local205++) {
				Static394.aClass124Array1[local205] = new Class124(local205 + 1, Static269.aClass16_11);
				(new Thread(Static394.aClass124Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static151.anInt3713 == 2) {
				local240 = 4;
				Static587.anInt10308 = 2;
			} else if (Static151.anInt3713 == 3) {
				local240 = 6;
				Static587.anInt10308 = 3;
			} else {
				local240 = 8;
				Static587.anInt10308 = 4;
			}
			Static49.aClass243Array1 = new Class243[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static49.aClass243Array1[local260] = new Class243(Static443.aStringArrayArray1[Static151.anInt3713 - 2][local260]);
			}
		} else {
			Static587.anInt10308 = 1;
		}
		Static630.anIntArray621 = new int[Static587.anInt10308 - 1];
		Static546.anIntArray513 = new int[Static587.anInt10308 - 1];
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIZ)I")
	public static int method6713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static118.aByteArrayArrayArray20[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static118.aByteArrayArrayArray20[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public static void method6714() {
		@Pc(17) Class8_Sub31 local17 = Static51.method1418(Static280.aClass257_51, Static608.aClass336_1);
		local17.aClass8_Sub8_Sub2_1.method8562(0);
		Static262.method4604(local17);
	}
}
