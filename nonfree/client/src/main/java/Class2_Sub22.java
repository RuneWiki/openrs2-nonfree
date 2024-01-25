import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!gia", name = "k", descriptor = "S")
	public short aShort63;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V")
	private Class2_Sub22() {
	}

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(S)V")
	public Class2_Sub22(@OriginalArg(0) short arg0) {
		this.aShort63 = arg0;
	}
}
