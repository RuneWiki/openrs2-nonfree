import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class5_Sub35 extends Class5 {

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	private Class5_Sub35() {
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(J)V")
	public Class5_Sub35(@OriginalArg(0) long arg0) {
		this.aLong175 = arg0;
	}
}
