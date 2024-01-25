import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public final class Class1_Sub47 extends Class1 {

	@OriginalMember(owner = "client!us", name = "j", descriptor = "S")
	public short aShort114;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	private Class1_Sub47() {
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(S)V")
	public Class1_Sub47(@OriginalArg(0) short arg0) {
		this.aShort114 = arg0;
	}
}
