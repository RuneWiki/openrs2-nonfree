import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "S")
	public short aShort83;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	private Class3_Sub39() {
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(S)V")
	public Class3_Sub39(@OriginalArg(0) short arg0) {
		this.aShort83 = arg0;
	}
}
