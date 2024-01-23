import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "J")
	public long aLong53;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(J)V")
	public Class1_Sub12(@OriginalArg(0) long arg0) {
		this.aLong53 = arg0;
	}
}
