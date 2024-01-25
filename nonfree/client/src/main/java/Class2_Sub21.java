import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
	public final int anInt3692;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
	public final int anInt3694;

	static {
		new Class209("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(II)V")
	public Class2_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3692 = arg1;
		this.anInt3694 = arg0;
	}
}
