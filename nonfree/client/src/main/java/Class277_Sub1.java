import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class277_Sub1 extends Class277 {

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "[Lclient!ug;")
	public final Class355[] aClass355Array1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "([Lclient!ug;)V")
	public Class277_Sub1(@OriginalArg(0) Class355[] arg0) {
		this.aClass355Array1 = arg0;
	}
}
