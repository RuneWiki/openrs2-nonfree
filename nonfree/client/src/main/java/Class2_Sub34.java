import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "J")
	public long aLong165;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	private Class2_Sub34() {
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(J)V")
	public Class2_Sub34(@OriginalArg(0) long arg0) {
		this.aLong165 = arg0;
	}
}
