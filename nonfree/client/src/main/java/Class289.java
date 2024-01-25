import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class289 implements Interface27 {

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "Lclient!uh;")
	private final Class335 aClass335_1;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!uh;)V")
	public Class289(@OriginalArg(0) Class335 arg0) {
		this.aClass335_1 = arg0;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8108() {
		Static266.aClass82_8.aa(0, 0, Static330.anInt6254, Static190.anInt3576, this.aClass335_1.anInt9411, 0);
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V")
	@Override
	public void method8107() {
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		return true;
	}
}
