import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class Class82 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
	protected final int anInt6498;

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public final int anInt6499;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public final int anInt6503;

	static {
		new Class175("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(III)V")
	protected Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6498 = arg2;
		this.anInt6499 = arg0;
		this.anInt6503 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)V")
	public abstract void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
	public abstract void method5120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZI)V")
	public abstract void method5121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
