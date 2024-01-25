import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "S")
	public short aShort25;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
	private Class3_Sub11() {
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(S)V")
	public Class3_Sub11(@OriginalArg(0) short arg0) {
		this.aShort25 = arg0;
	}
}
