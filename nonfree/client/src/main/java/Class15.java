import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public abstract class Class15 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(JI)I")
	public final int method8361(@OriginalArg(0) long arg0) {
		@Pc(13) long local13 = this.method8364();
		if (local13 > 0L) {
			Static57.method1062(local13);
		}
		return this.method8362(arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJ)I")
	protected abstract int method8362(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)J")
	protected abstract long method8364();

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)J")
	public abstract long method8365();

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
	public abstract void method8366();
}
