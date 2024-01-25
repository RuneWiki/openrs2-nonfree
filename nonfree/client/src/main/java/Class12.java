import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public abstract class Class12 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(JI)I")
	protected abstract int method2855(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public abstract void method2856();

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(JI)I")
	public final int method2857(@OriginalArg(0) long arg0) {
		@Pc(14) long local14 = this.method2858();
		if (local14 > 0L) {
			Static1.method125(local14);
		}
		return this.method2855(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)J")
	protected abstract long method2858();

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)J")
	public abstract long method2859();
}
