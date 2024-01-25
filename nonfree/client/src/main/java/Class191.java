import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class Class191 {

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	protected Class191() {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
	protected abstract boolean method6980();

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z")
	public final boolean method6981() {
		return this.method6984() || this.method6980() || this.method6987();
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)I")
	public abstract int method6982();

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
	public abstract void method6983();

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)Z")
	public abstract boolean method6984();

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Lclient!rg;")
	public abstract Class3_Sub31 method6986();

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)Z")
	protected abstract boolean method6987();

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
	public abstract void method6988();

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "(I)I")
	public abstract int method6989();
}
