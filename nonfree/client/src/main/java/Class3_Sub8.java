import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!au", name = "l", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V")
	private Class3_Sub8() {
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(S)V")
	public Class3_Sub8(@OriginalArg(0) short arg0) {
		this.aShort1 = arg0;
	}
}
