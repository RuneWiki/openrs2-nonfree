import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
	public int anInt3982;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	private Class3_Sub28() {
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V")
	public Class3_Sub28(@OriginalArg(0) int arg0) {
		this.anInt3982 = arg0;
	}
}
