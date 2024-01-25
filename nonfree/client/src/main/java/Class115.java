import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class115 implements Interface5 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Lclient!rg;")
	private final Class303 aClass303_1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class115(@OriginalArg(0) Class303 arg0) {
		this.aClass303_1 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8946() {
		Static457.aClass57_11.aa(0, 0, Static70.anInt1125, Static631.anInt10283, this.aClass303_1.anInt8697, 0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8947() {
		return true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	@Override
	public void method8948() {
	}
}
