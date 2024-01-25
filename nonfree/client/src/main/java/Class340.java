import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class340 implements Interface1 {

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "Lclient!gr;")
	private final Class133 aClass133_1;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!gr;)V")
	public Class340(@OriginalArg(0) Class133 arg0) {
		this.aClass133_1 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	@Override
	public void method8739() {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8741() {
		Static677.aClass137_47.aa(0, 0, Static561.anInt9759, Static639.anInt10685, this.aClass133_1.anInt3675, 0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8740() {
		return true;
	}
}
