import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class4_Sub50 extends Class4 {

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "J")
	public long aLong276;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	private Class4_Sub50() {
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(J)V")
	public Class4_Sub50(@OriginalArg(0) long arg0) {
		this.aLong276 = arg0;
	}
}
