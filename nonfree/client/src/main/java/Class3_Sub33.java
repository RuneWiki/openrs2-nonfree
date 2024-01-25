import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public final class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!jja", name = "n", descriptor = "I")
	public int anInt4831;

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
	private Class3_Sub33() {
	}

	@OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(I)V")
	public Class3_Sub33(@OriginalArg(0) int arg0) {
		this.anInt4831 = arg0;
	}
}
