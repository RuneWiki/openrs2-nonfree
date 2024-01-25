import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class6_Sub26 extends Class6 {

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "S")
	public short aShort73;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	private Class6_Sub26() {
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(S)V")
	public Class6_Sub26(@OriginalArg(0) short arg0) {
		this.aShort73 = arg0;
	}
}
