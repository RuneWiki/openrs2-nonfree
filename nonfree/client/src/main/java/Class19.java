import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public abstract class Class19 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(JI)I")
	protected abstract int method7649(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)J")
	public abstract long method7650();

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)J")
	protected abstract long method7651();

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IJ)I")
	public final int method7652(@OriginalArg(1) long arg0) {
		@Pc(14) long local14 = this.method7651();
		if (local14 > 0L) {
			Static263.method3671(local14);
		}
		return this.method7649(arg0);
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V")
	public abstract void method7653();
}
