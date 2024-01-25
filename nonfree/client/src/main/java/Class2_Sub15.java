import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "S")
	public short aShort24;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	private Class2_Sub15() {
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(S)V")
	public Class2_Sub15(@OriginalArg(0) short arg0) {
		this.aShort24 = arg0;
	}
}
