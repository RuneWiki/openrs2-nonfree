import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
	public static int anInt6739;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
	public static void method5278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static450.aClass79_10.method1977(Static23.aClass182_247.method4155(Static191.anInt3842));
		@Pc(26) int local26;
		for (@Pc(20) Class10_Sub45 local20 = (Class10_Sub45) Static70.aClass163_13.method3620(); local20 != null; local20 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
			local26 = Static289.method4076(local20);
			if (local13 < local26) {
				local13 = local26;
			}
		}
		local13 += 8;
		local26 = Static207.anInt4055 * 16 + 21;
		@Pc(52) int local52 = arg1 - local13 / 2;
		if (local52 + local13 > Static90.anInt1891) {
			local52 = Static90.anInt1891 - local13;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(76) int local76 = arg0;
		if (local26 + arg0 > Static340.anInt5756) {
			local76 = Static340.anInt5756 - local26;
		}
		if (local76 < 0) {
			local76 = 0;
		}
		Static270.anInt4755 = local52;
		Static35.aBoolean37 = true;
		Static361.anInt6151 = Static207.anInt4055 * 16 + (Static39.aBoolean44 ? 26 : 22);
		Static279.anInt4882 = local76;
		Static226.anInt4217 = local13;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIII)V")
	public static void method5280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class184 local16 = Static58.aClass184ArrayArray1[arg1][arg0];
		Static141.method2402(local16 == null ? Static370.aClass184_2 : local16, arg2);
	}
}
