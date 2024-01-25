import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public abstract class Class92 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IJ)I")
	protected abstract int method4206(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(IJ)I")
	public final int method4207(@OriginalArg(1) long arg0) {
		@Pc(7) long local7 = this.method4210();
		if (local7 > 0L) {
			Static423.method5918(local7);
		}
		return this.method4206(arg0);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V")
	public abstract void method4208();

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)J")
	public abstract long method4209();

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)J")
	protected abstract long method4210();
}
