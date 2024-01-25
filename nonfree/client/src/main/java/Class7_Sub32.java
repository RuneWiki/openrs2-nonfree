import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class7_Sub32 extends Class7 {

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "J")
	public long aLong150;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	private Class7_Sub32() {
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(J)V")
	public Class7_Sub32(@OriginalArg(0) long arg0) {
		this.aLong150 = arg0;
	}
}
