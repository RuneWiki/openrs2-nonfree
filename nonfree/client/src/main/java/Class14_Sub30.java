import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class14_Sub30 extends Class14 {

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
	public int anInt6793;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	private Class14_Sub30() {
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V")
	public Class14_Sub30(@OriginalArg(0) int arg0) {
		this.anInt6793 = arg0;
	}
}
