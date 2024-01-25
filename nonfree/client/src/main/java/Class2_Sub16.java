import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "S")
	public short aShort30;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	private Class2_Sub16() {
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(S)V")
	public Class2_Sub16(@OriginalArg(0) short arg0) {
		this.aShort30 = arg0;
	}
}
