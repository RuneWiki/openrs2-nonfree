import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class Class17 {

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!wga;")
	protected final Class20_Sub2 aClass20_Sub2_22;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!wga;)V")
	public Class17(@OriginalArg(0) Class20_Sub2 arg0) {
		this.aClass20_Sub2_22 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
	public abstract void method8057();

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZB)V")
	public abstract void method8058(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public void method8059() {
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
	public void method8060() {
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
	public void method8061() {
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
	public abstract void method8062(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
	public abstract void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!du;I)V")
	public abstract void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1);

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
	public void method8065() {
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)Z")
	public abstract boolean method8067();

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
	public void method8068() {
	}

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
	public void method8069() {
	}
}
