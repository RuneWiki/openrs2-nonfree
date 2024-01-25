import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public abstract class Class50 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public abstract void method6597();

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)J")
	protected abstract long method6599();

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IJ)I")
	protected abstract int method6600(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IJ)I")
	public final int method6602(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method6599();
		if ((long) 0 < local7) {
			Static190.method3914(local7);
		}
		return this.method6600(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)J")
	public abstract long method6603();
}
