import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class Class27 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public final int anInt5152;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	protected final int anInt5154;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public final int anInt5155;

	static {
		new Class83("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(III)V")
	protected Class27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5152 = arg1;
		this.anInt5154 = arg2;
		this.anInt5155 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	public abstract void method3935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)V")
	public abstract void method3936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)V")
	public abstract void method3939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
