import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class Class2 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!nv;")
	protected final Class78_Sub1 aClass78_Sub1_23;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class2(@OriginalArg(0) Class78_Sub1 arg0) {
		this.aClass78_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public void method7890() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public void method7891() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!rga;I)V")
	public abstract void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) Interface20 arg1);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	public abstract void method7894(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	public void method7896() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)V")
	public abstract void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public void method7898() {
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
	public abstract void method7899();

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	public void method7900() {
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(ZI)V")
	public abstract void method7901(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)Z")
	public abstract boolean method7902();

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
	public void method7903() {
	}
}
