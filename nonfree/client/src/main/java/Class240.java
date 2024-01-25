import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class240 implements Interface2 {

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public final int anInt6735;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V")
	public Class240(@OriginalArg(0) int arg0) {
		this.anInt6735 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Lclient!tca;")
	@Override
	public Class307 method7827() {
		return Static116.aClass307_4;
	}
}
