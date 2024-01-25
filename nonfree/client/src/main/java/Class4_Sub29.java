import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!o", name = "j", descriptor = "J")
	public long aLong134;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	private Class4_Sub29() {
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(J)V")
	public Class4_Sub29(@OriginalArg(0) long arg0) {
		this.aLong134 = arg0;
	}
}
