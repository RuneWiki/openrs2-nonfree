import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class120 implements Interface14 {

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public final int anInt3467;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V")
	public Class120(@OriginalArg(0) int arg0) {
		this.anInt3467 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Lclient!ph;")
	@Override
	public Class260 method6943() {
		return Static351.aClass260_5;
	}
}
