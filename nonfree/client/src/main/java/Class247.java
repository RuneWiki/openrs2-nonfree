import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class247 {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	public final int anInt7273;

	static {
		new Class158("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(II)V")
	public Class247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7273 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
