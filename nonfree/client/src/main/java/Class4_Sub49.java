import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class4_Sub49 extends Class4 {

	@OriginalMember(owner = "client!uu", name = "s", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
	private Class4_Sub49() {
	}

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(S)V")
	public Class4_Sub49(@OriginalArg(0) short arg0) {
		this.aShort123 = arg0;
	}
}
