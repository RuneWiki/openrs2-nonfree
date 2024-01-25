import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class378 implements Interface16 {

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "Lclient!ua;")
	private final Class334 aClass334_1;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!ua;)V")
	public Class378(@OriginalArg(0) Class334 arg0) {
		this.aClass334_1 = arg0;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8622() {
		Static171.aClass16_5.aa(0, 0, Static235.anInt5298, Static313.anInt6355, this.aClass334_1.anInt9685, 0);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8623() {
		return true;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	@Override
	public void method8624() {
	}
}
