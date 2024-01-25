import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public abstract class Class188 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BJ)I")
	protected abstract int method7561(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IJ)I")
	public final int method7562(@OriginalArg(1) long arg0) {
		@Pc(16) long local16 = this.method7564();
		if (local16 > 0L) {
			Static408.method5841(local16);
		}
		return this.method7561(arg0);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)J")
	protected abstract long method7564();

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)J")
	public abstract long method7565();

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)V")
	public abstract void method7568();
}
