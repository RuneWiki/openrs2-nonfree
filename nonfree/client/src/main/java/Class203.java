import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class203 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	public int anInt5850;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	public int anInt5854;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
	public int anInt5855;

	static {
		new Class306("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BILclient!ge;)V")
	private void method4982(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt5850 = arg1.method3967();
			this.anInt5854 = arg1.method3922();
			this.anInt5855 = arg1.method3922();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ge;Z)V")
	public void method4984(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3922();
			if (local15 == 0) {
				return;
			}
			this.method4982(local15, arg0);
		}
	}
}
