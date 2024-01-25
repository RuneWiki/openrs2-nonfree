import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	private Class3_Sub43() {
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(S)V")
	public Class3_Sub43(@OriginalArg(0) short arg0) {
		this.aShort110 = arg0;
	}
}
