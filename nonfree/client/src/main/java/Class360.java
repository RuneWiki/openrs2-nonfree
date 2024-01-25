import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class360 implements Interface10 {

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "Lclient!cr;")
	private final Class71 aClass71_1;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!cr;)V")
	public Class360(@OriginalArg(0) Class71 arg0) {
		this.aClass71_1 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	@Override
	public void method9561() {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9562() {
		return true;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9560() {
		Static396.aClass145_6.aa(0, 0, Static151.anInt7983, Static295.anInt4558, this.aClass71_1.anInt1731, 0);
	}
}
