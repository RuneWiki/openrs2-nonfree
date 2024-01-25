import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public abstract class Class29 {

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	protected Class29() {
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
	public abstract void method377();

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Z")
	public abstract boolean method379();

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)Z")
	public final boolean method380() {
		return this.method379() || this.method385() || this.method383();
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)I")
	public abstract int method381();

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(Z)V")
	public abstract void method382();

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)Z")
	protected abstract boolean method383();

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)I")
	public abstract int method384();

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)Z")
	protected abstract boolean method385();

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "(B)Lclient!um;")
	public abstract Class11_Sub39 method386();
}
