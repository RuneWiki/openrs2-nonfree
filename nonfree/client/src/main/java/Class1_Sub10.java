import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "J")
	public long aLong68;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(J)V")
	public Class1_Sub10(@OriginalArg(0) long arg0) {
		this.aLong68 = arg0;
	}
}
