import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class317 implements Interface4 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!bba;")
	private final Class21 aClass21_1;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!bba;)V")
	public Class317(@OriginalArg(0) Class21 arg0) {
		this.aClass21_1 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	@Override
	public void method7789() {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7788() {
		Static4.aClass43_1.J(0, 0, Static318.anInt5754, Static447.anInt7372, this.aClass21_1.anInt716, 0);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7790() {
		return true;
	}
}
