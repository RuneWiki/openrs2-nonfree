import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!paa", name = "m", descriptor = "J")
	public long aLong187;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "()V")
	private Class3_Sub39() {
	}

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(J)V")
	public Class3_Sub39(@OriginalArg(0) long arg0) {
		this.aLong187 = arg0;
	}
}
