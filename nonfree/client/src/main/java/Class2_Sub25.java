import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "J")
	public long aLong115;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	private Class2_Sub25() {
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(J)V")
	public Class2_Sub25(@OriginalArg(0) long arg0) {
		this.aLong115 = arg0;
	}
}
