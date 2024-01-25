import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!go", name = "j", descriptor = "S")
	public short aShort45;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	private Class3_Sub26() {
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(S)V")
	public Class3_Sub26(@OriginalArg(0) short arg0) {
		this.aShort45 = arg0;
	}
}
