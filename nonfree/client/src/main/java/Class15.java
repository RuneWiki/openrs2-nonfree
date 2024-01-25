import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public abstract class Class15 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IJ)I")
	public final int method5278(@OriginalArg(1) long arg0) {
		@Pc(9) long local9 = this.method5281();
		if (local9 > 0L) {
			Static459.method6498(local9);
		}
		return this.method5280(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)J")
	public abstract long method5279();

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(JB)I")
	protected abstract int method5280(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)J")
	protected abstract long method5281();

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public abstract void method5283();
}
