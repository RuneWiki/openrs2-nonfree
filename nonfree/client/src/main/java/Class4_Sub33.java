import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class4_Sub33 extends Class4 {

	@OriginalMember(owner = "client!nfa", name = "r", descriptor = "J")
	public long aLong180;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "()V")
	private Class4_Sub33() {
	}

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(J)V")
	public Class4_Sub33(@OriginalArg(0) long arg0) {
		this.aLong180 = arg0;
	}
}
