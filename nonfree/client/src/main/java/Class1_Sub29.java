import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "S")
	public short aShort76;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	private Class1_Sub29() {
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(S)V")
	public Class1_Sub29(@OriginalArg(0) short arg0) {
		this.aShort76 = arg0;
	}
}
