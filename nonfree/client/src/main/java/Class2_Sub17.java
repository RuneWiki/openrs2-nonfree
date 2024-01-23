import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(J)V")
	public Class2_Sub17(@OriginalArg(0) long arg0) {
		this.aLong175 = arg0;
	}
}
