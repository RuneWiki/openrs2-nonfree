import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class5_Sub50 extends Class5 {

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "J")
	public long aLong293;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	private Class5_Sub50() {
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(J)V")
	public Class5_Sub50(@OriginalArg(0) long arg0) {
		this.aLong293 = arg0;
	}
}
