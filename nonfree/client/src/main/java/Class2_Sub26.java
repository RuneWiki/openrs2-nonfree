import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "J")
	public long aLong128;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	private Class2_Sub26() {
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(J)V")
	public Class2_Sub26(@OriginalArg(0) long arg0) {
		this.aLong128 = arg0;
	}
}
