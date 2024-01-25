import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public abstract class Class39 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J")
	public abstract long method4913();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)I")
	public final int method4914(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method4917();
		if (local7 > 0L) {
			Static209.method3565(local7);
		}
		return this.method4919(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public abstract void method4915();

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)J")
	protected abstract long method4917();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)I")
	protected abstract int method4919(@OriginalArg(1) long arg0);
}
