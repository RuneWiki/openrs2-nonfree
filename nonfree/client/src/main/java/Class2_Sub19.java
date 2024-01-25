import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "S")
	public short aShort41;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
	private Class2_Sub19() {
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(S)V")
	public Class2_Sub19(@OriginalArg(0) short arg0) {
		this.aShort41 = arg0;
	}
}
