import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "Lclient!su;")
	public static Class298 aClass298_170;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[F")
	public static final float[] aFloatArray66 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_133 = new Class98(55, 28);

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
	public static int anInt8064 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!gh;)V")
	public static void method6397(@OriginalArg(1) Class60_Sub3 arg0) {
		arg0.aClass15_Sub2_Sub4_1 = null;
		if (Static497.anInt8653 < 20) {
			Static360.aClass349_13.method7893(arg0);
			Static497.anInt8653++;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method6399() {
		Static340.aClass6_Sub12_Sub2_1.method6042(Static186.aClass248_28.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static194.aClass248_30.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static265.aClass248_37.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static532.aClass248_103.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static492.aClass248_96.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static88.aClass248_15.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static262.aClass248_36.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static509.aClass248_75.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static114.aClass248_20.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static182.aClass248_25.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static333.aClass248_54.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static63.aClass248_11.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static63.aClass248_10.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static550.aClass248_107.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static35.aClass248_8.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static460.aClass248_89.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static274.aClass248_41.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static282.aClass248_43.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static107.aClass248_16.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static572.aClass248_109.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static535.aClass248_105.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static364.aClass248_63.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static277.aClass248_42.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static302.aClass248_45.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static295.aClass248_44.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static483.aClass248_94.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static557.aClass248_108.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static259.aClass248_35.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static134.aClass248_83.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static440.aClass248_84.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static482.aClass248_93.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static347.aClass248_58.method5801());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static138.method2966());
		Static340.aClass6_Sub12_Sub2_1.method6042(Static106.method3432());
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)I")
	public static int method6401() {
		return Static98.anIntArray146 == null ? 0 : Static98.anIntArray146.length * 2;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIB)V")
	public static void method6403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		Static264.method4006(arg0 + arg2, arg1, arg0 - arg2, Static155.anIntArrayArray32[arg3]);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(52) int[] local52 = Static155.anIntArrayArray32[local9 + arg3];
				@Pc(59) int[] local59 = Static155.anIntArrayArray32[arg3 - local9];
				@Pc(64) int local64 = arg0 + local7;
				@Pc(68) int local68 = arg0 - local7;
				Static264.method4006(local64, arg1, local68, local52);
				Static264.method4006(local64, arg1, local68, local59);
			}
			@Pc(84) int local84 = arg0 + local9;
			@Pc(89) int local89 = arg0 - local9;
			@Pc(96) int[] local96 = Static155.anIntArrayArray32[arg3 + local7];
			@Pc(103) int[] local103 = Static155.anIntArrayArray32[arg3 - local7];
			Static264.method4006(local84, arg1, local89, local96);
			Static264.method4006(local84, arg1, local89, local103);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!jr;)Lclient!ar;")
	public static Class19_Sub1 method6406(@OriginalArg(1) Class6_Sub12 arg0) {
		return new Class19_Sub1(arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6023(), arg0.method6037(), arg0.method6019());
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B[S)[S")
	public static short[] method6410(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static596.method7722(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
