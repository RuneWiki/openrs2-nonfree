import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "S")
	public short aShort48;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	private Class1_Sub24() {
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(S)V")
	public Class1_Sub24(@OriginalArg(0) short arg0) {
		this.aShort48 = arg0;
	}
}
