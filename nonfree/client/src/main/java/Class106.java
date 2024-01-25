import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public abstract class Class106 {

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)J")
	protected abstract long method6180();

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IJ)I")
	public final int method6182(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method6180();
		if (local7 > 0L) {
			Static570.method7907(local7);
		}
		return this.method6185(arg0);
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V")
	public abstract void method6184();

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(JB)I")
	protected abstract int method6185(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)J")
	public abstract long method6186();
}
