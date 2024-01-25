import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!br", name = "t", descriptor = "S")
	public short aShort4;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	private Class3_Sub9() {
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(S)V")
	public Class3_Sub9(@OriginalArg(0) short arg0) {
		this.aShort4 = arg0;
	}
}
