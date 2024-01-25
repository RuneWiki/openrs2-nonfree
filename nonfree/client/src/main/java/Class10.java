import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class10 implements Interface6 {

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Lclient!pp;")
	private final Class273 aClass273_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class10(@OriginalArg(0) Class273 arg0) {
		this.aClass273_1 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7887() {
		Static31.aClass78_18.J(0, 0, Static349.anInt6422, Static594.anInt9806, this.aClass273_1.anInt7273, 0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	@Override
	public void method7888() {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7886() {
		return true;
	}
}
