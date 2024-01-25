import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "J")
	public long aLong55;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	private Class1_Sub12() {
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(J)V")
	public Class1_Sub12(@OriginalArg(0) long arg0) {
		this.aLong55 = arg0;
	}
}
