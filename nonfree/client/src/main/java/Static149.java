import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
	public static int anInt3135;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "[I")
	public static final int[] anIntArray146 = new int[4];

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
	public static int anInt3137 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
	public static void method2820() {
		Static419.aClass223_54.method5398();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method2821(@OriginalArg(0) Class1_Sub4_Sub2_Sub1 arg0) {
		if (arg0.anIntArray461 == null && arg0.anIntArray458 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray461.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray461 != null) {
				local20 = arg0.anIntArray461[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(72) int local72;
				@Pc(88) int local88;
				@Pc(56) int local56;
				if ((-1073741824 & local20) == -1073741824) {
					local56 = local20 & 0xFFFFFFF;
					@Pc(60) int local60 = local56 >> 14;
					local72 = arg0.anInt9934 - (local60 - Static552.anInt9805) * 512 - 256;
					@Pc(76) int local76 = local56 & 0x3FFF;
					local88 = arg0.anInt9935 - (local76 - Static254.anInt4667) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(101) Class4_Sub4 local101 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local20);
					if (local101 == null) {
						arg0.method6926(-1, local16);
						continue;
					}
					@Pc(106) Class1_Sub4_Sub2_Sub1_Sub1 local106 = local101.aClass1_Sub4_Sub2_Sub1_Sub1_1;
					local88 = arg0.anInt9935 - local106.anInt9935;
					local72 = arg0.anInt9934 - local106.anInt9934;
				} else {
					local56 = local20 & 0x7FFF;
					@Pc(137) Class1_Sub4_Sub2_Sub1_Sub2 local137 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local56];
					if (local137 == null) {
						arg0.method6926(-1, local16);
						continue;
					}
					local88 = arg0.anInt9935 - local137.anInt9935;
					local72 = arg0.anInt9934 - local137.anInt9934;
				}
				if (local72 != 0 || local88 != 0) {
					arg0.method6926((int) (Math.atan2((double) local72, (double) local88) * 2607.5945876176133D) & 0x3FFF, local16);
				}
			} else if (!arg0.method6926(-1, local16)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray458 = null;
			arg0.anIntArray461 = null;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
	public static void method2822() {
		@Pc(9) int local9;
		if (Static8.aClass314Array1 != null) {
			for (local9 = 0; local9 < Static343.anInt6653; local9++) {
				Static8.aClass314Array1[local9] = null;
			}
			Static8.aClass314Array1 = null;
		}
		if (Static485.aClass314Array4 != null) {
			for (local9 = 0; local9 < Static180.anInt3623; local9++) {
				Static485.aClass314Array4[local9] = null;
			}
			Static485.aClass314Array4 = null;
		}
		if (Static430.aClass314Array3 != null) {
			for (local9 = 0; local9 < Static195.anInt3778; local9++) {
				Static430.aClass314Array3[local9] = null;
			}
			Static430.aClass314Array3 = null;
		}
		Static5.anIntArray5 = null;
		Static70.aClass314Array2 = null;
		Static582.anInt10109 = -1;
		Static47.anInt645 = -1;
		Static300.anIntArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIFFF)F")
	public static float method2823(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static228.aFloatArrayArray3[arg0];
		return arg1 * local12[2] + arg2 * local12[0] + arg3 * local12[1];
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	public static void method2824(@OriginalArg(0) int arg0) {
		Static381.anInt7743 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static182.anInt3633; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static253.anInt4651; local6++) {
				if (Static60.aClass53ArrayArrayArray1[arg0][local3][local6] == null) {
					Static60.aClass53ArrayArrayArray1[arg0][local3][local6] = new Class53(arg0);
				}
			}
		}
	}
}
