import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public abstract class Class5 {

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "Lclient!he;")
	protected final Class144_Sub1 aClass144_Sub1_20;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!he;)V")
	public Class5(@OriginalArg(0) Class144_Sub1 arg0) {
		this.aClass144_Sub1_20 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZII)V")
	public abstract void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)V")
	public abstract void method6865();

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
	public void method6866() {
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(B)Z")
	public abstract boolean method6867();

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
	public void method6868() {
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
	public void method6869() {
	}

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "(B)V")
	public void method6872() {
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZ)V")
	public abstract void method6873(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(B)V")
	public void method6875() {
	}

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V")
	public void method6876() {
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IILclient!vi;)V")
	public abstract void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZI)V")
	public abstract void method6878(@OriginalArg(0) boolean arg0);
}
