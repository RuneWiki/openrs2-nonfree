import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "J")
	public long aLong127;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	private Class3_Sub24() {
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(J)V")
	public Class3_Sub24(@OriginalArg(0) long arg0) {
		this.aLong127 = arg0;
	}
}
