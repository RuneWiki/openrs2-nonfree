import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_107 = new Class225(96, 3);

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
	public static int anInt5727 = 0;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIZLclient!ha;)V")
	public static void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class145 arg4) {
		arg4.KA(arg0, arg1, arg3 + arg0, arg1 - -arg2);
		arg4.method9637(arg3, arg2, arg1, -16777216, arg0);
		if (Static424.anInt6882 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static90.anInt3349 / (float) Static90.anInt3350;
		@Pc(37) int local37 = arg3;
		@Pc(39) int local39 = arg2;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg3 * local35);
		} else {
			local37 = (int) ((float) arg2 / local35);
		}
		@Pc(66) int local66 = arg0 + (arg3 - local37) / 2;
		@Pc(75) int local75 = arg1 + (arg2 - local39) / 2;
		if (Static709.aClass43_32 == null || arg3 != Static709.aClass43_32.method9601() || Static709.aClass43_32.method9592() != arg2) {
			Static90.method2921(Static90.anInt3353, Static90.anInt3348 + Static90.anInt3349, Static90.anInt3353 + Static90.anInt3350, Static90.anInt3348, local66, local75, local37 + local66, local39 + local75);
			Static90.method2925(arg4);
			Static709.aClass43_32 = arg4.method9654(local66, local75, local37, local39, false);
		}
		Static709.aClass43_32.method9588(local66, local75);
		@Pc(132) int local132 = local37 * Static247.anInt3838 / Static90.anInt3350;
		@Pc(138) int local138 = local39 * Static687.anInt10575 / Static90.anInt3349;
		@Pc(146) int local146 = Static220.anInt3515 * local37 / Static90.anInt3350 + local66;
		@Pc(167) int local167 = local75 + local39 - local138 - Static359.anInt5743 * local39 / Static90.anInt3349;
		@Pc(169) int local169 = -1996554240;
		if (Static174.aClass150_3 == Static249.aClass150_6) {
			local169 = -1996488705;
		}
		arg4.aa(local146, local167, local132, local138, local169, 1);
		arg4.method9713(local146, local167, local132, local138, local169, 0);
		if (Static181.anInt3030 <= 0) {
			return;
		}
		@Pc(204) int local204;
		if (Static482.anInt7725 <= 50) {
			local204 = Static482.anInt7725 * 5;
		} else {
			local204 = (100 - Static482.anInt7725) * 5;
		}
		for (@Pc(217) Class2_Sub51 local217 = (Class2_Sub51) Static90.aClass60_65.method1226(7); local217 != null; local217 = (Class2_Sub51) Static90.aClass60_65.method1228()) {
			@Pc(225) Class259 local225 = Static90.aClass196_3.method4194(local217.anInt9158);
			if (Static216.method3013(local225)) {
				@Pc(244) int local244;
				@Pc(256) int local256;
				if (Static368.anInt5903 == local217.anInt9158) {
					local244 = local66 + local217.anInt9165 * local37 / Static90.anInt3350;
					local256 = (Static90.anInt3349 - local217.anInt9167) * local39 / Static90.anInt3349 + local75;
					arg4.method9637(4, 4, local256 - 2, local204 << 24 | 0xFFFF00, local244 - 2);
				} else if (Static444.anInt7209 != -1 && Static444.anInt7209 == local225.anInt6981) {
					local244 = local66 + local37 * local217.anInt9165 / Static90.anInt3350;
					local256 = (Static90.anInt3349 - local217.anInt9167) * local39 / Static90.anInt3349 + local75;
					arg4.method9637(4, 4, local256 - 2, local204 << 24 | 0xFFFF00, local244 - 2);
				}
			}
		}
	}
}
