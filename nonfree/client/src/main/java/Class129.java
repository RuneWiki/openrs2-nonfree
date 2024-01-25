import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class129 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
	public int anInt3571 = 2048;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
	public int anInt3572 = 2048;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
	public int anInt3574 = 0;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
	public int anInt3579 = 0;

	static {
		new Class142("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!wm;I)V")
	public void method2808(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2915();
			if (local9 == 0) {
				return;
			}
			this.method2809(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!wm;ZI)V")
	private void method2809(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3574 = arg0.method2915();
		} else if (arg1 == 2) {
			this.anInt3571 = arg0.method2896();
		} else if (arg1 == 3) {
			this.anInt3572 = arg0.method2896();
		} else if (arg1 == 4) {
			this.anInt3579 = arg0.method2929();
		}
	}
}
