import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "J")
	public long aLong176;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	private Class1_Sub34() {
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(J)V")
	public Class1_Sub34(@OriginalArg(0) long arg0) {
		this.aLong176 = arg0;
	}
}
