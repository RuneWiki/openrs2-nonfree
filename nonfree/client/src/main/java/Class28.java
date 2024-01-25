import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class28 {

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
	public final int anInt642;

	static {
		new Class169("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class28(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt642 = arg1;
	}

	@OriginalMember(owner = "client!bm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)I")
	public int method497() {
		return this.anInt642;
	}
}
