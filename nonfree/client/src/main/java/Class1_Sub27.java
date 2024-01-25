import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	public int anInt4774;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public int anInt4776;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	public int anInt4779;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	public int anInt4781;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	public int anInt4782;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
	public int anInt4777 = -1;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "Z")
	public boolean aBoolean461 = false;

	static {
		new Class34("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	public Class1_Sub27(@OriginalArg(0) int arg0) {
		this.anInt4777 = arg0;
	}
}
