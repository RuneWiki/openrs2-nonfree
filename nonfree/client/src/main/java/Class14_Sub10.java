import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class14_Sub10 extends Class14 {

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "J")
	public long aLong41;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	private Class14_Sub10() {
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(J)V")
	public Class14_Sub10(@OriginalArg(0) long arg0) {
		this.aLong41 = arg0;
	}
}
