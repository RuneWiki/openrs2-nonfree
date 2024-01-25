import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class6_Sub31 extends Class6 {

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "S")
	public short aShort85;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	private Class6_Sub31() {
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(S)V")
	public Class6_Sub31(@OriginalArg(0) short arg0) {
		this.aShort85 = arg0;
	}
}
