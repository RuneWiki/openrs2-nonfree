import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public final class Class3_Sub50 extends Class3 {

	@OriginalMember(owner = "client!tda", name = "j", descriptor = "J")
	public long aLong267;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
	private Class3_Sub50() {
	}

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(J)V")
	public Class3_Sub50(@OriginalArg(0) long arg0) {
		this.aLong267 = arg0;
	}
}
