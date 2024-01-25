import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class3_Sub53 extends Class3 {

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "S")
	public short aShort112;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
	private Class3_Sub53() {
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(S)V")
	public Class3_Sub53(@OriginalArg(0) short arg0) {
		this.aShort112 = arg0;
	}
}
