import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public abstract class Class109 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BJ)I")
	protected abstract int method4079(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
	public abstract void method4080();

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)J")
	protected abstract long method4081();

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)J")
	public abstract long method4082();

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IJ)I")
	public final int method4085(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method4081();
		if (local7 > 0L) {
			Static214.method4061(local7);
		}
		return this.method4079(arg0);
	}
}
