import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class6_Sub43 extends Class6 {

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	private Class6_Sub43() {
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(S)V")
	public Class6_Sub43(@OriginalArg(0) short arg0) {
		this.aShort97 = arg0;
	}
}
