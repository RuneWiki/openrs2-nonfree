import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class4_Sub38 extends Class4 {

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	private Class4_Sub38() {
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(S)V")
	public Class4_Sub38(@OriginalArg(0) short arg0) {
		this.aShort87 = arg0;
	}
}
