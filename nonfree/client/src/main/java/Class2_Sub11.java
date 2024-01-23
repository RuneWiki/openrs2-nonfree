import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "J")
	public long aLong43;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(J)V")
	public Class2_Sub11(@OriginalArg(0) long arg0) {
		this.aLong43 = arg0;
	}
}
