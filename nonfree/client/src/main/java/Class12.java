import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class12 {

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public final int anInt283;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
	private final int anInt280;

	static {
		new Class96("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(II)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt283 = arg1;
		this.anInt280 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)I")
	public int method235() {
		return this.anInt280;
	}
}
