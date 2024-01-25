import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class Class31 {

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Lclient!pj;")
	protected final Class137_Sub1 aClass137_Sub1_22;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class31(@OriginalArg(0) Class137_Sub1 arg0) {
		this.aClass137_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	public void method8586() {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBI)V")
	public abstract void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BILclient!kja;)V")
	public abstract void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	public void method8589() {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public abstract void method8591();

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
	public abstract void method8592(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)Z")
	public abstract boolean method8593();

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V")
	public abstract void method8595(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V")
	public void method8596() {
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(Z)V")
	public void method8597() {
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V")
	public void method8598() {
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(Z)V")
	public void method8599() {
	}
}
