import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public final class Class14_Sub46 extends Class14 {

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "J")
	public long aLong284;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "()V")
	private Class14_Sub46() {
	}

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(J)V")
	public Class14_Sub46(@OriginalArg(0) long arg0) {
		this.aLong284 = arg0;
	}
}
