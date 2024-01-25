import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class37 implements Interface13 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!ks;")
	private final Class201 aClass201_1;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class37(@OriginalArg(0) Class201 arg0) {
		this.aClass201_1 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8637() {
		Static582.aClass33_13.aa(0, 0, Static632.anInt9867, Static357.anInt5421, this.aClass201_1.anInt5048, 0);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	@Override
	public void method8638() {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8636() {
		return true;
	}
}
