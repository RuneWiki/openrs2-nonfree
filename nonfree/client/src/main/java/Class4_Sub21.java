import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "J")
	public long aLong106;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	private Class4_Sub21() {
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(J)V")
	public Class4_Sub21(@OriginalArg(0) long arg0) {
		this.aLong106 = arg0;
	}
}
