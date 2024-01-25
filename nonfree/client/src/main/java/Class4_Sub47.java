import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public final class Class4_Sub47 extends Class4 {

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "J")
	public long aLong267;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V")
	private Class4_Sub47() {
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(J)V")
	public Class4_Sub47(@OriginalArg(0) long arg0) {
		this.aLong267 = arg0;
	}
}
