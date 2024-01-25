import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class Class4_Sub27 extends Class4 {

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "S")
	public short aShort55;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	private Class4_Sub27() {
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(S)V")
	public Class4_Sub27(@OriginalArg(0) short arg0) {
		this.aShort55 = arg0;
	}
}
