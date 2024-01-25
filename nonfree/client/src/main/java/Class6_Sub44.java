import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class6_Sub44 extends Class6 {

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "S")
	public short aShort103;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	private Class6_Sub44() {
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(S)V")
	public Class6_Sub44(@OriginalArg(0) short arg0) {
		this.aShort103 = arg0;
	}
}
