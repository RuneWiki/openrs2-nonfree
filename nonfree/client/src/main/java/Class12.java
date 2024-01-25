import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public abstract class Class12 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(JB)I")
	protected abstract int method8265(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public abstract void method8266();

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(JB)I")
	public final int method8269(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method8271();
		if (local7 > 0L) {
			Static26.method592(local7);
		}
		return this.method8265(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)J")
	protected abstract long method8271();

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)J")
	public abstract long method8273();
}
