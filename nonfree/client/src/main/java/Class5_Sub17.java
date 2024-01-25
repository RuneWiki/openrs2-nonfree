import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class5_Sub17 extends Class5 {

	@OriginalMember(owner = "client!gba", name = "j", descriptor = "S")
	public short aShort35;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
	private Class5_Sub17() {
	}

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(S)V")
	public Class5_Sub17(@OriginalArg(0) short arg0) {
		this.aShort35 = arg0;
	}
}
