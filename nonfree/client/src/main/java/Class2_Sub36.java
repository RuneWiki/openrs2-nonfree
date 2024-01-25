import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "J")
	public long aLong167;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	private Class2_Sub36() {
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(J)V")
	public Class2_Sub36(@OriginalArg(0) long arg0) {
		this.aLong167 = arg0;
	}
}
