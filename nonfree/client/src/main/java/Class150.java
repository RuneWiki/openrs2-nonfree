import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public final class Class150 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
	private final int anInt4150;

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
	public final int anInt4152;

	static {
		new Class40("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(II)V")
	public Class150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4150 = arg0;
		this.anInt4152 = arg1;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)I")
	public int method3535() {
		return this.anInt4150;
	}

	@OriginalMember(owner = "client!iu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
