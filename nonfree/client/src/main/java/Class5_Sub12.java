import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public final class Class5_Sub12 extends Class5 {

	@OriginalMember(owner = "client!cia", name = "o", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "()V")
	private Class5_Sub12() {
	}

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(S)V")
	public Class5_Sub12(@OriginalArg(0) short arg0) {
		this.aShort32 = arg0;
	}
}
