import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class363 implements Interface14 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
	public final int anInt10110;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
	public Class363(@OriginalArg(0) int arg0) {
		this.anInt10110 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lclient!c;")
	@Override
	public Class51 method9393() {
		return Static410.aClass51_24;
	}
}
