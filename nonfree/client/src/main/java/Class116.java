import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public abstract class Class116 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)J")
	public abstract long method7956();

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BJ)I")
	protected abstract int method7958(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(BJ)I")
	public final int method7961(@OriginalArg(1) long arg0) {
		@Pc(13) long local13 = this.method7963();
		if (local13 > 0L) {
			Static500.method7308(local13);
		}
		return this.method7958(arg0);
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)V")
	public abstract void method7962();

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)J")
	protected abstract long method7963();
}
