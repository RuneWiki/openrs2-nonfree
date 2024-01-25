import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public abstract class Class228 {

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
	public abstract void method6031();

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)J")
	public abstract long method6032();

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(JZ)I")
	protected abstract int method6033(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)J")
	protected abstract long method6036();

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(JI)I")
	public final int method6037(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method6036();
		if (local7 > 0L) {
			Static589.method7892(local7);
		}
		return this.method6033(arg0);
	}
}
