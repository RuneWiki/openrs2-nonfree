import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!od", name = "k", descriptor = "[Lclient!bk;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Lclient!qe;")
	public static Class274 aClass274_115 = null;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
	public static void method6031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 != 8 && arg4 != 16) {
			@Pc(165) Class217 local165 = Static440.aClass217ArrayArrayArray3[arg0][arg3][arg5];
			if (local165 == null) {
				local165 = new Class217(arg0);
			}
			if (arg4 == 1) {
				local165.aShort90 = (short) arg2;
				local165.aShort87 = (short) arg1;
			} else if (arg4 == 2) {
				local165.aShort89 = (short) arg2;
				local165.aShort88 = (short) arg1;
			}
			if (Static510.aBoolean637) {
				Static196.method3475();
			}
			return;
		}
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(45) int local45;
		@Pc(57) int local57;
		if (arg4 != 8) {
			local23 = (arg3 << Static415.anInt7579) + Static312.anInt5690;
			local27 = local23 - Static312.anInt5690;
			local31 = arg5 << Static415.anInt7579;
			local35 = local31 + Static312.anInt5690;
			local45 = Static178.aClass112Array2[arg0].method7819(arg5, arg3 + 1);
			local57 = Static178.aClass112Array2[arg0].method7819(arg5 + 1, arg3);
			Static448.aClass10Array2[Static156.anInt3553++] = new Class10(arg4, arg0, local23, local27, local27, local23, local45, local57, local57 - arg1, -arg1 + local45, local31, local35, local35, local31);
			return;
		}
		local23 = arg3 << Static415.anInt7579;
		local27 = local23 + Static312.anInt5690;
		local31 = arg5 << Static415.anInt7579;
		local35 = local31 + Static312.anInt5690;
		local45 = Static178.aClass112Array2[arg0].method7819(arg5, arg3);
		local57 = Static178.aClass112Array2[arg0].method7819(arg5 + 1, arg3 + 1);
		Static448.aClass10Array2[Static156.anInt3553++] = new Class10(arg4, arg0, local23, local27, local27, local23, local45, local57, local57 - arg1, -arg1 + local45, local31, local35, local35, local31);
	}
}
