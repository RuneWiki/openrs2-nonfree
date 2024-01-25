import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "Lclient!pc;")
	public final Class49_Sub2_Sub5 aClass49_Sub2_Sub5_1;

	static {
		new Class306("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class1_Sub1_Sub12(@OriginalArg(0) Class49_Sub2_Sub5 arg0) {
		this.aClass49_Sub2_Sub5_1 = arg0;
	}
}
