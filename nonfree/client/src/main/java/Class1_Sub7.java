import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!cca", name = "j", descriptor = "S")
	public short aShort16;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
	private Class1_Sub7() {
	}

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(S)V")
	public Class1_Sub7(@OriginalArg(0) short arg0) {
		this.aShort16 = arg0;
	}
}
