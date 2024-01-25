import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "S")
	public short aShort4;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	private Class2_Sub3() {
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(S)V")
	public Class2_Sub3(@OriginalArg(0) short arg0) {
		this.aShort4 = arg0;
	}
}
