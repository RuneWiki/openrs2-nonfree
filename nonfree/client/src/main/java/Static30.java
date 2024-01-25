import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!av", name = "i", descriptor = "I")
	public static int anInt411;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "[I")
	public static final int[] anIntArray32 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!av", name = "f", descriptor = "J")
	public static long aLong31 = 0L;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)[I")
	public static int[] method394() {
		return new int[] { Static551.anInt9039, Static90.anInt1505, Static6.anInt137 };
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method396(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static267.aClass143_6 = arg0;
		Static298.anInt4621 = arg1;
		Static362.aBoolean459 = Static298.anInt4621 > 1 && Static267.aClass143_6.method6234();
		Static138.anInt2287 = 9;
		Static108.anInt1949 = 0x1 << Static138.anInt2287;
		Static143.anInt2383 = Static108.anInt1949 >> 1;
		Math.sqrt((double) (Static143.anInt2383 * Static143.anInt2383 + Static143.anInt2383 * Static143.anInt2383));
		Static202.anInt3256 = 4;
		Static665.anInt7330 = arg2;
		Static92.anInt1526 = arg3;
		Static537.anInt10357 = arg4;
		Static515.aClass60_2 = Static2.method35();
		Static103.method1740();
		Static392.aClass313ArrayArrayArray4 = new Class313[4][Static665.anInt7330][Static92.anInt1526];
		Static230.aClass88Array2 = new Class88[4];
		if (arg5) {
			Static498.anIntArrayArray67 = new int[Static665.anInt7330][Static92.anInt1526];
			Static106.aByteArrayArray2 = new byte[Static665.anInt7330][Static92.anInt1526];
			Static288.aShortArrayArray13 = new short[Static665.anInt7330][Static92.anInt1526];
			Static549.aClass313ArrayArrayArray6 = new Class313[1][Static665.anInt7330][Static92.anInt1526];
			Static176.aClass88Array1 = new Class88[1];
		} else {
			Static498.anIntArrayArray67 = null;
			Static106.aByteArrayArray2 = null;
			Static288.aShortArrayArray13 = null;
			Static549.aClass313ArrayArrayArray6 = null;
			Static176.aClass88Array1 = null;
		}
		if (arg6) {
			Static98.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static602.aClass371Array5 = new Class371[65535];
			Static334.aBooleanArray15 = new boolean[65535];
			Static111.anInt10678 = 0;
		} else {
			Static98.aLongArrayArrayArray1 = null;
			Static602.aClass371Array5 = null;
			Static334.aBooleanArray15 = null;
			Static111.anInt10678 = 0;
		}
		Static249.method3525(false);
		Static271.aClass41_Sub1Array4 = new Class41_Sub1[2];
		Static227.aClass41_Sub1Array3 = new Class41_Sub1[2];
		Static126.aClass41_Sub1Array2 = new Class41_Sub1[2];
		Static284.aClass41_Sub1Array5 = new Class41_Sub1[10000];
		Static26.anInt350 = 0;
		Static5.aClass41_Sub1Array1 = new Class41_Sub1[5000];
		Static676.anInt9313 = 0;
		Static545.aClass41_Sub1_Sub1Array1 = new Class41_Sub1_Sub1[5000];
		Static89.anInt1482 = 0;
		Static10.aBooleanArrayArray1 = new boolean[Static537.anInt10357 + Static537.anInt10357 + 1][Static537.anInt10357 + Static537.anInt10357 + 1];
		Static115.aBooleanArrayArray3 = new boolean[Static537.anInt10357 + Static537.anInt10357 + 2][Static537.anInt10357 + Static537.anInt10357 + 2];
		Static652.anIntArray595 = new int[Static537.anInt10357 + Static537.anInt10357 + 2];
		Static508.aClass89_1 = Static508.aClass89_2;
		if (Static362.aBoolean459) {
			Static630.aBooleanArrayArrayArray2 = new boolean[4][Static537.anInt10357 + Static537.anInt10357 + 1][Static537.anInt10357 + Static537.anInt10357 + 1];
			Static11.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static460.aClass360Array1 != null) {
				Static93.method1443();
			}
			Static460.aClass360Array1 = new Class360[Static298.anInt4621];
			Static267.aClass143_6.method6253(Static460.aClass360Array1.length + 1);
			Static267.aClass143_6.method6218(0);
			for (@Pc(205) int local205 = 0; local205 < Static460.aClass360Array1.length; local205++) {
				Static460.aClass360Array1[local205] = new Class360(local205 + 1, Static267.aClass143_6);
				(new Thread(Static460.aClass360Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static298.anInt4621 == 2) {
				local240 = 4;
				Static286.anInt4496 = 2;
			} else if (Static298.anInt4621 == 3) {
				local240 = 6;
				Static286.anInt4496 = 3;
			} else {
				local240 = 8;
				Static286.anInt4496 = 4;
			}
			Static472.aClass345Array1 = new Class345[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static472.aClass345Array1[local260] = new Class345(Static383.aStringArrayArray2[Static298.anInt4621 - 2][local260]);
			}
		} else {
			Static286.anInt4496 = 1;
		}
		Static439.anIntArray432 = new int[Static286.anInt4496 - 1];
		Static224.anIntArray200 = new int[Static286.anInt4496 - 1];
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIIZ)Lclient!aj;")
	public static Class5_Sub4 method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class5_Sub4 local7 = new Class5_Sub4();
		local7.anInt257 = arg0;
		local7.anInt259 = arg2;
		Static131.aClass335_15.method7770((long) arg1, local7);
		Static462.method6850(arg0);
		@Pc(33) Class394 local33 = Static238.method3422(arg1);
		if (local33 != null) {
			Static609.method8190(local33);
		}
		if (Static415.aClass394_5 != null) {
			Static609.method8190(Static415.aClass394_5);
			Static415.aClass394_5 = null;
		}
		Static190.method2743();
		if (local33 != null) {
			Static547.method7542(!arg3, local33);
		}
		if (!arg3) {
			Static497.method7209(arg0);
		}
		if (!arg3 && Static131.anInt2222 != -1) {
			Static416.method6119(Static131.anInt2222, 1);
		}
		return local7;
	}
}
