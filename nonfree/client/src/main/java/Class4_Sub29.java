import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!mk", name = "q", descriptor = "J")
	public long aLong153;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	private Class4_Sub29() {
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(J)V")
	public Class4_Sub29(@OriginalArg(0) long arg0) {
		this.aLong153 = arg0;
	}
}
