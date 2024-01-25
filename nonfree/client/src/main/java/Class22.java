import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class Class22 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "Lclient!hj;")
	protected final Class2_Sub1 aClass2_Sub1_41;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class22(@OriginalArg(0) Class2_Sub1 arg0) {
		this.aClass2_Sub1_41 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public abstract void method5714(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
	public abstract void method5715(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
	public abstract void method5716(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "()V")
	public abstract void method5717();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!nj;)V")
	public abstract void method5718(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!np", name = "b", descriptor = "()Z")
	public abstract boolean method5719();
}
