import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "J")
	public long aLong158;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(J)V")
	public Class1_Sub21(@OriginalArg(0) long arg0) {
		this.aLong158 = arg0;
	}
}
