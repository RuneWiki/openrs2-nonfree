import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class Class32 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!rr;")
	protected final Class31_Sub1 aClass31_Sub1_22;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!rr;)V")
	public Class32(@OriginalArg(0) Class31_Sub1 arg0) {
		this.aClass31_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
	public abstract void method7446(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public void method7447() {
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	public void method7450() {
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	public void method7452() {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZLclient!wq;)V")
	public abstract void method7453(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)Z")
	public abstract boolean method7454();

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
	public void method7455() {
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	public void method7456() {
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	public void method7457() {
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
	public abstract void method7458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
	public abstract void method7459(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public abstract void method7460();
}
