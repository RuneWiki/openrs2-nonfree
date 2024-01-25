import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public abstract class Class28 {

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)J")
	public abstract long method8214();

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)J")
	protected abstract long method8215();

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(JB)I")
	public final int method8216(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method8215();
		if (local7 > 0L) {
			Static143.method2414(local7);
		}
		return this.method8217(arg0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IJ)I")
	protected abstract int method8217(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V")
	public abstract void method8220();
}
