import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class265 implements Interface6 {

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!oi;")
	private final Class240 aClass240_1;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!oi;)V")
	public Class265(@OriginalArg(0) Class240 arg0) {
		this.aClass240_1 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6803() {
		Static136.aClass12_8.J(0, 0, Static443.anInt7718, Static300.anInt5516, this.aClass240_1.anInt6735, 0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	@Override
	public void method6804() {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6805() {
		return true;
	}
}
