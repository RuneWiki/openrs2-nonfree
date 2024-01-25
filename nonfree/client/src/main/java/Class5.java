import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class Class5 {

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!bl;")
	protected final Class28_Sub1 aClass28_Sub1_42;

	static {
		new Class231("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class5(@OriginalArg(0) Class28_Sub1 arg0) {
		this.aClass28_Sub1_42 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public abstract void method5922();

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
	public abstract void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZB)V")
	public abstract void method5925(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
	public abstract void method5926(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ce;IZ)V")
	public abstract void method5927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z")
	public abstract boolean method5928();
}
