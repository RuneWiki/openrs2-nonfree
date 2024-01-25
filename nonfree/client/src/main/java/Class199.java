import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public abstract class Class199 {

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(Z)J")
	public abstract long method8105();

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
	public abstract void method8108();

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)J")
	protected abstract long method8110();

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IJ)I")
	public final int method8111(@OriginalArg(1) long arg0) {
		@Pc(13) long local13 = this.method8110();
		if (local13 > 0L) {
			Static564.method7845(local13);
		}
		return this.method8112(arg0);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BJ)I")
	protected abstract int method8112(@OriginalArg(1) long arg0);
}
