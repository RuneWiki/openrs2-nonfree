import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class267 implements Interface5 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!nk;")
	private final Class253 aClass253_1;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!nk;)V")
	public Class267(@OriginalArg(0) Class253 arg0) {
		this.aClass253_1 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
	@Override
	public void method8563() {
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8562() {
		Static273.aClass100_6.aa(0, 0, Static85.anInt9921, Static256.anInt4629, this.aClass253_1.anInt6670, 0);
	}
}
