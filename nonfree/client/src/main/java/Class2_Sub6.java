import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	private Class2_Sub6() {
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(S)V")
	public Class2_Sub6(@OriginalArg(0) short arg0) {
		this.aShort1 = arg0;
	}
}
