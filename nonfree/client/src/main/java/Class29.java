import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public abstract class Class29 {

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	public abstract void method8349();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(JB)I")
	public final int method8352(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method8353();
		if (local7 > 0L) {
			Static255.method4444(local7);
		}
		return this.method8354(arg0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)J")
	protected abstract long method8353();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IJ)I")
	protected abstract int method8354(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(Z)J")
	public abstract long method8356();
}
