import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class157 implements Interface15 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!cg;")
	private final Class50 aClass50_1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class157(@OriginalArg(0) Class50 arg0) {
		this.aClass50_1 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6565() {
		Static176.aClass121_5.C(0, 0, Static502.anInt8364, Static476.anInt8045, this.aClass50_1.anInt954, 0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	@Override
	public void method6567() {
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6566() {
		return true;
	}
}
