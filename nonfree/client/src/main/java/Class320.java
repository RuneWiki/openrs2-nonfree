import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class320 implements Interface9 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "Lclient!pga;")
	private final Class261 aClass261_1;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!pga;)V")
	public Class320(@OriginalArg(0) Class261 arg0) {
		this.aClass261_1 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8149() {
		return true;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8147() {
		Static39.aClass7_2.J(0, 0, Static123.anInt9150, Static71.anInt1872, this.aClass261_1.anInt7817, 0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	@Override
	public void method8148() {
	}
}
