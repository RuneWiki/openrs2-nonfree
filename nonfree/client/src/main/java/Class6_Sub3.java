import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!an", name = "r", descriptor = "J")
	public long aLong21;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	private Class6_Sub3() {
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(J)V")
	public Class6_Sub3(@OriginalArg(0) long arg0) {
		this.aLong21 = arg0;
	}
}
