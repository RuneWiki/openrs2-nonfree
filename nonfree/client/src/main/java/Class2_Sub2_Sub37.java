import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public final class Class2_Sub2_Sub37 extends Class2_Sub2 {

	static {
		new Class209("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		return Static365.anIntArray535;
	}
}
