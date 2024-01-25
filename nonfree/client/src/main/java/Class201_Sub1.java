import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class201_Sub1 extends Class201 {

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "[Lclient!wk;")
	public final Class388[] aClass388Array1;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([Lclient!wk;)V")
	public Class201_Sub1(@OriginalArg(0) Class388[] arg0) {
		this.aClass388Array1 = arg0;
	}
}
