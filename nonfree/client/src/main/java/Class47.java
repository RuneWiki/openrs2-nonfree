import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public abstract class Class47 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public abstract void method8500();

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)J")
	protected abstract long method8501();

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)I")
	public final int method8502(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method8501();
		if ((long) 0 < local7) {
			Static314.method4821(local7);
		}
		return this.method8503(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JB)I")
	protected abstract int method8503(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)J")
	public abstract long method8504();
}
