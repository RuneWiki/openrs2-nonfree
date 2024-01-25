import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!nq", name = "s", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	private Class3_Sub38() {
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(S)V")
	public Class3_Sub38(@OriginalArg(0) short arg0) {
		this.aShort82 = arg0;
	}
}
