import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "S")
	public short aShort37;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	private Class2_Sub19() {
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(S)V")
	public Class2_Sub19(@OriginalArg(0) short arg0) {
		this.aShort37 = arg0;
	}
}
