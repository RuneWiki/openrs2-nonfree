import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public abstract class Class13 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(JI)I")
	public final int method7244(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method7245();
		if (local7 > (long) 0) {
			Static214.method3478(local7);
		}
		return this.method7247(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)J")
	protected abstract long method7245();

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(JI)I")
	protected abstract int method7247(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public abstract void method7248();

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)J")
	public abstract long method7249();
}
