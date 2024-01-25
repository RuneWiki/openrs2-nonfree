import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	public int anInt4134;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	private Class3_Sub25() {
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V")
	public Class3_Sub25(@OriginalArg(0) int arg0) {
		this.anInt4134 = arg0;
	}
}
