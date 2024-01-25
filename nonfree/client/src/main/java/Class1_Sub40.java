import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "J")
	public long aLong195;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
	private Class1_Sub40() {
	}

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(J)V")
	public Class1_Sub40(@OriginalArg(0) long arg0) {
		this.aLong195 = arg0;
	}
}
