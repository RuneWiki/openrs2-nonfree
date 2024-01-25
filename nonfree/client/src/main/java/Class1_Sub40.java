import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!t", name = "r", descriptor = "S")
	public short aShort76;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	private Class1_Sub40() {
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(S)V")
	public Class1_Sub40(@OriginalArg(0) short arg0) {
		this.aShort76 = arg0;
	}
}
