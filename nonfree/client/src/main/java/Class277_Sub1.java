import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class277_Sub1 extends Class277 {

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "[Lclient!mj;")
	public final Class243[] aClass243Array1;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "([Lclient!mj;)V")
	public Class277_Sub1(@OriginalArg(0) Class243[] arg0) {
		this.aClass243Array1 = arg0;
	}
}
