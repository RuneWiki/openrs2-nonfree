import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class Class35 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Lclient!te;")
	protected final Class9_Sub3 aClass9_Sub3_41;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class35(@OriginalArg(0) Class9_Sub3 arg0) {
		this.aClass9_Sub3_41 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Z")
	public abstract boolean method7414();

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZB)V")
	public abstract void method7416(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V")
	public abstract void method7417(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
	public abstract void method7418();

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
	public abstract void method7419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!jl;)V")
	public abstract void method7420(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1);
}
