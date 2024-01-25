import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public abstract class Class119 {

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)J")
	protected abstract long method4145();

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IJ)I")
	protected abstract int method4146(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)J")
	public abstract long method4147();

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(IJ)I")
	public final int method4148(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method4145();
		if ((long) 0 < local7) {
			Static149.method2211(local7);
		}
		return this.method4146(arg0);
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
	public abstract void method4149();
}
