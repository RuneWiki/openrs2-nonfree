import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class4_Sub43 extends Class4 {

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	private Class4_Sub43() {
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(S)V")
	public Class4_Sub43(@OriginalArg(0) short arg0) {
		this.aShort95 = arg0;
	}
}
