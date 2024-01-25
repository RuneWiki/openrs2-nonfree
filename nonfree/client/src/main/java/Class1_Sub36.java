import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "S")
	public short aShort75;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	private Class1_Sub36() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(S)V")
	public Class1_Sub36(@OriginalArg(0) short arg0) {
		this.aShort75 = arg0;
	}
}
