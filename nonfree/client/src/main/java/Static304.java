import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "Lclient!vr;")
	public static Class33 aClass33_11;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
	public static final int[] anIntArray453 = new int[500];

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "[I")
	public static final int[] anIntArray454 = new int[32];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)Z")
	public static boolean method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!Static237.aBoolean328 || !Static665.aBoolean805) {
			return false;
		} else if (Static293.anInt4968 < 100) {
			return false;
		} else {
			@Pc(24) int local24 = Static282.anIntArrayArrayArray15[arg2][arg0][arg1];
			if (-Static100.anInt1840 == local24) {
				return false;
			} else if (local24 == Static100.anInt1840) {
				return true;
			} else if (Static108.aClass21Array1 == Static121.aClass21Array2) {
				return false;
			} else {
				@Pc(49) int local49 = arg0 << Static391.anInt10262;
				@Pc(53) int local53 = arg1 << Static391.anInt10262;
				if (Static9.method160(Static121.aClass21Array2[arg2].method7973(arg0, arg1), local49 + 1, Static121.aClass21Array2[arg2].method7973(arg0, arg1 + 1), local49 + Static207.anInt4003 - 1, local49 + 1, local53 + 1, Static121.aClass21Array2[arg2].method7973(arg0 + 1, arg1 + 1), Static207.anInt4003 + local53 - 1, Static207.anInt4003 + (local53 - 1)) && Static9.method160(Static121.aClass21Array2[arg2].method7973(arg0, arg1), Static207.anInt4003 + local49 - 1, Static121.aClass21Array2[arg2].method7973(arg0 + 1, arg1 - -1), local49 + Static207.anInt4003 - 1, local49 + 1, local53 + 1, Static121.aClass21Array2[arg2].method7973(arg0 + 1, arg1), local53 + 1, local53 + Static207.anInt4003 - 1)) {
					Static327.anInt5443++;
					Static282.anIntArrayArrayArray15[arg2][arg0][arg1] = Static100.anInt1840;
					return true;
				} else {
					Static282.anIntArrayArrayArray15[arg2][arg0][arg1] = -Static100.anInt1840;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([Lclient!vr;I)V")
	public static void method4670(@OriginalArg(0) Class33[] arg0) {
		Static498.anInt10143 = arg0.length;
		Static561.aClass33Array25 = new Class33[Static498.anInt10143 + 10];
		Static502.anIntArray361 = new int[Static498.anInt10143 + 10];
		Static684.method5327(arg0, 0, Static561.aClass33Array25, 0, Static498.anInt10143);
		for (@Pc(31) int local31 = 0; local31 < Static498.anInt10143; local31++) {
			Static502.anIntArray361[local31] = Static561.aClass33Array25[local31].method7658();
		}
		for (@Pc(46) int local46 = Static498.anInt10143; local46 < Static561.aClass33Array25.length; local46++) {
			Static502.anIntArray361[local46] = 12;
		}
	}
}
