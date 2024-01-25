import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class293_Sub1 extends Class293 {

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "[Lclient!bq;")
	public final Class41[] aClass41Array1;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([Lclient!bq;)V")
	public Class293_Sub1(@OriginalArg(0) Class41[] arg0) {
		this.aClass41Array1 = arg0;
	}
}
