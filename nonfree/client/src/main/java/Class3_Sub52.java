import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class3_Sub52 extends Class3 {

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "J")
	public long aLong263;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
	private Class3_Sub52() {
	}

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(J)V")
	public Class3_Sub52(@OriginalArg(0) long arg0) {
		this.aLong263 = arg0;
	}
}
