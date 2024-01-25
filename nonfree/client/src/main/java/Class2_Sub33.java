import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "S")
	public short aShort69;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	private Class2_Sub33() {
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(S)V")
	public Class2_Sub33(@OriginalArg(0) short arg0) {
		this.aShort69 = arg0;
	}
}
