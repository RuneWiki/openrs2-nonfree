import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "J")
	public long aLong16;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(J)V")
	public Class4_Sub4(@OriginalArg(0) long arg0) {
		this.aLong16 = arg0;
	}
}
