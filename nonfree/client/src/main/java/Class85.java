import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public abstract class Class85 {

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)J")
	protected abstract long method8291();

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)V")
	public abstract void method8293();

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(JB)I")
	public final int method8294(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method8291();
		if (local7 > 0L) {
			Static179.method3254(local7);
		}
		return this.method8298(arg0);
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)J")
	public abstract long method8297();

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(JZ)I")
	protected abstract int method8298(@OriginalArg(0) long arg0);
}
