import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class203_Sub1 extends Class203 {

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "[Lclient!lm;")
	public final Class212[] aClass212Array1;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "([Lclient!lm;)V")
	public Class203_Sub1(@OriginalArg(0) Class212[] arg0) {
		this.aClass212Array1 = arg0;
	}
}
