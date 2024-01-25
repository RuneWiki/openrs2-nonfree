import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class Class31 {

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	protected Class31() {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public abstract void method984();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Z")
	public abstract boolean method985(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public abstract void method989();

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lclient!tea;")
	public abstract Interface21 method990();
}
