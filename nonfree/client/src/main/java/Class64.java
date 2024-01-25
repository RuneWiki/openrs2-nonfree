import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public abstract class Class64 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(JI)I")
	public final int method6917(@OriginalArg(0) long arg0) {
		@Pc(12) long local12 = this.method6918();
		if (local12 > 0L) {
			Static440.method6322(local12);
		}
		return this.method6919(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)J")
	protected abstract long method6918();

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(JI)I")
	protected abstract int method6919(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public abstract void method6920();

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)J")
	public abstract long method6923();
}
