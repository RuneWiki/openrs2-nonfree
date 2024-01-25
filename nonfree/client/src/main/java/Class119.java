import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class119 {

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
	public final int anInt3623;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	private final int anInt3622;

	static {
		new Class189("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(II)V")
	public Class119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3623 = arg1;
		this.anInt3622 = arg0;
	}

	@OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)I")
	public int method2890() {
		return this.anInt3622;
	}
}
