import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "J")
	public long aLong145;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(J)V")
	public Class1_Sub24(@OriginalArg(0) long arg0) {
		this.aLong145 = arg0;
	}
}
