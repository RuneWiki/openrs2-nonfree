import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class7_Sub12 extends Class7 {

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "J")
	public long aLong93;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	private Class7_Sub12() {
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(J)V")
	public Class7_Sub12(@OriginalArg(0) long arg0) {
		this.aLong93 = arg0;
	}
}
