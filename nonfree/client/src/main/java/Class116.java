import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class116 {

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
	public int anInt3541 = 0;

	static {
		new Class106("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!at;B)V")
	public void method3180(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2132();
			if (local5 == 0) {
				return;
			}
			this.method3182(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IILclient!at;)V")
	private void method3182(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 5) {
			this.anInt3541 = arg1.method2161();
		}
	}
}
