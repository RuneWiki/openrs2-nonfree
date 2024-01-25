import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "S")
	public short aShort79;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	private Class1_Sub33() {
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(S)V")
	public Class1_Sub33(@OriginalArg(0) short arg0) {
		this.aShort79 = arg0;
	}
}
