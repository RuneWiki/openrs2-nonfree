import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class1_Sub39 extends Class1 {

	@OriginalMember(owner = "client!su", name = "p", descriptor = "S")
	public short aShort75;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	private Class1_Sub39() {
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(S)V")
	public Class1_Sub39(@OriginalArg(0) short arg0) {
		this.aShort75 = arg0;
	}
}
