import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class5_Sub35 extends Class5 {

	@OriginalMember(owner = "client!of", name = "o", descriptor = "S")
	public short aShort88;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	private Class5_Sub35() {
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(S)V")
	public Class5_Sub35(@OriginalArg(0) short arg0) {
		this.aShort88 = arg0;
	}
}
