import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class Class171 {

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	protected Class171() {
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)V")
	public abstract void method4214(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[B")
	public abstract byte[] method4216(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Lclient!c;")
	public abstract Class41 method4217();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZI)I")
	public abstract int method4219(@OriginalArg(1) int arg0);
}
