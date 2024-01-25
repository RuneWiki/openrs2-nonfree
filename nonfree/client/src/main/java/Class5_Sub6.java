import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!bga", name = "k", descriptor = "S")
	public short aShort17;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "()V")
	private Class5_Sub6() {
	}

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(S)V")
	public Class5_Sub6(@OriginalArg(0) short arg0) {
		this.aShort17 = arg0;
	}
}
