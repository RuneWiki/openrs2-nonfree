import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class6_Sub38 extends Class6 {

	@OriginalMember(owner = "client!u", name = "m", descriptor = "J")
	public long aLong194;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	private Class6_Sub38() {
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(J)V")
	public Class6_Sub38(@OriginalArg(0) long arg0) {
		this.aLong194 = arg0;
	}
}
