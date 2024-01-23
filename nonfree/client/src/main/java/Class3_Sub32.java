import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "J")
	public long aLong242;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(J)V")
	public Class3_Sub32(@OriginalArg(0) long arg0) {
		this.aLong242 = arg0;
	}
}
