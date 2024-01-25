import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class253 implements Interface8 {

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "Lclient!bt;")
	private final Class34 aClass34_86;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class253(@OriginalArg(0) Class34 arg0) {
		this.aClass34_86 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I")
	@Override
	public int method7616() {
		return this.aClass34_86.method1257() ? 100 : this.aClass34_86.method1241();
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)Lclient!sg;")
	@Override
	public Class329 method7617() {
		return Static545.aClass329_1;
	}
}
