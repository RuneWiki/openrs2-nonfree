import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "J")
	public long aLong158;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	private Class3_Sub30() {
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(J)V")
	public Class3_Sub30(@OriginalArg(0) long arg0) {
		this.aLong158 = arg0;
	}
}
