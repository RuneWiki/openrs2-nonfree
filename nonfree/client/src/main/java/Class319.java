import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public final class Class319 implements Interface21 {

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "Lclient!ei;")
	private final Class100 aClass100_1;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Lclient!ei;)V")
	public Class319(@OriginalArg(0) Class100 arg0) {
		this.aClass100_1 = arg0;
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7887() {
		return true;
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)V")
	@Override
	public void method7888() {
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7886() {
		Static208.aClass65_7.aa(0, 0, Static32.anInt510, Static79.anInt1140, this.aClass100_1.anInt2695, 0);
	}
}
