import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class95 implements Interface23 {

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "Lclient!qg;")
	private final Class282 aClass282_1;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class95(@OriginalArg(0) Class282 arg0) {
		this.aClass282_1 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7806() {
		return true;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	@Override
	public void method7804() {
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7805() {
		Static185.aClass66_14.C(0, 0, Static2.anInt29, Static19.anInt390, this.aClass282_1.anInt7404, 0);
	}
}
