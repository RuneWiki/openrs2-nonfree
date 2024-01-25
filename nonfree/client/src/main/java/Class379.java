import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class379 implements Interface12 {

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Lclient!hc;")
	private final Class135 aClass135_1;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!hc;)V")
	public Class379(@OriginalArg(0) Class135 arg0) {
		this.aClass135_1 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8775() {
		Static485.aClass126_17.aa(0, 0, Static254.anInt4283, Static438.anInt7403, this.aClass135_1.anInt3590, 0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	@Override
	public void method8777() {
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8776() {
		return true;
	}
}
