import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class6_Sub38 extends Class6 {

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "J")
	public long aLong214;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
	private Class6_Sub38() {
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(J)V")
	public Class6_Sub38(@OriginalArg(0) long arg0) {
		this.aLong214 = arg0;
	}
}
