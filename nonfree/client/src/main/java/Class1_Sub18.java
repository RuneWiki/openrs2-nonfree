import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "J")
	public long aLong109;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(J)V")
	public Class1_Sub18(@OriginalArg(0) long arg0) {
		this.aLong109 = arg0;
	}
}
