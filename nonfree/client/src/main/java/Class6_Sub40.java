import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public final class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "J")
	public long aLong237;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
	private Class6_Sub40() {
	}

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(J)V")
	public Class6_Sub40(@OriginalArg(0) long arg0) {
		this.aLong237 = arg0;
	}
}
