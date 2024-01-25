import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public final class Class6_Sub47 extends Class6 {

	@OriginalMember(owner = "client!uga", name = "i", descriptor = "J")
	public long aLong240;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V")
	private Class6_Sub47() {
	}

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(J)V")
	public Class6_Sub47(@OriginalArg(0) long arg0) {
		this.aLong240 = arg0;
	}
}
