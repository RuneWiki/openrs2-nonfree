import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "S")
	public short aShort44;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	private Class3_Sub18() {
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(S)V")
	public Class3_Sub18(@OriginalArg(0) short arg0) {
		this.aShort44 = arg0;
	}
}
