import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class104 implements Interface14 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "Lclient!pw;")
	private final Class296 aClass296_1;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!pw;)V")
	public Class104(@OriginalArg(0) Class296 arg0) {
		this.aClass296_1 = arg0;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8744() {
		return true;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8743() {
		Static488.aClass67_12.aa(0, 0, Static575.anInt9435, Static272.anInt5005, this.aClass296_1.anInt8598, 0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	@Override
	public void method8745() {
	}
}
