import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!jca", name = "s", descriptor = "S")
	public short aShort54;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
	private Class2_Sub32() {
	}

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(S)V")
	public Class2_Sub32(@OriginalArg(0) short arg0) {
		this.aShort54 = arg0;
	}
}
