import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "[I")
	public final int[] anIntArray37;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "[I")
	public final int[] anIntArray38;

	static {
		new Class96("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(II[I[I)V")
	public Class34_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray37 = arg2;
		this.anIntArray38 = arg3;
	}
}
