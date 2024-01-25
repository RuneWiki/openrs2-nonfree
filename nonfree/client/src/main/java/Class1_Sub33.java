import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "J")
	public long aLong269;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	private Class1_Sub33() {
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(J)V")
	public Class1_Sub33(@OriginalArg(0) long arg0) {
		this.aLong269 = arg0;
	}
}
