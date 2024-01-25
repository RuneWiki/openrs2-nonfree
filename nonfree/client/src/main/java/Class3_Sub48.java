import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class3_Sub48 extends Class3 {

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
	public int anInt9989;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	private Class3_Sub48() {
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(I)V")
	public Class3_Sub48(@OriginalArg(0) int arg0) {
		this.anInt9989 = arg0;
	}
}
