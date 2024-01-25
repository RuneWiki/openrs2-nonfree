import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class1_Sub49 extends Class1 {

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	private Class1_Sub49() {
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(S)V")
	public Class1_Sub49(@OriginalArg(0) short arg0) {
		this.aShort117 = arg0;
	}
}
