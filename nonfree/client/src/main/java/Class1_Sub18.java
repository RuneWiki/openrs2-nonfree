import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!il", name = "p", descriptor = "J")
	public long aLong103;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(J)V")
	public Class1_Sub18(@OriginalArg(0) long arg0) {
		this.aLong103 = arg0;
	}
}
