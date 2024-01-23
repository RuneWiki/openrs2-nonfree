import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public final class Class8_Sub18 extends Class8 {

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "J")
	public long aLong104;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(J)V")
	public Class8_Sub18(@OriginalArg(0) long arg0) {
		this.aLong104 = arg0;
	}
}
