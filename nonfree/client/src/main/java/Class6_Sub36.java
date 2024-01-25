import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class6_Sub36 extends Class6 {

	@OriginalMember(owner = "client!th", name = "l", descriptor = "S")
	public short aShort94;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	private Class6_Sub36() {
	}

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(S)V")
	public Class6_Sub36(@OriginalArg(0) short arg0) {
		this.aShort94 = arg0;
	}
}
