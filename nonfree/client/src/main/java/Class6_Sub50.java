import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class6_Sub50 extends Class6 {

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "J")
	public long aLong268;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	private Class6_Sub50() {
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(J)V")
	public Class6_Sub50(@OriginalArg(0) long arg0) {
		this.aLong268 = arg0;
	}
}
