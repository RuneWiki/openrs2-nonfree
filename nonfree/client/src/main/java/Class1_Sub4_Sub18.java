import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class1_Sub4_Sub18 extends Class1_Sub4 {

	static {
		new Class7("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			Static468.method4333(local14, 0, Static66.anInt1511, Static266.anIntArray628[arg0]);
		}
		return local14;
	}
}
