import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class65 implements Interface17 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!ie;")
	private final Class160 aClass160_1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!ie;)V")
	public Class65(@OriginalArg(0) Class160 arg0) {
		this.aClass160_1 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8064() {
		Static141.aClass13_27.aa(0, 0, Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925, this.aClass160_1.anInt4261, 0);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8063() {
		return true;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	@Override
	public void method8062() {
	}
}
