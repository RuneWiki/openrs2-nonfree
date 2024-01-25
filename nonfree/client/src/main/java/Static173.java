import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!gaa", name = "J", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "Lclient!oq;")
	public static final Class248 aClass248_3 = new Class248();

	@OriginalMember(owner = "client!gaa", name = "I", descriptor = "Z")
	public static boolean aBoolean311 = false;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!lr;")
	public static Class9_Sub4_Sub2 method3262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class168 local14 = local7.aClass168_3; local14 != null; local14 = local14.aClass168_2) {
			@Pc(18) Class9_Sub4_Sub2 local18 = local14.aClass9_Sub4_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort115 == arg1 && local18.aShort114 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg2; local12 <= arg1; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg0; local16++) {
				if (Static634.anIntArrayArray68[local12][local16] == arg4 && Static612.anIntArrayArray65[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)V")
	public static void method3267(@OriginalArg(0) int arg0) {
		Static117.anInt3014 = arg0;
		@Pc(11) Class94 local11 = Static521.aClass94_62;
		synchronized (Static521.aClass94_62) {
			Static521.aClass94_62.method2952();
		}
	}
}
