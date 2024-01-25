import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
	public int anInt3957;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	private Class3_Sub30() {
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
	public Class3_Sub30(@OriginalArg(0) int arg0) {
		this.anInt3957 = arg0;
	}
}
