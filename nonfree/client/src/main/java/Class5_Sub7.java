import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!bja", name = "i", descriptor = "J")
	public long aLong27;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "()V")
	private Class5_Sub7() {
	}

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(J)V")
	public Class5_Sub7(@OriginalArg(0) long arg0) {
		this.aLong27 = arg0;
	}
}
