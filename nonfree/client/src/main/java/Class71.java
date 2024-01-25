import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class71 implements Interface17 {

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
	public final int anInt1731;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(I)V")
	public Class71(@OriginalArg(0) int arg0) {
		this.anInt1731 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class152 method9627() {
		return Static450.aClass152_4;
	}
}
