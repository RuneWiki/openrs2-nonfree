import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public final class Class6_Sub51 extends Class6 {

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "J")
	public long aLong271;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
	private Class6_Sub51() {
	}

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(J)V")
	public Class6_Sub51(@OriginalArg(0) long arg0) {
		this.aLong271 = arg0;
	}
}
