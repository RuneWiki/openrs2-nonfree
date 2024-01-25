import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class5_Sub46 extends Class5 {

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	private Class5_Sub46() {
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(S)V")
	public Class5_Sub46(@OriginalArg(0) short arg0) {
		this.aShort103 = arg0;
	}
}
