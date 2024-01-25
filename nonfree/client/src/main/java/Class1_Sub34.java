import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!of", name = "m", descriptor = "J")
	public long aLong142;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	private Class1_Sub34() {
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(J)V")
	public Class1_Sub34(@OriginalArg(0) long arg0) {
		this.aLong142 = arg0;
	}
}
