import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class Class9_Sub1 extends Class9 {

	static {
		new Class151(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	protected Class9_Sub1() {
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)Lclient!rc;")
	public abstract Class5_Sub4 method1534();
}
