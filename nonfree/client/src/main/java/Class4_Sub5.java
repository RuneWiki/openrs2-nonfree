import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "J")
	public long aLong17;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(J)V")
	public Class4_Sub5(@OriginalArg(0) long arg0) {
		this.aLong17 = arg0;
	}
}
