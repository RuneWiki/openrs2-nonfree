import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class4_Sub52 extends Class4 {

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "S")
	public short aShort126;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "()V")
	private Class4_Sub52() {
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(S)V")
	public Class4_Sub52(@OriginalArg(0) short arg0) {
		this.aShort126 = arg0;
	}
}
