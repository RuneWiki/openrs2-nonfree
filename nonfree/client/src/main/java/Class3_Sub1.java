import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!aaa", name = "q", descriptor = "J")
	public long aLong3;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
	private Class3_Sub1() {
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(J)V")
	public Class3_Sub1(@OriginalArg(0) long arg0) {
		this.aLong3 = arg0;
	}
}
