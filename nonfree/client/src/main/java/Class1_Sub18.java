import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "J")
	public long aLong92;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	private Class1_Sub18() {
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(J)V")
	public Class1_Sub18(@OriginalArg(0) long arg0) {
		this.aLong92 = arg0;
	}
}
