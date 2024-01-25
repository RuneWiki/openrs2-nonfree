import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class66 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	public final int anInt1518;

	static {
		new Class169("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1518 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
