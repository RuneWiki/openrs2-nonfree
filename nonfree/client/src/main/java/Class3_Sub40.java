import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "S")
	public short aShort116;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	private Class3_Sub40() {
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(S)V")
	public Class3_Sub40(@OriginalArg(0) short arg0) {
		this.aShort116 = arg0;
	}
}
