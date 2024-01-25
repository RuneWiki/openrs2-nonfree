import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class2_Sub1_Sub22 extends Class2_Sub1 {

	static {
		new Class256(null, "geschickt werden.", null, null);
		new Class256("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(26) int[][] local26 = this.method6031(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			for (@Pc(40) int local40 = 0; local40 < Static131.anInt2581; local40++) {
				local11[local40] = (local30[local40] + local34[local40] + local38[local40]) / 3;
			}
		}
		return local11;
	}
}
