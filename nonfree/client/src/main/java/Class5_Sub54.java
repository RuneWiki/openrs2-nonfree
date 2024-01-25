import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public final class Class5_Sub54 extends Class5 {

	@OriginalMember(owner = "client!wia", name = "n", descriptor = "S")
	public short aShort127;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "()V")
	private Class5_Sub54() {
	}

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(S)V")
	public Class5_Sub54(@OriginalArg(0) short arg0) {
		this.aShort127 = arg0;
	}
}
