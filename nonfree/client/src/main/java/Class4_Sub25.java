import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class4_Sub25 extends Class4 {

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
	public int anInt3892;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class4_Sub25() {
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
	public Class4_Sub25(@OriginalArg(0) int arg0) {
		this.anInt3892 = arg0;
	}
}
