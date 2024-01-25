import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public abstract class Class103 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	public abstract void method7408();

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(JZ)I")
	public final int method7409(@OriginalArg(0) long arg0) {
		@Pc(14) long local14 = this.method7413();
		if (local14 > 0L) {
			Static55.method845(local14);
		}
		return this.method7412(arg0);
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)J")
	public abstract long method7410();

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZJ)I")
	protected abstract int method7412(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "(I)J")
	protected abstract long method7413();
}
