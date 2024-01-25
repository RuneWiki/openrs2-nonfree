import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public final class Class8_Sub38 extends Class8 {

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "S")
	public short aShort79;

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V")
	private Class8_Sub38() {
	}

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(S)V")
	public Class8_Sub38(@OriginalArg(0) short arg0) {
		this.aShort79 = arg0;
	}
}
