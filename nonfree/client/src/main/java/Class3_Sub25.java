import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
	public final int anInt3833;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	public Class3_Sub25(@OriginalArg(0) int arg0) {
		this.anInt3833 = arg0;
	}
}
