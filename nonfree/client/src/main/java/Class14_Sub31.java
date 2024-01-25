import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class14_Sub31 extends Class14 {

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "S")
	public short aShort77;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	private Class14_Sub31() {
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(S)V")
	public Class14_Sub31(@OriginalArg(0) short arg0) {
		this.aShort77 = arg0;
	}
}
