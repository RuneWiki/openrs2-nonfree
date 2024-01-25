import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class6_Sub31 extends Class6 {

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "J")
	public long aLong111;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	private Class6_Sub31() {
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(J)V")
	public Class6_Sub31(@OriginalArg(0) long arg0) {
		this.aLong111 = arg0;
	}
}
