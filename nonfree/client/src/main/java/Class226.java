import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class Class226 {

	static {
		new Class209("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	protected Class226() {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Z")
	public abstract boolean method4977(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
	public abstract void method4979();

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Lclient!kg;")
	public abstract Class141 method4981();

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public abstract void method4983();
}
