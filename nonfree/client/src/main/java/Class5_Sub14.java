import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class5_Sub14 extends Class5 {

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "J")
	public long aLong90;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	private Class5_Sub14() {
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(J)V")
	public Class5_Sub14(@OriginalArg(0) long arg0) {
		this.aLong90 = arg0;
	}
}
