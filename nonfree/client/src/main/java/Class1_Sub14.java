import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "S")
	public short aShort26;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	private Class1_Sub14() {
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(S)V")
	public Class1_Sub14(@OriginalArg(0) short arg0) {
		this.aShort26 = arg0;
	}
}
