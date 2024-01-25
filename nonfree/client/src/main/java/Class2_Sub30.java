import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "S")
	public short aShort67;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	private Class2_Sub30() {
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(S)V")
	public Class2_Sub30(@OriginalArg(0) short arg0) {
		this.aShort67 = arg0;
	}
}
