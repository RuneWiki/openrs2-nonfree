import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wja")
public abstract class Class96 {

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V")
	public abstract void method3589();

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(I)J")
	public abstract long method3591();

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IJ)I")
	public final int method3592(@OriginalArg(1) long arg0) {
		@Pc(12) long local12 = this.method3594();
		if (local12 > 0L) {
			Static20.method9254(local12);
		}
		return this.method3593(arg0);
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(IJ)I")
	protected abstract int method3593(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(B)J")
	protected abstract long method3594();
}
