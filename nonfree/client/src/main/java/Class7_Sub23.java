import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class7_Sub23 extends Class7 {

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "S")
	public short aShort54;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	private Class7_Sub23() {
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(S)V")
	public Class7_Sub23(@OriginalArg(0) short arg0) {
		this.aShort54 = arg0;
	}
}
