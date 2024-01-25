import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "J")
	public long aLong197;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	private Class3_Sub42() {
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(J)V")
	public Class3_Sub42(@OriginalArg(0) long arg0) {
		this.aLong197 = arg0;
	}
}
