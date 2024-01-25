import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!tq;")
	public static Class191 aClass191_102;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	public static int anInt3291;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_32 = new Class216();

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public static int anInt3283 = 0;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	public static int anInt3284 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ae;IIII)V")
	public static void method3046(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.method4252(arg2, arg4, arg0 + arg2, arg3 + arg4);
		arg1.method4261(arg4, arg2, arg3, arg0, -16777216);
		if (Static85.anInt1831 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static127.anInt1566 / (float) Static127.anInt1564;
		@Pc(35) int local35 = arg0;
		@Pc(37) int local37 = arg3;
		if (local33 < 1.0F) {
			local37 = (int) (local33 * (float) arg0);
		} else {
			local35 = (int) ((float) arg3 / local33);
		}
		@Pc(64) int local64 = arg4 + (arg3 - local37) / 2;
		@Pc(72) int local72 = arg2 + (arg0 - local35) / 2;
		if (Static310.aClass31_127 == null || Static310.aClass31_127.method4392() != arg0 || arg3 != Static310.aClass31_127.method4393()) {
			Static127.method1630(Static127.anInt1568, Static127.anInt1567 + Static127.anInt1566, Static127.anInt1564 + Static127.anInt1568, Static127.anInt1567, local72, local64, local72 + local35, local64 - -local37);
			Static127.method1615(arg1);
			Static310.aClass31_127 = arg1.method4291(local72, local64, local35, local37, false);
		}
		Static310.aClass31_127.method4377(local72, local64);
		@Pc(122) int local122 = local35 * Static175.anInt3545 / Static127.anInt1564;
		@Pc(128) int local128 = local37 * Static178.anInt3561 / Static127.anInt1566;
		@Pc(136) int local136 = local35 * Static341.anInt6839 / Static127.anInt1564 + local72;
		@Pc(150) int local150 = local37 + local64 - local128 - local37 * Static196.anInt3828 / Static127.anInt1566;
		@Pc(152) int local152 = -1996554240;
		if (Static41.anInt830 == 1) {
			local152 = -1996488705;
		}
		arg1.method4246(local136, local150, local122, local128, local152, 1);
		arg1.method4287(local136, local150, local122, local128, local152, 0);
		if (Static104.anInt5551 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (Static203.anInt3379 > 50) {
			local198 = 500 - Static203.anInt3379 * 5;
		} else {
			local198 = Static203.anInt3379 * 5;
		}
		for (@Pc(209) Class2_Sub31 local209 = (Class2_Sub31) Static127.aClass216_21.method5992(); local209 != null; local209 = (Class2_Sub31) Static127.aClass216_21.method6000()) {
			@Pc(216) Class120 local216 = Static278.method5042(local209.anInt4062);
			if (Static341.method5889(local216)) {
				@Pc(242) int local242;
				@Pc(254) int local254;
				if (Static52.anInt1119 == local209.anInt4062) {
					local242 = local35 * local209.anInt4063 / Static127.anInt1564 + local72;
					local254 = local64 + (Static127.anInt1566 - local209.anInt4059) * local37 / Static127.anInt1566;
					arg1.method4261(local254 - 2, local242 + -2, 4, 4, local198 << 24 | 0xFFFF00);
				} else if (Static20.anInt434 != -1 && local216.anInt3637 == Static20.anInt434) {
					local242 = local72 + local35 * local209.anInt4063 / Static127.anInt1564;
					local254 = local64 + local37 * (Static127.anInt1566 - local209.anInt4059) / Static127.anInt1566;
					arg1.method4261(local254 - 2, local242 + -2, 4, 4, local198 << 24 | 0xFFFF00);
				}
			}
		}
	}
}
