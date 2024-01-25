import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public abstract class Class3 {

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZJ)I")
	protected abstract int method6617(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)J")
	public abstract long method6619();

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(B)J")
	protected abstract long method6622();

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(B)V")
	public abstract void method6623();

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(BJ)I")
	public final int method6624(@OriginalArg(1) long arg0) {
		@Pc(12) long local12 = this.method6622();
		if (local12 > 0L) {
			Static520.method7923(local12);
		}
		return this.method6617(arg0);
	}
}
