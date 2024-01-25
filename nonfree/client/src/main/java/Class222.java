import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class222 implements Interface19 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
	public final int anInt6200;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V")
	public Class222(@OriginalArg(0) int arg0) {
		this.anInt6200 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return Static172.aClass357_4;
	}
}
