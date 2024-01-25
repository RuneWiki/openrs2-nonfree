import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public abstract class Class98 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BJ)I")
	protected abstract int method9613(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V")
	public abstract void method9614();

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(JZ)I")
	public final int method9615(@OriginalArg(0) long arg0) {
		@Pc(12) long local12 = this.method9619();
		if (local12 > 0L) {
			Static650.method9565(local12);
		}
		return this.method9613(arg0);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)J")
	public abstract long method9616();

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)J")
	protected abstract long method9619();
}
