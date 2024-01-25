import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public final class Class4_Sub30 extends Class4 {

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "S")
	public short aShort82;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V")
	private Class4_Sub30() {
	}

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(S)V")
	public Class4_Sub30(@OriginalArg(0) short arg0) {
		this.aShort82 = arg0;
	}
}
