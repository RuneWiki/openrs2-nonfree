import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "S")
	public short aShort48;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V")
	private Class3_Sub29() {
	}

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(S)V")
	public Class3_Sub29(@OriginalArg(0) short arg0) {
		this.aShort48 = arg0;
	}
}
