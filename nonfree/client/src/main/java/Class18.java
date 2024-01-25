import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public abstract class Class18 {

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "Lclient!ij;")
	protected final Class13_Sub3 aClass13_Sub3_23;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ij;)V")
	public Class18(@OriginalArg(0) Class13_Sub3 arg0) {
		this.aClass13_Sub3_23 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IZ)V")
	public abstract void method8632(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	public void method8634() {
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
	public void method8635() {
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)V")
	public void method8636() {
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZB)V")
	public abstract void method8637(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)V")
	public void method8638() {
	}

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(I)V")
	public void method8639() {
	}

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "(I)V")
	public void method8640() {
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIZ)V")
	public abstract void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)V")
	public abstract void method8642();

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "(I)Z")
	public abstract boolean method8643();

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IILclient!fe;)V")
	public abstract void method8645(@OriginalArg(0) int arg0, @OriginalArg(2) Interface6 arg1);
}
