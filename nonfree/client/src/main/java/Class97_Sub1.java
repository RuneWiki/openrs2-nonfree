import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class97_Sub1 extends Class97 {

	@OriginalMember(owner = "client!he", name = "d", descriptor = "[I")
	public final int[] anIntArray140;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
	public final int[] anIntArray141;

	static {
		new Class198("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(II[I[I)V")
	public Class97_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray140 = arg2;
		this.anIntArray141 = arg3;
	}
}
