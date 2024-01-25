import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class10_Sub37 extends Class10 {

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "J")
	public long aLong194;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	private Class10_Sub37() {
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(J)V")
	public Class10_Sub37(@OriginalArg(0) long arg0) {
		this.aLong194 = arg0;
	}
}
