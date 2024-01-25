import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class6_Sub25 extends Class6 {

	@OriginalMember(owner = "client!is", name = "n", descriptor = "J")
	public long aLong107;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	private Class6_Sub25() {
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(J)V")
	public Class6_Sub25(@OriginalArg(0) long arg0) {
		this.aLong107 = arg0;
	}
}
