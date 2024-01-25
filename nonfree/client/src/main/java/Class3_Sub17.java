import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
	public int anInt3217;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
	private Class3_Sub17() {
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(I)V")
	public Class3_Sub17(@OriginalArg(0) int arg0) {
		this.anInt3217 = arg0;
	}
}
