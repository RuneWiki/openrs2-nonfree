import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class346 implements Interface20 {

	@OriginalMember(owner = "client!up", name = "b", descriptor = "Lclient!rn;")
	private final Class297 aClass297_1;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!rn;)V")
	public Class346(@OriginalArg(0) Class297 arg0) {
		this.aClass297_1 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8023() {
		return true;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	@Override
	public void method8024() {
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022() {
		Static600.aClass87_15.aa(0, 0, Static571.anInt9399, Static585.anInt9606, this.aClass297_1.anInt8414, 0);
	}
}
