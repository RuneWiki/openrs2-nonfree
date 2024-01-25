import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!bfa", name = "m", descriptor = "J")
	public long aLong24;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V")
	private Class5_Sub8() {
	}

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(J)V")
	public Class5_Sub8(@OriginalArg(0) long arg0) {
		this.aLong24 = arg0;
	}
}
