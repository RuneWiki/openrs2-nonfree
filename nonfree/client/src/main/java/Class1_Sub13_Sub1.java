import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class1_Sub13_Sub1 extends Class1_Sub13 {

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
	public int anInt3168;

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
	public int anInt3170;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "J")
	public long aLong99;

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
	public int anInt3172;

	static {
		new Class169("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
	@Override
	public int method2558() {
		return this.anInt3172;
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)I")
	@Override
	public int method2554() {
		return this.anInt3168;
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)J")
	@Override
	public long method2557() {
		return this.aLong99;
	}

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)I")
	@Override
	public int method2559() {
		return this.anInt3170;
	}
}
