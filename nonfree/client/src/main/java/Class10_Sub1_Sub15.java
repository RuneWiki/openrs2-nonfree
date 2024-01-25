import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class10_Sub1_Sub15 extends Class10_Sub1 {

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "Lclient!us;")
	public final Class24_Sub3_Sub5 aClass24_Sub3_Sub5_1;

	static {
		new Class182("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class10_Sub1_Sub15(@OriginalArg(0) Class24_Sub3_Sub5 arg0) {
		this.aClass24_Sub3_Sub5_1 = arg0;
	}
}
