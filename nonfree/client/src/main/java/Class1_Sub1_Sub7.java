import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
	public int anInt3872 = 0;

	static {
		new Class306("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method3426(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		if (arg0 == 2) {
			this.anInt3872 = arg1.method3967();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLclient!ge;)V")
	public void method3427(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3922();
			if (local15 == 0) {
				return;
			}
			this.method3426(local15, arg0);
		}
	}
}
