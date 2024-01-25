import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public abstract class Class41 {

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BJ)I")
	public final int method6917(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method6923();
		if (local7 > 0L) {
			Static491.method6679(local7);
		}
		return this.method6922(arg0);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)J")
	public abstract long method6918();

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
	public abstract void method6920();

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(JI)I")
	protected abstract int method6922(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)J")
	protected abstract long method6923();
}
