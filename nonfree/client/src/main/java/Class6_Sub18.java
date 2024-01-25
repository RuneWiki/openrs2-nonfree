import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class6_Sub18 extends Class6 {

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "S")
	public short aShort30;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	private Class6_Sub18() {
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(S)V")
	public Class6_Sub18(@OriginalArg(0) short arg0) {
		this.aShort30 = arg0;
	}
}
