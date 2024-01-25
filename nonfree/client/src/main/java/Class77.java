import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public abstract class Class77 {

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)J")
	protected abstract long method7573();

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
	public abstract void method7575();

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IJ)I")
	public final int method7576(@OriginalArg(1) long arg0) {
		@Pc(9) long local9 = this.method7573();
		if ((long) 0 < local9) {
			Static374.method5521(local9);
		}
		return this.method7578(arg0);
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(IJ)I")
	protected abstract int method7578(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)J")
	public abstract long method7581();
}
