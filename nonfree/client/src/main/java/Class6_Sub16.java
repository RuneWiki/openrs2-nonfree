import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class6_Sub16 extends Class6 {

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "S")
	public short aShort28;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	private Class6_Sub16() {
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(S)V")
	public Class6_Sub16(@OriginalArg(0) short arg0) {
		this.aShort28 = arg0;
	}
}
