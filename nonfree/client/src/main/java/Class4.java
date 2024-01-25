import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class Class4 {

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "Lclient!ai;")
	protected final Class13_Sub1 aClass13_Sub1_23;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!ai;)V")
	public Class4(@OriginalArg(0) Class13_Sub1 arg0) {
		this.aClass13_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
	public void method7847() {
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Z")
	public abstract boolean method7848();

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIZ)V")
	public abstract void method7849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)V")
	public void method7851() {
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZ)V")
	public abstract void method7852(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V")
	public void method7853() {
	}

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "(B)V")
	public void method7854() {
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
	public void method7855() {
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)V")
	public abstract void method7856(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)V")
	public void method7857() {
	}

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "(B)V")
	public abstract void method7858();

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IBLclient!bm;)V")
	public abstract void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1);
}
