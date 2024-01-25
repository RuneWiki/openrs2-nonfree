import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public abstract class Class14 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IJ)I")
	public final int method3828(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method3831();
		if (local7 > 0L) {
			Static258.method4293(local7);
		}
		return this.method3830(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(JI)I")
	protected abstract int method3830(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)J")
	protected abstract long method3831();

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)J")
	public abstract long method3833();

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
	public abstract void method3834();
}
