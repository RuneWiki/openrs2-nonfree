import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class4_Sub32 extends Class4 {

	@OriginalMember(owner = "client!o", name = "m", descriptor = "J")
	public long aLong165;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	private Class4_Sub32() {
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(J)V")
	public Class4_Sub32(@OriginalArg(0) long arg0) {
		this.aLong165 = arg0;
	}
}
