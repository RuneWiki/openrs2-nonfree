import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "S")
	public short aShort39;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	private Class4_Sub11() {
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(S)V")
	public Class4_Sub11(@OriginalArg(0) short arg0) {
		this.aShort39 = arg0;
	}
}
