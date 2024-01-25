import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class304 implements Interface7 {

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!vo;")
	private final Class344 aClass344_1;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!vo;)V")
	public Class304(@OriginalArg(0) Class344 arg0) {
		this.aClass344_1 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7417() {
		return true;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	@Override
	public void method7416() {
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7418() {
		Static440.aClass44_12.J(0, 0, Static554.anInt9828, Static375.anInt7256, this.aClass344_1.anInt9908, 0);
	}
}
