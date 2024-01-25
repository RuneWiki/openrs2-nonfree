import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "S")
	public short aShort61;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	private Class1_Sub31() {
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(S)V")
	public Class1_Sub31(@OriginalArg(0) short arg0) {
		this.aShort61 = arg0;
	}
}
