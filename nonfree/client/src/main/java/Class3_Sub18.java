import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "J")
	public long aLong61;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	private Class3_Sub18() {
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(J)V")
	public Class3_Sub18(@OriginalArg(0) long arg0) {
		this.aLong61 = arg0;
	}
}
