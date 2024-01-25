import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "[B")
	public final byte[] aByteArray51;

	static {
		new Class159("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B)V")
	public Class4_Sub22(@OriginalArg(0) byte[] arg0) {
		this.aByteArray51 = arg0;
	}
}
