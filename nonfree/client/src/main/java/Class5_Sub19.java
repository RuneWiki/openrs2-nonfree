import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public final class Class5_Sub19 extends Class5 {

	@OriginalMember(owner = "client!dka", name = "j", descriptor = "S")
	public short aShort26;

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "()V")
	private Class5_Sub19() {
	}

	@OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(S)V")
	public Class5_Sub19(@OriginalArg(0) short arg0) {
		this.aShort26 = arg0;
	}
}
