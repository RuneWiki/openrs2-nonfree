import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "S")
	public short aShort60;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	private Class2_Sub29() {
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(S)V")
	public Class2_Sub29(@OriginalArg(0) short arg0) {
		this.aShort60 = arg0;
	}
}
