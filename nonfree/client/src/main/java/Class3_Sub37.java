import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	private Class3_Sub37() {
	}

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(S)V")
	public Class3_Sub37(@OriginalArg(0) short arg0) {
		this.aShort87 = arg0;
	}
}
