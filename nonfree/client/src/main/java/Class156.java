import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class156 {

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
	public final int anInt4501;

	static {
		new Class142("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class156(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4501 = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)I")
	public int method3576() {
		return this.anInt4501;
	}
}
