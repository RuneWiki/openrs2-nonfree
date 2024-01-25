import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class6_Sub36 extends Class6 {

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	private Class6_Sub36() {
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(S)V")
	public Class6_Sub36(@OriginalArg(0) short arg0) {
		this.aShort82 = arg0;
	}
}
