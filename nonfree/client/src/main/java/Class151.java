import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public abstract class Class151 {

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)J")
	public abstract long method6451();

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	public abstract void method6452();

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(JI)I")
	protected abstract int method6453(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)J")
	protected abstract long method6455();

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(JI)I")
	public final int method6456(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method6455();
		if (local7 > 0L) {
			Static63.method1019(local7);
		}
		return this.method6453(arg0);
	}
}
