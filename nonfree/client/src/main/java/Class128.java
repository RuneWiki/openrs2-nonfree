import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public abstract class Class128 {

	@OriginalMember(owner = "client!rja", name = "<init>", descriptor = "()V")
	protected Class128() {
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)I")
	public abstract int method5188();

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(B)Z")
	public abstract boolean method5189();

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(B)Z")
	protected abstract boolean method5190();

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "(B)I")
	public abstract int method5191();

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "(B)Z")
	public final boolean method5193() {
		return this.method5189() || this.method5190() || this.method5195();
	}

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "(I)V")
	public abstract void method5194();

	@OriginalMember(owner = "client!rja", name = "e", descriptor = "(B)Z")
	protected abstract boolean method5195();

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "(I)Lclient!pea;")
	public abstract Class6_Sub27 method5196();

	@OriginalMember(owner = "client!rja", name = "f", descriptor = "(B)V")
	public abstract void method5197();
}
