import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public abstract class Class125 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)J")
	protected abstract long method8176();

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V")
	public abstract void method8178();

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZJ)I")
	public final int method8180(@OriginalArg(1) long arg0) {
		@Pc(12) long local12 = this.method8176();
		if (local12 > 0L) {
			Static373.method5240(local12);
		}
		return this.method8181(arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(JI)I")
	protected abstract int method8181(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(I)J")
	public abstract long method8182();
}
