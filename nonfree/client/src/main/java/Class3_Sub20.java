import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "S")
	public short aShort27;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	private Class3_Sub20() {
	}

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(S)V")
	public Class3_Sub20(@OriginalArg(0) short arg0) {
		this.aShort27 = arg0;
	}
}
