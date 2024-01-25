import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class12_Sub31 extends Class12 {

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "S")
	public short aShort68;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	private Class12_Sub31() {
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(S)V")
	public Class12_Sub31(@OriginalArg(0) short arg0) {
		this.aShort68 = arg0;
	}
}
