import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public abstract class Class95 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)I")
	protected abstract int method6521(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public abstract void method6523();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)J")
	protected abstract long method6524();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IJ)I")
	public final int method6525(@OriginalArg(1) long arg0) {
		@Pc(12) long local12 = this.method6524();
		if (local12 > 0L) {
			Static327.method5231(local12);
		}
		return this.method6521(arg0);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)J")
	public abstract long method6526();
}
