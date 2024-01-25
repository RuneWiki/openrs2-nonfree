import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public abstract class Class2 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)J")
	protected abstract long method8983();

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public abstract void method8987();

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(JZ)I")
	public final int method8988(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method8983();
		if (local7 > 0L) {
			Static548.method7968(local7);
		}
		return this.method8990(arg0);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)J")
	public abstract long method8989();

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)I")
	protected abstract int method8990(@OriginalArg(1) long arg0);
}
