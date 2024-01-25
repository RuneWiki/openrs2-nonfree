import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "S")
	public short aShort6;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	private Class2_Sub12() {
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(S)V")
	public Class2_Sub12(@OriginalArg(0) short arg0) {
		this.aShort6 = arg0;
	}
}
