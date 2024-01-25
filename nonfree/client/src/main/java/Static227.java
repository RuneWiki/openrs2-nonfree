import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	public static int anInt8838;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
	public static int anInt8839;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Lclient!h;")
	public static final Class114 aClass114_166 = new Class114("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_74 = new Class38();

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIII[I)V")
	public static void method7421(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0--;
		@Pc(7) int local7 = arg2 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (arg0 < local11) {
			@Pc(20) int local20 = arg0 + 1;
			arg3[local20] = arg1;
			@Pc(25) int local25 = local20 + 1;
			arg3[local25] = arg1;
			@Pc(30) int local30 = local25 + 1;
			arg3[local30] = arg1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local35] = arg1;
			@Pc(40) int local40 = local35 + 1;
			arg3[local40] = arg1;
			@Pc(45) int local45 = local40 + 1;
			arg3[local45] = arg1;
			@Pc(50) int local50 = local45 + 1;
			arg3[local50] = arg1;
			arg0 = local50 + 1;
			arg3[arg0] = arg1;
		}
		while (local7 > arg0) {
			arg0++;
			arg3[arg0] = arg1;
		}
	}
}
