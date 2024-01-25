import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class Class2 {

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!mfa;")
	protected final Class5_Sub36 aClass5_Sub36_31;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	protected int anInt10576;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!mfa;)V")
	public Class2(@OriginalArg(0) Class5_Sub36 arg0) {
		this.aClass5_Sub36_31 = arg0;
		this.anInt10576 = this.method8764();
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(ILclient!mfa;)V")
	public Class2(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub36 arg1) {
		this.anInt10576 = arg0;
		this.aClass5_Sub36_31 = arg1;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)I")
	public abstract int method8763(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I")
	protected abstract int method8764();

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
	public abstract void method8765();

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)V")
	public final void method8768(@OriginalArg(0) int arg0) {
		if (this.method8763(arg0) != 3) {
			this.method8769(arg0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(BI)V")
	protected abstract void method8769(@OriginalArg(1) int arg0);
}
