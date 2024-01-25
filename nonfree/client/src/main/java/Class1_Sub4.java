import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	private Class1_Sub4() {
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(S)V")
	public Class1_Sub4(@OriginalArg(0) short arg0) {
		this.aShort7 = arg0;
	}
}
