import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_190 = new Class362(67, 8);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)I")
	public static int method6973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = arg0 & 0x3;
		if (local16 == 0) {
			return arg2;
		} else if (local16 == 1) {
			return arg1;
		} else if (local16 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!ha;III[Z)Z")
	public static boolean method6974(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static499.aClass83Array3 != Static183.aClass83Array6) {
			@Pc(12) int local12 = Static444.aClass83Array7[arg1].method7213(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class83 local19 = Static444.aClass83Array7[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7213(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7212(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.E(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
