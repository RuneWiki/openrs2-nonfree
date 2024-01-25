import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public abstract class Class99 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public abstract void method6863();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IJ)I")
	public final int method6864(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method6865();
		if (local7 > 0L) {
			Static444.method6061(local7);
		}
		return this.method6866(arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)J")
	protected abstract long method6865();

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(JI)I")
	protected abstract int method6866(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)J")
	public abstract long method6869();
}
