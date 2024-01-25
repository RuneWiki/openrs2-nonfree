import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "J")
	public long aLong64;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	private Class2_Sub15() {
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(J)V")
	public Class2_Sub15(@OriginalArg(0) long arg0) {
		this.aLong64 = arg0;
	}
}
