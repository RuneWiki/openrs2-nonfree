import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public abstract class Class89 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)J")
	protected abstract long method6692();

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)J")
	public abstract long method6694();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
	public abstract void method6696();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJ)I")
	public final int method6697(@OriginalArg(1) long arg0) {
		@Pc(12) long local12 = this.method6692();
		if (local12 > 0L) {
			Static17.method388(local12);
		}
		return this.method6700(arg0);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(IJ)I")
	protected abstract int method6700(@OriginalArg(1) long arg0);
}
