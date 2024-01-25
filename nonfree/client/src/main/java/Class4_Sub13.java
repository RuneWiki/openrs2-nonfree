import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class4_Sub13 extends Class4 {

	@OriginalMember(owner = "client!de", name = "r", descriptor = "J")
	public long aLong45;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	private Class4_Sub13() {
	}

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(J)V")
	public Class4_Sub13(@OriginalArg(0) long arg0) {
		this.aLong45 = arg0;
	}
}
