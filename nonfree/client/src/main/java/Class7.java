import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class Class7 {

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Lclient!pga;")
	protected final Class95_Sub3 aClass95_Sub3_23;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!pga;)V")
	public Class7(@OriginalArg(0) Class95_Sub3 arg0) {
		this.aClass95_Sub3_23 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
	public abstract void method8120(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZZ)V")
	public abstract void method8125(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILclient!lo;)V")
	public abstract void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1);

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public abstract void method8127();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIZ)V")
	public abstract void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V")
	public void method8129() {
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)V")
	public void method8130() {
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
	public void method8131() {
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
	public void method8133() {
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(B)V")
	public void method8134() {
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)Z")
	public abstract boolean method8135();

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "(B)V")
	public void method8136() {
	}
}
