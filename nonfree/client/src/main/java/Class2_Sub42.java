import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "J")
	public long aLong217;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	private Class2_Sub42() {
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(J)V")
	public Class2_Sub42(@OriginalArg(0) long arg0) {
		this.aLong217 = arg0;
	}
}
