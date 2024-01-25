import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class Class56 {

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "Lclient!en;")
	protected final Class100_Sub1 aClass100_Sub1_23;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class56(@OriginalArg(0) Class100_Sub1 arg0) {
		this.aClass100_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZZ)V")
	public abstract void method7171(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)Z")
	public abstract boolean method7172();

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V")
	public abstract void method7174(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
	public void method7175() {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	public void method7176() {
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	public void method7177() {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!hfa;)V")
	public abstract void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1);

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
	public void method7179() {
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
	public void method7181() {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)V")
	public abstract void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
	public abstract void method7183();

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
	public void method7185() {
	}
}
