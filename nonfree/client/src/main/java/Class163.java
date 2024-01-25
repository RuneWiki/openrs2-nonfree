import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class163 implements Interface13 {

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "Lclient!vd;")
	private final Class353 aClass353_49;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class163(@OriginalArg(0) Class353 arg0) {
		this.aClass353_49 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Lclient!gj;")
	@Override
	public Class115 method8509() {
		return Static184.aClass115_2;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)I")
	@Override
	public int method8510() {
		return this.aClass353_49.method8413() ? 100 : this.aClass353_49.method8409();
	}
}
