import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "J")
	public long aLong17;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(J)V")
	public Class2_Sub4(@OriginalArg(0) long arg0) {
		this.aLong17 = arg0;
	}
}
