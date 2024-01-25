import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class5_Sub37 extends Class5 {

	@OriginalMember(owner = "client!lba", name = "m", descriptor = "S")
	public short aShort54;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V")
	private Class5_Sub37() {
	}

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(S)V")
	public Class5_Sub37(@OriginalArg(0) short arg0) {
		this.aShort54 = arg0;
	}
}
