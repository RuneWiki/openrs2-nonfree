import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class1_Sub41 extends Class1 {

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "S")
	public short aShort84;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	private Class1_Sub41() {
	}

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(S)V")
	public Class1_Sub41(@OriginalArg(0) short arg0) {
		this.aShort84 = arg0;
	}
}
