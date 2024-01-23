import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class4_Sub33 extends Class4 {

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "J")
	public long aLong196;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(J)V")
	public Class4_Sub33(@OriginalArg(0) long arg0) {
		this.aLong196 = arg0;
	}
}
