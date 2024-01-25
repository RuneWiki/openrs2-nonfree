import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
	public static int anInt6820;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	public static int anInt6821;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "[I")
	public static final int[] anIntArray569 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	public static void method5702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class45 local7 = Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass5_Sub3_1 != null) {
			local7.aClass5_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!c;III[Z)Z")
	public static boolean method5704(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static69.aClass22Array1 != Static182.aClass22Array2) {
			@Pc(11) int local11 = Static355.aClass22Array3[arg1].method4678(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class22 local18 = Static355.aClass22Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method4678(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4677(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method4676(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIFIZIII)[[I")
	public static int[][] method5705(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class3_Sub3_Sub6 local13 = new Class3_Sub3_Sub6();
		local13.anInt1363 = 4;
		local13.anInt1376 = (int) (arg0 * 4096.0F);
		local13.anInt1369 = 8;
		local13.aBoolean71 = false;
		local13.anInt1364 = 3;
		local13.method5730();
		Static36.method664(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method1063(local45, local9[local45]);
		}
		return local9;
	}
}
