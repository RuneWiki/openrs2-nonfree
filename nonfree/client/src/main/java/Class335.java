import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class335 implements Interface23 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
	public final int anInt9411;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I)V")
	public Class335(@OriginalArg(0) int arg0) {
		this.anInt9411 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)Lclient!ww;")
	@Override
	public Class384 method8182() {
		return Static429.aClass384_57;
	}
}
