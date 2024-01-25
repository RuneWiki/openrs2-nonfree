import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class6_Sub36 extends Class6 {

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "S")
	public short aShort92;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	private Class6_Sub36() {
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(S)V")
	public Class6_Sub36(@OriginalArg(0) short arg0) {
		this.aShort92 = arg0;
	}
}
