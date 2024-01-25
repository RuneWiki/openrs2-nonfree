import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class363 implements Interface9 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	public final int anInt9554;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(I)V")
	public Class363(@OriginalArg(0) int arg0) {
		this.anInt9554 = arg0;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class6 method8749() {
		return Static332.aClass6_19;
	}
}
