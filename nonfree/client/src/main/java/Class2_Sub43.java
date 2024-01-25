import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "J")
	public long aLong209;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	private Class2_Sub43() {
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(J)V")
	public Class2_Sub43(@OriginalArg(0) long arg0) {
		this.aLong209 = arg0;
	}
}
