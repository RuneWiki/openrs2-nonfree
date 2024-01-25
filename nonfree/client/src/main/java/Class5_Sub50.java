import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class5_Sub50 extends Class5 {

	@OriginalMember(owner = "client!u", name = "r", descriptor = "J")
	public long aLong237;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	private Class5_Sub50() {
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(J)V")
	public Class5_Sub50(@OriginalArg(0) long arg0) {
		this.aLong237 = arg0;
	}
}
