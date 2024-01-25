import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pla")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!pla", name = "m", descriptor = "J")
	public long aLong282;

	@OriginalMember(owner = "client!pla", name = "<init>", descriptor = "()V")
	private Class3_Sub43() {
	}

	@OriginalMember(owner = "client!pla", name = "<init>", descriptor = "(J)V")
	public Class3_Sub43(@OriginalArg(0) long arg0) {
		this.aLong282 = arg0;
	}
}
