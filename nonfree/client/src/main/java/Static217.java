import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "[I")
	public static final int[] anIntArray207 = new int[50];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method3839(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static472.aClass5_14 = arg0;
		Static514.anInt8985 = arg1;
		Static640.aBoolean844 = Static514.anInt8985 > 1 && Static472.aClass5_14.method6173();
		Static606.anInt10280 = 9;
		Static190.anInt4138 = 0x1 << Static606.anInt10280;
		Static375.anInt7139 = Static190.anInt4138 >> 1;
		Math.sqrt((double) (Static375.anInt7139 * Static375.anInt7139 + Static375.anInt7139 * Static375.anInt7139));
		Static618.anInt10427 = 4;
		Static623.anInt10485 = arg2;
		Static142.anInt3372 = arg3;
		Static456.anInt8195 = arg4;
		Static641.aClass42_1 = Static401.method6314();
		Static507.method7292();
		Static52.aClass186ArrayArrayArray2 = new Class186[4][Static623.anInt10485][Static142.anInt3372];
		Static150.aClass245Array2 = new Class245[4];
		if (arg5) {
			Static80.anIntArrayArray5 = new int[Static623.anInt10485][Static142.anInt3372];
			Static578.aByteArrayArray32 = new byte[Static623.anInt10485][Static142.anInt3372];
			Static527.aShortArrayArray30 = new short[Static623.anInt10485][Static142.anInt3372];
			Static444.aClass186ArrayArrayArray3 = new Class186[1][Static623.anInt10485][Static142.anInt3372];
			Static152.aClass245Array3 = new Class245[1];
		} else {
			Static80.anIntArrayArray5 = null;
			Static578.aByteArrayArray32 = null;
			Static527.aShortArrayArray30 = null;
			Static444.aClass186ArrayArrayArray3 = null;
			Static152.aClass245Array3 = null;
		}
		if (arg6) {
			Static531.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static489.aClass3Array1 = new Class3[65535];
			Static632.aBooleanArray26 = new boolean[65535];
			Static402.anInt7480 = 0;
		} else {
			Static531.aLongArrayArrayArray1 = null;
			Static489.aClass3Array1 = null;
			Static632.aBooleanArray26 = null;
			Static402.anInt7480 = 0;
		}
		Static437.method6710(false);
		Static645.aClass9_Sub4Array6 = new Class9_Sub4[2];
		Static611.aClass9_Sub4Array5 = new Class9_Sub4[2];
		Static249.aClass9_Sub4Array4 = new Class9_Sub4[2];
		Static67.aClass9_Sub4Array3 = new Class9_Sub4[10000];
		Static525.anInt9179 = 0;
		Static547.aClass9_Sub4Array2 = new Class9_Sub4[5000];
		Static604.anInt10261 = 0;
		Static560.aClass9_Sub4_Sub2Array1 = new Class9_Sub4_Sub2[5000];
		Static592.anInt10005 = 0;
		Static137.aBooleanArrayArray1 = new boolean[Static456.anInt8195 + Static456.anInt8195 + 1][Static456.anInt8195 + Static456.anInt8195 + 1];
		Static551.aBooleanArrayArray7 = new boolean[Static456.anInt8195 + Static456.anInt8195 + 2][Static456.anInt8195 + Static456.anInt8195 + 2];
		Static592.anIntArray540 = new int[Static456.anInt8195 + Static456.anInt8195 + 2];
		Static418.aClass100_1 = Static418.aClass100_2;
		if (Static640.aBoolean844) {
			Static71.aBooleanArrayArrayArray1 = new boolean[4][Static456.anInt8195 + Static456.anInt8195 + 1][Static456.anInt8195 + Static456.anInt8195 + 1];
			Static223.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static93.aClass188Array1 != null) {
				Static438.method6714();
			}
			Static93.aClass188Array1 = new Class188[Static514.anInt8985];
			Static472.aClass5_14.method6146(Static93.aClass188Array1.length + 1);
			Static472.aClass5_14.method6170(0);
			for (@Pc(205) int local205 = 0; local205 < Static93.aClass188Array1.length; local205++) {
				Static93.aClass188Array1[local205] = new Class188(local205 + 1, Static472.aClass5_14);
				(new Thread(Static93.aClass188Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static514.anInt8985 == 2) {
				local240 = 4;
				Static40.anInt1428 = 2;
			} else if (Static514.anInt8985 == 3) {
				local240 = 6;
				Static40.anInt1428 = 3;
			} else {
				local240 = 8;
				Static40.anInt1428 = 4;
			}
			Static512.aClass260Array1 = new Class260[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static512.aClass260Array1[local260] = new Class260(Static109.aStringArrayArray1[Static514.anInt8985 - 2][local260]);
			}
		} else {
			Static40.anInt1428 = 1;
		}
		Static509.anIntArray482 = new int[Static40.anInt1428 - 1];
		Static30.anIntArray31 = new int[Static40.anInt1428 - 1];
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([I[JIIZ)V")
	public static void method3844(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) long local16 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local16;
		@Pc(30) int local30 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local30;
		@Pc(48) int local48 = local16 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg2; local50 < arg3; local50++) {
			if (local16 + (long) (local48 & local50) > arg1[local50]) {
				@Pc(68) long local68 = arg1[local50];
				arg1[local50] = arg1[local12];
				arg1[local12] = local68;
				@Pc(82) int local82 = arg0[local50];
				arg0[local50] = arg0[local12];
				arg0[local12++] = local82;
			}
		}
		arg1[arg3] = arg1[local12];
		arg1[local12] = local16;
		arg0[arg3] = arg0[local12];
		arg0[local12] = local30;
		method3844(arg0, arg1, arg2, local12 - 1);
		method3844(arg0, arg1, local12 + 1, arg3);
	}
}
