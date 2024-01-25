import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_214 = new Class179(112, 6);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method4615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static267.aBoolean292 || !Static322.aBoolean345) {
			return false;
		} else if (Static339.anInt5857 < 100) {
			return false;
		} else if (Static354.method5134(arg3, arg2, arg0)) {
			@Pc(31) int local31 = arg3 << Static185.anInt3178;
			@Pc(35) int local35 = arg2 << Static185.anInt3178;
			if (Static602.method8296(Static289.aClass12Array3[arg0].method7846(arg3, arg2), Static655.anInt10510, arg1, local35, local31, Static655.anInt10510)) {
				Static164.anInt10678++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
