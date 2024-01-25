import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "J")
	public long aLong5;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	private Class2_Sub2() {
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(J)V")
	public Class2_Sub2(@OriginalArg(0) long arg0) {
		this.aLong5 = arg0;
	}
}
