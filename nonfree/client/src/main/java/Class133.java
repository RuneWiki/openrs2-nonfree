import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class133 implements Interface2 {

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
	public final int anInt3675;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V")
	public Class133(@OriginalArg(0) int arg0) {
		this.anInt3675 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Lclient!saa;")
	@Override
	public Class310 method9078() {
		return Static174.aClass310_20;
	}
}
