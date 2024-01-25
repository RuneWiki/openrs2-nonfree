import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!oia", name = "q", descriptor = "S")
	public short aShort87;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "()V")
	private Class2_Sub39() {
	}

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(S)V")
	public Class2_Sub39(@OriginalArg(0) short arg0) {
		this.aShort87 = arg0;
	}
}
