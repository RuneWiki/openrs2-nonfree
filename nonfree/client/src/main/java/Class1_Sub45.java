import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	private Class1_Sub45() {
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(S)V")
	public Class1_Sub45(@OriginalArg(0) short arg0) {
		this.aShort97 = arg0;
	}
}
