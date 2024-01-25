import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "S")
	public short aShort154;

	static {
		new Class175("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	private Class3_Sub32() {
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(S)V")
	public Class3_Sub32(@OriginalArg(0) short arg0) {
		this.aShort154 = arg0;
	}
}
