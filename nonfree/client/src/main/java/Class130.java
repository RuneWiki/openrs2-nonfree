import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public abstract class Class130 {

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)J")
	protected abstract long method7416();

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)V")
	public abstract void method7417();

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)J")
	public abstract long method7418();

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IJ)I")
	public final int method7419(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method7416();
		if (local7 > (long) 0) {
			Static344.method5698(local7);
		}
		return this.method7420(arg0);
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(IJ)I")
	protected abstract int method7420(@OriginalArg(1) long arg0);
}
