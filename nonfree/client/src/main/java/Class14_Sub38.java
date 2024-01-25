import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class14_Sub38 extends Class14 {

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "J")
	public long aLong206;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	private Class14_Sub38() {
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(J)V")
	public Class14_Sub38(@OriginalArg(0) long arg0) {
		this.aLong206 = arg0;
	}
}
