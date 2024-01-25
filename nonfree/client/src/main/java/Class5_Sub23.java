import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class5_Sub23 extends Class5 {

	@OriginalMember(owner = "client!im", name = "r", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V")
	private Class5_Sub23() {
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(S)V")
	public Class5_Sub23(@OriginalArg(0) short arg0) {
		this.aShort32 = arg0;
	}
}
