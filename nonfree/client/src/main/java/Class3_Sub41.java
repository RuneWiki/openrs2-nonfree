import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "J")
	public long aLong207;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	private Class3_Sub41() {
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(J)V")
	public Class3_Sub41(@OriginalArg(0) long arg0) {
		this.aLong207 = arg0;
	}
}
