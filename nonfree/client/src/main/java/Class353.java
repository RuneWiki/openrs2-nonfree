import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public final class Class353 implements Interface2 {

	@OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
	public final int anInt9404;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(I)V")
	public Class353(@OriginalArg(0) int arg0) {
		this.anInt9404 = arg0;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)Lclient!tca;")
	@Override
	public Class307 method7827() {
		return Static160.aClass307_16;
	}
}
