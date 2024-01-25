import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	private Class6_Sub40() {
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(S)V")
	public Class6_Sub40(@OriginalArg(0) short arg0) {
		this.aShort83 = arg0;
	}
}
