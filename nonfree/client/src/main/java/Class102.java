import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public abstract class Class102 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IJ)I")
	public final int method8793(@OriginalArg(1) long arg0) {
		@Pc(15) long local15 = this.method8797();
		if (local15 > 0L) {
			Static373.method5403(local15);
		}
		return this.method8795(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(JI)I")
	protected abstract int method8795(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	public abstract void method8796();

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)J")
	protected abstract long method8797();

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)J")
	public abstract long method8799();
}
