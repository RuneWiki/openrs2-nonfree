import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public final class Class213 implements Interface1 {

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
	public final int anInt6738;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(I)V")
	public Class213(@OriginalArg(0) int arg0) {
		this.anInt6738 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)Lclient!qi;")
	@Override
	public Class275 method8059() {
		return Static614.aClass275_10;
	}
}
