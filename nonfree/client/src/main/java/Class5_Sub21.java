import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class5_Sub21 extends Class5 {

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
	public final int anInt3273;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
	public final int anInt3271;

	static {
		new Class40("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(II)V")
	public Class5_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3273 = arg0;
		this.anInt3271 = arg1;
	}
}
