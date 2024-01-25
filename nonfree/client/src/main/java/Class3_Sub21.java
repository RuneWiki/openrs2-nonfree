import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "J")
	public long aLong96;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	private Class3_Sub21() {
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(J)V")
	public Class3_Sub21(@OriginalArg(0) long arg0) {
		this.aLong96 = arg0;
	}
}
