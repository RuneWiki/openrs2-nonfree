import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class211 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!b;")
	private final Class20 aClass20_77;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "I")
	public final int anInt5378;

	static {
		new Class57("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!ea;ILclient!b;)V")
	public Class211(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		new Class139(64);
		this.aClass20_77 = arg2;
		this.anInt5378 = this.aClass20_77.method231(15);
	}
}
