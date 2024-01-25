import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "F")
	public static float aFloat327;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIII)Z")
	public static boolean method6362(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface10 local9 = (Interface10) Static490.method6780(arg2, arg0, arg1);
		@Pc(16) boolean local16 = true;
		if (local9 != null) {
			local16 = Static54.method1114(local9) & true;
		}
		local9 = (Interface10) Static188.method3173(arg2, arg0, arg1, p.class);
		if (local9 != null) {
			local16 &= Static54.method1114(local9);
		}
		local9 = (Interface10) Static469.method6581(arg2, arg0, arg1);
		if (local9 != null) {
			local16 &= Static54.method1114(local9);
		}
		return local16;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBI)V")
	public static void method6363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class227 local9 = Static227.aClass227ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static539.anInt9045 = local9.anInt6889;
			Static405.anInt7248 = local9.anInt6890;
			Static523.anInt8858 = local9.anInt6894;
		}
		method6365();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	public static void method6364() {
		Static230.aClass307_2.method7175();
		Static27.aClass38_1.method1056();
		Static261.aClass211_2.method5219();
		Static453.aClass88_3.method2290();
		Static204.aClass282_1.method6595();
		Static451.aClass67_2.method2010();
		Static155.aClass76_2.method2154();
		Static501.aClass41_2.method1065();
		Static304.aClass162_1.method4087();
		Static117.aClass287_1.method6721();
		Static201.aClass85_1.method2264();
		Static196.aClass274_1.method6378();
		Static358.aClass246_3.method5846();
		Static530.aClass122_1.method3031();
		Static216.aClass298_11.method6968();
		Static175.aClass49_1.method1193();
		Static420.aClass118_10.method3009();
		Static307.aClass139_1.method3298();
		Static454.aClass231_2.method5641();
		Static326.aClass115_3.method2910();
		Static160.method2900();
		Static265.method4421();
		Static485.method6726();
		if (Static134.aClass199_4 != Static124.aClass199_3) {
			for (@Pc(76) int local76 = 0; local76 < Static246.aByteArrayArray28.length; local76++) {
				Static246.aByteArrayArray28[local76] = null;
			}
			Static315.anInt6126 = 0;
		}
		Static137.method1269();
		Static533.method7272();
		Static41.method891();
		Static421.method6051();
		Static160.method2901();
		Static266.aClass288_37.method6744();
		Static110.aClass62_15.method7025();
		Static58.aClass291_1.method6847();
		Static466.method6499();
		Static46.aClass117_21.method2952();
		Static454.aClass117_190.method2952();
		Static212.aClass117_110.method2952();
		Static52.aClass117_28.method2952();
		Static371.aClass117_157.method2952();
		Static338.aClass117_151.method2952();
		Static108.aClass117_61.method2952();
		Static290.aClass117_131.method2952();
		Static533.aClass117_228.method2952();
		Static533.aClass117_229.method2952();
		Static193.aClass117_104.method2952();
		Static56.aClass117_29.method2952();
		Static497.aClass117_234.method2952();
		Static145.aClass117_76.method2952();
		Static476.aClass117_204.method2952();
		Static393.aClass117_164.method2952();
		Static382.aClass117_162.method2952();
		Static437.aClass117_181.method2952();
		Static315.aClass117_141.method2952();
		Static178.aClass117_97.method2952();
		Static444.aClass117_183.method2952();
		Static162.aClass117_88.method2952();
		Static435.aClass117_180.method2952();
		Static317.aClass117_142.method2952();
		Static539.aClass117_232.method2952();
		Static72.aClass117_35.method2952();
		Static419.aClass117_175.method2952();
		Static79.aClass117_38.method2952();
		Static541.aClass117_233.method2952();
		Static466.aClass117_199.method2952();
		Static530.aClass117_226.method2952();
		Static337.aClass117_149.method2952();
		Static337.aClass288_44.method6744();
		Static443.aClass288_57.method6744();
		Static530.aClass288_71.method6744();
		Static313.aClass288_42.method6744();
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
	public static void method6365() {
		Static206.aClass62_24.M(Static457.aFloat331 * ((float) Static300.aClass5_Sub28_Sub1_1.anInt4878 * 0.1F + 0.7F));
		Static206.aClass62_24.m(Static426.anInt7527, Static482.aFloat346, Static59.aFloat39, (float) (Static405.anInt7248 << 0), (float) (Static539.anInt9045 << 0), (float) (Static523.anInt8858 << 0));
		Static206.aClass62_24.method7067(Static232.aClass92_2);
	}
}
