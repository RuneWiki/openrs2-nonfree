import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class3_Sub51 extends Class3 {

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
	public int anInt9787;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	private Class3_Sub51() {
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
	public Class3_Sub51(@OriginalArg(0) int arg0) {
		this.anInt9787 = arg0;
	}
}
