import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public abstract class Class13 {

	static {
		new Class209("", 76);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
	public abstract void method6672();

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(JB)I")
	protected abstract int method6673(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(JB)I")
	public final int method6674(@OriginalArg(0) long arg0) {
		@Pc(12) long local12 = this.method6677();
		if (local12 > 0L) {
			Static127.method1985(local12);
		}
		return this.method6673(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)J")
	protected abstract long method6677();

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)J")
	public abstract long method6678();
}
