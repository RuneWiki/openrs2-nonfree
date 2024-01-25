import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class174 {

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
	public int anInt4625 = 0;

	static {
		new Class55("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method3668(@OriginalArg(1) Class7_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt4625 = arg0.method3943();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method3671(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3981();
			if (local9 == 0) {
				return;
			}
			this.method3668(arg0, local9);
		}
	}
}
