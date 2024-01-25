import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public abstract class Class32 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(JI)I")
	public final int method7210(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method7215();
		if (local7 > (long) 0) {
			Static183.method3079(local7);
		}
		return this.method7216(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)J")
	public abstract long method7211();

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public abstract void method7212();

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)J")
	protected abstract long method7215();

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(JI)I")
	protected abstract int method7216(@OriginalArg(0) long arg0);
}
