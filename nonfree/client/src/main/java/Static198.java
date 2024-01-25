import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
	public static int anInt3490;

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "Lclient!wv;")
	public static final Class409 aClass409_5 = new Class409(5, 1);

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "[I")
	public static final int[] anIntArray177 = new int[4096];

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
	public static int anInt3491 = -1;

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIZI)V")
	public static void method2979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(103) Class262 local103 = Static584.aClass262ArrayArrayArray2[arg3][arg2][arg0];
			if (local103 != null) {
				if (arg1 == 1) {
					local103.aShort99 = 0;
				} else if (arg1 == 2) {
					local103.aShort100 = 0;
				}
			}
			Static372.method5397();
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static379.anInt6781; local22++) {
			@Pc(28) Class79 local28 = Static483.aClass79Array3[local22];
			if (local28.aByte35 == arg1 && arg2 == local28.aShort17 && arg0 == local28.aShort16 || local28.aShort19 == arg2 && arg0 == local28.aShort16) {
				if (Static379.anInt6781 != local22) {
					Static735.method9183(Static483.aClass79Array3, local22 + 1, Static483.aClass79Array3, local22, Static483.aClass79Array3.length - local22 - 1);
				}
				Static379.anInt6781--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([Ljava/lang/Object;[IB)V")
	public static void method2983(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static416.method6189(arg1.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)V")
	public static void method2984(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub4_Sub2 local16 = Static502.method7211(20, (long) arg0);
		local16.method627();
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIIIB[B)Z")
	public static boolean method2986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg3 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg2 + 7) / 8);
		for (@Pc(43) int local43 = local32; local43 < 0; local43++) {
			for (@Pc(57) int local57 = local41; local57 < 0; local57++) {
				if (arg4[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local19;
			if (arg4[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg1;
		}
		return false;
	}
}
