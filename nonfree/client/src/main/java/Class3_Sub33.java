import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "S")
	public short aShort76;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "()V")
	private Class3_Sub33() {
	}

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(S)V")
	public Class3_Sub33(@OriginalArg(0) short arg0) {
		this.aShort76 = arg0;
	}
}
