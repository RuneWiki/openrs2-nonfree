import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "S")
	public short aShort96;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	private Class2_Sub43() {
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(S)V")
	public Class2_Sub43(@OriginalArg(0) short arg0) {
		this.aShort96 = arg0;
	}
}
