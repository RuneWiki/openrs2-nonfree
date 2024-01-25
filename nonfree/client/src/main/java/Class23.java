import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public abstract class Class23 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IJ)I")
	protected abstract int method6158(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)J")
	public abstract long method6159();

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
	public abstract void method6160();

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(JI)I")
	public final int method6164(@OriginalArg(0) long arg0) {
		@Pc(11) long local11 = this.method6165();
		if (local11 > 0L) {
			Static579.method8004(local11);
		}
		return this.method6158(arg0);
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)J")
	protected abstract long method6165();
}
