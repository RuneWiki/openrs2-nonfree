import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "[Lclient!tg;")
	public final Class325[] aClass325Array1;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "([Lclient!tg;)V")
	public Class94_Sub1(@OriginalArg(0) Class325[] arg0) {
		this.aClass325Array1 = arg0;
	}
}
