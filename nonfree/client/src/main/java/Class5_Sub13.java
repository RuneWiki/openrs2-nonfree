import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public final class Class5_Sub13 extends Class5 {

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "J")
	public long aLong62;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "()V")
	private Class5_Sub13() {
	}

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(J)V")
	public Class5_Sub13(@OriginalArg(0) long arg0) {
		this.aLong62 = arg0;
	}
}
