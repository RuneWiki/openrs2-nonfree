import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class94 implements Interface24 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!eba;")
	private final Class80 aClass80_1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!eba;)V")
	public Class94(@OriginalArg(0) Class80 arg0) {
		this.aClass80_1 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6873() {
		Static505.aClass45_11.J(0, 0, Static40.anInt758, Static308.anInt5171, this.aClass80_1.anInt2180, 0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6871() {
		return true;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	@Override
	public void method6872() {
	}
}
