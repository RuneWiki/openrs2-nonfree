import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "S")
	public short aShort16;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V")
	private Class2_Sub10() {
	}

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(S)V")
	public Class2_Sub10(@OriginalArg(0) short arg0) {
		this.aShort16 = arg0;
	}
}
