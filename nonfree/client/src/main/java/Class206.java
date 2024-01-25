import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class206 implements Interface17 {

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public final int anInt5029;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
	public Class206(@OriginalArg(0) int arg0) {
		this.anInt5029 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Lclient!mh;")
	@Override
	public Class225 method7443() {
		return Static268.aClass225_18;
	}
}
