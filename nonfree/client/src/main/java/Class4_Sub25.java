import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class4_Sub25 extends Class4 {

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "J")
	public long aLong145;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	private Class4_Sub25() {
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(J)V")
	public Class4_Sub25(@OriginalArg(0) long arg0) {
		this.aLong145 = arg0;
	}
}
