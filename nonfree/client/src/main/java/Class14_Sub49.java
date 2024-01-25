import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class14_Sub49 extends Class14 {

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "S")
	public short aShort95;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	private Class14_Sub49() {
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(S)V")
	public Class14_Sub49(@OriginalArg(0) short arg0) {
		this.aShort95 = arg0;
	}
}
